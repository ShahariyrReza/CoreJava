package String;

public class StringBuffer {

    public StringBuffer(String s1) {
    }
    public static void main(String[] args) {
        String s1 = "shahariyr reza";
        StringBuffer sb = new StringBuffer(s1);
        sb.append("reza");
        System.out.println(sb);
    }

    private void append(String reza) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
