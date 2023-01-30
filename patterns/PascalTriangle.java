package patterns;
import java.util.Scanner;
public class PascalTriangle {
    public static void main(String argvs[]){
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int half=0;
        boolean flag=true;        
        int p=0;
        for(int i=0;i<a;i++){
            p=1;
            for(int j=0;j<a;j++){
                if(j<a-i-1)
                System.out.print(" ");
                else{
                    if(j==a)
                    System.out.print(j);
                    else
                    System.out.print(j);
                    if(j<a-1)
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}