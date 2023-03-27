package ru.ibs.program13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите строку из слов, разделенных пробелами: ");

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        String str = reader.readLine();

        //1.
        String str1 = str.replaceAll("[а-яА-Я\\d]", "");
        System.out.println("Слова на латинице: "+str1.trim());

        //2.
        int count = str1.split(" +").length;
        System.out.println("Количество слов на латинице: "+count);
    }
}
