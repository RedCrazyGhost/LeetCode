package top100;

/**
 * 70. 爬楼梯
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/01/09 13:35
 * @思考 通过递归循环会导致时间复杂度超出预期，改用滑动数组依此累加完成。F(n)=F(n-1)+F(n-2)
 **/
public class Question70 {
    public int climbStairs(int n) {
        int p=0,q=0,r=1;
        for (int i = 1; i <= n; i++) {
            p=q;
            q=r;
            r=p+q;
        }
        return r;
    }
}
