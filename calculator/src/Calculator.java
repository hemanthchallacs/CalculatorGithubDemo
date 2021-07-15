import java.util.Scanner;

public class Calculator {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 values");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter operation: ");
        char c = sc.next().charAt(0);
        switch(c){
            case '+':
                    Add add = new Add();
                    System.out.println(add.adding(a,b));
                    break;
            case '-':
                Difference diff = new Difference();
                System.out.println(diff.subtracting(a,b));
                break;
            default: break;
        }

    }
}
