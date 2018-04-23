import java.io.*;
import java.util.*;

class trophy
{

	trophy()
	{
		double r,h,inputarea=0,outputarea=0,l,w,e,inputvalue=0,outputvalue=0;
			double total;
			final int aluminum=5,steel=10,copper=15,gold=100,silver=80,bronze=50; //value are in square metre.
			double pi=3.14;
			System.out.println("Please Select the area for which you need to find the cost"); // selection of shape
			System.out.println("1. Sphere");
			System.out.println("2. Cylinder");
			System.out.println("3. Cube");
			System.out.println("4. Cuboid");
			Scanner sc=new Scanner(System.in);
			int shape = sc.nextInt();
			System.out.flush();
			System.out.println("Please select the metal to be built on"); // selection of material
			System.out.println("1. Aluminum");
			System.out.println("2. Steel");
			System.out.println("3. Copper");
			int material=sc.nextInt();
			System.out.flush();
			System.out.println("Please select the coating material"); // selection of coating material
			System.out.println("1. Gold");
			System.out.println("2. Silver");
			System.out.println("3. Bronze");
			int coating=sc.nextInt();
			System.out.flush();
			System.out.println("Please enter thickness of coating material"); //selection of thickness  of coating material selected 
			double thick=sc.nextDouble();
			
			switch(shape)
			{
				case 1:
						System.out.println("Sphere");
						System.out.println("Please enter radius for your sphere trophy");
						r=sc.nextDouble();
						inputarea=(4/3)*pi*(r*r*r);	//calcuation is done for calculating inner area
						outputarea=4*pi*(r+thick*r+thick); // calcuation for calculating outer area + the thickness of material
						break;
				case 2:
						System.out.println("Cylinder");
						System.out.println("Please enter radius for your cylinder trophy");
						r=sc.nextDouble();
						System.out.println("Please enter height for your cylinder trophy");
						h=sc.nextDouble();
						inputarea= pi*(r*r)*(h*h);
						outputarea=2*pi*(r+thick)*h+(2*(22/7)*((r+thick)*(r+thick)));
						break;
				case 3:
						System.out.println("Cube");
						System.out.println("Please enter edge for your cube trophy");
						e=sc.nextDouble();
						inputarea=e*e*e;
						outputarea=6*((e+thick)*(e+thick));
						break;
				case 4:
						System.out.println("Cuboid");
						System.out.println("Please enter height for your cuboid trophy");
						h=sc.nextDouble();
						System.out.println("Please enter width for your cuboid trophy");
						w=sc.nextDouble();
						System.out.println("Please enter length for your cuboid trophy");
						l=sc.nextDouble();
						inputarea=2*((l*w)+(w*h)+(h*l));
						outputarea=2*(((l+thick)*(w+thick))+((w+thick)*(h+thick))+((h+thick)*(l+thick)));
						break;
			}
			
			switch(material)//calculation on the basis of selected material
			{
				case 1:
						inputvalue=inputarea*aluminum;
						break;
				case 2:
						inputvalue=inputarea*steel;
						break;
				case 3:
						inputvalue=inputarea*copper;
						break;
			}
			
			switch(coating)//calculation as per the coating material
			{
				case 1:
						outputvalue=outputarea*gold;
						break;
				case 2:
						outputvalue=outputarea*silver;
						break;
				case 3:
						outputvalue=outputarea*bronze;
						break;
			}
			total=inputvalue+outputvalue;
			System.out.println("The total cost for your trophy is"+"\t"+total);// This is the final amount that is incurred
}

	public static void main(String[] args)
	{
				new trophy();
	}
}