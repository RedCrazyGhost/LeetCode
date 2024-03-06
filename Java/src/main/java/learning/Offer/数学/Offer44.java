package learning.Offer.数学;

/**
 * 剑指 Offer 44. 数字序列中某一位的数字
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/10 15:34
 **/
public class Offer44 {
    public int findNthDigit(int n) {
      int digit=1;
      long start=1,count=9;
      while(n>count){
          n-=count;
          digit+=1;
          start*=10;
          count=digit*start*9;
      }
      long num=start+(n-1)/digit;
      return Long.toString(num).charAt((n-1)%digit)-'0';
    }
}
