package daily;

/**
 * 860. 柠檬水找零
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2023/07/22 15:30
 **/
public class Question860 {
    public boolean lemonadeChange(int[] bills) {
       int five=0,ten=0;
        for (int bill : bills) {
            switch (bill){
                case 5->{five++;}
                case 10->{
                    if (five<1){
                        return false;
                    }else{
                        five--;
                        ten++;
                    }
                }
                default -> {
                    if (ten>0){
                        if (five<1){
                            return false;
                        }else{
                            ten--;
                            five--;
                        }
                    }else{
                        if (five<3){
                            return false;
                        }else{
                            five-=3;
                        }
                    }
                }
            }
        }
        return true;
    }
}
