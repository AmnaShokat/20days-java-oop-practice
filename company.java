class Person{
    private String name;
    private  int age;
    protected String country;
    Person(){
        name="unknown";
        age=0;
        country=null;
    }
    Person(String name,int age , String country){
        this.name=name;
        this.age=age;
        this.country=country;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getcountry(){
        return country;
    }
    public void setcountry(String country){
        this.country=country;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void displayinfo(){
        System.out.println("employer name: "+name);
        System.out.println("employer age:  "+age);
        System.out.println("country name:  "+country);
    }

}
class employe extends Person{
    private int salary;
    protected String department;

    employe(String name,int age , String country,int salary,String department){

        super(name,age,country);
        this.salary=salary;
        this.department=department;
    }

    public int getsalary(){
    return salary;
    }
    public void setsalary(int salary){
        this.salary=salary;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    @Override
    public void displayinfo(){
        System.out.println("--------------------------");
        super.displayinfo();
        System.out.println("employer salary:  "+salary);
        System.out.println("department:  "+department);
    }

}

class manager extends employe{
    private int bonus;

        manager(String name,int age , String country,int salary,String department,int bonus){
        super(name,age,country,salary,department);
        this.bonus=bonus;
    }
    public int getbonus(){
    return bonus;
    }
    public void setbonus(int bonus){
        this.bonus=bonus;
    }
 @Override
    public void displayinfo(){
        System.out.println("--------------------------");
        super.displayinfo();
        System.out.println("bonus:  "+bonus);
        
    }
}

public class company{
    public static void main(String[] args){
         Person p = new Person("Ali", 30, "Pakistan");
        p.displayinfo();

        employe e1 = new employe("Amna", 22, "Pakistan", 50000, "Software");
        e1.displayinfo();

        employe e2 = new employe("Hafsa", 28, "Pakistan", 60000, "HR");
        e2.displayinfo();

        manager m1 = new manager("Amna", 21, "Pakistan", 90000, "Software", 20000);
        m1.displayinfo();


    }
}