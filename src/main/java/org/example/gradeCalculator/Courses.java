package org.example.gradeCalculator;

import java.util.List;

public class Courses {

    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    public double multiplyCreditAndCourseGrade() {
        return courses.stream()
                .mapToDouble(Course::multiplyCreditAndCourseGrade)
                .sum();
//        double multipliedCreditAndCourseGrade = 0;
//        for(Course course: courses){
////            multipliedCreditAndCourseGrade += course.getCredit() * course.getGradeToNumber();
//            // 위의 코드에서는 응집도가 낮아 변화가 생겼을 경우 해당 로직을 사용하는 모든 부분에서 수정해줘야 한다.
//            // 하지만 밑의 코드에서는 course에서 계산하므로 해당 메서드만 수정해주면 모든 사용한 부분에 변화가 적용된다.(응집도 향상)
//            multipliedCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
//        }
//        return multipliedCreditAndCourseGrade;
    }

    public int calculateTotalCompletedCredit() {
        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
