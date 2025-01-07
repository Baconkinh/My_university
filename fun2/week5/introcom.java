import java.util.Scanner;

public class introcom {

    public static String FTB(float number) {  
        int sign = number < 0 ? 1 : 0;
        number = Math.abs(number);

        int integerPart = (int) number;
        float fractionalPart = number - integerPart;

        String intBin = Integer.toBinaryString(integerPart);

        StringBuilder fracBin = new StringBuilder();
        while (fractionalPart > 0 && fracBin.length() < 23) {
            fractionalPart *= 2;
            if (fractionalPart >= 1) {
                fracBin.append("1");
                fractionalPart -= 1;
            } else {
                fracBin.append("0");
            }
        }

        String combinedBin = intBin + "." + fracBin.toString();

        int exponent;
        String mantissa;

        if (integerPart != 0) {
            exponent = intBin.length() - 1;
            mantissa = combinedBin.substring(1).replace(".", "");
        } else {
            int firstOneIndex = fracBin.indexOf("1");
            exponent = -(firstOneIndex + 1);
            mantissa = fracBin.substring(firstOneIndex + 1);
        }

        int bias = 127;
        int adjustedExponent = exponent + bias;

        String expoBin = String.format("%8s", Integer.toBinaryString(adjustedExponent)).replace(' ', '0');

        mantissa = (mantissa + "00000000000000000000000").substring(0, 23);

        // Build final RAW format
        return sign + expoBin + mantissa;
    }

    public static void main(String[] args) {
        // Input real number
        Scanner sc = new Scanner(System.in);
        System.out.println("Input real number :");
        float realNumber=sc.nextFloat();

        // Convert to IEEE-754 format
        String rawBinary = FTB(realNumber);

        // Extract components
        int sign = rawBinary.charAt(0) - '0';
        String expo = rawBinary.substring(1, 9);
        String mantissa = rawBinary.substring(9);

        // Output
        System.out.println("Input real number: " + realNumber);
        System.out.println("Output1 sign: " + sign);
        System.out.println("Output2 expo: " + expo);
        System.out.println("Output3 mantissa: " + mantissa);
        System.out.println("Output RAW: " + rawBinary);
    }
}
