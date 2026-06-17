package ch07;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcPostTest {
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
    }

    static void insert(int memberId, String title, String content) {
        Connection conn = null;
        Statement stat = null;

        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            stat = conn.createStatement();

            int affectedRows = stat.executeUpdate(
                    "INSERT INTO post (member_id, title, content) VALUES "
                            + "('" + memberId + "', '" + title + "', '" + content + "')" );

            System.out.println("글 등록 완료: " + affectedRows + "건 반영됨\n");

        } catch (Exception e) {
            System.out.println("에러 발생: " + e.getMessage());
        } finally {
            try { if (stat != null) stat.close(); } catch (Exception e) {
                System.out.println("에러 발생: " + e.getMessage());
            }
            try { if (conn != null) conn.close(); } catch (Exception e) {
                System.out.println("에러 발생: " + e.getMessage());
            }
        }
    }

    static void findAll() {
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            stat = conn.createStatement();

            rs = stat.executeQuery("SELECT * FROM post");

            while (rs.next()) {
                int id = rs.getInt("id");
                int memberId = rs.getInt("member_id");
                String title = rs.getString("title");
                String content = rs.getString("content");
                String createdAt = rs.getString("created_at");

                System.out.println("ID: " + id + "\n글쓴이: " + memberId + "\n제목: " + title + "\n내용: "
                        + content + "\n날짜: " + createdAt + "\n");
            }
        } catch (Exception e) {
            System.out.println("에러 발생: " + e.getMessage());
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {
                System.out.println("에러 발생: " + e.getMessage());
            }
            try { if (stat != null) stat.close(); } catch (Exception e) {
                System.out.println("에러 발생: " + e.getMessage());
            }
            try { if (conn != null) conn.close(); } catch (Exception e) {
                System.out.println("에러 발생: " + e.getMessage());
            }
        }
    }

    static void findById(int id) {
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            stat = conn.createStatement();

            rs = stat.executeQuery("SELECT * FROM post WHERE id = " + id);

            if (rs.next()) {
                int memberId = rs.getInt("member_id");
                String title = rs.getString("title");
                String content = rs.getString("content");
                String createdAt = rs.getString("created_at");

                System.out.println("ID: " + id + "\n글쓴이: " + memberId + "\n제목: " + title + "\n내용: "
                        + content + "\n날짜: " + createdAt + "\n");
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
            try { if (stat != null) stat.close(); } catch (Exception e) {
                System.out.println("에러 발생: " + e.getMessage());
            }
            try { if (conn != null) conn.close(); } catch (Exception e) {
                System.out.println("에러 발생: " + e.getMessage());
            }
        }
    }

    static void update(int id, String title, String content) {
        Connection conn = null;
        Statement stat = null;

        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            stat = conn.createStatement();

            int affectedRows = stat.executeUpdate(
                    "UPDATE post SET title = '" +  title + "', content = '" + content + "' WHERE id = " + id );

            System.out.println("글 수정 완료: " + affectedRows + "건 반영됨\n");

        } catch (Exception e) {
            System.out.println("에러 발생: " + e.getMessage());
        } finally {
            try { if (stat != null) stat.close(); } catch (Exception e) {
                System.out.println("에러 발생: " + e.getMessage());
            }
            try { if (conn != null) conn.close(); } catch (Exception e) {
                System.out.println("에러 발생: " + e.getMessage());
            }
        }
    }

    static void delete(int id) {
        Connection conn = null;
        Statement stat = null;

        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            stat = conn.createStatement();

            int affectedRows = stat.executeUpdate("DELETE FROM post WHERE id = " + id );

            System.out.println("글 삭제 완료: " + affectedRows + "건 반영됨\n");

        } catch (Exception e) {
            System.out.println("에러 발생: " + e.getMessage());
        } finally {
            try { if (stat != null) stat.close(); } catch (Exception e) {
                System.out.println("에러 발생: " + e.getMessage());
            }
            try { if (conn != null) conn.close(); } catch (Exception e) {
                System.out.println("에러 발생: " + e.getMessage());
            }
        }
    }
}
