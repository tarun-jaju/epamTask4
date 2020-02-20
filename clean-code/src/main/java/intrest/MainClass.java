package intrest;

import java.io.IOException;

public class MainClass {
public static void main(String[] args)throws IOException 
{
	
	SimpleIntrest simpleIntrestObj=new SimpleIntrest();
	simpleIntrestObj.calculateSimpleIntrest();
	CompoundIntrest  CompoundIntrestObj=new 	CompoundIntrest();
	CompoundIntrestObj.calculateCompoundIntrest();
}
}


