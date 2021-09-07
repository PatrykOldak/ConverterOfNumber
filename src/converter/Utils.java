package converter;
public class Utils {

    public static void fromDecimalToBinary(int numberInDecimal) {
        String stringOfDigits = "";
        while (numberInDecimal > 0) {
            stringOfDigits += numberInDecimal % 2;
            numberInDecimal /= 2;
        }
        for (int i = stringOfDigits.length() - 1; i >= 0; i--) {
            System.out.print(stringOfDigits.charAt(i));
        }
        System.out.println();
    }

    public static void fromDecimalToOctal(int numberInDecimal) {
        String stringOfDigits = "";
        while (numberInDecimal > 0) {
            stringOfDigits += numberInDecimal % 8;
            numberInDecimal /= 8;
        }
        for (int i = stringOfDigits.length() - 1; i >= 0; i--) {
            System.out.print(stringOfDigits.charAt(i));
        }
        System.out.println();
    }

    public static void fromDecimalToHex(int numberInDecimal) {
        String stringOfDigits = "";
        while (numberInDecimal > 0) {
            int waitingNumber = numberInDecimal % 16;
            if (waitingNumber > 9) {
                switch (waitingNumber) {
                    case 10:
                        stringOfDigits += "A";
                        break;
                    case 11:
                        stringOfDigits += "B";
                        break;
                    case 12:
                        stringOfDigits += "C";
                        break;
                    case 13:
                        stringOfDigits += "D";
                        break;
                    case 14:
                        stringOfDigits += "E";
                        break;
                    case 15:
                        stringOfDigits += "F";
                        break;
                }
            }
            else {
                stringOfDigits += numberInDecimal % 16;
            }
            numberInDecimal /= 16;
        }
        for (int i = stringOfDigits.length() - 1; i >= 0; i--) {
            System.out.print(stringOfDigits.charAt(i));
        }
    }
    public static void fromBinaryToDecimal(int sourceNumber) {
        int length = sourceNumber;
        int lengthOfNumber = 0;
        while (length > 0) {
            length /= 10;
            lengthOfNumber++;
        }
        int number = 0;
        for (int i = 0; i < lengthOfNumber; i++){
            int remainder = sourceNumber % 10;
            if (remainder == 1) {
                number += Math.pow(2, i);
            }
            sourceNumber /= 10;
        }
        System.out.println(number);
    }
    public static void fromOctalToDecimal(int sourceNumber) {
        int length = sourceNumber;
        int lengthOfNumber = 0;
        while (length > 0) {
            length /= 10;
            lengthOfNumber++;
        }
        int number = 0;
        for (int i = 0; i < lengthOfNumber; i++) {
            int remainder = sourceNumber % 10;
            number += remainder * Math.pow(8, i);
            sourceNumber /= 10;
        }
        System.out.println(number);
    }

    public static void fromHexToDecimal(String sourceNumber) {
        String[] arrayOfDigit = sourceNumber.split("");
        int number = 0;
        for (int i = arrayOfDigit.length - 1; i >= 0; i--) {
            switch(arrayOfDigit[i]) {
                case "A":
                case "a":
                    number += 10 * Math.pow(16, Math.abs((arrayOfDigit.length - 1) - i));
                    break;
                case "B":
                case "b":
                    number += 11 * Math.pow(16, Math.abs((arrayOfDigit.length - 1) - i));
                    break;
                case "C":
                case "c":
                    number += 12 * Math.pow(16, Math.abs((arrayOfDigit.length - 1) - i));
                    break;
                case "D":
                case "d":
                    number += 13 * Math.pow(16, Math.abs((arrayOfDigit.length - 1) - i));
                    break;
                case "E":
                case "e":
                    number += 14 * Math.pow(16, Math.abs((arrayOfDigit.length - 1) - i));
                    break;
                case "F":
                case "f":
                    number += 15 * Math.pow(16, Math.abs((arrayOfDigit.length - 1) - i));
                    break;
                default:
                    number += Integer.parseInt(arrayOfDigit[i]) * Math.pow(16, Math.abs((arrayOfDigit.length - 1) - i));
                    break;
            }
        }
        System.out.println(number);
    }
}
