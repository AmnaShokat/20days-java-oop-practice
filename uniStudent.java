class student {
   String name;
   int rollno;
   int marks1;
   int marks2;
      student(){
       name="unknown"; 
       rollno=0;
       marks1=0;
       marks2=0;
      }
      student(String name,int rollno, int marks1,int marks2){
        this.name=name;
        this.rollno=rollno;
        this.marks1=marks1;
        this.marks2=marks2;
      }
  void displayinfo(){
    System.out.println("my name is "+ name+ " and roll no is "+rollno+" "+marks1+" "+marks2);
  }    
  int totalmarks(){
    return marks1+marks2;
  }
  void result(){
    if(totalmarks()>=50){
    System.out.println("pass");
} else{
System.out.println("fail");
}
  }
}
public class uniStudent{
  public static void main(String[] args){
    student student1=new student();
    student1.displayinfo();
    student1.totalmarks();
    student1.result();

    student student2=new student("amna",147,45,65);
    student2.displayinfo();
    student2.totalmarks();
    student2.result();

    student student3=new student("hamza",147,85,67);
    student3.displayinfo();
    student3.totalmarks();
    student3.result();

  }
}
