package HackerEarth_CodeMonk;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CycleShift {
    static int max=0;
    static int index=0;
    public static void main(String argvs[]){
        int n,T,k;
        List<String> list=new ArrayList<String>();
        String s,temp;
        Scanner scanner = new Scanner(System.in);
        T=scanner.nextInt();
        while(T>0){
            n=scanner.nextInt();
            k=scanner.nextInt();
            s=scanner.next();
            for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                temp=s.substring(i);
                temp=temp+s.substring(0,i);
                findDecimal(temp,i);                
            }
        }
        System.out.println(index+((k-1)*s.length()));
            T--;            
        }
        scanner.close();
    }

    private static void findDecimal(String temp,int ind) {
        int sum=0,mult=1;
        for(int i=temp.length()-1;i>=0;i--){
            sum=sum+(Integer.parseInt(String.valueOf(temp.charAt(i)))*mult);
            mult=mult*2;
        }
        if(sum>max){
            max=sum;
            index=ind;
        }
    }
}
