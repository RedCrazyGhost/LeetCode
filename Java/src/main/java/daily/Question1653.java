package daily;

/**
 * 1653. 使字符串平衡的最少删除次数
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/03/06 17:17
 **/
public class Question1653 {
        public int minimumDeletions(String s) {
            // 动态规划

            // 1.统计当前数字以 a/b 结尾的最少操作数
            int aTime = 0;
            int bTime = 0;
            for (int i = 0;i < s.length(); i++) {
                char c = s.charAt(i);
                // 2.以 b 结尾的最小操作数，前一个可以是a，也可以是b，取前一个 a/b 结尾的最小值加当前操作数(a加1，b为0)
                bTime = Math.min(bTime,aTime) + 'b' - c;
                // 3.以 a 结尾的最小操作数，前一个必须是a，也就是加上当前位置变化为 b 的操作数
                aTime = aTime + c - 'a';
            }
            // 最终结果取两者的较小值
            return Math.min(aTime,bTime);
        }
    }

