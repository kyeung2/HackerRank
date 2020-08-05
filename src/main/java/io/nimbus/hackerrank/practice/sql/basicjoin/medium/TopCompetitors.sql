# https://www.hackerrank.com/challenges/full-score/problem


# almost got this on my own
SELECT h.hacker_id, h.name
FROM Hackers h
# remembered to do an INNER JOIN this time, rather than just JOIN
         INNER JOIN Submissions s ON h.hacker_id = s.hacker_id
         INNER JOIN Challenges c ON s.challenge_id = c.challenge_id
         INNER JOIN Difficulty d ON c.difficulty_level = d.difficulty_level
WHERE s.score = d.score

# don't understand entirely but the GROUP BY required both attributes, my original attempt only grouped by the h.hacker_id
GROUP BY h.hacker_id, h.name
HAVING COUNT(h.hacker_id) > 1
ORDER BY COUNT(h.hacker_id) DESC, h.hacker_id
