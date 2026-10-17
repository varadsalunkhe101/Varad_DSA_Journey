package BasicPrograms;

public class Fibonacci {
    public static void main(String[] args) {
        int i = 1;
        int term=10;
        int newnum=1;
        int pastnum=0;

        while (i <= term) {
            int gnum=newnum+pastnum;
            System.out.print(pastnum+" ");
            pastnum=newnum;
            newnum=gnum;
            i++;
        }
    }
}
