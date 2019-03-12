package event;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

import stu.student;

public class Event {
	public static void main(String[] args) 
	{
			PriorityQueue r=new PriorityQueue();
			Scanner s=new Scanner(System.in);
			ArrayList<String> str=new ArrayList<>();
			System.out.println("enter the number of event");
			int n=s.nextInt();
			System.out.println("enter the events");
			System.out.println();
			for(int i=0;i<=n;i++)
			str.add(s.nextLine());
			for(String q:str)
			{
				String[] str1=q.split(" ");
				if(str1[0].equals("ENTER"))
				{
					//System.out.println(str1[1]);
					double cgpa=Double.parseDouble(str1[2]);
					int token=Integer.parseInt(str1[3]);
					r.add(new student(str1[1],cgpa,token));
				}
				else if(str1[0].equals("SERVED"))
				{
					
					System.out.println("served "+r.poll());
				}
			}
			if(r.isEmpty()==false){
			while(r.isEmpty()==false)
			{
				System.out.println(r.poll());
			}
			}
			else{
				System.out.println("EMPTY");
			}
			
			
	}
}

