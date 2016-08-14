package computer2.java.src.test.java.aha.java.src.test.java.aha;

import org.junit.Test;

/**
 * Created by LK on 2016/7/16.
 */
public class TestChapter2 {

    //建立一个队列对象
    private class QueueType {
        int[] date = new int[100];     //存放数据
        int head;                       //头
        int tail;                       //尾
    }

    /**
     * 解密QQ号——队列
     */
    @Test
    public void TestQueue() {
        QueueType queueType = new QueueType();
        int[] tem = new int[9];
        int range = 9;
        tem = CreateArray(tem, range);

        queueType.head = 0;
        queueType.tail = 0;

        //入队列
        for (int i = 0; i < tem.length; i++) {
            queueType.date[i] = tem[i];
            queueType.tail++;
        }

        while (queueType.head < queueType.tail) {
            System.out.print(queueType.date[queueType.head] + "\t");
            queueType.head++;
            queueType.date[queueType.tail] = queueType.date[queueType.head];
            queueType.tail++;
            queueType.head++;
        }
    }

    /**
     * 解密回文——栈
     */
    @Test
    public void TestPalindrome() {
//        System.out.println("请输入一串字符串");
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.next();

        String input="abcba";

        //初始化一个栈
        char[] stack = new char[100];
        //初始化栈顶
        int stacktop = 0;

        //字符入栈
        for (int i = 0; i < input.length(); i++) {
            stack[i] = input.charAt(i);
            stacktop++;
        }

        //去中间值
        int mid = 0;
        if (stacktop % 2 == 0) {
            mid = stacktop / 2 - 1;
        } else {
            mid = stacktop / 2;
        }

        //对比
        for (int i = 0; i <= mid; i++) {
            if (stack[i] != stack[stacktop-1]) {
                break;
            }
            stacktop--;
        }

        if (stacktop == 0) {
            System.out.println("输入值为回文");
        } else {
            System.out.println("输入值不是回文");
        }
    }

    /**
     *第三节 纸牌游戏-小猫钓鱼
     */
    public void TestCatGetFish(){

    }

    /**
     * 随机生成排列数组
     */
    private int[] CreateArray(int[] array, int range) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * range);
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        return array;
    }
}
