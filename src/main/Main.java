package main;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.MatchResult;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
//        part of code for first task
        Class<String> clazz = String.class;
        String line = new String("line");
        System.out.println("первоначальное значение приватного поля = " + line);
        Field lineValue = clazz.getDeclaredField("value");
        Field lineCount = clazz.getDeclaredField("count");
        lineValue.setAccessible(true);
        lineCount.setAccessible(true);
        String newLine = "new line";
        lineValue.set(line, newLine.toCharArray());
        lineCount.set(line, newLine.length());
        System.out.println("новое значение приватного поля = " + line);

//        part of code for second task
        Class<Math> classMath = Math.class;
        Field[] fiels = classMath.getDeclaredFields();
        Constructor<Math> cntor = Math.class.getDeclaredConstructor();
        cntor.setAccessible(true);
        Math math = cntor.newInstance();
        System.out.println(math.getClass());
    }
}
