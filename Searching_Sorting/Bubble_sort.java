package Searching_Sorting;

public class Bubble_sort {
    public static void bubbleSort(int arr[]){
        for (int i =0; i<arr.length -1 ;i++){
            for(int j =0; j< arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
    }

    public static void main(String[] args) {

        int arr[] = {2,3,4,8,55,77,33,2,4};
        bubbleSort(arr);
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
