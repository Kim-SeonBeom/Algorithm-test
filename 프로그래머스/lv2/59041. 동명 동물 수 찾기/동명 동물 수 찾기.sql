-- 코드를 입력하세요
SELECT
NAME,
count(name) as COUNT
from animal_ins
GROUP BY name
having count(name)>1
order by name