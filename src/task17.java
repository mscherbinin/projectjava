
//Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
// Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли. Пользователь при тестировании программы
// по правилу черного ящика должен понимать, какой принцип остановки записи в файл он должен подать.


import java.io.*;

public class task17 {
    public static void main(String[] args){
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст на следующей строке, признак конца ввода - строка 'stop'");
        try(FileWriter fw = new FileWriter("C:\\Users\\Mikhail\\IdeaProjects\\projectjava\\src\\text2.txt")) {
            do {
                System.out.print(": ");
                s = br.readLine();
                if (s.compareTo("stop") == 0) break;
                s = s + "\r\n";
                fw.write(s);
            }
            while(s.compareTo("stop") !=0 );
        }
        catch(IOException exc){
            System.out.println("Ошибка ввода-вывода данных: " + exc);
        }
    }
}