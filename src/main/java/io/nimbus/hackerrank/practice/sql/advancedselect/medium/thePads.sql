# https://www.hackerrank.com/challenges/the-pads/problem?h_r=next-challenge&h_v=zen

SELECT CASE
           WHEN Occupation = 'Doctor' THEN CONCAT(Name, '(D)')
           WHEN Occupation = 'Professor' THEN CONCAT(Name, '(P)')
           WHEN Occupation = 'Singer' THEN CONCAT(Name, '(S)')
           WHEN Occupation = 'Actor' THEN CONCAT(Name, '(A)')
           END
FROM OCCUPATIONS
ORDER BY Name;

SELECT CONCAT('There are a total of ', COUNT(Occupation), ' ', LOWER(Occupation), 's.')
FROM OCCUPATIONS
GROUP BY Occupation
ORDER BY COUNT(Occupation), Occupation;