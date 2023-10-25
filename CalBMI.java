import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class CalBMI{
    public static void main(String[] args) throws IOException {
        float heightNum, weightNum, resultBMI;

        BufferedReader brf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your heightNum: ");
        heightNum = Float.parseFloat(brf.readLine());
        System.out.println("Enter your weightNum: ");
        weightNum = Float.parseFloat(brf.readLine());
        resultBMI = weightNum / (heightNum * heightNum);
        System.out.println("Your result of BMI: " + resultBMI + "kg/m2");
    }

}