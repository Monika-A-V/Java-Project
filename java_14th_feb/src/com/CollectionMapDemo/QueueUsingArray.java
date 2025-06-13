package com.CollectionMapDemo;

public class QueueUsingArray
{
	int a[];
	int rear;
	int front;
	
	public QueueUsingArray()
	{
		a=new int[5];
		rear=0;
		front=0;
	}
	public void insert(int x)
	{
		if(rear>=a.length)
		{
			System.out.println("Queue is full");
		}
		else
		{
			a[rear]=x;
			rear++;
		}
	}
	public void display()
	{
		for(int temp=front;temp<rear;temp++)
		{
			System.out.println(a[temp]);
		}
	}
    public void delete()
    {
    	if(rear==front)
    	{
    		System.out.println("Queue is empty");
    	}
    	else
    	{
    		for(int temp=front;temp<rear;temp++)
    		{
    			a[temp]=a[temp+1];
    		}
    		rear--;
    		a[rear]=0;
    	}
    }
	public static void main(String[] args)
	{
		QueueUsingArray q=new QueueUsingArray();
		q.insert(56);
		q.insert(23);
		
		q.display();
		System.out.println(",,,,,,,,,,,,,,,,,,");
		q.delete();
		q.display();
		q.delete();
		q.delete();

	}

}
