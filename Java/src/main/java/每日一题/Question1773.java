package 每日一题;

import java.util.List;

/**
 * 1773. 统计匹配检索规则的物品数量
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/10/29 20:30
 **/
public class Question1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int num=0,index=0;
        switch (ruleKey) {
            case "color" -> index = 1;
            case "name" -> index = 2;
            default -> index=0;
        }
        for(List<String> item:items){
            if (item.get(index).equals(ruleValue)){
                num+=1;
            }
        }
        return num;
    }
}
