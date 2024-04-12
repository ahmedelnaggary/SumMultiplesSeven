import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n1 = scanner.nextInt();
    int n2 = scanner.nextInt();
    int sum = sumMultiSeven(n1,n2);
        System.out.println("Sum = "+sum);
    }
    public static int sumMultiSeven(int n1,int n2)
    {
        if(n2<=n1)
            return 0;
        else if (n1%7==0)
        {
            return n1 + sumMultiSeven(n1+1,n2);
        }
        else
            return sumMultiSeven(n1+1,n2);
    }
}
