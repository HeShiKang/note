### 招银网络Java面经
* 多态的实现

  * 多态的本质上分两种

    * > 1.编译时多态(又称静态多态   ----重载
      > 2.运行时多态（又称动态多态）----重写


  * 多态的实现方法

    * > 子类继承父类
      >
      > 类实现接口

* 生产者消费者手写

  > 1. Object的wait/notify的消息通知机制；
  > 2. 使用Lock的Condition的wait/signal的消息通知机制
  > 3. .使用BlockingQueue实现

* sql查询语句手写
* Mybatis批量查询手写
  * http://www.cnblogs.com/zjdxr-up/p/8334655.html

* HashMap,HashTable,ConcurrentHashMap区别，底层源码
  1. HashTable 使用 synchronized 来进行同步。
  2. HashMap 可以插入键为 null 的 Entry。
  3. HashMap 的迭代器是 fail-fast 迭代器。
  4. HashMap 不能保证随着时间的推移 Map 中的元素次序是不变的。

* classpath,path的区别
  * https://blog.csdn.net/zhaihao1996/article/details/78387676

* jvm的运行过程

* GC机制讲一讲

* 线程池，阻塞队列

* http,https的区别

* 分布式dubbo讲一下了解

* Spring事务写在哪一部分，为什么不写Dao,controller

  * 事务的四大特性

    >1. 原子性
    >
    >   原子性是指事务是一个不可分割的单位，要么什么都发生，要么什么都不发生
    >
    >2. 一致性
    >
    >   事务必须使数据库从一个一致性状态到另一个一致性转台（数据不被破坏）
    >
    >3. 隔离性
    >
    >   事务的执行不被其他事务干扰
    >
    >4. 持久性
    >
    >*持久性是指一个事务一旦被提交，它对数据库中数据的改变就是永久性的.即使系统重启也不会丢失*

  * 结合事务的特点，为什么加在service层就很好解释了。如果我们的事务注解@Transactional加在dao层，那么只要与数据库做增删改，就要提交一次事务，如此做事务的特性就发挥不出来，尤其是事务的一致性，当出现并发问题是，用户从数据库查到的数据都会有所偏差。一般的时候，我们的service层可以调用多个dao层，我们只需要在service层加一个事务注解@Transactional，这样我们就可以一个事务处理多个请求，事务的特性也会充分的发挥出来

* 一个网络请求的全过程
  * https://blog.csdn.net/qq_39393899/article/details/80405979