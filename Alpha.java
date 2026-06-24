public class Alpha{
    public static void main(String[] args){
        int [] arr = {1, 2, 3, 4};
        int left=0;
        int right= arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            int target=0;
            if(sum==target){
                System.out.println(sum);
                  return;
            } else if(sum<target){
                left++;
            } else {
                right--;
            }
        }
    }
}