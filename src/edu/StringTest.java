package edu;

import java.util.Scanner;

import static java.lang.System.out;

/*1. Создать класс StringTest с main методом*/
public class StringTest {
    public static void main(String[] args) {
        /*2.  Создать произвольные строки разными вариантами:
        1)  Литерал
        2)  new
        3)  массив символов
        4)  из байтов
        5)  С помощью StringBuilder*/
        String str1 = "I`m Java Developer";
        out.println(str1);
        String str2 = new String("I developer on Java");
        out.println(str2);
        char[] str3 = {'J', 'a', 'v', 'a'};
        out.println(str3);
        String str4 = "Java is doing me better";
        String str5 = new String(str4.getBytes());
        out.println(str5);
        StringBuilder built = new StringBuilder("I love Java");
        String str6 = new String(built);
        out.println(str6);
        out.println();

        /*3. Работа с строкой.
        1)  Создать строку “Апельсин,Яблоко,Гранат,Груша”.
        2)  Воспользоваться методом split для извлечения всех названий фруктов в массив.
        3)  Найти и вывести на экран самое длинное название фрукта с преобразованием
            всех символов в нижний регистр.
        4)  Создать «сокращенный» вариант названия фрукта. Получить подстроку из
        первых 3-х символов названия фрукта. Вывести на экран.*/
        String fruits = "Апельсин,Яблоко,Гранат,Груша";
        String[] fruit = fruits.split(",");
        int i = 1;
        String longWord = fruit[0];
        do {
            if (longWord.length() < fruit[i].length()) {
                longWord = fruit[i];
            }
            i++;
        } while (i < fruit.length);
        out.println(longWord.toLowerCase());
        out.println(longWord.substring(0, 3));

    /*      5)  Создать строку “   Я_новая_строка      ”. (с такими же пробелами)
            6)  Преобразовать строку: Убрать лишние пробелы в начале и конце
            7)  Преобразовать строку: заменить все символы ‘_’ на пробелы.
            8)  Вывести окончательный вариант на экран.*/
        String str7 = new String("  I am_a new_string   ");
        out.println(str7.trim());
        out.println(str7.replace("_", " ").trim());
        out.println();

    /*9)  Создать Scanner для ввода текста. Выводим на экран сообщение с текстом: «Вы
    ввели: <ваш текст>»
    10)  Добавить проверку: если введенный текст начинается со слова “Запуск”,
    выводим на экран «Запускаем процесс»
    11) Добавить проверку: если введенный текст заканчивается на слово “завершен”,
    выводим на экран «Процесс завершен»
    12) Добавить проверку: если введенный текст содержит слово “ошибка” (с любым
    регистром букв), выводим на экран «Произошла ошибка»*/
        Scanner scan = new Scanner(System.in);
        String Str8 = scan.nextLine();
        out.println("Вы ввели: " + Str8);
        if (Str8.startsWith("Run")) {
            out.println("We run the process");
        } else if (Str8.endsWith("completed")) {
            out.println("The process was completed");
        } else if (Str8.equalsIgnoreCase("error")) {
            out.println("An error has been");
        }
        out.println();

    /*4.Создать StringBuilder:
    1)  Добавить в него все ранее созданные строки.
    2)  После каждой 3-й строки выполнять перенос на новую строку.
    3)  Развернуть содержимое задом на перед.
    4)  Собрать StringBuilder в строку. Вывести ее на экран.*/
        StringBuilder builder = new StringBuilder(str1 + " " + str2 + " " + str4 + "\n " + str6
                + " " + fruits + " " + str7.trim() + "\n " + Str8);
        out.println(builder.reverse());

    }
}
