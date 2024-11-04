import java.util.Scanner;
class tt
{
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your 1st number");
        int a = Sc.nextInt();
        System.out.println("Enter your 2nd number");
        int b = Sc.nextInt();
        int c = a+b;
        System.out.println("The summetion is:"+c);
    }
}