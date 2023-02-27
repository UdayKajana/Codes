class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0],maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else if(maxProfit<prices[i]-min){
               maxProfit=prices[i]-min;
            }
        }     
        return maxProfit;
    }
}