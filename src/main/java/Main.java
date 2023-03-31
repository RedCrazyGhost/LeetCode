import 数据结构模型.ListNode;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    }

    public static void RunMethod(Class<?> clz, Object... args) {

        final String ARRAY_INT="[I";
        final String ARRAY_DOUBLE_INT="[[I";
        final String ARRAY_CHAR="[C";
        final String ARRAY_LONG="[J";
        final String ARRAY_BYTE="[B";
        final String ARRAY_DOUBLE="[D";
        final String ARRAY_STRING="[Ljava.lang.String;";
        final String ARRAY_OBJECT="[Ljava.lang.Object;";
        final String ARRAY_BOOLEAN="[Z";
        final String ARRAY_FLOAT="[F";




        long START_TIME,END_TIME;
        Scanner scanner=new Scanner(System.in);
        Method method = null;
        if (clz.getDeclaredMethods().length==1){
            method=clz.getDeclaredMethods()[0];
        }else{

            for(Method item:clz.getDeclaredMethods()){
                if (item.getName().equals("TestCase")){
                    method=item;
                    break;
                }
            }

            if (method==null) {
                for (Method item : clz.getDeclaredMethods()) {
                    System.out.print("当前方法: " + setColor(new StringBuilder(item.getName()), "yellow") + " 请输入[0/1]选择方法：");
                    if (scanner.nextInt() == 1) {
                        method = item;
                        break;
                    }
                }
            }
        }
        Object object, result;
        try {
            object = clz.getConstructor().newInstance();
            assert method != null:"没有找到目标方法！";

            for (int i=0;i< method.getParameterCount();i++) {
                switch (method.getParameterTypes()[i].getName()) {
                    case ARRAY_STRING -> {
                        args[i] = (Object) args[i];
                        System.out.println("参数[" + (i + 1) + "]:" + Arrays.toString((String[]) args[i]));
                    }
                    case ARRAY_INT -> System.out.println("参数[" + (i + 1) + "]:" + Arrays.toString((int[]) args[i]));
                    case ARRAY_DOUBLE_INT ->System.out.println("参数[" + (i + 1) + "]:" + Arrays.toString((int[][]) args[i]));
                    default -> System.out.println("参数[" + (i + 1) + "]:" + args[i]);
                }
            }
            START_TIME = System.currentTimeMillis();
            result=method.invoke(object, args);
            END_TIME = System.currentTimeMillis();



            if (result==null){
                System.out.println(clz.getName()+ ":" + method.getName() + ":null");
            }else if (result.getClass().isArray()) {
                System.out.println(clz.getName()+ ":" + method.getName() + ":" + Arrays.toString((int[]) result));
            }else {
                if (method.getReturnType().equals(ListNode.class)) {
                    ListNode node = (ListNode) result;
                    System.out.println(clz.getName() + ":" + method.getName() + ":" + node.toValueString());
                } else {
                    System.out.println(clz.getName() + ":" + method.getName() + ":" + result);
                }
            }

            System.out.println(getMicrosecond(START_TIME,END_TIME));
        } catch (InstantiationException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }


    public static String getMicrosecond(long START_TIME,long END_TIME) {
        StringBuilder stringBuilder=new StringBuilder();
        long millis=END_TIME - START_TIME;
        stringBuilder.append("方法用时：").append(millis).append("ms");
        if (millis<=1000){
            stringBuilder= setColor(stringBuilder,"green");
        }else{
            stringBuilder=setColor(stringBuilder,"red");
        }
        return stringBuilder.append("\n").toString();
    }

   public static StringBuilder setColor(StringBuilder context,String color){
        //示例：31;22;9m  31->红色 22->正常颜色/强度 9->划除线
       switch (color){
            case "red":
                context.insert(0,"\033[31;22;9m");
                context.append("\033[0m");
                break;
            case "green":
                context.insert(0,"\033[32;22m");
                context.append("\033[0m");
                break;
           case "yellow":
               context.insert(0,"\033[93;22;4;1m");
               context.append("\033[0m");
            default:
                break;
        }
        return context;
   }

}

