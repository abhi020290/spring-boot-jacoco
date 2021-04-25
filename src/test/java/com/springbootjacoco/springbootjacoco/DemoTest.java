package com.springbootjacoco.springbootjacoco;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DemoTest {

    @Test
    public void testJacoco()
    {
        Messages obj = new Messages();
        Assertions.assertEquals("Hello Jacoco!", obj.getMessage("Jacoco"));
    }

    @Test
    public void testNameBlank()
    {
        Messages obj = new Messages();
        Assertions.assertEquals("Provide a name , it should not be empty!", obj.getMessage(""));
    }

    @Test
    public void testNameNull()
    {
        Messages obj = new Messages();
        Assertions.assertEquals("Provide a name , it should not be empty!", obj.getMessage(null));
    }

}
