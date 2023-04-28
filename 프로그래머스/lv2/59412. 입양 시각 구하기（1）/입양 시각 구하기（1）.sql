-- 코드를 입력하세요
SELECT HOUr(DATETIME) as HOUr, COUNT(DATETIME) COUNT
from animal_outs
GROUP BY HOUR
HAVING HOUR > 8 and hour <20
order by hour
