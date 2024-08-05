import java.util.Scanner;
public class Tickets{
    public static void main(String[] args){
        int cost;
        Scanner read = new Scanner(System.in);
        cost = read.nextInt();
        if(4 * cost <= 1000){
            System.out.printf("YES
");
        }
        else{
            System.out.printf("NO");
        }
        
    }
}