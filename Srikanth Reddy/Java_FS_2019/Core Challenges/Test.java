class Test
 {
	Test()
	{
		System.out.println("hello");
	}
	Test(int i)
	{
		this();
		System.out.println("world");
	}
	Test(int i,int j)
		{
			this(4);
			System.out.println("bye");
		}
	public static void main(String[] args) {
		
		Test o=new Test(1,8);
	}
}