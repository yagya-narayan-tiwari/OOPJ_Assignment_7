package assignment.solution;
import java.util.*;
public class PrintSeries {

	public static void main(String[] args) {
		
		 Scanner sc =new Scanner(System.in);
		    System.out.print("enter the number upto which series should be printed =  ");
		    int num = sc.nextInt();
		    for(int i=1;i<num;i++){
		        if(i%2==0){
		            System.out.print(i*i + " ");
		        }
		        else{
		            System.out.print(i*i*i + " ");
		        }
		    }
	}
}
