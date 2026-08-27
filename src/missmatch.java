import java.util.*;
public class missmatch {
    static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3};

        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctindex = arr[i] - 1;
            if(arr[i] != arr[correctindex]){
                swap(arr,i,correctindex);
            }else{
                i++;
            }
        }
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index + 1){
                return new int[] {arr[index],index + 1};
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
