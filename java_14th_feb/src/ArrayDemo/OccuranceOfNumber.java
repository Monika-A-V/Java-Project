package ArrayDemo;

public class OccuranceOfNumber {

	public static void main(String[] args)
	{

		int a[]= {2,4,6,8,2,5,7,6,8,6};
		int max=0;

		for(int i=0;i<a.length-1;i++)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=0;
				}
			}
		if(a[i]!=0)
		{
		System.out.println("occurance of : " +a[i]+ "="+count);
		if(max<count)
		{
			max=count;
		}
		}
		}System.out.println("max count is : " +max);
		}
		}