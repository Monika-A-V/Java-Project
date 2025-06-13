package com.ArrayDemo;

public class AddArrayElement {
		
		static void insert(int arr[],int insert_index,int value,int size)
		{
			
			for(int i=size-1;i>=insert_index;i--)
			{
				     arr[i+1]=arr[i];
			}
			arr[insert_index]=value;
			size++;
			for(int i=0;i<size;i++)
			{
				System.out.println(arr[i]);
			}
	}

	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5,0};
		insert(arr,2,100,5);
		
			}
}

