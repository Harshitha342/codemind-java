import java.util.Scanner;
public class Sum{
    public static void main(String[] args){
        int n;
        Scanner read = new Scanner(System.in);
        n = read.nextInt();
        int ans = (n*(n+1) / 2);
        System.out.printf("%d",ans);
    }
}