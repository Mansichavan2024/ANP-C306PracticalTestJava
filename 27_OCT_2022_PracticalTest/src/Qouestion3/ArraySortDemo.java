package Qouestion3;


public class ArraySortDemo {

	public static void main(String[] args) {
		
int temp;
int a[]= {56,8,34,987,-87,-65,56};
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)	
{
	if(a[i]<a[j])
	{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
}
	
System.out.println("Array elements in decending order:");
for(int i=0;i<=a.length-1;i++)
{
	System.out.println(a[i]);
}
	}
}

		
	
	

	


