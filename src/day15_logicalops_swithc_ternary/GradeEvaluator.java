package day15_logicalops_swithc_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'D';
        if (grade == 'A' || grade == 'B' || grade == 'C'||grade=='a'||grade=='b'||grade=='c') {
            System.out.println("Pass. with grade :" + grade);

        } else if (grade == 'D') {
            System.out.println("Qualify for retake. Grade - " + grade);

        } else if (grade == 'E') {
            System.out.println("Fail. Grade - " + grade);

        } else {
            System.out.println("Invalid Grade - " + grade);
        }
    }
}

