import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PracticeTest {

    @Test
    void test_init_1() {
        Object[][] p = new Practice().test1_2DInit_a();
        assertTrue(p.length == 3);
        assertTrue(p[0].length == 3);
        assertTrue(p[1].length == 3);
        assertTrue(p[2].length == 3);
    }

    @Test
    void test_init_2() {
        Object[][] p = new Practice().test1_2DInit_b();
        assertTrue(p.length == 2);
        assertTrue(p[0].length == 4);
        assertTrue(p[1].length == 4);
    }
    
    
    @Test
    void test_init_3() {
        Object[][] p = new Practice().test1_2DInit_c();
        assertTrue(p.length == 5);
        assertTrue(p[0].length == 2);
        assertTrue(p[1].length == 2);
        assertTrue(p[2].length == 2);
        assertTrue(p[3].length == 2);
        assertTrue(p[4].length == 2);
    }
    
    @Test
    void test_init_4() {
        Object p = new Practice().test1_2DInit_d();
        assertTrue(p != null);
    }
    
    @Test
    void test_init_5() {
        Object p = new Practice().test1_2DInit_e();
        assertTrue(p != null);
    }
    
    @Test
    void test_init_6() {
        Integer sum = new Practice().test1_2DInit_f();
        assertTrue(sum == 21);
    }
    
    @Test
    void test_init_7() {
        Integer sum = new Practice().test1_2DInit_g();
        assertTrue(sum == 12);
    }
}
