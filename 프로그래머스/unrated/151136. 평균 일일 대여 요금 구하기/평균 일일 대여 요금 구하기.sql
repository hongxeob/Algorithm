-- 코드를 입력하세요
SELECT FLOOR(AVG(DAILY_FEE)) as DAILY_FEE
FROM CAR_RENTAL_COMPANY_CAR
WHERE CAR_TYPE = 'SUV'