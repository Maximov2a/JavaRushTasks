package com.javarush.test.level04.lesson13.task02;

import java.io.*;
import java.util.Scanner;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {

            //напишите тут ваш код
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            String s = "8";


            for (int f =1 ; f<=a ;f++ )
            {
                for  ( int i = 1; i<= b; i++ )
                { System.out.print(s );

                }
                System.out.println();

            }

    }
}
