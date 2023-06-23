
public class recursive_methods {

	// This method returns the sum of 1 to num
	public int sum (int num)
	{
	int result;
	if (num == 1)
	result = 1;
	else
	result = num + sum (num-1);
	return result;
	}
	
	
}
