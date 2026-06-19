package ch01;

import java.sql.*;

public class JdbcMemberTest {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/board_db?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
    private static final String DB_USER = "user1";
    private static final String DB_PASSWORD = "1111";


    public static void main(String[] args) {
//        selectAllMembers();
//        insertMember("haru" + (int)(Math.random() * 1000) + "@gmail.com", "1234", "뉴하루", "01022221111", 2);
//        updateMember(3, "3333", "3번회원", "01033333333");
//        deleteMember(1);
//        selectAllMembers();
        try {
            login(null, "123");
        } catch (LoginFailException e) {
            e.printStackTrace();
        }

//        login("haru@gmail.com", "pwd123");
//        deleteMemberNPost(2);
        try {
            insertMember("haru" + (int)(Math.random() * 1000) + "@gmail.com", "1234", "뉴하루", "010222123221111", 2);
        } catch (IllegalArgumentException e) {
            System.out.println("전화번호를 11자로 줄여 실행합니다.");
            insertMember("haru" + (int)(Math.random() * 1000) + "@gmail.com", "1234", "뉴하루", "010222123221111".substring(0, 11), 2);
        }

    }

    public static void login(String email, String password) throws LoginFailException{
        String sql = "SELECT * FROM member WHERE email = ? AND password = ?";

        if (email == null || password == null || email.isEmpty() || password.isEmpty()) {
            throw new LoginFailException("이메일 또는 패스워드를 입력하세요.");
        }

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement pStat = conn.prepareStatement(sql)) {

            pStat.setString(1, email);
            pStat.setString(2, password);

            try (ResultSet rs = pStat.executeQuery()) {
                if (rs.next()) {
                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String phone = rs.getString("phone");

                    System.out.println("ID: " + id + "\n이메일: " + email + "\n이름: " + name + "\n전화번호: " + phone + "\n");
                }
                else {
                    System.out.println("이메일 혹은 비밀번호를 잘못 입력하셨습니다.");
                }
            } catch (Exception e) {
                System.out.println("에러 발생: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("에러 발생: " + e.getMessage());
        }
    }

    // 회원 목록 조회
    public static void selectAllMembers() {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stat = conn.createStatement();
             ResultSet rs = stat.executeQuery("SELECT * FROM member")) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String email = rs.getString("email");
                String name = rs.getString("name");
                String phone = rs.getString("phone");

                System.out.println("ID: " + id + "\n이메일: " + email + "\n이름: " + name + "\n전화번호: " + phone + "\n");
            }
        } catch (Exception e) {
            System.out.println("에러 발생: " + e.getMessage());
        }
    }

    // 회원 등록
    public static void insertMember(String email, String password, String name, String phone, int recommenderId) {

        if (phone.length() > 11) {
            throw new IllegalArgumentException("전화번호는 11자 이하여야 합니다.");
        }

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stat = conn.createStatement();) {

            int affectedRows = stat.executeUpdate(
                    "INSERT INTO member (email, password, name, phone, recommender_id) VALUES "
                            + "('" + email + "', '" + password + "', '" + name + "', '" + phone + "', '"
                            + recommenderId + "')" );

            System.out.println("회원 등록 완료: " + affectedRows + "건 반영됨\n");

        } catch (Exception e) {
            System.out.println("에러 발생: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // 회원 수정
    public static void updateMember(int id, String password, String name, String phone) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stat = conn.createStatement()){

            if (phone.length() > 11) {
                throw new IllegalArgumentException("전화번호는 11자 이하여야 합니다.");
            }

            int affectedRows = stat.executeUpdate(
                    "UPDATE member SET password = '" +  password + "', name = '" + name + "', phone = '" + phone
                            + "' WHERE id = " + id );

            System.out.println("회원 수정 완료: " + affectedRows + "건 반영됨\n");

        } catch (Exception e) {
            System.out.println("에러 발생: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // 회원 삭제
    public static void deleteMember(int id) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stat = conn.createStatement()){
            int affectedRows = stat.executeUpdate("DELETE FROM member WHERE id = " + id );

            System.out.println("회원 삭제 완료: " + affectedRows + "건 반영됨\n");

        } catch (Exception e) {
            System.out.println("에러 발생: " + e.getMessage());
        }
    }

    // 회원 삭제 및 회원 게시물 삭제
    public static void deleteMemberNPost(int id) {
        Connection conn = null;
        Statement stat = null;

        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            stat = conn.createStatement();

            conn.setAutoCommit(false);

            int affectedRows = stat.executeUpdate("DELETE FROM post WHERE member_id = " + id );
            System.out.println("회원의 게시글 삭제 완료: " + affectedRows + "건 반영됨\n");

            affectedRows = stat.executeUpdate("DELETE FROM member WHERE id = " + id );
            System.out.println("회원 삭제 완료: " + affectedRows + "건 반영됨\n");

            conn.commit();
            System.out.println("데이터베이스 동기화 완료\n");

        } catch (Exception e) {
            System.out.println("에러 발생: " + e.getMessage());

            try { if (conn != null) conn.rollback(); } catch (Exception e2) {
                System.out.println("에러 발생: " + e2.getMessage());
            }
            e.printStackTrace();
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
