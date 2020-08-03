# https://www.hackerrank.com/challenges/earnings-of-employees/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen

SELECT  (salary * months) as total, COUNT(*) FROM Employee
GROUP BY  total
ORDER BY total DESC
LIMIT 1;