import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        double num1,num2;
        Scanner scan=new Scanner(System.in);
        System.out.println(" ");
        System.out.println("** I hope you like my Calculator **");
        System.out.println(" ");
        System.out.print ("Enter Operation (+,-,*,/): ");
        String operation=scan.next();
        System.out.print("Enter First Number: ");
        double firstnum=scan.nextDouble();
        System.out.print("Enter Second Number: ");
        double secondnum=scan.nextDouble();

        double greatest = Math.max(firstnum, secondnum);
        if (greatest==firstnum){
            num1=firstnum;
            num2=secondnum;
        }
        else if (greatest==secondnum){
            num2=firstnum;
            num1=secondnum;
        }
        else{
            num1=firstnum;
            num2=secondnum;
        }


        if (operation.equals("+")){
            System.out.println("The sum is:"+(firstnum+secondnum));
        }
        else    if (operation.equals("-")){
            System.out.println("The difference is:"+(num1-num2));
        } else    if (operation.equals("*")){
            System.out.println("The result is:"+(num1*num2));
        } else    if (operation.equals("/")){
            System.out.println("The division is:"+(num1/num2));
        }
        else{
            System.out.println("Operation Not Found");
        }
    }
}