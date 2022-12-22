package patterns;
import java.util.Scanner;
public class Pyramid {
    public static void main(String argvs[]){
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if(j<a-i)
                System.out.print(" ");
                else
                System.out.print("*");
                if(j<a)
                System.out.print(" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}