import com.sun.jmx.remote.internal.ArrayQueue;
import sun.java2d.loops.DrawGlyphListAA;

import java.lang.reflect.Array;
import java.util.Queue;

/*
    数组实现队列
    //先进先出
    https://www.cnblogs.com/CherishFX/p/4608880.html
 */
public class GeneralQueue<T>{
    private Object[] mArray = null;
    private int maxSize;    //队列容量
    private int front; //队列头，循序删除
    private int rear;   //队列尾，允许插入

    //构造函数
    public GeneralQueue(){
        this(10);
    }
    public GeneralQueue(int initialSize){
        if (initialSize>=0){
            this.maxSize = initialSize;
            mArray = new Object[10];
            front = rear = 0;
        }else{
            throw  new RuntimeException("初始化大小不能小于0："+initialSize);
        }
    }
    //判断是否为空
    public boolean empty(){
        return rear==front?true:false;
    }
    //插入
    public boolean add( T t){
        if (rear == maxSize){
            throw new RuntimeException("队列已满，无法插入新的元素");
        }else {
            mArray[rear++]=t;
            return true;
        }
    }
    //返回队首元素，但不删除
    public T peek(){
        if (empty()){
            throw new RuntimeException("队列空异常");
        }else {
            return (T)mArray[front];
        }
    }
    //出队
    public T poll(){
        if(empty()){
            throw new RuntimeException("空队列异常");
        }else{
            T value = (T)mArray[front];
            return value;
        }
    }

    public int length(){
        return rear-front;
    }
    public  static void main(String args[]){

    }

}
