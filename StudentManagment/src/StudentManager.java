import java.util.ArrayList;

public class StudentManager {
    // studentArray list
    private ArrayList<Student> studentArray = new ArrayList<>();

    //add students
    public void addStudents(Student student){
        studentArray.add(student);
        System.out.println("Student added successfully!");
    }

    //display all the students
    public void displayStudents(){
        for(Student eachstudent:studentArray){ //for each loop
            eachstudent.dispplayInfo();
        }
        System.out.println(" ");
    }

    //remove students
    public void removeStudent(String id){
        boolean found = false;
        for(Student eachstudent:studentArray){ //for each loop
            if(eachstudent.getId().equalsIgnoreCase(id)){
                studentArray.remove(eachstudent);
                System.out.println("Student removed successfully!");
                found = true;
                break;
            }
        }if(!found){
            System.out.println("No Student found with this ID!" + id + "\n");
        }
    }
}
