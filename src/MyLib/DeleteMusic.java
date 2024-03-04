package MyLib;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteMusic  extends ReadFile {
    public DeleteMusic() {super();}
    @Override
    public void myPrint() throws IOException {
        List<String> listOpen = new ArrayList<>();
        System.out.print("Введите название композиции: ");
        Scanner cin = new Scanner(System.in);
        String compositionName = cin.nextLine().toLowerCase().trim();   //нижний регистр без пробелов
        boolean findComposition=false;
        for (int i=0;i<CommonDate.recordListFile.size();i++) {
            String line = CommonDate.recordListFile.get(i);
            String[] elements = line.split(", "); // Здесь предполагается, что элементы разделены запятыми
            String str=elements[0].replace("[","");
            if (str.toLowerCase().equals(compositionName)) findComposition=true;
            else listOpen.add(line); //если не тот, то сохраняем
        }
        if (findComposition) {
            System.out.print("Композиция " + compositionName + " найдена и будет удалена!\n");
            CommonDate.recordListFile= listOpen;
            new ReadFile();
        }
        else System.out.print("Композиция " + compositionName + " не найдена\n");
    }
}
