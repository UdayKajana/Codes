package patterns;
import java.util.Scanner;
public class PascalTriangle {
    public static void main(String argvs[]){
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int count=1; boolean flag=true;
        for(int i=0;i<a;i++){
            count=0;
            flag=true;
            for(int j=0;j<a;j++){
                if(j<a-i)
                System.out.print(" ");
                else{
                    if(flag && count<=i/2){
                        count++;
                        flag=false;
                        System.out.print(count);
                    }
                    else{
                        count--;
                        System.out.print(count);
                    }
                    if(j<a)
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}