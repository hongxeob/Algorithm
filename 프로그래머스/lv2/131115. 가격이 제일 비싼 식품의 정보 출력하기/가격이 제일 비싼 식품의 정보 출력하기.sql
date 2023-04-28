-- 코드를 입력하세요
SELECT *
FROM food_product
where price = (select max(price) as prcie from food_product)


