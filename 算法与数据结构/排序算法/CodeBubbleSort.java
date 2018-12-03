import java.util.ArrayList;

public class CodeBubbleSort {
    public static void bubbleSort(int[] arr){
        if(arr == null||arr.length<2){
            return;
        }
        for(int end=arr.length-1;end>0;end--) {
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            
            }
        }
    }
    public static void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    /*
            test测试方法
     */
    public static void main(String args[]){
        int test[] = {1,232,4,432,5,35,1213,3213,532423,};
        System.out.println(test.length);

        bubbleSort(test);
        for (int arr: test
             ) {
            System.out.println(arr);
        }
    }
}
