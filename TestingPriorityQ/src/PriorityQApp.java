import java.lang.*;
import java.util.Scanner;


public class PriorityQApp 
{
public static void main(String args[])
{
	int a[]={2,4,1,5,6,7,3,9,8};
	int n=9;
	int largest_ele,larg_ele_index;
	larg_ele_index=0;
	for(int i=1;i<n;i++)
	{
		if(a[larg_ele_index]<a[i])
			larg_ele_index=i;
	}
	largest_ele=a[larg_ele_index];
	for(int j=larg_ele_index+1;j<n;j++)
		a[j-1]=a[j];
		n--;
		
		System.out.println("Deleted element is:"+largest_ele);
}
}