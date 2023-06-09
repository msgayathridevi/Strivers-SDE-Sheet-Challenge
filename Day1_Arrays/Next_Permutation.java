class Next_Permutation {
    public void swap(int[] a, int i, int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
    public void reverse(int a[],int i, int j){
        while(i<j)swap(a,i++,j--);
    }
    public void nextPermutation(int[] a) {
        if(a==null || a.length<=1) return;
        int i=a.length-2; // backwards i<i+1
        while(i>=0 && a[i]>=a[i+1])i--;
        if(i>=0) //imp
        {
            int j=a.length-1; // to swap the 2 nos
            while( a[i]>=a[j])j--;
            swap(a,i,j); // pass index
        }
        reverse(a,i+1,a.length-1); // pass index
    }
}