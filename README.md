# note
* 作为一个学习笔记,记录平时的测试代码
* [java源码库](Java_source-master)阅读源码及笔记
* java基础易忘知识点
* [1泛型](#如果既要存又要取)
    (# id=1)T,?是占位符
    T指定了一个类型就只能是那个类型
    ? 可以表示N中类型。 
    如果要从集合中**读取**类型T的数据，并且**不能写入**，可以使用 ? extends 通配符；(Producer Extends)
    如果要从集合中**写入**类型T的数据，并且**不需要读取**，可以使用 ? super 通配符；(Consumer Super)
#如果既要存又要取
    那么就不要使用任何通配符。    
## 数据库
   -关系的完整性性约束条件：实体完整性，参照完整性，用户自定义完整性
   关系模型种常用的关系操作：查询，插入，删除，修改
   查询操作又分为：选择(select),投影(project),连接(join),除(divide),并(union),差(except),交(interesection),笛卡儿积
   其中选择，投影，并，差，笛卡儿积是五种基本操作，其他操作可以用基本操作来定义和导出
   关系操作的特点是集合操作方式，即**操作的对象和结果都是集合。这种操作方式也称一次一集合**
   **建表语句**
   ```
   create table <表名>（<列名><数据类型>[列级完整性约束]
                [,列名<数据类型>[列级完整性约束]]
                ...
                [,表级完整性约束]）；
   ```
   **修改表**
   ```
   alter table<表名>
   [add [column] <new column><数据类型>[完整性约束]]
   [add <表级完整性约束>]
   [drop [column]<列明> [cascade|restrict]]       //如果指定了cascade属性，则自动删除引用了该列的其他对象，比如视图，如果指定了restrict短语，则如果该列被其他对象引用，rdms将拒绝删除该列
   [drop constrint<完整性约束名> [cascade|restrict]]
   [alter column <列名><数据类型>]
   ```
   **查询语句**
   ```
  select 的语句的一般形式
  select [all|distinct] <目标表达式>[别名][,<目标列表达式> [别名]]......
  from <表名或视图> [别名] [,表名或视图 [别名]]...|(sellect <语句>) [AS] <别名>
  where <条件表达式>             //where 字句种不能用聚集函数作为条件表达式的
  [group by <列名1>] [having <条件表达式>]   //聚集函数这里不能用where，只能用having
  [order by<列名 2>] [asc|desc]  
  ```
  where 对表操作 having对组操作
  **修改数据**
  ``` 
    insert into <表名>   [(属性列 1)] values (a,b,c)
    insert into <表名>   [(<属性列>)][，属性列]
    子查询
  ```
  **修改数据**
  ```
    update table 
    set <列名> =<表达式>[，列名=<表达式>]..
    [where <条件>]
  ```
  **删除数据**
  ```
  dalete 
  from table
  where <条件>
  ```
  数据库的完整性是指数据的正确性和相容性。


















































    
