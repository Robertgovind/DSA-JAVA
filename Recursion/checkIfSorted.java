package Recursion;

public class checkIfSorted {
    public static boolean CheckSorted(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
       if(arr[index]>arr[index+1]){
        return false;
       }
       return CheckSorted(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,6,8,9};
        System.out.println(CheckSorted(arr, 0));
    }
}
