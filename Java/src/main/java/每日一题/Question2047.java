package 每日一题;

public class Question2047 {
    public int countValidWords(String sentence) {
//        执行用时：
//3 ms
//, 在所有 Java 提交中击败了
//94.61%
//的用户
//内存消耗：
//38.1 MB
//, 在所有 Java 提交中击败了
//93.39%
//的用户
//通过测试用例：
//244 / 244
        int number=0;
        String[] arrstr=sentence.split(" ");
      for (String s : arrstr) {
          char[] chars = s.toCharArray();boolean flag=false;
         forstr: for (int i = 0; i < chars.length; i++) {

              switch (chars[i]) {
                  case '-':
                      if (i == 0 || i == chars.length - 1||flag) {
                          break forstr;
                      }else {
                          if ((int)chars[i+1]<97||(int)chars[i+1]>122){
                              break forstr;
                          }
                          flag=true;
                      }
                      break;
                  case ',':
                  case '.':
                  case '?':
                  case '!':
                      if (i != chars.length - 1) {
                          break forstr;
                      }
                      break;
                  case ' ':
                      if (i == 0 || i == chars.length - 1)
                          break;
                  case 'q':
                  case 'w':
                  case 'e':
                  case 'r':
                  case 't':
                  case 'y':
                  case 'u':
                  case 'i':
                  case 'o':
                  case 'p':
                  case 'a':
                  case 's':
                  case 'd':
                  case 'f':
                  case 'g':
                  case 'h':
                  case 'j':
                  case 'k':
                  case 'l':
                  case 'z':
                  case 'x':
                  case 'c':
                  case 'v':
                  case 'b':
                  case 'n':
                  case 'm':
                      break;
                  default:
                      break forstr;

              }
             if (i==chars.length-1&&!s.equals("")) {
                 number++;
             }
          }
      }
        return number;
    }
}
