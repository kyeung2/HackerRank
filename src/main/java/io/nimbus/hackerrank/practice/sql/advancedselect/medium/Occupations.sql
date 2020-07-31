# https://www.hackerrank.com/challenges/occupations/problem

# the inner Temp table's    as Doctor etc rows I could get on my own. But the "Ranking" idea I needed help with.
set @r1 = 0, @r2 = 0, @r3 = 0, @r4 = 0;
# min() aggregate function will get first non-null value after group by
select min(Doctor), min(Professor), min(Singer), min(Actor)
from (
         select case
                    when Occupation = 'Doctor' then (@r1 := @r1 + 1)
                    when Occupation = 'Professor' then (@r2 := @r2 + 1)
                    when Occupation = 'Singer' then (@r3 := @r3 + 1)
                    when Occupation = 'Actor' then (@r4 := @r4 + 1) end as RowNumber,
                case when Occupation = 'Doctor' then Name end           as Doctor,
                case when Occupation = 'Professor' then Name end        as Professor,
                case when Occupation = 'Singer' then Name end           as Singer,
                case when Occupation = 'Actor' then Name end            as Actor
         from OCCUPATIONS
         order by Name
     ) Temp
group by RowNumber


/**
  the inner select produces the Temp resultset/Table

  RowNumber, Doctor, Professor, Singer, Actor.
  ------------------
  1 Aamina NULL NULL NULL
1 NULL Ashley NULL NULL
2 NULL Belvet NULL NULL
3 NULL Britney NULL NULL
1 NULL NULL Christeen NULL
1 NULL NULL NULL Eve
2 NULL NULL Jane NULL
2 NULL NULL NULL Jennifer
3 NULL NULL Jenny NULL
2 Julia NULL NULL NULL
3 NULL NULL NULL Ketty
4 NULL NULL Kristeen NULL
4 NULL Maria NULL NULL
5 NULL Meera NULL NULL
6 NULL Naomi NULL NULL
3 Priya NULL NULL NULL
7 NULL Priyanka NULL NULL
4 NULL NULL NULL Samantha

 */