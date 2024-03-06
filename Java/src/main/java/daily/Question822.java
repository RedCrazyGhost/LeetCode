package daily;

import java.util.HashSet;
import java.util.Set;

/**
 * 822. 翻转卡片游戏
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/08/02 15:28
 **/
public class Question822 {
    public int flipgame(int[] fronts, int[] backs) {
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < fronts.length; i++) {
            if(fronts[i]==backs[i])  set.add(fronts[i]);
        }
        int min=2001;
        for (int i = 0; i < fronts.length; i++) {
            if (!set.contains(fronts[i])) min=Math.min(min,fronts[i]);
            if (!set.contains(backs[i])) min=Math.min(min,backs[i]);
        }
        return min==2001?0:min;
    }
}
