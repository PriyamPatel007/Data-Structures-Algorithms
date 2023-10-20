class Solution {
    public void rotate(int[][] matrix){
    int n=matrix.length; 
    int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
     for(int i=0;i<n;i++){
         int temp[]=matrix[i];
         int s=0;
         int e=temp.length-1;
         while(s<e){
             int temp1=temp[s];
             temp[s]=temp[e];
             temp[e]=temp1;
             s++;
             e--;
         }
         matrix[i]=temp;
     }
}
}
