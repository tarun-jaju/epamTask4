
package intrest;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter; 
  
    public class SimpleIntrest {
public void calculateSimpleIntrest() throws IOException
{
	BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
	out.write("enter the principal amount");
	out.flush();
	double principal=Double.parseDouble(input.readLine());
	out.write("enter the tenure to calculate simple intrest(in years)");
out.flush();
	double term=Double.parseDouble(input.readLine());
	out.write("enter rate of intrest(in %)");
	out.flush();
	double rateOfIntrest=Double.parseDouble(input.readLine());
	
	
	double simpleIntrest=(principal*term*rateOfIntrest)/100;
	out.write("the simple intrest of the principal amount is\n "  +simpleIntrest);
	out.flush();
	double finalAmount=principal+simpleIntrest;
	out.write("the final amount after adding intrest is\n "    +finalAmount);
	out.flush();
	
}
}