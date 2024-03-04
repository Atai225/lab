package MyLib;
import java.util.Scanner;
public class WriteMusicGenre {
    public WriteMusicGenre() {
        System.out.print("Введите жанр музыки: ");
        Scanner cin = new Scanner(System.in);
        CommonDate.recordMusic[1] = cin.nextLine();
    }

}
