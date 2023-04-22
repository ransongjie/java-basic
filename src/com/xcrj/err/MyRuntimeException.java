package com.xcrj.err;
//自定义RuntimeException
public class MyRuntimeException extends RuntimeException{
    public MyRuntimeException() {
    }

    public MyRuntimeException(String str) {
        super(str);
    }
}
