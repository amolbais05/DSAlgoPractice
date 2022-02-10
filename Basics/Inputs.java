import java.util.Scanner;

public class Inputs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter some input : ");
        int rollNum = scanner.nextInt();
        System.out.println("Your Roll number is : "+rollNum);

        int num = 234_000_000;
        System.out.println(num);

        System.out.print("Please enter name : ");
        String name = scanner.next();
        System.out.println("Your name : "+name);

        System.out.print("Please marks : ");
        float marks = scanner.nextFloat();
        System.out.println("Your name : "+marks);
    }
}
