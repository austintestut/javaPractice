import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        System.out.println("Please enter 5 test scores.");

        Scanner userInput = new Scanner(System.in);
        String currentLetterGrade;

        String score1String = userInput.nextLine();
        int score1 = Integer.parseInt(score1String);
        currentLetterGrade = determineGrade(score1);
        System.out.println("This grade was " + currentLetterGrade);

        String score2String = userInput.nextLine();
        int score2 = Integer.parseInt(score2String);
        currentLetterGrade = determineGrade(score2);
        System.out.println("This grade was " + currentLetterGrade);

        String score3String = userInput.nextLine();
        int score3 = Integer.parseInt(score3String);
        currentLetterGrade = determineGrade(score3);
        System.out.println("This grade was " + currentLetterGrade);

        String score4String = userInput.nextLine();
        int score4 = Integer.parseInt(score4String);
        currentLetterGrade = determineGrade(score4);
        System.out.println("This grade was " + currentLetterGrade);

        String score5String = userInput.nextLine();
        int score5 = Integer.parseInt(score5String);
        currentLetterGrade = determineGrade(score5);
        System.out.println("This grade was " + currentLetterGrade);

        double average = calcAverage(score1, score2, score3, score4, score5);
        System.out.println("Your test grade average is " + average);
    }

    public static double calcAverage(int score1, int score2, int score3, int score4, int score5) {
        return (score1 + score2 + score3 + score4 + score5) / 5;
    }

    public static String determineGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
