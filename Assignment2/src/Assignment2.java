import java.util.*;
public class Assignment2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System .in);
		
		System.out.print("Enter your name : ");
		String name = input.nextLine();
		
		System.out.print("Enter your IC : ");
		String IC = input.next();
		
		System.out.print("Enter your No. H/P : ");
		String hp = input.next();
		System.out.println();
		
		String brandA = "Faber Castle";
		String typeA = "ballpoint pen";
		String colourA = "Blue, Black, Red";
		String widthsA = "0.5mm & 0.7mm";
		String priceA = "RM1.31 / pcs";
		
		System.out.println("The brand of product: " + brandA);
		System.out.println("The type of product: " + typeA);
		System.out.println("The colour of product: " + colourA);
		System.out.println("The witdh of product: " + widthsA);
		System.out.println("The price of product: " + priceA);
		System.out.println();
		
		String brandB = "Pilot G2";
		String typeB = "gel ball pen";
		String colourB = "Blue, Black, Red";
		String widthsB = "0.5mm & 0.7mm & 1.0mm";
		String priceB = "RM3.40 / pcs";
		
		System.out.println("The brand of product: " + brandB);
		System.out.println("The type of product: " + typeB);
		System.out.println("The colour of product: " + colourB);
		System.out.println("The witdh of product: " + widthsB);
		System.out.println("The price of product: " + priceB);
		System.out.println();
		
		String brandC = "Zhi Xin";
		String typeC = "gel ink pen";
		String colourC = "Blue, Black, Red";
		String widthsC = "0.7mm";
		String priceC = "RM 0.80 / pcs";
		
		System.out.println("The brand of product: " + brandC);
		System.out.println("The type of product: " + typeC);
		System.out.println("The colour of product: " + colourC);
		System.out.println("The witdh of product: " + widthsC);
		System.out.println("The price of product: " + priceC);
		System.out.println();
		
		int numberofitems, qty;
		String branditem, colour, witdh;
		double price, ttlprice;
		double amount = 0;
		
		System.out.print("Enter the number of item: ");
		numberofitems = input.nextInt();
		
		for (int items = 1; items <= numberofitems; items++) {
			System.out.println("Item " + items);
			
			System.out.print("Enter brand: ");
			branditem = input.next();
			
			System.out.print("Enter price: RM");
			price = input.nextDouble();
			
			System.out.print("Enter colour: ");
			colour = input.next();
			
			System.out.print("Enter witdh : ");
			witdh = input.next();
			
			System.out.print("Enter quantity : ");
			qty = input.nextInt();
			
			ttlprice = price * qty;
			System.out.println("Total price: " + ttlprice);
			System.out.println();
			
			amount += ttlprice;
			
		}
		
		double discount = 0;
		if(amount < 50) {
			discount =  amount * 5/100;
		}
		
		else if(amount >= 50 && amount < 100) {
			discount = amount * 10/100;
		}
		
		else if(amount >= 100) {
			discount = amount * 15/100;
		}
		
		System.out.println("Name :" + name);
		System.out.println("NO. IC :" + IC);
		System.out.println("H/P : " + hp);
		System.out.println("Total amount of items : RM" + amount);
		System.out.println("Discount received: RM" + discount);
		System.out.println("Price to be paid: RM" + (amount - discount ));
		System.out.println();
		
	}

}
