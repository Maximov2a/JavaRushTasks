package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in) );

        String a1=reader.readLine();
        String b1=reader.readLine();
        String c1=reader.readLine();

        int a= Integer.parseInt(a1);
        int b= Integer.parseInt(b1);
        int c= Integer.parseInt(c1);
        int s = 0;
        if(a>0 )
           s++;
        if(b>0 )
            s++;
        if( c>0 )
            s++;

        System.out.println(s);

    }
    }

