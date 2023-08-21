import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float mathMark = 0;
        float scienceMark = 0;
        float englishMark;
        float percentage;
        System.out.println("Enter mathMark, scienceMark, englishMark : ");
        mathMark = scanner.nextFloat();
        scienceMark = scanner.nextFloat();
        englishMark = scanner.nextFloat();
        percentage = ((mathMark+scienceMark+englishMark)/300)*100;
        if (percentage >= 90 && percentage <=100){
            System.out.println("you have got A+");
        } else if (percentage >= 80 && percentage <=90) {
            System.out.println("you have got A");
        }
        else if (percentage >= 70 && percentage <=80) {
            System.out.println("you have got B+");
        }
        else if (percentage >= 60 && percentage <=70) {
            System.out.println("you have got B");
        }
        else if (percentage >= 50 && percentage <=60) {
            System.out.println("you have got C+");
        }
        else if (percentage >= 40 && percentage <=50) {
            System.out.println("you have got C");
        }
        else{
            System.out.println("You are fail");
        }
    }
}
