import javax.naming.NameNotFoundException;
import java.util.Scanner;

public class Main {
public static  void QuadraticEquation()//שאלה 1
{
    int a;
    int b;
    int c;
    Scanner scanner=new Scanner(System.in);
    double sum;
    System.out.println(" enter a : ");
    a = scanner.nextInt();
    System.out.println(" enter b : ");
    b = scanner.nextInt();
    System.out.println(" enter c : ");
    c = scanner.nextInt();
    int ac = a * c;
    double x1 = (-b + (Math.sqrt(b * b - 4 * ac))) / (2 * a);
    double x2 = (-b - (Math.sqrt(b * b - 4 * ac))) / (2 * a);
    if ((b * b - 4 * ac) < 0) {
        System.out.println("There is no answer");
    } else if (x1 != x2) {
        System.out.println("x1 :  " + x1 + "    x2 :   " + x2);
    } else {
        System.out.println("the answer is :  " + x1);
    }

}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuadraticEquation();//שאלה 1
        // שאלה 2
        System.out.println("enter the first number : ");
        double a1 = scanner.nextDouble();
        System.out.println("write the quantity :  ");
        double  n = scanner.nextDouble();
        System.out.println(" write the remainder : ");
        double d = scanner.nextDouble();
        double Sum =a1;
        if (n>0&&n%1==0)
        {
            for (int i=0; i<n; i++) {
                System.out.print(Sum + " , ");
                Sum=Sum+d;
            }
        }
        else {
            System.out.println("youre quantity is wrong");
        }



        //שאלה 3





    }

}