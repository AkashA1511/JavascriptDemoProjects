import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a octal no");
        int octal = sc.nextInt();
        int decimal =0;
        int binary =0;
        int reverse=0;
        int mod = 0;

        while(octal>0)
        {
            mod = octal % 10;
            decimal = decimal+ (mod + ((int) Math.pow(8,count++)));

            octal = octal/10;
            


        }
    }
}