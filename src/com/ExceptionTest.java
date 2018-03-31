package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ExceptionTest {

    void f() throws FileNotFoundException {
        InputStream is = new FileInputStream("abc");
    }

    void g()throws Exception{
        throw new Exception();
    }
}
