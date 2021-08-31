package Searching_Sorting;

public class Selection_sort {
    public static void selectionSort(int [] arr){
        for (int i=0; i<arr.length -1; i++){
            int min = arr[i];
            int minIndex= i;
            for(int j= i+1; j< arr.length; j++){
                if(arr[j]< min){
                    min =arr[j];
                    minIndex = j;
                }
            }
            if(minIndex!= i){
                arr[minIndex]= arr[i];
                arr[i]= min;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]= {23,45,22,11,2,100,789};
        selectionSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
