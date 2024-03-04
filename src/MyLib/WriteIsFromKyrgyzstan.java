package MyLib;

import java.util.Scanner;

public class WriteIsFromKyrgyzstan {
    public WriteIsFromKyrgyzstan() {
        System.out.print("Музыка из Кыргызстана? (да/нет): ");
        while (true) {
            Scanner cin = new Scanner(System.in);
            String ant=cin.nextLine().toLowerCase();
            if (ant.equals("да") || ant.equals("нет")) {
                CommonDate.recordMusic[5] = ant;
                break;}
            else System.out.print("Вы ввели не верное значение. Повторите ввод - ");
        }
    }

}
