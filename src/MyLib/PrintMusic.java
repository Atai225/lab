package MyLib;

import java.util.List;

public class PrintMusic extends ReadFile {
    public PrintMusic() {
        super();
    }
    @Override
    public void myPrint(){
        List<String> list=CommonDate.recordListFile;
        new PrintList(list);
    }
}
