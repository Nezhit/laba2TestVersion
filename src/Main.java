import java.util.regex.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Введите Url");
        boolean b;
        do {
            Scanner sc= new Scanner(System.in);
            String str= sc.nextLine();
            String ch=" ";
            str+=ch;
            //Pattern p1 = Pattern.compile("(http|https):(/{2})(\\w{2,})\\S+");
            //Pattern p3 = Pattern.compile("(http|https):(\\/{2})([a-z]{3,}.)+(\\w{2,})\s");
            //Pattern p2 = Pattern.compile("(http|https):(/{2})(\\w{3,}.)+(\\w{2,})");
            Pattern p4 = Pattern.compile("((http|https):(\\/{2}))?([a-z]{3,}.)+(\\w{2,})(\\/*)(\\w?)\s");
            Matcher m1 = p4.matcher( str );
            b = m1.matches();
            if(!b) System.out.println("Не валидный URL");
            System.out.println(b);
        } while (!b);
    }
}