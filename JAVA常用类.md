

#         JAVA常用类

1、内部类

2、Object类

3、Object类常用方法

4、包装类

5、String类

6、BigDecimal类

# 1、内部类

 ## 内部类的分类

- 成员内部类
- 静态内部类
- 局部内部类
- 匿名内部类

## 什么是内部类

-   概念：在一个类的内部再定义一个完整的类
- 特点：
  - 编译之后可生成独立的字节码文件
  - 内部类可直接访问外部类的私有成员，而不破坏封装。
  - 可以外部类提供必要的内部功能组件。

```java
class Outer{
  class Inner{
    **********
  }
}
```

​                                                      ⬇️编译

```java
Outer$Inner.class  //内部类字节码文件
Outer.class
```

 ## 成员内部类

-  在类的内部定义，与实例变量、实例方法同级别的类。
- 外部类的一个实例部分，创建内部类对象时，必须依赖外部类对象。

```java
Outer out = new Outer();
Inner inner = Out.new Inner(); 
```

- 当外部类、内部类存在重名属性时，会优先访问内部类属性。
- 成员内部类不能定义静态 成员。可定义静态常量 staitc final 

test_1

## 静态内部类         

-  不依赖外部类对象，可直接创建或通过类名访问，可声明静态成员。
- 只能直接访问外部类的静态成员（实例成员需实例化外部类对象）。
- Outer.Inner inner = new Outer.Inner();
- Outer.Inner.show();

test_2

## 局部内部类

- 定义在外部类方法中，作用范围和创建对象范围仅限于当前方法。    
-  局部内部类访问外部类当前方法中的局部变量时，因为无法保障变量的生命周期与自身相同，变量必须修饰为final
- 限制类的使用范围

test_3

## 匿名内部类

-  没有类名的局部内部类（一切特征都与局部内部类相同 ）。
- 必须继承一个父类或者实现一个接口。
- 定义类、实现类、创建对象的语法合并，只能创建一个该类的对象。 
- 优点：减少代码量
- 缺点：可读性差。

test_4

# 2、Object类

- 超类、基类，所有类的直接或间接父类，位于类继承的最顶层。
- 任何类，如没有书写extends显示继承某个类，都默认直接继承Object类，否则为间接继承。
- Object类中所定义的方法，是所有对象都具备的方法。
- Objiect类型可以存储任何对象
  - 作为参数，可以接受任何对象。
  - 作为返回值，可返回任何对象。

test_5

##  getClass()方法

- public final Class<?> getClass() {}
- 返回引用中存储的实际对象类型。
- 应用：通常用于判断两个引用中实际存储对象类型是否一致。

## hashCode()方法

- public int hashCode() { }
- 返回该对象的哈希码值
- 哈希值根据对象的地址或字符串或数字使用hash算法计算出来的int类型的数值。
- 一般情况下相同对象返回相同哈希码。

## toString()方法

- public String toString() { }
- 返回该对象的字符串表示（表现形式）。
- 可以根据程序需求覆盖方法，如：展示对象各个属性值。 

## equals()方法

```java
public boolean equals(Object obj) {  }
```

- 默认实现为(this == obj)，比较两个对象地址是否相同。
- 可进行覆盖，比较两个对象的内容是否相同。

## equals()方法覆盖步骤

- 比较两个引用是否指向同一个对象。
- 判断obj是否为null。
- 判断两个引用指向的实际对象类型是否一致。
- 强制类型转换。
- 依次比较各个属性值是否相同。

## finalize()方法

- 当对象被判定为垃圾对象时，由JVM自动调用此方法，用以标记垃圾对象，进入回收队列。
- 垃圾对象：没有有效引用指向此对象，为垃圾对象。
- 垃圾回收：由GC销毁垃圾对象，释放数据存储空间。
- 自动回收机制：JVM的内存耗尽，一次性回收所有垃圾对象
- 手动回收机制：使用System.gc()；通知JVM执行垃圾回收。 

# 4、包装类

## 什么是包装类

- 基本数据类型所对应的引用数据类型。
  - 基本类型数据存储在栈空间。引用数据在堆中，存放的是对象一个地址。
- Object可统一所有数据，包装类的默认值是null 

test_6、 test_7

## 包装类对应

| 基本数据类型 |  包装类型     |
| ---------- | :----------: |
| byte       |    Byte    |
| short      |   Short    |
| int        |   Integer    |
| long       |     Long    |
| float      |     Float     |
| double      |     Double      |
| boolean     |     Boolean      |
| char      |     Character      |

## 类型转换与装箱、拆箱

-  8种包装类提供不同类型间的转换方式：
- Number父类中提供的6个共性方法。
- parseXXX()静态方法。
- valueof()静态方法。



- 注意：需保证类型兼容，否则抛出NumberFormatException异常。

## 整数缓冲区

- Java预先创建了256个常用的整数包装类对象。 
- 在实际应用中，对已创建的对象进行反复用。

# 5、String类

- 字符串是常量，创建之后不可改变。
- 字符串字面值在字符串池中，可以共享。
- String s = "Hello";生产一个对象，字符串池中存储。
- String s = new String("Hello");//产生两个对象，堆、池各存储一个。

test_8/Test_9

## 常用方法

- public int length()：返回字符粗的长度。
- public char charAt(int index)：根据下标获取字符。
- public boolean contains(String str)：判读当前字符串中是否包含str。
- public char[] toCharArray：将字符串转换成数组。
- public int indexOf(String str):查找str首次出现的下标。
- public int lastIdexOf(String str)：查找字符串在当前字符串中最后一次出现的下标索引。
- public String trim()：去掉字符串前后的空格。
- public String toUpperCass()：将小写转成大写。
- public String tolowerCass()：将大写转成小写。
- public boolean endWith(String str)：判读字符串是否以str结尾。
- public String replace(char oldChar,char newChar)：将旧字符串替换成新字符串。
- split();对字符串进行拆分
- 补充两个方法**equals(),compare();**比较大小  

## 可变字符串

- StringBuffer：可变长字符串，JDK1.0提供，运行效率慢、线程安全。
- StringBuilder：可变长字符串，JDK5.0提供，运行效率快、线程不安全。

test_8/Test_10

# 6、BigDecimal

## BigDecimal

- 位置：java.math包中。
- 作用：精确计算浮点数。
- 创建方式：BigDecial db = new BigDecimal("1.0");
- 方法：
  - BigDecimal add(BigDecimal db)   加
  - BigDecimal subtract(BigDecimal db) 减
  - BigDecimal multiply(BigDecimal db) 乘
  - BigDecimal divide(BigDecimal db)  除

- 除法：divide(BigDecial db,int scal,RoundingMode mode)
- 参数Scal：指定精确到小数点后几位。
- 参数mode：
  - 指定小数部分的取舍模式，通常采用四舍五入的模式
  - 取值为BigDecimal.ROUND_HALF_HALF_UP。

test_9

## Date

- Data表示特定的瞬间，精确到毫秒。Date类中的大部分方法都已经被Calendar类中的方法所取代。
- 时间单位
  - 1秒=1000毫秒
  - 1毫秒=1000微秒
  - 1微秒=1000纳秒

test_10

## Calendar

- Calendar提供了获取或设置各种日历字段的方法
- 构造方法
  - protecte Calendar():由于修饰符是protected，所以无法直接创建该对象。

- 其他方法

test_11

| 方法名                                                       | 说明                                        |
| ------------------------------------------------------------ | ------------------------------------------- |
| static Calendar getInstance()                                | 使用默认时区和区域获取日历                  |
| Void set(int year, int month, int date, int hourofday,int minute, int second) | 设置日历的年、月、日、时、分、秒。          |
| int get(int field)                                           | 返回给定日历字段的值。字段比如年、月、日等  |
| Void setTime(Date date)                                      | 用给定的Date设置此日历的时间。Data-Calendar |
| Date getTime()                                               | 返回一个Date表示日历时间。Calendar-Date     |
| Void add(int fielding, int amount)                           | 按照日历的规则，给指定字段添加或减少时间量  |
| Long getTimeInMillies()                                      | 毫秒为单位返回该日历的时间值。              |

## SimpleDateFormat

| 字母 | 日期或时间          | 示例 |
| ---- | ------------------- | ---- |
| y    | 年                  | 2024 |
| M    | 年中月份            | 08   |
| d    | 月中天数            | 10   |
| H    | 1天中小时数（0-23） | 22   |
| m    | 分钟                | 16   |
| s    | 秒                  | 59   |
| S    | 毫秒                | 367  |

test_12

## System类

- System系统类，主要用于获取系统的属性数据和其他操作，构造方法私有的。

| 方法名                           | 说明                                                    |
| -------------------------------- | ------------------------------------------------------- |
| static void array copy(...)      | 复制数组                                                |
| static long currentTimeMillis(); | 获取当前系统时间，返回时毫秒值                          |
| static void gc();                | 建议JVM赶快启动垃圾回收器回收垃圾                       |
| staic void exit(int status)      | 退出jvm，如果参数是0表示正常退出jvm，非0表示异常退出jvm |
|                                  |                                                         |

test_13