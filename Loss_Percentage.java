import java.util.Scanner;
public class Loss{
    public static void main(String[] args){
        int cp,sp;
        float p,loss;
        Scanner read = new Scanner(System.in);
        cp = read.nextInt();
        sp = read.nextInt();
        loss = cp - sp;
        p = (loss * 100) / cp;
        System.out.printf("%.2f",p);
    }
}