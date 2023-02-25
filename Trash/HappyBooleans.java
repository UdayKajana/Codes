package Trash;
public class HappyBooleans{
    public static void main(String argvs[]){
        HappyBooleans happyBooleans=new HappyBooleans();
        int[] a={0,0,0,1,1};
        System.out.println(happyBooleans.happyBooleans(a, 6));
    }
    public int happyBooleans(int arr[],int N){
        int happyCount=0;
        if (arr[arr.length-1]==arr[arr.length-2])
        happyCount++;
        if(arr[0]==arr[1])
        happyCount++;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1]!=arr[i]||arr[i]!=arr[i+1]){
                happyCount++;
            }
        }
        return happyCount;
    }
}
