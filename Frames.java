import java.util.Scanner;
public class Frames{
    public static void main(String[] args){
        int a,b,c,money;
        Scanner read = new Scanner(System.in);
        a = read.nextInt();
        b = read.nextInt();
        c = read.nextInt();
        money = (2*(a + b)*c);
        System.out.println(money);
        
    }
}