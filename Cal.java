import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        float firstNumber;
        float secondNumber;
        float resultNumber;
        char operation; //etc /+,-,/,*
        // Calculation
        Scanner enterNum = new Scanner(System.in);


        /* Calculating */
        System.out.println("Enter your operation: *, /, +, -");
        operation = enterNum.next().charAt(0);
        System.out.println("Enter your first Number: ");
        firstNumber = enterNum.nextFloat();
        System.out.println("Enter your first Number: ");
        secondNumber = enterNum.nextFloat();


        switch (operation) {
            case '+':
                resultNumber = firstNumber + secondNumber;
                System.out.println("Your result: " + resultNumber);
                break;

            case '-':
                resultNumber = firstNumber - secondNumber;
                System.out.println("Your result: " + resultNumber);
                break;

            case '/':
                resultNumber = firstNumber / secondNumber;
                System.out.println("Your result: " + resultNumber);
                break;

            case '%':
                resultNumber = firstNumber % secondNumber;
                System.out.println("Your result: " + resultNumber);
                break;

            case '*':
                resultNumber = firstNumber * secondNumber;
                System.out.println("Your result: " + resultNumber);
                break;
        }
    }
}