package Inheritance;

public class PersonOverriding {

    String name;
    int age;
    
    void setName(String name, int  age){
        this.name = name;
        this.age = age;
    }

    void DisplayInfo() {
        System.out.println("Name :"+name);
        System.out.println("Age :"+age);
    }
}
