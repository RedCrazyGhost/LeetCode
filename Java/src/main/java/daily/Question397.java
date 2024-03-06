package daily;

/**
 * 397. 整数替换
 *
 * @author wenxingzhan
 * @date 2021/11/19 11:46
 **/
public class Question397 {
    public int integerReplacement(int n) {
        if (n==2147483647){
            n-=1;
            return function(n);
        }
        return function(n);
    }
    public int function(int n){
        if (n==1){
            return 0;
        }
        if (n%2==1){
           return 1+Math.min(function(n+1), function(n-1));
        }else{
            return 1+function(n/2);
        }
    }
}
