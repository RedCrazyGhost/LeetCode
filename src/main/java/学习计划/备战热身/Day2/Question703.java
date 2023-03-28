import java.util.*;


/**
 * 703. 数据流中的第K大元素
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/03/28 17:00
 **/
public class Question703 {

    /**
     * 例子:初始数组[4,5,8,2]
     * 排序后[2,4,5,8]
     * add(3)方法添加一个元素后，排序结果[2,3,4,5,8]
     * 此时k=3的最大元素是4
     * @param k 排序后第k大的元素
     * @param nums 初始数组
     */

    int k;
    int[] arr;

    public Question703(int k, int[] nums) {
        this.k = k ;
        int len = nums.length ;
        Arrays.sort(nums);
        this.arr = Arrays.copyOfRange(nums, len - k, len );
    }

    public int add(int val) {
        for (int i = 0; i < k; i++) {
            if (val<=arr[i]){
                if (i != 0) {
                    int temp = 0;
                    for (int j = i - 1; j > -1; j--) {
                        temp = arr[j];
                        arr[j] = val;
                        val = temp;
                    }
                }
                break;
            }else{
                if (i==k-1){
                    int temp = 0;
                    for (int j = i ; j > -1; j--) {
                        temp = arr[j];
                        arr[j] = val;
                        val = temp;
                    }
                }
            }
        }
        return arr[0];
    }
}
