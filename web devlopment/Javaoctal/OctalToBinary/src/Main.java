import java.net.StandardSocketOptions;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        int n,rem,arm=0,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no");
        n = sc.nextInt();
        c=n;
        while(n>0)
        {
            rem = n % 10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if(c==arm){
            System.out.println("armstron no");
        }
        else{
            System.out.println("Not armstrong");
        }
    }
}