package computer2.java.src.test.java.aha.java.src.test.java.aha;

import org.junit.Test;

/**
 * Created by LK on 2016/7/9.
 * 啊哈算法第一章
 */
public class TestChapter1 {
    private int[] radomArray;
    private int[] resultArray;
    private int range = 0;
    private int i;
    private int j;

    /**
     * 桶排序
     */
    @Test
    public void bucketSort() {
        radomArray = new int[10];
        range = 10;

        //创建一个随机数组
        radomArray = createArray(radomArray, range);

        //创建一个结果数组
        resultArray = new int[radomArray.length];

        //循环将数放在每个桶中，每有一个数，桶里面数量加1
        for (i = 0; i < resultArray.length; i++) {
            int c = radomArray[i];
            resultArray[c] = resultArray[c] + 1;
        }

        //循环每个桶
        for (i = 0; i < resultArray.length; i++) {
            //循环输出每个桶中的数字
            for (j = 0; j < resultArray[i]; j++) {
                System.out.print(i + "\t");
            }
        }
    }

    /**
     * 冒泡排序
     */
    @Test
    public void bubbleSort() {
        radomArray = new int[10];
        range = 10;

        //创建一个随机数组
        radomArray = createArray(radomArray, range);

        //将随机产生的数组赋值给结果数组
        resultArray = radomArray;

        //设置零时存储变量
        int temp;
        //开始冒泡循环
        for (i = 0; i < radomArray.length; i++) {
//            注意不要数组长度越界，java数组下标从0开始，从1开始时，则最小的值要i-1
//            for (j = 1; j < radomArray.length - i; j++) {
//                if (resultArray[j - 1] > resultArray[j]) {
//                    temp = resultArray[j];
//                    resultArray[j] = resultArray[j - 1];
//                    resultArray[j - 1] = temp;
//                }
//            }
            for (j = 0; j < radomArray.length - i - 1; j++) {
                if (resultArray[j] > resultArray[j + 1]) {
                    temp = resultArray[j];
                    resultArray[j] = resultArray[j + 1];
                    resultArray[j + 1] = temp;
                }
            }

            for (i = 0; i < resultArray.length; i++) {
                System.out.print(resultArray[i] + "\t");
            }
        }

    }

    /**
     * 快速排序法
     */
    @Test
    public void quickSort() {
        radomArray = new int[10];
        range = 100;
        radomArray = createArray(radomArray, range);

        quickSortImpl(radomArray, 0, radomArray.length - 1);
//        System.out.println(resultArray.length);
//        for (i = 0; i < resultArray.length; i++) {
//            System.out.print(resultArray[i] + "\t");
//        }
    }

    private void quickSortImpl(int[] arr, int low, int high) {
        int l = low;
        int h = high;
        int povit = arr[low];

        while (l < h) {
            while (l < h && arr[h] >= povit)
                h--;
            if (l < h) {
                int temp = arr[h];
                arr[h] = arr[l];
                arr[l] = temp;
                l++;
            }

            while (l < h && arr[l] <= povit)
                l++;

            if (l < h) {
                int temp = arr[h];
                arr[h] = arr[l];
                arr[l] = temp;
                h--;
            }
        }
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+ "\t");
        }
        System.out.print("l=" + (l + 1) + "h=" + (h + 1) + "povit=" + povit + "\n");
        if (l > low) quickSortImpl(arr, low, l - 1);
        if (h < high) quickSortImpl(arr, l + 1, high);

    }


    /**
     * 随机生成排列数组
     */
    private int[] createArray(int[] array, int range) {
        for (i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * range);
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        return array;
    }
}
