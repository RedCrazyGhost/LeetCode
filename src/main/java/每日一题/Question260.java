package 每日一题;

public class Question260 {

// 位运算
    public int[] singleNumber(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum^=num;
        }
        int i=(sum==Integer.MIN_VALUE?sum:sum&-(sum));
        int num1=0,num2=0;
        for(int num:nums){
            if ((num&i)!=0){
                num1^=num;
            }else{
                num2^=num;
            }
        }
        return new int[]{num1,num2};
    }

//    常规Map计算
//    public int[] singleNumber(int[] nums) {
//        Map<Integer,Integer> map=new HashMap<>();
//        List<Integer> list=new ArrayList<>();
//        for(int i:nums){
//            map.put(i, map.getOrDefault(i,0)+1);
//        }
//        for(int i: map.keySet()){
//            if(map.get(i)==1){
//                list.add(i);
//            }
//        }
//        int arr[]=new int[list.size()];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=list.get(i);
//        }
//        return arr;
//    }
}
