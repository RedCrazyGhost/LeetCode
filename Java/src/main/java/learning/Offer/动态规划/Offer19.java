package learning.Offer.动态规划;

/**
 * 剑指 Offer 19. 正则表达式匹配
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/18 22:39
 **/
public class Offer19 {
    /**
     *     作者：Krahets
     *     链接：https://leetcode.cn/problems/zheng-ze-biao-da-shi-pi-pei-lcof/solutions/494128/jian-zhi-offer-19-zheng-ze-biao-da-shi-pi-pei-dong/
     *     来源：力扣（LeetCode）
     *     著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    public boolean isMatch(String s, String p) {
        int m = s.length() + 1, n = p.length() + 1;
        boolean[][] dp = new boolean[m][n];
        dp[0][0] = true;
        for(int j = 2; j < n; j += 2)
            dp[0][j] = dp[0][j - 2] && p.charAt(j - 1) == '*';
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                dp[i][j] = p.charAt(j - 1) == '*' ?
                        dp[i][j - 2] || dp[i - 1][j] && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.') :
                        dp[i - 1][j - 1] && (p.charAt(j - 1) == '.' || s.charAt(i - 1) == p.charAt(j - 1));
            }
        }
        return dp[m - 1][n - 1];
    }
}

