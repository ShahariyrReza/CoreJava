
package advance_java;

/**
 *this class can convert any Decimal number to others number like, Binary, Octal, Hexadecimal
 * @author shahariyr reza
 */
public class DecimalToOthers {
    public static void main(String[] args) {
        int Dec = 10;
        String bin = Integer.toBinaryString(Dec);
        String oct = Integer.toOctalString(Dec);
        String hex = Integer.toHexString(Dec);
        
        System.out.println("Binary Value is :"+bin);
        System.out.println("Octal Value is :"+oct);
        System.out.println("HexaDecimal Value is :"+hex.toUpperCase());
    }
}
