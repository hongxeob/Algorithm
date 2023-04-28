-- 코드를 입력하세요
SELECT B.TITLE, B.BOARD_ID, 
       R.REPLY_ID, R.WRITER_ID, R.CONTENTS, DATE_FORMAT(R.CREATED_DATE,'%Y-%m-%d') 
FROM USED_GOODS_BOARD b join USED_GOODS_REPLY r
ON b.Board_Id = r.board_id
WHERE b.created_date like '2022-10-%'
order by r.created_date asc , b.title asc