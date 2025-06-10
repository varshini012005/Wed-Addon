package program;

public class DefaultConstructor {
    String language;
    String name;
    int year;
        DefaultConstructor( String name,int year,String lang){
            this.name=name;
            this.year=year;
            this.language=lang;
       System.out.println("userdefine Constructor"+" " +name+" "+ year);
    }
    
      public static void main(String[] args) {
          //to create object
          //classname refernce variable=new classname();
          DefaultConstructor ref=new DefaultConstructor("java",1995,"programming");
      } 
}