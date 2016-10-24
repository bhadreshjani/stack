package mypack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

interface stack {
	BufferedReader bfin = new BufferedReader (new InputStreamReader(System.in));
	void push() throws NumberFormatException, IOException, NullPointerException; 
	int pop();

}

class fixedstack implements stack
{
	
	int[] fstk;
	int size;
	int tos=0;
	fixedstack(int s)
	{
		size=s;
		fstk = new int[s];
	}
	public void push() throws NumberFormatException, IOException, NullPointerException
	{
		for(;;tos++)
		{
			if (tos>=size)
			{
			tos=0;
			System.out.println("The stack is FULL....");
			break;
			}
			else
			fstk[tos]=Integer.parseInt(bfin.readLine());
		}
	}
	public int pop()
	{
		for(;tos<size;tos++)
		{
			System.out.println(fstk[tos]);
		}
		tos=0;
		return 0;
		
	}
	
}
class variablestack implements stack
{

    int vstk[]=new int[100];
	int size,item;
	int tos=0;
	variablestack(int s)
	{
		size=s;
	}
	variablestack()
	{
		
	}
	public void push() throws NumberFormatException, IOException, NullPointerException
	{
		for(;;tos++)
		{
			
//			if (tos>=size)
//			{
//			tos=0;
//			System.out.println("The stack is FULL....");
//			break;
//			}
//			else
			item=Integer.parseInt(bfin.readLine());
		if  (item!=-1)
		{
			vstk[tos]=item;	
		}
		else
		{
			break;
		}
		
		}
	size=tos;	
	}
	public int pop()
	{
	
		for(;tos<size;tos++)
		{
			System.out.println(vstk[tos]);
		}
		tos=0;
	
		return 0;
		
	}
}
public class Stacktry {
	public static void main(String ar[]) throws NumberFormatException, IOException
	{
		int size=10;
	fixedstack fs = new fixedstack(size);
	fs.push();
	fs.pop();
	variablestack vs = new variablestack();
	vs.push();
	vs.pop();
			
	}
}
