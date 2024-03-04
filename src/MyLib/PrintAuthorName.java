package MyLib;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintAuthorName extends ReadFile {
    public PrintAuthorName() {super();}

    @Override
    public void myPrint(){
        List<String> listOpen = new ArrayList<>();
        System.out.print("Введите имя автора: ");
        Scanner cin = new Scanner(System.in);
        String authorName = cin.nextLine();
        for (int i=0;i<CommonDate.recordListFile.size();i++) {
            String line = CommonDate.recordListFile.get(i);
            String[] elements = line.split(", ");  //элементы разделены запятыми
            int index = elements[1].indexOf(authorName);
            if (index != -1) listOpen.add(line);
        }
        new PrintList(listOpen);
    }
}
