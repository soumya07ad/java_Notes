public class col_no_fixedsize {
    public static void main(String[] args) {
        int arr[][]= {
                {1,2,3,4},
                {7,8},
                {9,10,11}
        };
        for(int row=0; row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

    }
}
