-- 코드를 입력하세요
SELECT b.book_id, a.AUTHOR_NAME, DATE_FORMAT(b.PUBLISHED_DATE,'%Y-%m-%d') as PUBLISHED_DATE
FROM BOOK b join AUTHOR a
ON b.AUTHOR_ID = a.AUTHOR_ID
WHERE b.category = '경제'
order by b.PUBLISHED_DATE asc

