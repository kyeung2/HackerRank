# https://www.hackerrank.com/challenges/harry-potter-and-wands/problem?h_r=next-challenge&h_v=zen


SELECT w.id, wp.age, w.coins_needed, w.power
FROM Wands w
         INNER JOIN Wands_Property wp ON w.code = wp.code
WHERE wp.is_evil = 0

#    this sub select I didn't get on my own. Very odd construct.
  AND w.coins_needed = (SELECT MIN(w1.coins_needed)
                        FROM WANDS w1
                                 INNER JOIN Wands_Property wp1 ON w1.code = wp1.code
                        WHERE w.power = w1.power
                          AND wp.age = wp1.age
)

ORDER BY w.power DESC, wp.age DESC;


#
#
#
#
#
#  the following doesn't work, but is insightful to why
SELECT w1.id, wp1.age, MIN(w1.coins_needed), w1.power
FROM WANDS w1
         INNER JOIN Wands_Property wp1 ON w1.code = wp1.code
WHERE wp1.is_evil = 0

# the issue is that we want to be grouping by w1.power, wp1.age only as those are the pairs that have to be
# unique in the exercise. But since its a none aggregated column in the SELECT, we need to include
# therefore, not getting the correct result.
GROUP BY w1.power, wp1.age, w1.id
ORDER BY w1.power DESC, wp1.age DESC;