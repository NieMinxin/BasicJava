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
        //����ԭ��Ϊ<R> Stream<R> map(Function<? super T,? extends R> mapper)
        // �����Ƿ���һ���Ե�ǰ����Ԫ��ִ��ִ��mapper֮��Ľ����ɵ�Stream��
        // ֱ�۵�˵�����Ƕ�ÿ��Ԫ�ذ���ĳ�ֲ�������ת����ת��ǰ��Stream��Ԫ�صĸ�������ı䣬��Ԫ�ص�����ȡ����ת��֮������͡�

        System.out.println("---------------------------");
        Stream<List<Integer>> stream5 = Stream.of(Arrays.asList(1,2),Arrays.asList(3,4,5));
        stream5.flatMap(list->list.stream()).forEach(i->{System.out.println(i);});


    }
}
