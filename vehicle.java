abstract class cost{
   String name;
   int modelYear;
    cost(String name, int modelYear) {
        this.name = name;
        this.modelYear = modelYear;
    }

   abstract int calculateTax();

   public void displayInfo(){
    System.out.println("name: "+name);
    System.out.println("Model Year: " +modelYear);
   }
}

   class car extends cost{
    int engineCC;

     car(String name, int modelYear, int engineCC) {
        super(name, modelYear);
        this.engineCC = engineCC;
    }
    public int calculateTax(){
            if (engineCC > 1500){
              return 5000;
    }else{
        return 3000;
    }

      }
      public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine CC: " + engineCC);
        System.out.println("Tax: " + calculateTax());
    }
   }
      class Bike extends cost{
    boolean sportsModel;
     Bike(String name, int modelYear, boolean sportsModel) {
        super(name, modelYear);
        this.sportsModel = sportsModel;
    }
    public int calculateTax(){
            if (sportsModel == true){
              return 2000;
    }else{
        return 1000;
    }
                               }
                                public void displayInfo() {
        super.displayInfo();
        System.out.println("Sports Model: " + sportsModel);
        System.out.println("Tax: " + calculateTax());
    }
                               
   }

public class vehicle{
    public static void main(String[] args){
    car c1=new car("Honda",1998,1800);
    Bike c2=new Bike("Honda",1998,false);
        c1.displayInfo();
        c2.displayInfo();
        System.out.println();
    }
 }