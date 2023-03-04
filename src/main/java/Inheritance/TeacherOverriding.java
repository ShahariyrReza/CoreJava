package Inheritance;


public class TeacherOverriding extends PersonOverriding{
    int teacherId;
    String qualification;
    
    
    void teacherName(int teacherId, String qualification){
        this.teacherId = teacherId;
        this.qualification = qualification;
    }
    
    @Override
    void DisplayInfo(){
        System.out.println("Teacher Id :"+teacherId);
        System.out.println("Qualification :"+qualification);
    }
}


