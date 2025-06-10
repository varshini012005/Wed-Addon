public class SumOverloading{
    public void sum(int a,int b){
        System.out.println("sum(int,int)");
        System.out.println("sum(int):"+(a+b));
    }
    public void sum(double a,double b){
        System.out.println("sum(double,double)");
        System.out.println("sum(double):"+(a+b));
    }
    public static void main(String[] args){
        SumOverloading in=new SumOverloading();
        
        in.sum(10,10);
        in.sum(2.5,4.3);
    }
}