package com.Test_4;

public class Test_2
{
static int mcCartyCounter =100;
public static int mcCarthy(int n)
{
mcCartyCounter++;
if (n > 100)
return n - 10;
else
return mcCarthy(n+11);
}

//public class Test_2

public static void main(String[] args)
	{

		//Console.WriteLine(mcCarthy(100) + "  " + mcCartyCounter);
	}

}
