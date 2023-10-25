import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CalSquare {
    public static void main(String[] args) throws IOException {
        float a, b, c;
        float root1, root2, imaginaryNum;
        float discriminant;

        BufferedReader brf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter value a: ");
        a = Float.parseFloat(brf.readLine());
        System.out.println("Enter value b: ");
        b = Float.parseFloat(brf.readLine());
        System.out.println("Enter value c: ");
        c = Float.parseFloat(brf.readLine());


        discriminant = (b * b) - (4 * a * c);
// > 0
        switch ((int) discriminant)  {
            case '1':
                root1 = (float) ((-b + Math.sqrt(discriminant)) / (2 * a));
                root2 = (float) ((-b - Math.sqrt(discriminant)) / (2 * a));
                System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
                break;
// == 0
            case '2':
                root1 = root2 = -b / (2 * a);
                System.out.format("root1 = root2 = %.2f;", root1);
                break;
// < 0
            case '3':
                float realNum = -b / (2 * a);
                imaginaryNum = (float) Math.sqrt(-discriminant) / (2 * a);
                System.out.format("root1 = %.2f+%.2fi", realNum, imaginaryNum);
                System.out.format("\nroot2 = %.2f-%.2fi", realNum, imaginaryNum);
                break;

        }
    }
}
