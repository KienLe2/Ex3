import java.util.Random;

public class FindingNumber {
    public static void main(String[] args) {
        int count = 0, currentNum, smallestNum= 1 , largestNum= 100;

        //For randomly 10 number
        Random randomNum = new Random();
        currentNum = randomNum.nextInt(100) + 1;
        while (count < 10) { // count 10 times
            if (currentNum > largestNum) {
                largestNum = currentNum;
            }

            if (currentNum < smallestNum) {
                smallestNum = currentNum;
            }
            count++; // count = count + 1 run 10times
        }
        System.out.println("The largest number is: " + largestNum);
        System.out.println("\nThe smallest number is: " + smallestNum);
    }
}
