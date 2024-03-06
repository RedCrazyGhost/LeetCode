package daily;

/**
 * 824. 山羊拉丁文
 *
 * @author RedCrazyGhost - wenxingzhan
 * @date 2022/04/21 17:02
 **/
public class Question824 {
    public String toGoatLatin(String sentence) {
        String[] strs=sentence.split(" ");
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i< strs.length;i++){
           switch (strs[i].charAt(0)){
               case 'a': case  'e': case 'i': case 'o': case 'u': case'A': case'E': case'I': case'O': case 'U':
                    stringBuilder.append(strs[i]).append("ma");
                   break;
               default:
                   stringBuilder.append(strs[i].substring(1))
                   .append(strs[i].charAt(0))
                   .append("ma");
                   break;
           }
            stringBuilder.append("a".repeat(i+1));

           if (i!=strs.length-1){
               stringBuilder.append(" ");
           }
        }
        return  stringBuilder.toString();
    }
}
