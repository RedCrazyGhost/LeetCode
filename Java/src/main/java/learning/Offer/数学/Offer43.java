package learning.Offer.数学;

/**
 * 剑指 Offer 43. 1～n 整数中 1 出现的次数
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/10 15:19
 **/
public class Offer43 {
    public int countDigitOne(int n) {
        int digit=1,res=0;
        int high=n/10,cur=n%10,low=0;
        while(high!=0 || cur!=0){
            if (cur==0) {
                res+=high*digit;
            } else if (cur==1) {
                res+=high*digit+low+1;
            }else{
                res+=(high+1)*digit;
            }
            low+=cur*digit;
            cur=high%10;
            high/=10;
            digit*=10;
        }
        return res;
    }
}
