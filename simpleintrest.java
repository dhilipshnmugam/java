import java.util.Scanner;
public class simpleintrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float p,r,t,si;
        System.out.print("Enter the principal amount: ");
        p=sc.nextFloat();
        System.out.print("Enter the rate: ");
        r=sc.nextFloat();
        System.out.print("Enter the time: ");
        t=sc.nextFloat();
        si=(p*t*r/100);
        System.out.println("the simple intrest "+si);
    }
}
