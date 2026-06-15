-- 각 회원(member_id)별로 작성한 게시글 개수를 조회
SELECT member_id, COUNT(*) AS post_count
	FROM post
	GROUP BY member_id;

-- 각 게시글(post_id)별 댓글 개수 조회
SELECT post_id, COUNT(*) AS reply_count
	FROM reply
	GROUP BY post_id
	ORDER BY reply_count DESC;

-- 회원별로 작성한 게시글의 수, 총 조회수 조회
SELECT member_id, COUNT(*) AS post_count, SUM(view_count) AS total_views
	FROM post
	GROUP BY member_id
	ORDER BY post_count, total_views DESC;

-- 가입 연도별 회원수 조회
SELECT DATE_FORMAT(created_at, '%Y') AS join_year, COUNT(*) AS join_count
	FROM member
	GROUP BY join_year;

-- 회원별로 작성한 게시글의 수, 총 조회수 조회 (게시글이 5개 이상인 경우만)
SELECT member_id, COUNT(*) AS post_count, SUM(view_count) AS total_views
	FROM post
	GROUP BY member_id
	HAVING post_count >= 5
	ORDER BY post_count, total_views DESC;



-- 해결 방법 1: 집계 함수를 적용하여 단일 결과값으로 보장
SELECT member_id, MAX(title), COUNT(*) AS post_count
    FROM post
    GROUP BY member_id;

-- 해결 방법 2: group_concat을 사용해 여러 개의 title을 하나의 텍스트로 합침
SELECT member_id, GROUP_CONCAT(title), COUNT(*) AS post_count
    FROM post
    GROUP BY member_id;

-- 해결 방법 3: 해당 컬럼도 GROUP BY 기준에 추가하여 공동 그룹으로 묶음
SELECT member_id, title, COUNT(*) AS post_count
    FROM post
    GROUP BY member_id, title;



-- 게시글을 2개 이상 작성한 회원의 id와 게시글 수 조회 (HAVING 사용)
SELECT member_id, COUNT(*) AS post_count
    FROM post
    GROUP BY member_id
    HAVING post_count >= 2;

-- 1번 회원을 제외하고 나머지 회원들의 그룹별 작성 게시글 수 조회
SELECT member_id, COUNT(*) AS post_count
    FROM post
    WHERE member_id != 1
    GROUP BY member_id;

-- 2026년 6월에 작성된 게시글을 대상으로, 작성한 글 개수가 2개 이상인 회원 그룹만 조회
SELECT member_id, COUNT(*) AS post_count
    FROM post
    WHERE DATE_FORMAT(created_at, '%Y-%m') = '2026-06'
    GROUP BY member_id
    HAVING post_count >= 2;