-- 코드를 입력하세요
SELECT a.flavor
FROM  first_half a join ICECREAM_INFO b
ON a.flavor = b.flavor
 WHERE TOTAL_ORDER > 3000 and INGREDIENT_TYPE='fruit_based'
 order by TOTAL_ORDER desc
 

