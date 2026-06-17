package ch07;

import java.sql.*;

public class JdbcBasicTest {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/board_db?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
    private static final String DB_USER = "user1";
    private static final String DB_PASSWORD = "1111";


    public static void main(String[] args) {
        selectAllMembers();
        insertMember("haru" + (int)(Math.random() * 1000) + "@gmail.com", "1234", "뉴하루", "01022221111", 2);
        updateMember(3, "3333", "3번회원", "01033333333");
        deleteMember(1);
        selectAllMembers();
    }

    // 회원 목록 조회
    public static void selectAllMembers() {
        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            stat = conn.createStatement();

            rs = stat.executeQuery("SELECT * FROM member");

            while (rs.next()) {
                int id = rs.getInt("id");
                String email = rs.getString("email");
                String name = rs.getString("name");
                String phone = rs.getString("phone");

                System.out.println("ID: " + id + "\n이메일: " + email + "\n이름: " + name + "\n전화번호: " + phone + "\n");
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

    // 회원 등록
    public static void insertMember(String email, String password, String name, String phone, int recommenderId) {
        Connection conn = null;
        Statement stat = null;

        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            stat = conn.createStatement();

            int affectedRows = stat.executeUpdate(
                    "INSERT INTO member (email, password, name, phone, recommender_id) VALUES "
                            + "('" + email + "', '" + password + "', '" + name + "', '" + phone + "', '"
                            + recommenderId + "')" );

            System.out.println("회원 등록 완료: " + affectedRows + "건 반영됨\n");

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

    // 회원 수정
    public static void updateMember(int id, String password, String name, String phone) {
        Connection conn = null;
        Statement stat = null;

        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            stat = conn.createStatement();

            int affectedRows = stat.executeUpdate(
                    "UPDATE member SET password = '" +  password + "', name = '" + name + "', phone = '" + phone
                            + "' WHERE id = " + id );

            System.out.println("회원 수정 완료: " + affectedRows + "건 반영됨\n");

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

    // 회원 삭제
    public static void deleteMember(int id) {
        Connection conn = null;
        Statement stat = null;

        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            stat = conn.createStatement();

            int affectedRows = stat.executeUpdate("DELETE FROM member WHERE id = " + id );

            System.out.println("회원 삭제 완료: " + affectedRows + "건 반영됨\n");

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
