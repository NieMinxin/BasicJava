package com.ellen.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("i","love","you");

        stream.forEach((str)->{System.out.println(str);});

        System.out.println("---------------------------");

        Stream<String> stream1= Stream.of("I", "love", "you", "too");

        stream1.filter(str->str.length()==3).forEach((str)->{System.out.println(str);});
        System.out.println("---------------------------");

        Stream<String> stream2= Stream.of("I", "love", "you", "too","too");
        stream2.distinct().forEach((str)->{System.out.println(str);});


        System.out.println("---------------------------");

        Stream<String> stream3= Stream.of("I", "love", "you", "too","too");
        stream3.sorted().forEach((str)->{System.out.println(str);});

        System.out.println("---------------------------");

        Stream<String> stream4= Stream.of("I", "love", "you", "too","too");
        stream4.map(str->str.toUpperCase()).forEach((str)->{System.out.println(str);});
        //函数原型为<R> Stream<R> map(Function<? super T,? extends R> mapper)
        // 作用是返回一个对当前所有元素执行执行mapper之后的结果组成的Stream。
        // 直观的说，就是对每个元素按照某种操作进行转换，转换前后Stream中元素的个数不会改变，但元素的类型取决于转换之后的类型。

        System.out.println("---------------------------");
        Stream<List<Integer>> stream5 = Stream.of(Arrays.asList(1,2),Arrays.asList(3,4,5));
        stream5.flatMap(list->list.stream()).forEach(i->{System.out.println(i);});


    }
}
