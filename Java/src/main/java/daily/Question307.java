package daily;

/**
 * 307. 区域和检索 - 数组可修改
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/04 10:44
 **/
public class Question307 {
//   树状数组
//    累加和
    int[] sums;
//    更新后数组
    int[] nums;

    private void insert(int index,int val){
        int x=index+1;
        while(x<sums.length){
            sums[x]=sums[x]+val;
            x+=lowBit(x);
        }
    }

//    计算lowBit 用于定位
    private int lowBit(int index){
        return index &(-index);
    }

    //    查询树状数组
    private int query(int index){
        int s=0;
        while(index!=0){
            s+=sums[index];
            index-=lowBit(index);
        }
        return s;
    }

    public void NumArray(int[] nums) {
        this.sums=new int[nums.length+1];
        this.nums=nums;
        for(int i=0;i<nums.length;i++){
            insert(i,nums[i]);
        }
    }

    public void update(int index, int val) {
        int x=index+1;
        while(x<sums.length){
            sums[x]=sums[x]-nums[index]+val;
        }
        nums[index]=val;
    }

    public int sumRange(int left, int right) {
        return query(right+1)-query(left);
    }


}
