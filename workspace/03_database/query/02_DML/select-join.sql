-- 모든 게시글의 모든 컬럼 조회
SELECT *
	FROM post;

-- 모든 게시글의 id, member_id, title, view_count 조회
SELECT id, member_id, title, view_count
	FROM post;



-- INNER JOIN
-- 모든 게시글의 id, member_id, title, view_count, 작성자이름, 작성자이메일 조회
SELECT post.id, member_id, title, view_count, member.name, member.email
	FROM post
	INNER JOIN member ON post.member_id = member.id;

-- 모든 게시글의 id, member_id, title, view_count, 작성자이름, 작성자이메일 조회 (alias 사용)
SELECT p.id, member_id, title, view_count, m.name, m.email
	FROM post p
	INNER JOIN member m ON p.member_id = m.id;

-- 모든 댓글의 작성자, 원본 게시글 제목을 조회
SELECT r.id, r.content, r.member_id, r.post_id, m.name AS member_name, p.title AS post_title
	FROM reply r
	INNER JOIN member m ON r.member_id = m.id 
	INNER JOIN post p ON r.post_id = p.id;

-- 모든 댓글의 작성자, 원본 게시글 제목을 조회 (게시글 기준으로 정렬, 같으면 댓글 기준으로 정렬)
SELECT p.title AS post_title, r.content, m.name AS member_name
	FROM reply r
	INNER JOIN member m ON r.member_id = m.id 
	INNER JOIN post p ON r.post_id = p.id
	ORDER BY p.id DESC, r.id;
	


-- LEFT OUTER JOIN
-- 모든 게시글의 id, member_id, title, view_count, 작성자이름, 작성자이메일 조회 (alias 사용)
SELECT p.id, member_id, title, view_count, m.name, m.email
	FROM post p
	LEFT JOIN member m ON p.member_id = m.id;

-- 전체 회원 목록과 각 회원이 작성한 게시글 수를 조회하세요.(게시글을 작성하지 않은 회원도 포함)
SELECT m.id, m.name, COUNT(p.id) post_count
	FROM member m
	LEFT JOIN post p ON m.id = p.member_id
	GROUP BY m.id;



-- RIGHT OUTER JOIN
-- 모든 게시글의 id, member_id, title, view_count, 작성자이름, 작성자이메일 조회 (alias 사용)
SELECT p.id, member_id, title, view_count, m.name, m.email
	FROM post p
	RIGHT JOIN member m ON p.member_id = m.id;

-- 위의 RIGHT JOIN을 LEFT JOIN 화 (동일한 결과)
SELECT p.id, member_id, title, view_count, m.name, m.email
	FROM member m
	LEFT JOIN post p ON m.id = p.member_id;



-- FULL OUTER JOIN(MySQL은 지원하지 않으므로 UNION으로 대체)
SELECT m.id AS member_id, m.name, p.title
	FROM member m
	LEFT JOIN post p ON m.id = p.member_id
UNION
SELECT m.id AS member_id, m.name, p.title
	FROM member m
	RIGHT JOIN post p ON m.id = p.member_id;



-- SELF JOIN
-- 회원 이름과 그 회원을 추천한 추천인의 이름을 함께 조회
SELECT m.name AS 회원명, m.recommender_id AS 추천인아이디, r.name AS 추천인이름
	FROM member m
	INNER JOIN member r ON m.recommender_id = r.id;