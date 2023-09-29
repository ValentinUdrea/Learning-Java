import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1 for Addition");
        System.out.println("2 for Substraction");
        System.out.println("3 for multiplication");
        System.out.println("4 for division");

        int choose = input.nextInt();

        System.out.println("Chose two numbers");
        double firstNum = input.nextDouble();
        double secondNum = input.nextDouble();

        if (choose == 1){
            System.out.println("Adding the two numbers = " + add(firstNum,secondNum));
        }else if( choose == 2){
            System.out.println("Substracting the two numbers = " + sub(firstNum,secondNum));
        }else if( choose == 3){
            System.out.println("Mutiplying the two numbers = " + mult(firstNum,secondNum));
        }else if( choose == 4){
            System.out.println("Dividing the two numbers = " + div(firstNum,secondNum));
        }




        }
        public static double add(double x,double y){
        double result = x + y;
        return result;

        }
    public static double sub(double x,double y){
        double result = x - y;
        return result;

    }
    public static double mult(double x,double y){
        double result = x * y;
        return result;
    }
    public static double div(double x,double y){
        double result = x / y;
        return result;

    }

}
