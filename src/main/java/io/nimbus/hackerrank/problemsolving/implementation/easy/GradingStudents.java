package io.nimbus.hackerrank.problemsolving.implementation.easy;

import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/grading/problem
 */
public class GradingStudents {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        return grades.stream()
                .map(grade -> {
                    if( grade >= 38) {
                        int nextMultipleOf5 = (((grade / 5) + 1) * 5);
                        return nextMultipleOf5 - grade < 3 ? nextMultipleOf5 : grade;
                    }
                    return grade;
                })
                .collect(Collectors.toList());
    }
}
