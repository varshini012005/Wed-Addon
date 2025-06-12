import java.util.HashMap;
  class EmailProgram {
    public static void main(String[] args) {
    HashMap<String,Integer> studentMarks=new HashMap<String,Integer>();
        studentMarks.put("sree",100);
        studentMarks.put("varshini",86);
        studentMarks.put("nithran",89);
        int totalMarks=0;
        for(int marks:studentMarks.values()){
            totalMarks +=marks;
        }
        
        System.out.println(totalMarks);
        double average=totalMarks / studentMarks.size();
        System.out.println(average);
    }
}
