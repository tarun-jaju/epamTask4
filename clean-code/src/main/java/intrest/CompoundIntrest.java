package intrest;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.lang.Math;

public class CompoundIntrest {
public void calculateCompoundIntrest()throws IOException
{
	BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
	
	out.write("\nenter the principal amount\n");
	out.flush();
	double principal=Double.parseDouble(read.readLine());
	out.write("enter the tenure to calculate compound intrest(in years)\n");
	out.flush();
	double term=Double.parseDouble(read.readLine());
	out.write("enter the rate of intrest(in %)\n");
	out.flush();
	double rateOfIntrest=Double.parseDouble(read.readLine());
	rateOfIntrest/=100;
	out.write("enter the times the intrest is coumpounded in a year\n");
	out.flush();
	int timesCompounded=Integer.parseInt(read.readLine());
	out.flush();
	double finalAmount=principal*(Math.pow(1+(rateOfIntrest/timesCompounded),term*timesCompounded));
	double compoundIntrest=finalAmount-principal;
	out.write("the amount of intrest is\n"   +compoundIntrest);
	out.flush();
	out.write("the final amount after adding intrest is \n"   +finalAmount);
	out.flush();
}
}
