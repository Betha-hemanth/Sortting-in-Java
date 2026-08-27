import java.util.*;
public class CyclicSort {
    static void main(String[] args) {
        int[] arr = { 3, 5, 2, 1, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctindex = arr[i] - 1;
            if(arr[i] < arr[correctindex]){
                swap(arr,i,correctindex);
            }else{
                i++;
            }if(arr[i] != i){
                int missingnumber = i;
            }
        }
    }
    static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
