class Student{
    // bcz no one can change student name roll no and gpa except owner or developer
    private String name;
    private int rollNo;
    private double gpa;
    // same package + inherited child of another package 
    protected String department;
    static int totalStudents;

    Student(){
        this.name = "Unknown";
        this.rollNo = 0;
        this.gpa = 0.0;
        this.department = "Unknown";
        totalStudents++;
    }

    // to access private variables
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

        public int getrollNo(){
        return rollNo;
    }
    public void setrollNo(int rollNo){
        this.rollNo=rollNo;
    }

        public double getgpa(){
        return gpa;
    }
    public void setgpa(double gpa){
        this.gpa=gpa;
    }
    Student(String name,int rollNo,double gpa,String department){
        this.name=name;
        this.rollNo=rollNo;
        this.gpa=gpa;
        this.department=department;
        totalStudents++;
        
    }
   
    public void displayinfo(){
        System.out.println( "studentName: "+ name );
        System.out.println( "rollNo: " +rollNo);
        System.out.println( "gpa: "+gpa);
        System.out.println(  "department: "+department);
        System.out.println("total Student"+ totalStudents);
    }
         public static void showTotalStudent(){
        System.out.println(totalStudents);
    }

    }


public class management {
     public static void main(String[] args) {
     Student s1=new Student("amna ",147,3.8,"software engineering");
    s1.displayinfo();
    Student s2=new Student("hafsa ",97,3,"Electrical engineering");
    s2.displayinfo();
    Student s3=new Student("farwa ",39,2.9,"chemical engineering");
    s3.displayinfo();
    Student.showTotalStudent();

     }
    
}
