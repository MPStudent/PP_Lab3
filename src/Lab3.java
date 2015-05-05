import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class  Lab3 {

    public static void main(String[] args) throws FileNotFoundException {
        String s = "";
        Scanner in = new Scanner(new File("D:\\Git\\PP\\PP_Lab3\\file.txt"));
        while(in.hasNext())
            s += in.nextLine() + "\r\n";
        in.close();
        System.out.println("Итого: " + getNumOfVerbs(s) + " совпадения.");
    }

    public static int getNumOfVerbs(String string) {
        String reV = "\\b[а-яА-ЯёЁ]+((ть)|(л)|(ла)|(ло)|(ли)|(шь)|(ет)|(ют)|(ит)|(ят)|(аю)|(ти))\\b";
        Pattern p = Pattern.compile(reV);
        Matcher m = p.matcher(string);
        System.out.println("Ищем глаголы:");
        int numOfVerbs = 0;
        while (m.find()) {
            System.out.println(m.group());
            numOfVerbs++;
        }
        return numOfVerbs;
    }


}