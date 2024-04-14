class Solution {
    public boolean binarysearch(int[] i, int target, int n){
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(i[mid]==target){
                return true;
            }
            else if(i[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0;
        int right=m-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(matrix[mid][0]<=target && matrix[mid][n-1]>=target){
                return binarysearch(matrix[mid], target, n);
            }
            else if(matrix[mid][0]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return false;
    }
}
