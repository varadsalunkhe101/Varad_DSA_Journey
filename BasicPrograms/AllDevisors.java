package BasicPrograms;
public class AllDevisors {
    public static void main(String[] args) {
        int num=56;
        int i=1;
        while(i<num){
            if(num%i==0){
                System.out.println("Divisor : "+i);
            }
            i++;
        }
    } 
}
