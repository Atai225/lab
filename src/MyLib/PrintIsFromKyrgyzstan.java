package MyLib;

import java.util.ArrayList;
import java.util.List;

public class PrintIsFromKyrgyzstan extends ReadFile{
    public PrintIsFromKyrgyzstan() {
        super();
    }
    @Override
    public void myPrint() {
        List<String> listOpen = new ArrayList<>();
        for (int i=0;i<CommonDate.recordListFile.size();i++) {
            String line = CommonDate.recordListFile.get(i);
            String[] elements = line.split(", ");  //элементы разделены запятыми
            String kino=elements[4].replace("]","");
            if (kino.equals("да")) listOpen.add(line);
        }
        new PrintList(listOpen);
    }
}
