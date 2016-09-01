package guvi;

import java.util.Set;
import java.util.TreeSet;

public class RepeatedArrayValues
{
public static void main(String[] args)  
{
	int []arr=new int[]{00,01,00,03};
	
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
					{
				
				System.out.println(arr[i]);
					}
		}
			
	}
}
}
