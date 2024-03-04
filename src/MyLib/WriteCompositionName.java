package MyLib;

import java.util.Scanner;

public class WriteCompositionName {
    public WriteCompositionName() {
        System.out.print("Введите название композиции: ");
        Scanner cin = new Scanner(System.in);
        CommonDate.recordMusic[0] = cin.nextLine();    // название композиции
    }

}
