package Searching_Sorting;

public class Binary_search {
//    public static int[] takeInput(){
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int [] arr = new int[size];
//        for(int i = 0; i<size; i++){
//            arr[i]= sc.nextInt();
//        }
//        return arr;
//    }

    public static int binarySearch(int n, int [] arr){
        int start=0;
        int end =arr.length -1;
        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid]==n){
                return mid;
            }
            else if(n> arr[mid]){
                start =mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]= {23, 34, 45, 56, 67, 78, 100};

        int index = binarySearch(2, arr);
        System.out.println(index);
    }
}
