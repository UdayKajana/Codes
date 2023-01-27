package patterns;
import java.util.Scanner;
public class PascalTriangle {
    public static void main(String argvs[]){
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int count=1;
        boolean flag=true;
        for(int i=0;i<a;i++){
            count=1;
            flag=true;
            for(int j=0;j<a;j++){
                if(j<a-i-1)
                System.out.print(" ");
                else{
                    if(count==(i+3)/2)
                    flag=false;
                    if(flag)
                    System.out.print(count++);
                    else
                    System.out.print(count--);
                    if(j<a-1)
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}