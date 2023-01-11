package OOP;

public class Student {
    int id;
    String name,email;
    
    Student(){
        System.out.println("No Information");
    }

    Student(int id, String name) { //this.id , this.name agulo amr valo lagce..
        this.id = id;
        this.name = name;
    }

    Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
    
    void DisplayInfo(){
        
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Email:"+email);
    }
    
}
