package task2;
import java.io.*;
class Estimate
{
	void estimation()throws IOException
	{
		int totalCost=0;
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
			out.write(" select  the type of materials that you want to use for construction\n");
			out.flush();
			out.write("1.standard materials\n2.above standard materials\n3.high standard material\n4.fully automated materials");
			out.flush();
			int choice=Integer.parseInt(input.readLine());
			out.write("enter the area of your house(in sq feet)\n");
			out.flush();
			int area=Integer.parseInt(input.readLine());
				if(choice==1)
					totalCost=1200*area;
				else	if(choice==2)
					totalCost=1500*area;
				else	if(choice==3)
					totalCost=1800*area;
				else if(choice==4)
					totalCost=2500*area;
				else
				{
					out.write("INVALID CHOICE\n");
				out.flush();
				}
				
			out.write("the total cost of construction as per your choice is"+totalCost+"rupees\n" );
			out.flush();
	}
	
}
public class ContructionCost {
public static void main(String[] args)throws IOException
{
	Estimate cost=new Estimate();
	cost.estimation();
}
}
