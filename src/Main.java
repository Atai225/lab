import MyLib.*;
import java.io.IOException;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        System.out.println("+-------------------------+");
        System.out.println("| Торговые центры Бишкека |");
        System.out.println("+-------------------------+");
        while (true) {
            WriteNumMode writeNumMode = new WriteNumMode();
            int n = writeNumMode.getN();
            switch (n) {
                case 1:     //ввод
                    WriteMusic writeMusic = new WriteMusic();
                    break;
                case 2:     //вывод всего
                    PrintMusic printMusic = new PrintMusic();
                    if (printMusic.getKo()==0) printMusic.myPrint();
                    else System.out.println("Файл "+CommonDate.nameFile+" отсутствует");
                    break;
                case 3:     //вывод виду
                    PrintIsFromKyrgyzstan printIsFromKyrgyzstan = new PrintIsFromKyrgyzstan();
                    if (printIsFromKyrgyzstan.getKo()==0) printIsFromKyrgyzstan.myPrint();
                    else System.out.println("Файл "+CommonDate.nameFile+" отсутствует");
                    break;
                case 4:     //вывод по автору
                    PrintAuthorName printAuthorName = new PrintAuthorName();
                    if (printAuthorName.getKo()==0) printAuthorName.myPrint();
                    else System.out.println("Файл "+CommonDate.nameFile+" отсутствует");
                    break;
                case 5:     //вывод по жанру
                    PrintMusicGenre printMusicGenre = new PrintMusicGenre();
                    if (printMusicGenre.getKo()==0) printMusicGenre.myPrint();
                    else System.out.println("Файл "+CommonDate.nameFile+" отсутствует");
                    break;
                case 6:     //вывод по году
                    PrintYearOfRelease printYearOfRelease = new PrintYearOfRelease();
                    break;
                case 7:     //Удаление
                    DeleteMusic deleteMusic = new DeleteMusic();
                    if (deleteMusic.getKo()==0) deleteMusic.myPrint();
                    else System.out.println("Файл "+CommonDate.nameFile+" отсутствует");
                    break;
                case 8:     //конец работы
                    System.out.println("Конец работы");
                    System.exit(0);
            }
        }
    }
}
