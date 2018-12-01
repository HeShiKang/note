
//冒泡排序
//算法的时间复杂度为（N2）
public class CodeBubbleSort {
    public static void bubbleSort(int[] arr){
        if(arr == null||arr.length<2){
            return;
        }
        for(int end=arr.length-1;end>0;end--) {    0---N-1  遍历N次
            for (int i = 0; i < end; i++) {        0---N-2
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }

            }
        }
    }
    //调换位置
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
