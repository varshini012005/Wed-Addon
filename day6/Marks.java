import java.util.HashMap;
import java.util.Map;
  class Marks{
    public static void main(String[] args) {
    HashMap<String,Integer> studentMarks=new HashMap<String,Integer>();
        studentMarks.put("sree:",100);
        studentMarks.put("varshini:",86);
        studentMarks.put("nithran:",89);
        int totalMarks=0;
        for(int marks:studentMarks.values()){
            totalMarks +=marks;
        }
        
        System.out.println( "TOTAL:" +totalMarks);
        double average=totalMarks / studentMarks.size();
        System.out.println("AVERAGE:" +average);
        for(Map.Entry<String,Integer> entry : studentMarks.entrySet()){
            System.out.println(entry.getKey()+""+entry.getValue());
        }
    }
}
