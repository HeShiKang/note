import java.lang.reflect.Array;

/**
 *
 * @param <T>
 */
public class GeneralArrayStack <T>{

    //默认大小为12
    private static final int DEFAULT_SIZE = 12;
    private T[] mArray;
    private int count;

    public GeneralArrayStack(Class<T> type) {
        this(type,DEFAULT_SIZE);
    }
    public GeneralArrayStack(Class <T> type,int size){
       mArray = (T[]) Array.newInstance(type,size);
        count = 0;
    };
    //将value添加到栈中
    public void push(T val){
        mArray[count++] = val;
    }

    //返回“栈顶元素值”
    public T peek(){
        return mArray[count-1];
    }
    //返回栈顶元素值并删除栈顶元素
    public T pop(){
        T ret = mArray[count-1];
        count--;
        return ret;
    }
    //返回栈的大小
    public int size(){
        return count;
    }
    public boolean isEmpty(){
        return size()==0;
    }
    public void PrintArrayStack(){
        if (isEmpty()){
            System.out.println("stack is Empty \n");
        }
        System.out.printf("stack size()=%d\n",size());

        int i=size()-1;
        while (i>=0){
            System.out.println(mArray[i]);
            i--;
        }
    }
    public static void main(String []args){
        String tmp;
        GeneralArrayStack<String> stack= new GeneralArrayStack<String>(String.class);

        //将10，20，30依次放入栈中
        stack.push("10");
        stack.push("20");
        stack.push("30");
        //将栈顶元素赋值给tmp,并删除栈顶元素
        tmp = stack.pop();
        System.out.println("tmp="+tmp);

        //只将栈顶赋值给tmp,不删除该元素
        tmp = stack.peek();
        System.out.println("tmp="+tmp);

        stack.push("40");
        stack.PrintArrayStack();
    }
}