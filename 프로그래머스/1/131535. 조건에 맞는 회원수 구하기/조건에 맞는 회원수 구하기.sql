-- 코드를 입력하세요
SELECT
count(*)
from
(select * from USER_INFO where to_char(joined, 'yyyy-mm-dd') between '2021-01-01' and '2021-12-31')
where age between 20 and 29