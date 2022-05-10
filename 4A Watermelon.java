import java.util.Scanner;
 
public class watermelon {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String size = in.nextLine();
        int num = Integer.parseInt(size);
        if(num%2==0){
            if(num==2) System.out.println("No");
            else System.out.println("Yes");
        }
        else System.out.print("No");
 
    }
}
