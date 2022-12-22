package Patterns;
import java.util.Scanner;
public class Diamond {
    public static void main(String argvs[]){
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int c=(a*2)-1;
        for(int i=0;i<c;i++){
            for(int j=0;j<c;j++){
                if(j<Math.abs(a-i-1) || j>(a+i-1) || (i>=a && j>=(c-i%a-1)))
                System.out.print("   ");
                else
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}
