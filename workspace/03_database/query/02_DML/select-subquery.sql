-- 가장 오래된 가입일자 조회
SELECT MIN(created_at) FROM member;

-- 가장 오래전에 가입한 회원의 정보 조회
SELECT *
	FROM member
	WHERE created_at = (SELECT MIN(created_at) FROM member);


-- 게시글을 하나라도 작성한 회원 id (중복없이)
SELECT DISTINCT member_id FROM post WHERE member_id IS NOT NULL;

-- 게시글을 한 건이라도 작성한 회원의 정보 조회
SELECT *
	FROM member
	WHERE id IN (SELECT DISTINCT member_id FROM post WHERE member_id IS NOT NULL);



-- 게시글 조회
SELECT id, title FROM post;

-- 1번 게시글의 댓글 수 조회
SELECT COUNT(*) reply_count FROM reply WHERE post_id = 1;

-- 각 게시글과 함께 해당 게시글의 댓글 수 조회
SELECT id, title, (SELECT COUNT(*) FROM reply WHERE post_id = post.id) reply_count 
	FROM post;

-- 각 게시글과 함께 해당 게시글의 댓글 수 조회 (JOIN 버전)
SELECT p.id, p.title, COUNT(r.id)
	FROM post p
	LEFT JOIN reply r ON p.id = r.post_id
	GROUP BY p.id;



-- 게시글을 하나라도 작성한 회원 id (중복없이)
SELECT DISTINCT member_id FROM post WHERE member_id IS NOT NULL;

-- 게시글을 한 건이라도 작성한 회원의 게시글 수
SELECT member_id, COUNT(*) post_count FROM post WHERE member_id IS NOT NULL GROUP BY member_id;

-- 게시글을 한 건이라도 작성한 회원의 평균 게시글 수
SELECT AVG(cnt)
	FROM (
		SELECT member_id, COUNT(*) cnt
			FROM post 
			WHERE member_id IS NOT NULL 
			GROUP BY member_id
	) sub;

-- 게시글을 한 건이라도 작성한 회원의 평균 게시글 수보다 많은 글을 작성한 회원 조회
SELECT member_id, COUNT(*) post_count
	FROM post
	WHERE member_id IS NOT NULL
	GROUP BY member_id
	HAVING post_count > (
		SELECT AVG(cnt)
		FROM (
			SELECT member_id, COUNT(*) cnt
				FROM post 
				WHERE member_id IS NOT NULL 
				GROUP BY member_id
		) sub
	);
	