-- 코드를 입력하세요
SELECT
a.product_code,
sum(b.sales_amount * a.price) as sales
from offline_sale b join product a
on a.product_id = b.product_id
group by a.product_code    
order by sales desc, a.product_code
-- select
-- *
-- from offline_sale
-- order by product_id