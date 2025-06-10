 public class SumofEven {
    public static void main(String[] args) {
        int[] number={1,2,3,4,5};
        System.out.println(number[2]);
        System.out.println(number.length);
        for(int i=number.length-1;i>=0;i--)
        {
            System.out.println(number[i]);
        }
    }
}