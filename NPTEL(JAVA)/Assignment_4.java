
import java.util.*;
public class Assignment_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice = "";
        int product=1, sum =0 ,count=0;

        while(true){
            //System.out.print("Enter your choice(or q to exit): ");
            choice = input.next();
            if (choice.equals("q")){
                break;
            }
            else{
                count++;
                int num = Integer.parseInt(choice);
                sum = sum+num;
                product= product*num;
            }
        }
        float average = (float)sum/count;
        System.out.println("Product is: " + product);
        System.out.println("Average is: "+ average);

    }
}
