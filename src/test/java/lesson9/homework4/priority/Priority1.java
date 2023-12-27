package lesson9.homework4.priority;

import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class Priority1 {

    @Test(priority = 7)
    public void a(){
        assertTrue(true);
    }
    @Test(priority = 6)
    public void b(){
        assertTrue(true);
    }
    @Test(priority = 5)
    public void c(){
        assertTrue(true);
    }
    @Test(priority = 4)
    public void d(){
        assertTrue(true);
    }
    @Test(priority = 3)
    public void e(){
        assertTrue(true);
    }
    @Test(priority = 2)
    public void f(){
        assertTrue(true);
    }
    @Test(priority = 1)
    public void g(){
        assertTrue(true);
    }



    @Test(dependsOnMethods = {"b2"})
    public void a2(){
        assertTrue(true);
    }
    @Test(dependsOnMethods = {"c2"})
    public void b2(){
        assertTrue(true);
    }
    @Test(dependsOnMethods = {"d2"})
    public void c2(){
        assertTrue(true);
    }
    @Test(dependsOnMethods = {"e2"})
    public void d2(){
        assertTrue(true);
    }
    @Test(dependsOnMethods = {"f2"})
    public void e2(){
        assertTrue(true);
    }
    @Test(dependsOnMethods = {"g2"})
    public void f2(){
        assertTrue(true);
    }
    @Test
    public void g2(){
        assertTrue(true);
    }
}
