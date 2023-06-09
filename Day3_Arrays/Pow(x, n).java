class Solution {
    public double myPow(double x, int n) {
        long nn=n;
        double ans=1;
        if(n<0) nn=-1*nn;
        while(nn>0){
            if(nn%2==0){
                x=x*x;
                nn/=2;
            }
            else{
                ans=ans*x;
                nn-=1;
            }
        }
        if(n<0) return (double) (1/ans);
        return ans;
    }
}