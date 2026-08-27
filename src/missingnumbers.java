import java.util.*;
public class missingnumbers {
    static void main(String[] args) {
        int[] arr = { 3, 2, 0, 4,8,7,1,5};
        System.out.println(sort(arr));
    }
    static int sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctindex = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[correctindex]){
                swap(arr,i,correctindex);
            }else {
                i++;
            }
            }
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index + 1){
                return index;
            }

        }
        return arr.length;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
