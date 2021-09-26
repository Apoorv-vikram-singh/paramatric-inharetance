class pen
{
	pen()
	{
		System.out.println("pen.. non para constructor ..base");
	}
	pen(int a)
	{
		System.out.println("pen..para cons..base");
	}
}
class pencil extends pen
{
	pencil()
	{
		System.out.println("pencil.. non para cons..derived");
	}
	pencil(int b)
	{
		
		System.out.println("pencil.. para cons..derived");
	}
	public static void main(String args[])
	{
		pencil obj1=new pencil(9);
	}
}