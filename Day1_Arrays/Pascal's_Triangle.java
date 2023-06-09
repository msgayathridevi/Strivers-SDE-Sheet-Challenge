class Pascal's_Triangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> row, pre = null;
        int n=numRows;
        for (int i=0;i<n;i++){
            row= new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0 || i==j ) //1st or last col
                    row.add(1);
                else
                    row.add(pre.get(j-1)+pre.get(j));
            }
            pre= row; ans.add(row);
        }
        return ans;
    }
}