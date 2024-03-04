package MyLib;

import java.util.Scanner;

public class WriteYearOfRelease {
    public WriteYearOfRelease() {
        System.out.print("Введите год релиза: ");
        while (true) {
            Scanner cin = new Scanner(System.in);
            if (cin.hasNextInt()){
                CommonDate.recordMusic[4] =cin.nextLine();
                break;
            }
            else System.out.print("Вы ввели не число. Повторите ввод - ");
        }
    }

}
