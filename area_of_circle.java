import java.util.Scanner;
public class radius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int radius;
        double Pi=3.14,area;
        System.out.print("Enter the radius : ");
        radius=sc.nextInt();
        area=Pi*radius*radius;
        System.out.println("area of the cicle : "+area);
    }
}
