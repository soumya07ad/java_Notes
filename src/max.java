public class max {
    public static void main(String[] args) {
      int [] arr ={1,3,2,67,8};
        System.out.println(maxRange(arr, 2,3));
    }
    //imagine the array is not empty
    // work on the edge cases here, like array being null
    static int maxRange(int[] arr, int start, int end){
        if(end>start){
            return -1;
        }
        if(arr == null){
            return -1;
        }
        int maxval = arr[start];
        for(int i=start; i<end;i++){
            if(arr[i]>maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
    //imagine the array is not empty
    static int max(int[] arr){
        if(arr.length ==0){
            return -1;
        }
        int maxval = arr[0];
        for(int i=1; i<arr.length;i++){
            if(arr[i]>maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
