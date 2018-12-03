package Algorithm;


public class SelectionSort {
    //选择排序
    //时间复杂度（N2）

    public static void selectionSort(int []arry){
        //如果数组为空或者数组长度小于2直接返回
        if(arry==null||arry.length<2){
            return;
        }
        for(int i = 0;i<arry.length-1;i++){
            int minIndex = i;           //最小值得索引值
            for(int j=i+1;j<arry.length;j++){
                minIndex = arry[j]<arry[minIndex]?j:minIndex;       //如果array[j]小于最小值，minIdex=j;否则不变
            }
            swap(arry,i,minIndex);
        }
    }
    public static void swap(int []arry,int i,int j){
        int tmp = arry[i];
        arry[i] = arry[j];
        arry[j] = tmp;
    }
    public static void main(String args[]){
        int []arry = {1,232,4,432,5,35,1213,3213,532423,};
        selectionSort(arry);
        for (int a:arry
             ) {
            System.out.println(a);
        }
    }

}
