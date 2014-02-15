package Operation_maths;

public class Division {

	public int exec(int a, int b)
	{
		if(b == 0) throw new IllegalArgumentException();
		return a / b;
	}
}
