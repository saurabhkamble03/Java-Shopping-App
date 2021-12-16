import java.util.ArrayList;
import java.util.Scanner;

public class ProductMethods {

	static Scanner sc = new Scanner(System.in);
	public static ArrayList create(int n)
	{
		
//		String arr[]= new String[n];
		ArrayList<Product> ls = new ArrayList<>();
		for(int i=0;i<n;i++)
		{
//			arr[i]=sc.next();
			System.out.println("Enter Product id : ");
			int prodId=sc.nextInt();
			System.out.println("Enter Product name : ");
			String prodName=sc.next();
			System.out.println("Enter Product price : ");
			int prodPrice=sc.nextInt();
			System.out.println("Enter Product quantity : ");
			int prodQuant=sc.nextInt();
			
			Product prod=new Product(prodId,prodName,prodPrice,prodQuant);
			ls.add(prod);
//			ls.add(sc.next());
		}
		
		return ls;
	}
	public static void display(ArrayList ls)
	{
		System.out.println("Sr no.\tProdId\tProduct Name\t\tProduct price\tProduct Quantity\n");
		for(int i=0;i<ls.size();i++)
		{
			Product prod=(Product) ls.get(i);
			System.out.println((i+1)+"\t"+prod.getProdId()+"\t"+prod.getProdName()+"\t\t"+prod.getProdPrice()+"\t"+prod.getProdQuant()+"\n");
//			System.out.println((i+1)+". "+ls.get(i));
		}
	}
	public static ArrayList update(ArrayList ls)
	{
		System.out.println("Enter the product number to update");
		int num=sc.nextInt();
//		System.out.println("Enter the updated name");
//		ls.set(num-1, sc.next());
		
//		System.out.println("Enter Product id to update : ");
//		int prodId=sc.nextInt();
//		System.out.println("Enter Product name to update : ");
//		String prodName=sc.next();
//		System.out.println("Enter Product price to update : ");
//		int prodPrice=sc.nextInt();
//		System.out.println("Enter Product quantity to update : ");
//		int prodQuant=sc.nextInt();
//		
//		Product prod=new Product(prodId, prodName, prodPrice, prodQuant);
		
		Product prod=(Product) ls.get(num-1);
		System.out.println("Enter Product name to update : ");
		String prodName=sc.next();
		prod.setProdName(prodName);
		ls.set(num-1, prod);
		
		return ls;
	}
	public static ArrayList delete(ArrayList ls)
	{
		if(ls.size()==0)
		{
			System.out.println("No products available");
		}
		else
		{
			System.out.println("Enter the product number to be deleted");
			int num=sc.nextInt();
			ls.remove(num-1);
//			for(int i = num-1;i<ls.size()-1;i++)
//			{
//				arr[i]=arr[i+1];
//			}
			
			
		}
		
		return ls;
	}
}
