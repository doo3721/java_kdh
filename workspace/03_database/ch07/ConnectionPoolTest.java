package ch07;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionPoolTest {

    private static DataSource dataSource;

    static {
        HikariConfig config = new HikariConfig("/hikari.properties");
        dataSource = new HikariDataSource(config);
    }

    private static final String DB_URL = "jdbc:mysql://localhost:3306/board_db?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
    private static final String DB_USER = "user1";
    private static final String DB_PASSWORD = "1111";

    public static void main(String[] args) {
        findAll();
        insert(2, "2번이 등록한 게시글", "안녕하세요. 자바 공부 해요.");
        findById(10);
        update(10, "수정된 10번 게시글", "수정했어요");
        findById(10);
        delete(10);
        findAll();
        deleteMemberAll(3);
        findAll();
        search("안녕");

        if (dataSource != null) {
            ((HikariDataSource) dataSource).close();
        }
    }

    public static void insert(int memberId, String title, String content) {
        Connection conn = null;
        PreparedStatement pStat = null;
        String sql = "INSERT INTO post (member_id, title, content) VALUES (?, ?, ?)";

        try {
            conn = dataSource.getConnection();

            pStat = conn.prepareStatement(sql);
            pStat.setInt(1, memberId);
            pStat.setString(2, title);
            pStat.setString(3, content);
            int affectedRows = pStat.executeUpdate();

            System.out.println("글 등록 완료: " + affectedRows + "건 반영됨\n");

        } catch (Exception e) {
            System.out.println("에러 발생: " + e.getMessage());
        } finally {
            try { if (pStat != null) pStat.close(); } catch (Exception e) {
                System.out.println("에러 발생: " + e.getMessage());
            }
            try { if (conn != null) conn.close(); } catch (Exception e) {
                System.out.println("에러 발생: " + e.getMessage());
            }
        }
    }

    public static void search(String keyword) {
        Connection conn = null;
        PreparedStatement pStat = null;
        ResultSet rs = null;
        StringBuilder sql = new StringBuilder("SELECT * FROM post");

        boolean hasKeyword = keyword != null && !keyword.isEmpty();
        if (hasKeyword) {
            sql.append(" WHERE title LIKE ? OR content LIKE ?");
        }

        try {
            conn = dataSource.getConnection();

            pStat = conn.prepareStatement(sql.toString());
            if (hasKeyword) {
                pStat.setString(1, "%" + keyword + "%");
                pStat.setString(2, "%" + keyword + "%");
            }
            rs = pStat.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                int memberId = rs.getInt("member_id");
                String title = rs.getString("title");
                String content = rs.getString("content");
                int viewCount = rs.getInt("view_count");
                String createdAt = rs.getString("created_at");

                System.out.println("ID: " + id + "\n글쓴이: " + memberId + "\n제목: " + title + "\n내용: "
                        + content + "\n조회수: " + viewCount + "\n날짜: " + createdAt + "\n");
            }
        } catch (Exception e) {
            System.out.println("에러 발생: " + e.getMessage());
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {
                System.out.println("에러 발생: " + e.getMessage());
            }
            try { if (pStat != null) pStat.close(); } catch (Exception e) {
                System.out.println("에러 발생: " + e.getMessage());
            }
            try { if (conn != null) conn.close(); } catch (Exception e) {
                System.out.println("에러 발생: " + e.getMessage());
            }
        }
    }

    public static void findAll() {
       search("");
    }

    public static void findById(int id) {
        Connection conn = null;
        PreparedStatement pStat = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM post WHERE id = ?";

        try {
            conn = dataSource.getConnection();

            pStat = conn.prepareStatement(sql);
            pStat.setInt(1, id);
            rs = pStat.executeQuery();

            if (rs.next()) {
                int memberId = rs.getInt("member_id");
                String title = rs.getString("title");
                String content = rs.getString("content");
                int viewCount = rs.getInt("view_count");
                String createdAt = rs.getString("created_at");

                System.out.println("ID: " + id + "\n글쓴이: " + memberId + "\n제목: " + title + "\n내용: "
                        + content + "\n조회수: " + viewCount + "\n날짜: " + createdAt + "\n");
            }
            else {
                System.out.println("해당 글을 찾을 수 없습니다.\n");
            }

        } catch (Exception e) {
            System.out.println("에러 발생: " + e.getMessage());
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {
                System.out.println("에러 발생: " + e.getMessage());
            }
            try { if (pStat != null) pStat.close(); } catch (Exception e) {
                System.out.println("에러 발생: " + e.getMessage());
            }
            try { if (conn != null) conn.close(); } catch (Exception e) {
                System.out.println("에러 발생: " + e.getMessage());
            }
        }
    }

    public static void update(int id, String title, String content) {
        Connection conn = null;
        PreparedStatement pStat = null;
        String sql = "UPDATE post SET title = ?, content = ? WHERE id = ?";


        try {
            conn = dataSource.getConnection();

            pStat = conn.prepareStatement(sql);
            pStat.setString(1, title);
            pStat.setString(2, content);
            pStat.setInt(3, id);
            int affectedRows = pStat.executeUpdate();

            System.out.println("글 수정 완료: " + affectedRows + "건 반영됨\n");

        } catch (Exception e) {
            System.out.println("에러 발생: " + e.getMessage());
        } finally {
            try { if (pStat != null) pStat.close(); } catch (Exception e) {
                System.out.println("에러 발생: " + e.getMessage());
            }
            try { if (conn != null) conn.close(); } catch (Exception e) {
                System.out.println("에러 발생: " + e.getMessage());
            }
        }
    }

    public static void delete(int id) {
        Connection conn = null;
        PreparedStatement pStat = null;
        String sql = "DELETE FROM post WHERE id = ?";

        try {
            conn = dataSource.getConnection();

            pStat = conn.prepareStatement(sql);
            pStat.setInt(1, id);
            int affectedRows = pStat.executeUpdate();

            System.out.println("글 삭제 완료: " + affectedRows + "건 반영됨\n");

        } catch (Exception e) {
            System.out.println("에러 발생: " + e.getMessage());
        } finally {
            try { if (pStat != null) pStat.close(); } catch (Exception e) {
                System.out.println("에러 발생: " + e.getMessage());
            }
            try { if (conn != null) conn.close(); } catch (Exception e) {
                System.out.println("에러 발생: " + e.getMessage());
            }
        }
    }

    public static void deleteMemberAll(int memberId) {
        Connection conn = null;
        PreparedStatement pStat = null;
        String sql = "DELETE FROM post WHERE member_id = ?";

        try {
            conn = dataSource.getConnection();

            pStat = conn.prepareStatement(sql);
            pStat.setInt(1, memberId);
            int affectedRows = pStat.executeUpdate();

            System.out.println(memberId + "번 회원 글 모두 삭제 완료: " + affectedRows + "건 반영됨\n");

        } catch (Exception e) {
            System.out.println("에러 발생: " + e.getMessage());
        } finally {
            try { if (pStat != null) pStat.close(); } catch (Exception e) {
                System.out.println("에러 발생: " + e.getMessage());
            }
            try { if (conn != null) conn.close(); } catch (Exception e) {
                System.out.println("에러 발생: " + e.getMessage());
            }
        }
    }
}
