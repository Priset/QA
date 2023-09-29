package basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasicTest {

    @BeforeEach
    public void before(){
        System.out.println("before");
        // requirement -> setup / initialize
    }

    @Test
    public void verifySomeThing(){
        System.out.println("test1");
        // step1
        // step2
        // verification
    }
    @Test
    public void verifySomeThing2(){
        System.out.println("test2");
        // step1
        // step2
        // verification
    }

    @AfterEach
    public void after(){
        System.out.println("after");
        // cleanup / teardown
    }



}
