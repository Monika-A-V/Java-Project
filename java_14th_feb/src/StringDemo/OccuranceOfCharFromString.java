package StringDemo;

public class OccuranceOfCharFromString {

	public static void main(String[] args) {

		String s="mmo@nikka avvh$aadd";
		char ch[]=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			int count=1;
			for(int j=i+1;j<ch.length-1;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]='\n';
				}
			}
			if(ch[i]!='\n')
			{
				System.out.println("occurance of char : " +ch[i]+" "+count);
			}}}
}