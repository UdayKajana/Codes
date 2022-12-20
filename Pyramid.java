package Patterns;
import java.util.Scanner;
public class Pyramid {
    public static void main(String argvs[]){
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int count=1;
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if(j<a-i-1)
                System.out.print(" ");  
                else{
                System.out.print("asdfghjkl;");
                if(j<a-1)
                System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
