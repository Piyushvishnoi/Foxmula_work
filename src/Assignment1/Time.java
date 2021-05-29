package Assignment1;

class Time
{
	private int hour, min, sec;
	
	Time(int h,int m,int s)
	{
		hour=h;
		min=m;
		sec=s;
	}
	
	Time()
	{
		hour=0;
		min=0;
		sec=0;
	}
	
	public Time add(Time tx)
	{
		Time t=new Time();
		t.sec= this.sec + tx.sec;
		if(t.sec>60)
		{
			t.sec-=60;
			this.min++;
		}
		t.min = this.min + tx.min;
		if(t.min>60)
		{
			t.min-=60;
			this.hour++;
		}
		t.hour += this.hour + tx.hour;
		if(t.hour>24)
			t.hour-=24;
		return t;
	}
	void display(String str)
	{
		System.out.println(str + hour +":" + min +":"+sec);
	}
		
	public static void main(String []args)
	{
		Time t1=new Time(8,40,12);
		t1.display("Time 1: ");
		Time t2=new Time(9,30,50);
		Time t3=t1.add(t2);
		t2.display("Time 2: ");
		t3.display("\nAdded time : Time 1 + Time 2  \n = ");
	}
}