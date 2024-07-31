import java.util.Scanner;
public class Square{
    public static void main(String[] args){
        int a,area,peri;
        Scanner read = new Scanner (System.in);
        a = read.nextInt();
        area = a * a;
        peri = 4 * a;
        System.out.print(area+ " " + peri);
    }
}