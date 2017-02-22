import java.util.Scanner;

/**
 * @author: Brojandos.
 * @creation_date: 22.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte coinsQuantity = input.nextByte();
        byte headsQuantity = 0;
        byte tailsQuantity = 0;
        for (byte i = 0; i < coinsQuantity; i++) {
            if (input.nextByte() == 0) headsQuantity++;
            else tailsQuantity++;
        }
        if (headsQuantity < tailsQuantity) System.out.println(headsQuantity);
        else System.out.println(tailsQuantity);
    }
}
