package aha.java.src.test.java.coreJava;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by LK on 2016/7/6.
 */

public class TestChapter3 {
    @Test
    public void testRandom() {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }


    @Test
    public void testMulArray() {
        int a[][] = new int[2][10];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println(Arrays.deepToString(a));

    }

}