package MyLib;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
    int ko=0;
    public WriteFile() throws IOException {
        System.out.print("\n"+"Сохранить в файл? (да или нет): ");
        Scanner cin = new Scanner(System.in);
        if (cin.nextLine().toLowerCase().equals("да")) {
            File file = new File(CommonDate.nameFile);
            if (!(file.exists() && file.isFile())){
                //если файла нет, то создаем
                FileWriter writer = new FileWriter(CommonDate.nameFile);
                writer.close();}
            //открываем файл для дозаписи
            FileWriter writer = new FileWriter(CommonDate.nameFile, true);
            String line=CommonDate.recordMusic[0] +", "+
                    CommonDate.recordMusic[1] +", "+
                    CommonDate.recordMusic[2] +", "+
                    CommonDate.recordMusic[3] +", "+
                    CommonDate.recordMusic[4] +", "+
                    CommonDate.recordMusic[5] +"\n";
            writer.write(line);
            writer.close();
        } else ko=1;
    }
    public int getKo() {
        return ko;
    }

}
