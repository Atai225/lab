package MyLib;

import java.io.IOException;
import java.text.ParseException;

public class WriteMusic{
    public WriteMusic() throws IOException, ParseException {
        new WriteCompositionName(); //название композиции
        new WriteMusicGenre(); //название композиции
        new WriteAuthorName(); //имя автора
        new WriteCountry(); //страна
        new WriteYearOfRelease(); //год выпуска
        new WriteIsFromKyrgyzstan();
        WriteFile writeFile=new WriteFile();
        if (writeFile.getKo()==0)
            System.out.println("Данные записаны");
    }
}
