import java.util.Date;
import java.util.Scanner;

import jdk.internal.misc.FileSystemOption;
public class ShopInfo {
	
	Scanner sc=new Scanner(System.in);
	
	public Customer[] create() {
		System.out.println("How many customers do you want to add");
		n=sc.nextInt();
		Customer carr[]=new Customer[n];
		for(int j=0;j<carr.length;j++)
		{
			System.out.println("How many Products do you want to buy");
			n=sc.nextInt();
			Product parr[]=new Product[n];
			
			for(int i=0;i<parr.length;i++)
			{
				System.out.println("Enter product "+(i+1)+" Details");
				System.out.println("Enter Product Id,Product Name,Product Price,Qty");
				parr[i]=new Product(sc.nextInt(),sc.next(),sc.nextDouble(),sc.nextInt())
			}
			System.out.println("Enter City, State , PInCode ");
			
			Address addr=new Address(sc.next(),sc.next(),sc.nextInt());
			System.out.println("Enter Customer Id ,Customer Name ,Mobile No");
			Customer cust=new Customer(sc.nextInt(),sc.next(),sc.next(),parr,addr);
			carr[j]=cust;
		}	
    	return carr;
	}
	public void display(Customer cust[]) {
		for(int i=0;i<cust.length;i++)
		{
			System.out.println("--------------CUSTOMER : " +(i+1)+" Details----------------");
			System.out.println("Customer Id : "+cust[i].getCustId());
			System.out.println("Customer Name : "+cust[i].getCustName());
			System.out.println("Customer Mobile No : "+cust[i].getMobno());
			System.out.println("--------------ADDRESS----------------");
			System.out.println("City : "+cust[i].getAddr().getCt());
			System.out.println("State : "+cust[i].getAddr().getSt());
			System.out.println("Pincode : "+cust[i].getAddr().getPincode());
			System.out.println("----------PRODUCT DETAILS------------");
			Product arr[]=cust[i].getProd();
			for(Product p:arr)
			{
				System.out.println(p.getProdId()+"\t"+p.getProdName()+"\t"+p.getProdPrice()+"\t"+p.getProdQty());
			}
			System.out.println("-------------BILL DETAILS----------------");
			Bill bill=cust[i].getBill();
			//System.out.println(" Date : "+cust.getBill().getDate());
			System.out.println("Date : "+bill.getDate());
			System.out.println("Total : "+bill.getTotal());
			System.out.println("CGST : "+bill.getCgst());
			System.out.println("SGST : "+bill.getSgst());
			System.out.println("Final Total : "+bill.getFinaltotal());
			
		}
		
		System.out.println("===============THANK YOU=====================");
	}
	public void calculateBill(Customer cust[]) {
		for(int i=0;i<cust.length;i++)
		{
			double total=0,cgst,sgst,finaltotal;
			Product arr[]=cust[i].getProd();//here you will get array of products
			for(Product p:arr) {
				total=total+p.getProdPrice()*p.getProdQty();	
			}
			cgst=total*0.05;
			sgst=total*0.06;
			finaltotal=total+cgst+sgst;
			Bill bill=new Bill(1,new Date(),total,cgst,sgst,finaltotal);
			cust[i].setBill(bill);
		}
		
			
		}
		
    
}
