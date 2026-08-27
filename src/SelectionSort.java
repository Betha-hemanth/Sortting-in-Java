import java.util.*;
public class SelectionSort {
    static void main(String[] args) {
        int[] arr = {5, 4, 3, 1, 2};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Selection(int[] arr){
        for(int i =  0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int maxindex = getMaxIndex(arr,0,last);

                int temp = arr[maxindex];
                arr[maxindex] = arr[last];
                arr[last] = temp;
        }
    }

    static int getMaxIndex(int[] arr,int start,int end){
        int max = start;
        for(int i = start; i <= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;


    }
}
