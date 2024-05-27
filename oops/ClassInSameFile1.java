package oops;

public class ClassInSameFile1 {
String name;
private int rno;
double percent;

public int getRno()//getter
{
	return rno;
	}
public void setRno(int rno)//setter
{
	//rno=rno;  //compiler confueses and set value 0 so we use this keyword 
	this.rno=rno;
	}
}
