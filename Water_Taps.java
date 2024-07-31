import java.util.Scanner;
public class Taps{
    public static void main(String[] args)
    {
        int x,y,z;
        Scanner read = new Scanner (System.in);
        x = read.nextInt();
        y = read.nextInt();
        z = (x * y) / (x + y);
        System.out.println(z);
    }
}