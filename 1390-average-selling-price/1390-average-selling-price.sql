WITH products AS (
  SELECT DISTINCT product_id FROM Prices
),
sales AS (
  SELECT u.product_id,
         SUM(u.units * p.price) AS total_revenue,
         SUM(u.units) AS total_units
  FROM UnitsSold u
  JOIN Prices p
    ON u.product_id = p.product_id
   AND u.purchase_date BETWEEN p.start_date AND p.end_date
  GROUP BY u.product_id
)
SELECT pr.product_id,
       COALESCE(ROUND(s.total_revenue / s.total_units, 2), 0) AS average_price
FROM products pr
LEFT JOIN sales s ON pr.product_id = s.product_id
ORDER BY pr.product_id;
