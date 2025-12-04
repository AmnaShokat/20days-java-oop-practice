abstract class calculate{
    abstract void area();
    public void displayInfo(){
        System.out.println("calculating area.....");
    }
}
class circle extends calculate{

        int radius;
        circle(int radius){
            this.radius=radius;
        }
        // pie r^2
                void area(){
                    double result=3.14*radius*radius;
            System.out.println("area of circle: "+result);
        }
     
}

class rectangle extends calculate{

        int length;
        int width;
        rectangle(int length,int width){
            this.length=length;
            this.width=width;
        }
             void area(){
                int result=width*length;
            System.out.println("area of rectangle: "+result);
        }
}


public class shape {
    public static void main(String[] args) {
        calculate c1=new circle(7);
      c1.displayInfo();
      c1.area();

calculate r1=new rectangle(7,4);
      r1.displayInfo();
      r1.area();
    }
    
}
