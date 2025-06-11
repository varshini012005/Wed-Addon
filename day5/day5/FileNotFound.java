package program;
import java.io.*;
 public class FileNotFound{
    public static void main(String[] args){
        String filename="";
        try(BufferedReader br=new BufferedReader(new FileReader(filename))){
        String Line;
        if((Line = br.readLine()) !=null){
            System.out.println(Line);
        }
        
        }
    catch(Exception e){
        System.out.println("fILE NOT FOUND");
    }
    }
 }
 
