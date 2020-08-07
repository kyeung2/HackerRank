# https://www.hackerrank.com/challenges/challenges/problem

# didn't get this one on my own entirely. The beta makes sense though the
# steps to achieve it was beyond my current level.

# the idea is to alias the aggregate of the count of challenges, then using a HAVING condition
# to reduce the results
SELECT h.hacker_id, h.name, COUNT(c.challenge_id) as c_count
FROM Hackers h
         INNER JOIN Challenges c ON h.hacker_id = c.hacker_id
GROUP BY h.hacker_id, h.name
# c_count aggregate can be..
HAVING c_count =
#         the max number of total challenges...
       (SELECT MAX(temp1.total_challenges)
       FROM (
           SELECT COUNT(hacker_id) as total_challenges
           FROM Challenges
           GROUP BY hacker_id) temp1)
    OR
#  OR the total challenges that only occur once.
        c_count in
        (SELECT temp2.total_challenges
#         inner select gets the counts per hacker, so 2,2,2,2,2,3,4 etc
         FROM (SELECT COUNT(hacker_id) AS total_challenges
               FROM Challenges
               GROUP BY hacker_id) temp2
#         group by the counts, so 2 occurs 5 times, 3 occurs once, 4 occurs once.
#         Note: GROUP BY is used to group rows with the SAME value, doesn't hve to
#         be used with an aggregate function at all!
         GROUP BY temp2.total_challenges
#         having it occur once.
#         Note: I didn't know you could use aggregate functions in a HAVING clause.
         HAVING COUNT(temp2.total_challenges) = 1)

ORDER BY c_count DESC, h.hacker_id