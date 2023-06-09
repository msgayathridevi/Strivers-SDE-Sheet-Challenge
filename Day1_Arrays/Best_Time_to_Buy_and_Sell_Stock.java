class Best_Time_to_Buy_and_Sell_Stock{
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0; // no -ve
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minprice)
                minprice=prices[i];
            else if(prices[i]-minprice > maxprofit)
                maxprofit=prices[i]-minprice;
        }
        return maxprofit;
    }
}