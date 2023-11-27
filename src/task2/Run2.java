package task2;

import java.lang.reflect.Field;
import java.util.Scanner;

public class Run2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
Apple apple=new Apple("green");
        System.out.println("cvet - "+ apple.color);
        try {
            Field field = Apple.class.getDeclaredField("color");
            field.setAccessible(true);
            field.set(apple, "red");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println("novui cvet - " + apple.color);

    }
}
