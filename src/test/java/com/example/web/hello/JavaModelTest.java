package com.example.web.hello;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaModelTest {

    @Test
    public void test() {
        JavaModel javaModel = new JavaModel("java model");
        assertEquals("java model", javaModel.getValue());
    }

}
