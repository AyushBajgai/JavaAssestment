//Programmed by: Ayush Bajgai
package Assestment;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Assestment1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Scanner data=new Scanner(System.in);
		
//Declaring Array for storing data's
		String [] title= new String[20];
		String [] author= new String[20];
		String [] publisher= new String[20];
		double [] price= new double[20];
		int [] page= new int[20];
		long [] ISBN= new long[20];
		
		int count=0;
		int i=0;
		String nomore;
		String temp;
//Allowing the user to input the number of data's	

//Currency format		
		NumberFormat GBP = NumberFormat.getCurrencyInstance(Locale.UK);
		
		do{
//Prompting the user to store the further data's	
			System.out.print("Do you want to store other data (Yes / Nomore): ");
			nomore=data.nextLine();
			
//If user inputs YES then			
			if(nomore.equalsIgnoreCase("Yes")) {
			
			System.out.print("Enter the name of Book "+ "["+i+"] :");
			title[i]=input.nextLine();
			
			System.out.print("Enter the name of an Author "+ "["+i+"] :");
			author[i]=input.nextLine();
			
			System.out.print("Enter the name of Publisher"+ "["+i+"] :");
			publisher[i]=input.nextLine();
			
			System.out.print("Enter Price"+ "["+i+"] :");
			temp=input.nextLine();
//Error Handling Case			
			try {
				price[i]=Double.parseDouble(temp);
			}
			catch(NumberFormatException e) {
				System.out.println("Wrong data format inserted!!!");
				System.out.println("Please re-enter");
			}
			
			System.out.print("Enter the number of Pages"+ "["+i+"] :");
			temp=input.nextLine();
//Error Handling Case			
			try {
				page[i]=Integer.parseInt(temp);
			}
			catch(NumberFormatException e) {
				System.out.println("Wrong data format inserted!!!");
				System.out.println("Please re-enter");
			}
			
			System.out.print("Enter ISBN"+ "["+i+"] :");
			temp=input.nextLine();
//Error Handling Case			
			try {
				ISBN[i]=Long.parseLong(temp);
			}
			catch(NumberFormatException e) {
				System.out.println("Wrong data format inserted!!!");
				System.out.println("Please re-enter");
			}
		i++;	
			}
			
//If user inputs NOMORE then		
			else if(nomore.equalsIgnoreCase("Nomore")) {
				break;
			}
		}
		
		while (true);
		
//In the case if user types Nomore then the output is displayed in the console	
		count=i;

			System.out.println("LIBRARY CATLOGUE");
			
			System.out.println(String.format("%-20s", "Title") + 
					String.format("%-20s", "Author") + 
					String.format("%-20s", "Publisher") + 
					String.format("%-20s", "Price") + 
					String.format("%-20s", "Page") + 
					String.format("%-20s", "ISBN"));
			
			System.out.println(String.format("%-20s", "=====") + 
					String.format("%-20s", "======") + 
					String.format("%-20s", "=========") + 
					String.format("%-20s", "=====") + 
					String.format("%-20s", "====") + 
					String.format("%-20s", "===="));
			
			for(i=0; i<count; i++) 
			{
				System.out.println(String.format("%-20s", title[i]) + 
						String.format("%-20s", author[i]) + 
						String.format("%-20s", publisher[i]) +
						String.format("%-20f", price[i]) + 
						String.format("%-20d", page[i]) + 
						String.format("%-20d", ISBN[i]));
			}

//For Calculation of Sum
			double sum=0;
			
			for(i=0; i<count; i++) {
				sum=sum+price[i];
			}

//For Maxium & Minimum cost of book
					double max=price[0];
					double min=price[0];
					
					for(i=0; i<count; i++) {
						if(max<price[i]) {
							max=price[i];
							
						}
						else if(min>price[i]) {
							min=price[i];
						}
					}
					
//For the books which has highest & lowest number of pages
					int highest=page[0];
					int lowest=page[0];
					String name1=title[0];
					String name2=title[0];
					
					for(i=0; i<count; i++) {
						if(highest<page[i]) {
							highest=page[i];
							name1=title[i];
						}
						if(lowest>page[i]) {
							lowest=page[i];
							name2=title[i];
						}
					}

//For calculation of average cost
					double avg;
					avg=sum/count;
			
//Displaying info of Library Catlogue	
			System.out.println("");		
			System.out.println("Totals");
			System.out.println("------------------------------------");
			System.out.println("");	
			System.out.println("Total number of books: "+ count);
			System.out.println("Total cost of books: "+ GBP.format(sum));
			System.out.println("Maximum cost of book: " + GBP.format(max));
			System.out.println("Minimum cost of book: " + GBP.format(min));
			System.out.println("'"+ name1 +"' has the highest number of pages: "+ highest);
			System.out.println("'"+ name2 +"' has the lowest number of pages: "+ lowest);
			System.out.println("Average cost of a book: "+ GBP.format(avg));
		

		}
	}
