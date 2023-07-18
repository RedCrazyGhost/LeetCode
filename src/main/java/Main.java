import 数据结构模型.ListNode;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
    }

    public static void RunQuestion(Class<?> clz, Object... args) {
        long START_TIME,END_TIME;
        System.out.printf("Class来源: %s ",clz.getName());
        Method method = getTargetMethod(clz);
        Object object, result;

        try {
            object = clz.getConstructor().newInstance();
            assert method != null:"没有找到目标方法！";

            if (method.getName().equals("TestCase")) {
               args=null;
            }
            parameterResolver(method,args);

            START_TIME = System.currentTimeMillis();
            result=method.invoke(object, args);
            END_TIME = System.currentTimeMillis();

            if (!method.getName().equals("TestCase")) {
                returnResolver(result);
            }

            System.out.println(getMicrosecond(START_TIME,END_TIME));
        } catch (InstantiationException | NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }


    private static void parameterResolver(Method targetMethod,Object[] args){
        Parameter[] parameters = targetMethod.getParameters();
        int len= parameters.length;
        String format="参数位置[%d] 类型: %s  值: %s\n";
        for (int i = 0; i < len; i++) {
            System.out.printf(format,i,parameters[i].getType().getTypeName(),resolver(args[i]));
        }
    }

    private static void returnResolver(Object result){
        String format="计算结果为: %s\n";
        System.out.printf(format,resolver(result));
    }

    private static String resolver(Object obj){
//        final String ARRAY_INT="[I";
//        final String ARRAY_DOUBLE_INT="[[I";
//        final String ARRAY_CHAR="[C";
//        final String ARRAY_LONG="[J";
//        final String ARRAY_BYTE="[B";
//        final String ARRAY_DOUBLE="[D";
//        final String ARRAY_STRING="[Ljava.lang.String;";
//        final String ARRAY_OBJECT="[Ljava.lang.Object;";
//        final String ARRAY_BOOLEAN="[Z";
//        final String ARRAY_FLOAT="[F";
//        final String LISTNODE="数据结构模型.ListNode";


        StringBuilder stringBuilder=new StringBuilder();
        if (obj!=null) {
            switch (obj.getClass().getTypeName()) {
                case "java.lang.String[]"->stringBuilder.append(Arrays.deepToString((String[]) obj));
                case "java.lang.Object[]"->stringBuilder.append(Arrays.deepToString((Object[]) obj));
                case "int[]"->stringBuilder.append(Arrays.toString((int[]) obj));
                case "double[]"->stringBuilder.append(Arrays.toString((double[]) obj));
                case "int[][]"->{
                    int iMax = ((int[][])obj).length - 1;
                    if (iMax == -1)
                        return "[]";
                    StringBuilder b = new StringBuilder();
                    b.append('[');
                    for (int i = 0; ; i++) {
                        b.append(Arrays.toString(((int[][])obj)[i]));
                        if (i == iMax)
                            return b.append(']').toString();
                        b.append(", ");
                    }
                }
                case "数据结构模型.ListNode" -> stringBuilder.append(((ListNode) obj).toValueString());
                default -> stringBuilder.append(obj);
            }
        }else{
            stringBuilder.append("NULL");
        }
        return stringBuilder.toString();
    }

    private static Method getTargetMethod(Class<?> clz){
        String format="方法名称: %s(%s)\n";
        StringBuilder stringBuilder=new StringBuilder();
        Method targetMethod=null;
        Method[] methods = clz.getDeclaredMethods();

        boolean haveTestCase=false;
        Method testCaseMethod=null;

        for (Method method : methods) {
           if (method.getModifiers()== Modifier.PUBLIC) {
               if (method.getName().equals("TestCase")) {
                   haveTestCase = true;
                   testCaseMethod = method;
               }else{
                   targetMethod=method;
               }
           }

        }

        if (haveTestCase){
            targetMethod=testCaseMethod;
        }
        if (targetMethod != null) {
            for (Parameter parameter : targetMethod.getParameters()) {
                stringBuilder.append(parameter.getType().getTypeName()).append(',');
            }
            if (stringBuilder.length()!=0) {
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }
            System.out.printf(format,targetMethod.getName(),stringBuilder);
        }
        return targetMethod;
    }


    private static String getMicrosecond(long START_TIME,long END_TIME) {
        StringBuilder stringBuilder=new StringBuilder();
        long millis=END_TIME - START_TIME;
        stringBuilder.append("方法用时：").append(millis).append("ms");
        if (millis<=1000){
            setColor(stringBuilder, "green");
        }else{
            setColor(stringBuilder, "red");
        }
        return stringBuilder.append("\n").toString();
    }

   private static StringBuilder setColor(StringBuilder context,String color){
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

