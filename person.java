class PersonData{
    private String name;
    private int age;
    protected String nationality;
    
    PersonData( String name, int age,String nationality){
        this.name=name;
        this.age=age;
        this.nationality=nationality;
        
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getNationality(){
        return nationality;
    }
    public void setNationality(String  nationality){
        this. nationality= nationality;
    }
    public void displayinfo(){
        System.out.println("Name:        "+ name);
        System.out.println("age:         "+ age);
        System.out.println("Nationality: "+ nationality);
    }
}

class Teacher extends PersonData{
    private String subject;
    static int TeacherCount;

    public String getsubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }

    Teacher( String name, int age,String nationality,String subject){
        super(name,age,nationality);
        this.subject=subject;
        TeacherCount++;

}
@Override
   public void displayinfo(){
       super.displayinfo();
       System.out.println("subject: "+ subject);
   }
   
}
class HeadTeacher extends Teacher{
    private long bonus;


     public long getBonus(){
        return bonus;
    }
    public void setBonus(long bonus){
        this.bonus=bonus;
    }
        HeadTeacher( String name, int age,String nationality,String subject,long bonus){
        super(name,age,nationality,subject);
        this.bonus=bonus;
        
}
      public void displayinfo(){
         super.displayinfo();
       System.out.println("bonus: "+ bonus);
  }

}
public class person {
    public static void main(String[] args) {
        PersonData p1= new PersonData("Amna shoukat", 21, "pakistan");
        p1.displayinfo();
     System.out.println("-------------------");
        Teacher p2= new Teacher("hafsa", 51, "india","english");
        p2.displayinfo();
     System.out.println("-------------------");

       HeadTeacher p3= new HeadTeacher("hafsa", 51, "india","english",98900);
        p3.displayinfo();
        System.out.println("Total Teachers: " + Teacher.TeacherCount);

    }
    
}
