import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] arr = null;
		ArrayList<Product> ls = null;
		int n=0;
		ProductMethods pm = new ProductMethods();
		int ch=0;
		do
		{
			System.out.println("Shopping Application");
			System.out.println("1.Add Product");
			System.out.println("2.Display Products");
			System.out.println("3.Update Products");
			System.out.println("4.Delete Products");
			System.out.println("5.Exit");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			
			switch(ch) 
			{
				case 1: 
						System.out.println("Enter the no. of products you want to add.");
						n=sc.nextInt();
						ls=pm.create(n);
						break;
				case 2: pm.display(ls);
						break;
				case 3: ls=pm.update(ls);
						break;
				case 4: ls=pm.delete(ls);
						break;
			}
			
			
		}while(ch!=5);

	}

}
