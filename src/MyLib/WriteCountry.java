package MyLib;

import java.util.Scanner;

public class WriteCountry {
    public WriteCountry() {
        System.out.print("Введите родину музыки: ");
        Scanner cin = new Scanner(System.in);
        CommonDate.recordMusic[3] = cin.nextLine();
    }

}
