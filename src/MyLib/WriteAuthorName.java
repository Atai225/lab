package MyLib;

import java.util.Scanner;

public class WriteAuthorName {
    public WriteAuthorName() {
        System.out.print("Введите имя автора: ");
        Scanner cin = new Scanner(System.in);
        CommonDate.recordMusic[2] = cin.nextLine();
    }

}
