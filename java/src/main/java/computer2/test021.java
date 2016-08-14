package computer2;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by LK on 2016/3/12.
 * 本题随机产生若干字母（A~Z间），直到出现字母Q停止。
 */
public class test021 {
    public static void main(String[] args) {
        char c;
        do{
            c=(char)((int)(Math.random()*26)+'A');
            System.out.print(c+",");
        }while(c!='Q');
    }
}