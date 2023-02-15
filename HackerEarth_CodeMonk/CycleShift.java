package HackerEarth_CodeMonk;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CycleShift {    
    List<Integer> index=new ArrayList<Integer>();
    int n,T,k,max=-10000; 
    public static void main(String argvs[]){
        CycleShift cs=new CycleShift();
        cs.start();
        cs.solve();
        cs.close();
    }
    private void close() {
    }
    private void start() {
        String s,temp;
        Scanner scanner = new Scanner(System.in);
        T=scanner.nextInt();
        while(T>0){
            index.clear();
            n=scanner.nextInt();
            k=scanner.nextInt();
            s=scanner.next();
            System.out.println(s);
            for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                temp=s.substring(i);
                temp=temp+s.substring(0,i);
                System.out.println(temp);
                //findDecimal(temp,i);                
            }
        }
        for(int i=0;i<index.size();i++)
        System.out.print(index.get(i)+"- ");
            T--;            
        }
        scanner.close();
    }    
    private void solve() {
    }
    private void findDecimal(String temp,int ind) {
        int sum=0,mult=1;
        for(int i=temp.length()-1;i>=0;i--){
            sum=sum+(Integer.parseInt(String.valueOf(temp.charAt(i)))*mult);
            mult=mult*2;
        }
        System.out.print(sum+" + ");
        // if(sum>max){
        //     max=sum;
        //     index.clear();
        //     index.add(ind);
        // }
        // else if(sum==max){
        //     index.add(ind);
        // }
    }
}
