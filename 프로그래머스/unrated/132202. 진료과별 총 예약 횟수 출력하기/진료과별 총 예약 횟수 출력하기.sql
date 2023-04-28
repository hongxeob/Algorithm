-- 코드를 입력하세요
SELECT MCDP_CD as '진료과코드', COUNT(MCDP_CD) as '5월예약건수'
From APPOINTMENT
WHERE APNT_YMD like '2022-05-%'
GROUP BY 진료과코드
ORDER BY 5월예약건수, 진료과코드

