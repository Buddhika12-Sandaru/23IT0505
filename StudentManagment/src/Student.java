public class Student {
    private String name;
    private String id;
    private int age;

    //parametirezed constructor
    Student(String studentName,String studentId,int studentAge){
        this.name=studentName;
        this.id=studentId;
        this.age=studentAge;
    }

    //getters and setters
    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }
    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setId(String id){
        this.id=id;
    }
    public void setAge(int age){
        this.age=age;
    }

    //displayinfo
    public void dispplayInfo(){
        System.out.println("ID: " + id + " | Name: " + name + " | Age: " + age);
    }

}
