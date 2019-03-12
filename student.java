package stu;

public class student implements Comparable
	{
		private String name;
		private double cgpa;
		private int token;
		
		public student(String name,double cgpa,int token)
		{
			this.name=name;
			this.cgpa=cgpa;
			this.token=token;
		}

		@Override
		public int compareTo(Object obj) {
			student s=(student)obj;
			int a;
			double b=(s.cgpa-this.cgpa);
			if(b>0)
			{
			 a=1;
			}
			else if(b<0)
			{
			 a=-1;
			}
			else{
				a=0;
			}
			if(a==0)
			{
			a=give(s.name,this.name);
			
			if(a==0)
			{
				a=this.token-s.token;
			}
			}
			//System.out.println(a);
			return (int)a;
		}
		
private int give(String s, String s1) {
		char[] a=s.toCharArray();
		char[] b=s1.toCharArray();
		int i=0,result = 0;
		if(a.length==b.length)
		{
		if(a[i]==b[i]&&i<=a.length)
		{
			i++;
		}
		else if(a[i]>b[i])
		{
			result=1;
		}
		else if(a[i]<b[i])
		{
			result=-1;
		}
		else {
			result=0;
		}
		}
		else if(a.length<b.length)
		{
			if(a[i]==b[i]&&i<=a.length)
			{
				i++;
			}
			else if(a[i]>b[i])
			{
				result=-1;
			}
			else
				result=1;
		}
		else
		{
			if(a[i]==b[i]&&i<=b.length)
			{
				i++;
			}
			else if(a[i]>b[i])
			{
				result=-1;
			}
			else
				result=1;
		}
			return result;
	}
	
	public String toString()
	{
		return name;
	}
}