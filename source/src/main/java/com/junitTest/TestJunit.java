package com.junitTest;

import com.Test.Method;
import org.junit.Test;

import static com.Test.Method.TestAppEnv.DOMAIN;
import static com.Test.Method.TestAppEnv.PORT;
import static com.Test.Method.str;
import static org.junit.Assert.assertEquals;

public class TestJunit {
    @Test
    public void canAssertResults(){
        assertEquals("Return result is:", "abc123", str);
    }

    @Test
    public void canAddTwoPlusTwo(){
        int answer = 2+2;
        assertEquals("2+2=4", 4, answer );
    }

    @Test
    public void canOutputHelloWorldToConsole(){
        Method myClass = new Method();
        myClass.aOutPutMethod();
    }

    @Test
    public void canGetUrl(){

        assertEquals("Returns Hard Coded URL",
                "http://192.168.31.31:8080",
                Method.getUrl());
    }

    @Test
    public void canGetDomainAndPortStatically(){

        assertEquals("Just the Domain",
                "192.168.31.31",
                DOMAIN);

        assertEquals("Just the port",
                "8080",
                PORT);
    }
}
