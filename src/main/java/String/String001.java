package String;

public class String001 {

    public static void main(String[] args) {
        String s1 = "Shahariyr reza";
        System.out.println(s1);

        String s2 = new String("Shahariyr Reza");
        System.out.println(s2);
        char[] ch = {'r', 'e', 'z', 'a'};
        System.out.println(ch);
        
        int len =s1.length();
        System.out.println("The Length of s1 is :"+len);
        
        if (s1==s2) {
            System.out.println("S1 = S2");
        } else {
            System.out.println("S1 != S2");
        }
        // This method will compare the method of s1 and s2 and return the value
        
        if (s1.equalsIgnoreCase(s2)) { // method 1 :s1.equal]   method 2 : s1.equalIgnoreCase]
            System.out.println("S1 = S2");
        } else {
            System.out.println("S1 != S2");
        }
        // will return a boolean value, if it's true then will go to the loop, else go to another loop
        
        if (s1.contains(s2)) {
            System.out.println("S1 = S2");
        } else {
            System.out.println("S1 != S2");
        }
        //compare if the given string match with the method value or not.. will return a boolean value 
        
        boolean em =s2.isEmpty();
        System.out.println(em);
        // will return either the s2 is null or not..
    }
    
    
}
