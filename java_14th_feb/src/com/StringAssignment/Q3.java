package com.StringAssignment;

/*3. Write a program to find the number of vowels, consonants, digits and white 
space characters in a string*/

public class Q3 {

	public static void main(String[] args)
	{
                String s="This String Concept 1s Aw3som3";
				int vowels=0,consonents=0,digits=0,spaces=0;
				s.toLowerCase();
				char ch[]=s.toCharArray();
				
				for(int i=0;i<s.length();i++)
				{
					if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i'  || ch[i]=='o'  || ch[i]=='u')
					{
						vowels++;
					}
					else if(ch[i]>='a' && ch[i]<='z')
					{
						consonents++;
					}
					else if(ch[i]>='0' && ch[i]<='9')
					{
						digits++;
					}
					else if(ch[i]==' ')
					{
						spaces++;
					}
				}
					System.out.println("vowels :"+vowels);
					System.out.println("consonents :"+consonents);
					System.out.println("digits :"+digits);
					System.out.println(("spaces :"+spaces));
				}}

