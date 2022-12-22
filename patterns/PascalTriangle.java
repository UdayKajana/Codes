package patterns;
import java.util.Scanner;
public class PascalTriangle {
    public static void main(String argvs[]){
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int c; boolean flag=false;
        for(int i=0;i<a;i++){
            c=0;
            for(int j=0;j<a;j++){
                if(j<a-i)
                System.out.print(" ");
                else{
                    if(flag)
                System.out.print(--c+1);
                else
                System.out.print((c++)+1);
                if(j<a)
                System.out.print(" ");
            }
            if(c+1==i)
            flag=!flag;
            }
            System.out.println();
        }
        scanner.close();
    }
}