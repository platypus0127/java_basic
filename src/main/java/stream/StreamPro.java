package stream;


import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* Java Stream编程体验
* 流式编程的作用：在JDK8中不止新增了Lambda,还有Stream,可以利用Stream简化对数据的处理，本质就是计算。
* 通俗的理解流就是数据通道，用于操作数据源所生成的元素序列
* 参考链接：https://zhuanlan.zhihu.com/p/340469592
* https://blog.csdn.net/lidai352710967/article/details/82496783
* 步骤：
* 1：流创建
* 2：使用算子处理流
*
* 问题1哪些可以作为数据源
*    Collect、数组，Java容器或I/O channel等
*
*常见的方法：
*map：使用用户定义的函数转换数据集中的项目。每个输入元素都被转换为一个输出元素。
 map：使用用户定义的函数转换数据集中的项目。每个输入元素都被转换为一个输出元素。
 filter：根据用户定义的函数过滤数据集中的项目。
 flatMap：类似于map运算符，但允许返回零个，一个或多个元素。
 groupBy：按键值分组得元素。与SQL中的GROUP BY运算符类似。
 project：在tuples(元组)数据集中选择指定的字段，类似于SQL中的SELECT操作符。
 reduce：使用用户定义的函数将数据集中的元素组合为单个值。
 collect:
* */
public class StreamPro {

    public static void main(String[] args) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May",
                "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec", "Jun", "Jun", "Feb", "Jan"};
        //Map 方法
        Arrays.stream(months).map(xx -> xx + "_***")
                .forEach( System.out::println);


        //filter
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1,"zhangshan");
        map.put(2,"lisi");
        map.put(3,"王五");

        map.keySet().stream()
                .filter( key ->key>=2)
                .forEach(  key -> System.out.println("map输出:" + key +" <->"+ map.get(key)));


        //Reduce 把所有的元素按照指定规则聚合
        String string_reduce = Stream.of("A", "B", "C", "D").reduce("", String::concat);
        System.out.println("string_reduce:" + string_reduce);
        Integer reduce = Stream.of(1, 2, 3, 4).reduce(0, Integer::sum);
        System.out.println("reduce:" + reduce);

        //collect
        String collect = Stream.of(months).collect(Collectors.toList()).toString();
        System.out.println("collect:" + collect);
        String collect2 = Stream.of(months).collect(Collectors.joining("=")).toString();
        System.out.println("collect2:" + collect2);


    }

}
