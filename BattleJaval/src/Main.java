import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Scanner s_Scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Board.s_iHeight = 20;
        Board.s_iWidth = 15;

        WarBoat wb = new WarBoat();
        System.out.println( wb.toString());
        Submarine sub = new Submarine(null);
        System.out.println( sub.toString());
    }

    public static String[] getScannerInfo(){
        var infos = Main.s_Scanner.nextLine();
        var infosArray = infos.split(",");
        return infosArray;
    }
}