import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        char a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character:");
        a=sc.next().charAt(0);
        int p=(int)a;
        System.out.println("The ASI value of " + p);  
    }
}
