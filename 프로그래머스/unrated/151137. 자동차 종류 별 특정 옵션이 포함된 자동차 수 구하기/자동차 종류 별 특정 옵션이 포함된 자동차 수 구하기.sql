-- 코드를 입력하세요
SELECT CAR_TYPE, COUNT(options)  'CARS'
FROM CAR_RENTAL_COMPANY_CAR
WHERE options like '%시트%'
GROUP BY CAR_TYPE

ORDER BY CAR_TYPE ASC

