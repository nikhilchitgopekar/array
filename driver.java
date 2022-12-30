package array;
import java.util.Scanner;
public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[];
		x=new int[5];
		Scanner s;
		s=new Scanner(System.in);
		System.out.println("enter array elements");
		for(int i=0;i<5;i++) {
			x[i]=s.nextInt();
			
		}
		int i;
		System.out.println("elements are");
			for(i=0;i<5;i++)
			{
				System.out.println(+x[i]);
			}

	}

}
