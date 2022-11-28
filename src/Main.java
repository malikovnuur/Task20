import javax.xml.crypto.dsig.TransformException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println(" write  length: ");
            int length = scanner.nextInt();
            System.out.println("write  width: ");
            int width = scanner.nextInt();
            System.out.println("write  height: ");
            int height = scanner.nextInt();
            Parallelepiped parallelepiped = new Parallelepiped(length, width, height);
            if (parallelepiped.getLength() < 0 || parallelepiped.getWidth() < 0 || parallelepiped.getHeight() < 0) {
                throw new ArithmeticException("The input msut be positive number");
            } else if (parallelepiped.getLength() > 20 || parallelepiped.getWidth() > 20 || parallelepiped.getHeight() > 20) {
                throw new ArithmeticException("The input must be less than 20");
            } else {
                parallelepiped.Area();
                parallelepiped.Volume();
            }
        } catch ( InputMismatchException e){
            throw new InputMismatchException("The input must be a number");
        }


    }
}