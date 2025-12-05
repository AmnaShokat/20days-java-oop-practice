abstract class employ{
    String name;
    int id;
    long salary;

    employ(String name,int id,long salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    abstract double calculatebonus();
    void showinfo(){
        System.out.println("name:    "+name);
        System.out.println("ID:      "+id);
        System.out.println("salary:  "+salary);
    }
}
class fulltimeemployee extends employ{
    int fieldhour;
   
    fulltimeemployee(String name,int id,long salary,int fieldhour){
        super(name, id, salary);
        this.fieldhour=fieldhour;
    }
    double calculatebonus(){
        if(fieldhour > 40){
            return salary*0.20;
            
            // System.out.println(bonus);
    } else {
        return salary*0.10;
        // System.out.println(bonus);
    }
    }
    void showWork(){
        System.out.println("fieldhous:  "+fieldhour);
    }

}
class manager extends fulltimeemployee{
    int teamsize;
    manager(String name,int id,long salary,int fieldhour,int teamsize){
        super(name, id, salary,fieldhour);
        this.teamsize=teamsize;
    }

        double calculatebonus(){
       
            return salary * 0.30 + (teamsize * 500);
            
        }
     void showTeam() {
        System.out.println("Team Size: " + teamsize);
    }
}


public class Employee {
    
public static void main(String[] args) {
    employ e1 = new fulltimeemployee("amna",43,5000,54);
    employ e2 = new manager("Sara", 12, 80000, 50, 6);
    e1.showinfo();     
System.out.println(e1.calculatebonus());
e2.showinfo();
}

}
