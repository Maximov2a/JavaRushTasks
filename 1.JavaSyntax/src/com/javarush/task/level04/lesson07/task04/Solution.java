package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
*/

import java.io.*;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       /* //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in) );

        String a1=reader.readLine();
        String b1=reader.readLine();
        String c1=reader.readLine();

        int a= Integer.parseInt(a1);
        int b= Integer.parseInt(b1);
        int c= Integer.parseInt(c1);
        int s = 0;
        int s1 = 0;

        if(a>0 ) s++;   else s1++  ;
        if(b>0 ) s++;   else s1++  ;
        if( c>0 ) s++;  else s1++  ;

        System.out.println(" количество отрицательных чисел: " + s);
        System.out.println(" количество положительных чисел: " + s1);
*/
        //напишите тут ваш код

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int p = 0;
        int n = 0;
        if (a > 0) p++; else n++;
        if (b > 0) p++; else n++;
        if (c > 0) p++; else n++;
        System.out.println("количество отрицательных чисел: " + n);
        System.out.println("количество положительных чисел: " + p);


    }
}
