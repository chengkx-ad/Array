# Array
集合

单列集合

集合体系结构

collection：list、set
set：HashSet、TreeSet
list：ArrayList、LinkedList、Vector

集合遍历方法：

collection遍历方法：迭代器遍历、增强for循环遍历、Lambda表达式遍历
因为set集合没有索引，所以不能使用普通for循环遍历


list集合遍历方法：
    五种遍历方式
    1.迭代器遍历
    2.普通for循环遍历
    3.增强for循环遍历
    4.Lambda表达式遍历
    5.stream流遍历

ArrayList：方法和遍历方式都和List、connection集合一样

LinkedList：底层是双向链表，所以可以添加任意位置的元素，但是效率低，所以不常用


泛型：泛型只能支持引用数据类型，不能支持基本数据类型

泛型类、泛型接口、泛型方法

泛型的继承和通配符
泛型不具备继承性，但是可以通配符来继承
？ extends E 表示E类型或者E类型的子类
? super E 表示E类型或者E类型的父类

练习：Test

双列集合

一对数据：键值对、键值对对象、Entry<K,V>
一一对应
键不能重复，值可以重复

体系结构：Map（HashMap（LinkedHashMap）、TreeMap）

map
常见API：
V put(K key,V Value)：添加元素【如果键存在，会把原有的键值对覆盖，并返回被覆盖的键值对的值，如果不存在，返回null】
V remove(Object key)：根据键删除键值对，并返回被删除的键值对的值
void clear()：清空所有的键值对
boolean containsKey(Object key)：判断集合是否包含指定的键【键存在：true 不存在：false】
boolean containsValue(Object key)：判断集合是否包含指定的值【键存在：true 不存在：false】
boolean isEmpty()：判断集合是否为空
int size()：集合的长度，集合中键值对的个数

遍历方法：
1、键找值
2、键值对
3、Lambda表达式

hashMap：
无序、不重复、无索引（键决定）

LinkedHashMap：方法与HashMap一样，但是可以记住添加的顺序（有序、不重复、无索引）

TreeMap：方法与HashMap一样，但是可以按照键排序（有序、不重复、无索引）

可排序：对键进行排序  默认按照从小到大的顺序，也可以自己制定顺序

可变参数    方法形参的个数可以发生变化  数据类型...名字：public void add(int... a){}  一个方法中只允许写一个

集合工具类：Collections  提供一些集合可以使用的API

统计思想: HashMap\TreeMap

如何选择？ 题目是否要求对结果进行排序？没有要求：HashMap ；要求：TreeMap
