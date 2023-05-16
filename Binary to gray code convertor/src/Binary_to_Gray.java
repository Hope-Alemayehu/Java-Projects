import java.io.*;

class GFG {
    // to convert the given binary string into
    // its equivalent gray code
    public static char xOR(char a, char b) {
        if (a == b) {
            return '0';
        } else {
            return '1';
        }
    }

    public static void toGray(String binary) {
        String gray = "";
        gray += binary.charAt(0);

        for (int i = 1; i < binary.length(); i++) {
            // perform XOR on the previous bit
            // and the current bit of binary string
            gray += xOR(binary.charAt(i - 1), binary.charAt(i));
        }
        System.out.println("The gray code of " + binary + " is: " + gray);
    }

    public static void main(String[] args) {
        String binary = "0011010101";
        toGray(binary);
    }
}
