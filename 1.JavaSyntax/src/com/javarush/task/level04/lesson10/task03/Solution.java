package com.javarush.test.level04.lesson10.task03;

import java.io.*;
import java.util.Scanner;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String c=reader.readLine();
        String d=reader.readLine();
        int a=Integer.parseInt(d);
        int b=1;
        while (b<=a)
        {
            System.out.println(c);
            b++;
        }
    }
}
