package Patterns;
import java.util.Scanner;
public class Pyramid {
    public static void main(String argvs[]){
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if(j<a-i-1)
                System.out.print("_");  
                else{
                System.out.print("*");
                if(j<a-1)
                System.out.print("_");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
