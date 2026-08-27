import java.util.*;
public class findallmissingno {
    static void main(String[] args) {
        int[] arr = {3, 2, 7, 1, 3, 2, 7};
        System.out.println(sort(arr));
    }

    static ArrayList<Integer> sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctindex = arr[i] - 1;
            if(arr[i] != arr[correctindex]){
                swap(arr,i,correctindex);
            }else{
                i++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index + 1){
                ans.add(index + 1);
            }
        }
        return ans;
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
