# https://www.hackerrank.com/challenges/binary-search-tree-1/problem

SELECT N,
       CASE
           WHEN P IS NULL THEN 'Root'
#            since evaluation is sequential, all the other "parent" nodes that are not the root are inner
           WHEN N IN (SELECT P FROM BST) THEN 'Inner'
#            remaining are the leaf nodes
           ELSE 'Leaf'
           END
FROM BST
ORDER BY N;