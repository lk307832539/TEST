package computer2;

/**
 * Created by LK on 2016/3/22.
 * 本题采用递归的方法计算n!(n=8)。
 */
public class test4401{
    static long Fac(int n){
        if(n == 1){
            return 1;
        }
        else{
            int sum = 0;
            while(n != 1){
                sum = sum + n * ( n - 1 );
                n  = n - 1;
            };
            return sum;
        }
    }
    public static void main(String[] args) {
        int n=8;
        System.out.println(n+"!="+Fac(n));
    }
}
