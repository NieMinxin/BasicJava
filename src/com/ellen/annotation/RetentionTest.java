package com.ellen.annotation;

public class RetentionTest {


    @SourcePolicy
    public void sourcePolicy() {
        //保留到编译时
    }

    @ClassPolicy
    public void classPolicy() {
        //保留到Class
    }

    @RuntimePolicy
    public void runtimePolicy() {
        //保留到运行时
    }
}
