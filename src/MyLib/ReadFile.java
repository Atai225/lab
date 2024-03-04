package MyLib;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
//родительский класс для печати
public class ReadFile {
    int ko=0;
    public ReadFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(CommonDate.nameFile))) {
            String line;
            CommonDate.recordListFile.clear();
            while ((line = reader.readLine()) != null) {
                // Разбиваем строку на элементы (предполагаем, что они разделены запятой с пробелом)
                String[] elements = line.split(", ");
                elements[0]=elements[0].replace("[","");
                elements[elements.length-1]=elements[elements.length-1].replace("]","");
                // Добавляем элементы в список
                CommonDate.recordListFile.add(Arrays.toString(elements));
            }
        } catch (IOException e) {
            ko=1;   //файл не прочитан
        }
    }
    public void myPrint() throws IOException {}  //пустышка для перезагрузки

    public int getKo() {
        return ko;
    }
}
