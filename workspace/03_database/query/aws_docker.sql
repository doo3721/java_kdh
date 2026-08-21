-- 외부 접속 권한 사용자 생성
CREATE USER IF NOT EXISTS 'board_app'@'%' IDENTIFIED BY 'Board123!';

-- board_db 데이터베이스에 대한 전권 부여
GRANT ALL PRIVILEGES ON board_db.* TO 'board_app'@'%';

-- 권한 변경 사항 적용
FLUSH PRIVILEGES;