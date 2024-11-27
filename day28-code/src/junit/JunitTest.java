package junit;

import org.junit.Test;

public class JunitTest {

    @Test
    public void show(){
        System.out.println("show...");
    }

    @Test
    public void print(){
        System.out.println(10/0);
        System.out.println("print...");
    }
    
    @Test
    public void method(){
        System.out.println("method...");
    }
}
