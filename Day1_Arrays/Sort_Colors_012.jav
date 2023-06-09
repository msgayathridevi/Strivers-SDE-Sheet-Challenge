class Sort_Colors_012
 {
    public void swap(int a,int b){
        int t=a;
        a=b;
        b=t;
    }
    public void sortColors(int[] a) {
        int low=0,high=a.length-1,mid=0;
        while(mid<=high){
        // for(int i=0;i<a.length-1;i++){
            if (a[mid]==0){
                swap(a[low],a[mid]);
                low++;mid++;
            }
            else if(a[mid]==1)mid++;
            else if(a[mid]==2){
                swap(a[mid], a[high]);
                high--;
            }
        }
    }
}