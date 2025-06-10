package program;

public class Laptop{
    String name;
    String brand;
    int size;
    
        Laptop( String name,String brand,int size){
            this.brand=name;
            this.name=brand;
            this.size=size;
       System.out.println("laptop brand"+" " +name+" "+brand+" "+size);
    }

     
     
      public static void main(String[] args) {
          //to create object
          //classname refernce variable=new classname();
          System.out.println("original constructor");
          Laptop ref=new Laptop("Lenovo","V15 G4",450);
          
      } 
}