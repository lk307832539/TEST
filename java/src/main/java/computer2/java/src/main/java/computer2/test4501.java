package computer2.java.src.main.java.computer2;

/**
 * Created by LK on 2016/3/22.
 本题的功能是依次输出26个字母，即A~Z。
 */
public class test4501{
    public static void main(String[] args) {
        int i;
        char c='A';
        for (i = 0;i < 26;i++){
            System.out.print(c+" ");
            c = (char)(c+1);
        }
    }
}