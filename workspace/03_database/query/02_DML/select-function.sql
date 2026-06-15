-- 회원 이름 조회
SELECT name, email
FROM member;

-- 회원 이름과 이메일을 결합하여 표현
SELECT CONCAT(name, ' (', email, ')') AS member_info
    FROM member;

-- 각 회원 이메일의 바이트 길이를 조회
SELECT email, LENGTH(email) AS email_length, LENGTH('hello'), LENGTH('안녕하세요')
    FROM member;

-- 게시글 제목의 바이트 길이를 조회
SELECT title, LENGTH(title) AS title_length
    FROM post;

-- 게시글 본문 내의 특정 문자열을 다른 내용으로 치환하여 조회
SELECT content, REPLACE(content, '안녕하세요', 'HI') AS replaced_content
    FROM post
    WHERE content LIKE '%안녕하세요%';

-- 게시글 본문의 첫 10글자만 미리보기로 추출하여 조회
SELECT title, SUBSTRING(content, 1, 10) AS preview
    FROM post;

-- 게시글 본문의 첫 10글자만 미리보기로 가져오기(잘린 뒷부분은 ...으로 표시하세요.)
SELECT title, CONCAT(SUBSTRING(content, 1, 10), '...') AS preview
    FROM post;

-- 이메일을 일반, 소문자, 대문자로 통일하여 조회
SELECT email, LOWER(email) AS email_lower, UPPER(email) AS email_upper
    FROM member;

-- 이름 앞뒤 공백을 제거하여 조회
SELECT email, TRIM(email) AS trimmed_email
    FROM member;



-- 현재 날짜와 시간을 조회
SELECT NOW() AS current_datetime;

-- 연-월-일 형식으로 가공하여 조회 (예: 2026년 06월 10일)
SELECT id, title, DATE_FORMAT(created_at, '%Y년 %m월 %d일') AS write_date
    FROM post;

-- 연-월-일 요일 시:분:초 형식으로 가공하여 조회 (예: 2026년 06월 10일 wed 23시 25분 54초)
SELECT id, title, DATE_FORMAT(created_at, '%Y년 %m월 %d일 %a %H시 %i분 %s초') AS write_datetime
    FROM post;

-- 오늘 날짜 조회
SELECT CURDATE() AS cur_date;

-- 오늘 작성된 게시글만 조회
SELECT id, title, created_at
    FROM post
    WHERE created_at >= CURDATE();

-- 최근 7일 이내에 가입한 회원 조회
SELECT id, name, created_at, CURDATE() AS now, DATE_SUB(CURDATE(), INTERVAL 7 DAY) AS before_7days
	FROM member
	WHERE created_at >= DATE_SUB(CURDATE(), INTERVAL 7 DAY);

-- 가입한지 1개월이 지난 회원 조회
SELECT *, DATE_SUB(NOW(), INTERVAL 1 MONTH) AS before_1month
	FROM member
	WHERE created_at < DATE_SUB(NOW(), INTERVAL 1 MONTH);

-- 가입한지 33일 12시간이 지난 회원 조회
SELECT *, DATE_SUB(NOW(), INTERVAL '33 12' DAY_HOUR) AS before_days
	FROM member
	WHERE created_at < DATE_SUB(NOW(), INTERVAL '33 12' DAY_HOUR);

-- 각 회원의 가입 경과일수를 조회
SELECT name, created_at, DATEDIFF(CURDATE(), created_at) AS days_since_join
	FROM member;



-- 모든 회원수 조회
SELECT COUNT(*)
	FROM member;

-- 모든 게시글 수 조회
SELECT COUNT(*)
	FROM post;

-- id=3인 회원의 모든 게시글의 총 게시글 수 조회
SELECT member_id, COUNT(*) AS total_count
	FROM post
	WHERE member_id = 3;

-- id=3인 회원의 모든 게시글의 조회수 합
SELECT member_id, SUM(view_count) AS total_views
	FROM post
	WHERE member_id = 3;

-- id=3인 회원의 모든 게시글의 평균 조회수
SELECT member_id, AVG(view_count) AS avg_views
	FROM post
	WHERE member_id = 3;

-- id=3인 회원의 가장 많은 조회수, 적은 조회수
SELECT member_id, MAX(view_count) AS max_view, MIN(view_count) AS min_view
	FROM post
	WHERE member_id = 3;



-- 전화번호가 NULL인 회원은 '미등록'으로 표시하여 조회
SELECT name, IFNULL(phone, '미등록') AS phone
	FROM member;

-- 전화번호가 NULL이면 이메일을, 이메일도 NULL이면 '연락처 없음'으로 표시
SELECT name, COALESCE(phone, email, '연락처 없음') AS contact
	FROM member;



-- 전화번호 등록 여부에 따라 상태를 표시하여 조회
SELECT name, IF(phone IS NULL, '연락처 없음', '연락처 등록') AS phone_status
    FROM member;

-- 회원 가입 연도에 따른 회원 등급 부여 조회
SELECT name, created_at,
    CASE
        WHEN created_at < DATE_SUB(NOW(), INTERVAL 1 YEAR) THEN '우수 회원'
        WHEN created_at < DATE_SUB(NOW(), INTERVAL 1 MONTH) THEN '일반 회원'
        ELSE '신규 회원'
    END AS member_grade
    FROM member;