# https://www.hackerrank.com/challenges/what-type-of-triangle/problem

# didn't get this on my own
SELECT CASE

#     firstly can we make a triangle? any 2 sides summed must be greater than the last side.
           WHEN A + B > C AND A + C > B AND B + C > A THEN CASE
                                                               WHEN A = B AND B = C THEN 'Equilateral'
#                if not all equal, if we have 2 sides equal then isosceles
                                                               WHEN A = B OR B = C OR A = C THEN 'Isosceles'
#                otherwise all sides must be different
                                                               ELSE 'Scalene' END
           ELSE 'Not A Triangle' END
FROM TRIANGLES;