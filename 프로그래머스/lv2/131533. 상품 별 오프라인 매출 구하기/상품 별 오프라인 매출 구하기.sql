-- 코드를 입력하세요
SELECT PRODUCT_CODE, SUM(a.PRICE*b.SALES_AMOUNT) AS SALES
FROM PRODUCT a join OFFLINE_SALE b
on a.product_id = b.product_id
GROUP BY a.PRODUCT_CODE
order by SALES desc, product_code asc