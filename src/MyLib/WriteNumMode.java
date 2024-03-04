package MyLib;

import java.util.Scanner;

public class WriteNumMode {
    int n;
    public WriteNumMode() {
        System.out.print("\n");
        System.out.print("1. Ввод данных\n");
        System.out.print("2. Вывод данных\n");
        System.out.print("3. Узнать из кыргызстана ли песня\n");
        System.out.print("4. Вывод по авторам песен \n");
        System.out.print("5. Вывод по жанрам песен \n");
        System.out.print("6. Вывод по году песен\n");
        System.out.print("7. Удаление данных о песне\n");
        System.out.print("8. Выход");
        int N=8;    //количество опций меню
        System.out.print("\n"+"Введите номер режима - ");
        while (true) {
            Scanner cin = new Scanner(System.in);
            if (cin.hasNextInt()) {
                n = cin.nextInt();
                if (n>=1 && n<= N) {break;}
                else System.out.print("Номер режима от 1 до "+N+". Повторите ввод - ");
            } else System.out.print("Вы ввели не число. Повторите ввод - ");
        }
    }
    public int getN() {
        return n;
    }
}
