package converter;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        boolean isWork = true;
        while(isWork) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to convert /from decimal or /to decimal? (To quit type /exit)");
            String choiceOfConvert = sc.next();
            if (choiceOfConvert.equals("/from")) {
                System.out.println("Enter number in decimal system:");
                int numberInDecimal = sc.nextInt();
                System.out.println("Enter target base:");
                int targetBase = sc.nextInt();
                System.out.print("Conversion result: ");
                switch (targetBase) {
                    case 2:
                        Utils.fromDecimalToBinary(numberInDecimal);
                        break;
                    case 8:
                        Utils.fromDecimalToOctal(numberInDecimal);
                        break;
                    case 16:
                        Utils.fromDecimalToHex(numberInDecimal);
                        break;
                }
                System.out.println();

            } else if (choiceOfConvert.equals("/to")) {
                System.out.println("Enter source number:");
                String sourceNumber = sc.next();
                System.out.println("Enter source base:");
                int sourceBase = sc.nextInt();
                System.out.print("Conversion to decimal result:");
                switch (sourceBase) {
                    case 2:
                        Utils.fromBinaryToDecimal(parseInt(sourceNumber));
                        break;
                    case 8:
                        Utils.fromOctalToDecimal(parseInt(sourceNumber));
                        break;
                    case 16:
                        Utils.fromHexToDecimal(sourceNumber);
                        break;
                }
                System.out.println();
            } else if (choiceOfConvert.equals("/exit")) {
                isWork = false;
            }
        }
    }
}

