import static org.junit.jupiter.api.Assertions.*;

import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.jupiter.api.Test;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class PracticeTest {
    @Test
    void test_1_Init1() {
        Integer[][] p = new Practice().test1();
        assertTrue(p.length == 3);
        assertTrue(p[0].length == 3);
        assertTrue(p[1].length == 3);
        assertTrue(p[2].length == 3);
    }

    @Test
    void test_2_Init2() {
        String[][] p = new Practice().test2();
        assertTrue(p.length == 2);
        assertTrue(p[0].length == 4);
        assertTrue(p[1].length == 4);
    }
    
    @Test
    void test_3_Init3() {
        Boolean[][] p = new Practice().test3();
        assertTrue(p.length == 5);
        assertTrue(p[0].length == 2);
        assertTrue(p[1].length == 2);
        assertTrue(p[2].length == 2);
        assertTrue(p[3].length == 2);
        assertTrue(p[4].length == 2);
    }
    
    @Test
    void test_4_index1() {
        Object obj = new Practice().test4();
        assertTrue(obj != null);
    }
    
    @Test
    void test_5_index2() {
        Object obj = new Practice().test5();
        assertTrue(obj != null);
    }
    
    @Test
    void test_6_oneRowSum() {
        Integer sum = new Practice().test6();
        assertTrue(sum == 26);
    }
    
    @Test
    void test_7_oneColumnSum() {
        Integer sum = new Practice().test7();
        assertTrue(sum == 14);
    }
    
    int[][] testMatrix = { { 10, 20, 30 },
                           { 80, -10, 100 },
                           { 75, -25, -50 } };

    @Test
    void test_8_RowSum() {
        Practice methods = new Practice();
        assertTrue(methods.getSumByRow(testMatrix, 0) == 60);
        assertTrue(methods.getSumByRow(testMatrix, 1) == 170 );
        assertTrue(methods.getSumByRow(testMatrix, 2) == 0);
    }
    
    @Test
    void test_9_ColumnSum() {
        Practice methods = new Practice();
        assertTrue(methods.getSumByColumn(testMatrix, 0) == 165);
        assertTrue(methods.getSumByColumn(testMatrix, 1) == -15 );
        assertTrue(methods.getSumByColumn(testMatrix, 2) == 80);
    }
    
    @Test
    void test_10_EastNeighbor() {
        Practice methods = new Practice();
        assertTrue(methods.getEastNeighbor(testMatrix, 2, 0) == -25 );
        assertTrue(methods.getEastNeighbor(testMatrix, 0, 2) == null );
    }
    
    @Test
    void test_11_WestNeighbor() {
        Practice methods = new Practice();
        assertTrue(methods.getWestNeighbor(testMatrix, 2, 0) == null );
        assertTrue(methods.getWestNeighbor(testMatrix, 0, 2) == 20 );
    }
    
    @Test
    void test_12_NorthNeighbor() {
        Practice methods = new Practice();
        assertTrue(methods.getNorthNeighbor(testMatrix, 2, 0) == 80 );
        assertTrue(methods.getNorthNeighbor(testMatrix, 0, 2) == null );
    }
    
    @Test
    void test_13_SouthNeighbor() {
        Practice methods = new Practice();
        assertTrue(methods.getSouthNeighbor(testMatrix, 2, 0) == null );
        assertTrue(methods.getSouthNeighbor(testMatrix, 0, 2) == 100 );
    }
}
