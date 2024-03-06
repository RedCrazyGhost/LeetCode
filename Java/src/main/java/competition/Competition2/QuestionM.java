package competition.Competition2;

/**
 * QuestionM
 *
 * @author wenxingzhan
 * @date 2022/03/10 19:12
 **/
public class QuestionM {
    /*
    truck 数量是10辆
    trainnum 车厢数量
    trainarr 车厢关押犯人的情况
    从左往右
    被10整除才满足结果
     */
    public int[] method(int trainnum,int[] trainarr){
//        暴力
        int[] arr=new int[trainnum];
        for (int i = 0; i < trainnum; i++) {
            int personnum=0,num=0;
            int index=i;
            while(index<trainnum){
                personnum+=trainarr[index];
                num+=1;
                if (personnum%10==0){
                    break;
                }
                index+=1;
            }

            if (personnum%10==0) {
                arr[i] = num;
            }else{
                arr[i]=-1;
            }
        }
        return arr;


//      尝试预处理
//        int[] arr=new int[trainnum];
//        int personnum=0;
//        for (int i = 0; i < trainnum; i++) {
//            personnum+=trainarr[i];
//            arr[i]=personnum;
//        }
    }
}
