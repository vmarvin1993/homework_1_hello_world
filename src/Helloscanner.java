import java.util.Scanner;

public class Helloscanner {
    public static void main(String[] args){
        Scanner  scan = new Scanner(System.in);
        System.out.println("Введите Ваше Имя:");
        String phrasel = scan.nextLine();
        System.out.println("Приветствую, " + phrasel + "!");
    }
}
