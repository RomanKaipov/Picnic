import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    //    1. Осуществить подсчет слов:
//    Напишите программу, которая подсчитывает количество слов в
//    файле `input.txt`.
//    2. Найти самое длинное слово:
//    Создайте программу, которая находит самое длинное слово в
//    файле.
//    3. Вычислить частоту слов:
//    Напишите программу, которая анализирует, сколько раз каждое
//    слово встречается в файле. Подумайте об этом как о подсчете того,
//    какие фрукты и овощи самые популярные на вашем пикнике!

    public static void main(String[] args) throws IOException {
        cntWords();
        longestWord();
        cntFruits();
    }

    public static void cntWords() throws IOException {
        String filePath = "D:\\Education\\Java\\Picnic\\Picnic\\src\\input.txt";
        Scanner fileReader = new Scanner(new FileInputStream(filePath));
        int cntWords = 0;
        while (fileReader.hasNext()) {
            fileReader.next();
            cntWords++;
        }
        fileReader.close();
        System.out.println("Numbers of words in the file is: " + cntWords);
    }

    public static void longestWord() throws IOException {
        String filePath = "D:\\Education\\Java\\Picnic\\Picnic\\src\\input.txt";
        String longestWord = "";
        String temp;
        Scanner fileReader = new Scanner(new FileInputStream(filePath));

        while (fileReader.hasNext()) {
            temp = fileReader.next();
            if (temp.length() > longestWord.length()) {
                longestWord = temp;

            }
        }
        fileReader.close();
        System.out.println("The longest word in file is: " + longestWord);
    }

    public static void cntFruits() throws IOException {
        String filePath = "D:\\Education\\Java\\Picnic\\Picnic\\src\\input.txt";
        Scanner fileReader = new Scanner(new FileInputStream(filePath));
        Map<String, Integer> map = new HashMap<>();
        String temp;
        while (fileReader.hasNext()) {
            temp = fileReader.next();
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }
        map.remove("");
        System.out.println(map);
    }
}


