class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0],index=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
            min=prices[i];
            index=i;
            }
        }
        int max=min;
        for(int i=index+1;i<prices.length;i++){
            if(max<prices[i]){
                max=prices[i];
            }
        }        
        return max-min;
    }
}