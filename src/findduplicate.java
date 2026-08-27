import java.util.*;
public class findduplicate {
    static void main(String[] args) {
        int[] arr = {3, 1, 4, 2, 2};
        System.out.println(sort(arr));
    }
    static int sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] != i + 1){
                int correctindex = arr[i] - 1;
                if(arr[i] != arr[correctindex]){
                    swap(arr,i,correctindex);
                }else{
                    return arr[i];
                }

            }else{
                i++;
            }

        }
        return -1;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
