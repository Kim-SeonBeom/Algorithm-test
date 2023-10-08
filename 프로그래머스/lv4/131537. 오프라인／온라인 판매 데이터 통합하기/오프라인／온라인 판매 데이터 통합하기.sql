-- 코드를 입력하세요
(SELECT
to_char(SALES_DATE,'yyyy-mm-dd') as SALES_DATE,	PRODUCT_ID,	USER_ID,SALES_AMOUNT
from
online_sale
where
to_char(SALES_DATE,'yyyy-mm') = '2022-03'
union all
SELECT
to_char(SALES_DATE,'yyyy-mm-dd') as SALES_DATE,	PRODUCT_ID,null as user_id,	SALES_AMOUNT
from
offline_sale 
where
to_char(SALES_DATE,'yyyy-mm') = '2022-03')
ORDER BY SALES_DATE, PRODUCT_ID, USER_ID