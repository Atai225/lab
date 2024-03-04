package MyLib;

import java.util.List;

public class PrintList {
    public PrintList(List<String> list) {
        System.out.println(
                "+----------------------------------------------------------------------------------------------------------+");
        System.out.println("|       Название       |       Жанр       |        Автор        |       Страна       | " +
                " Год  | Кыргызская |");
        System.out.println(
                "+----------------------------------------------------------------------------------------------------------+");

        for (int i=0; i< list.size(); i++) {
            String[] str = list.get(i).replaceAll("\\[|\\]", "").split(", ");
            System.out.printf("| %-20s | %-16s | %-19s | %-18s | %-5s | %-10s |%n",
                    str[0], str[1], str[2], str[3], str[4], str[5]);
        }
        System.out.println(
                "+----------------------------------------------------------------------------------------------------------+");
    }
}
