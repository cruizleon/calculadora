/*
 * 
 * @author Cristhian Javier Ruiz León
 */
package calculadora;

public class Operaciones {
	public void operaciones(){}
	/**
	 * Number1 + Number2
	 * @param Number1
	 * @param Number2
	 * @return
	 */
	public int addition(int number1, int number2) 
	{
		
		return number1+number2;
				
	}
	/**
	 * Number1 - Number2
	 * @param Number1
	 * @param Number2
	 * @return
	 */
	public int subtraction(int number1, int number2) 
	{
		
		return number1-number2;
	}
	/**
	 * Number1 * Number2
	 * @param Number1
	 * @param Number2
	 * @return
	 */
	public int multiplication(int number1, int number2) 
	{
		
		return number1*number2;
	}
	/**
	 * Number1 / Number2
	 * @param Number1
	 * @param Number2
	 * @return
	 */
	public double division(int number1, int number2) 
	{ 
		if(number2!=0){
			
		int res =number1/number2;
                return res;
       }else{
                  return Double.NaN;     
                }              
	}
	/**
	 * Number1 % Number2
	 * @param Number1
	 * @param Number2
	 * @return
	 */
	public double residue(int number1, int number2) 
	{
		return number1%number2;
	}
		
	public int factorial(int number) 
	{
		if(number<1)
			return 1;
		else
			return number*factorial(number-1);
	}
	/**
	 * 
	 * @param Base
	 * @param Exponent
	 * @return
	 */
	public int exponentiation(int base, int exponent) 
	{
		if(exponent==1)
			return base;
		else
			if(exponent==0)
				return 1;
			else
				if(exponent>1)
					return multiplication(base, exponentiation(base,exponent-1));
				else
					return (1/exponentiation(base, multiplication(exponent,(-1))));
	}
	/**
	 * 
	 * @param x
	 * @return
	 */
	public double sin(int number1)
	{
	return Math.sin(number1);
	   }
	public double cos(int number1)
	{
	return Math.cos(number1);
	}		public double integration (int initial_point,int final_point, int step_increment) 
		{
			double response = 0.0;
			double  temp;
			int x_i, x_i_1, y_i;
			
			x_i_1 = initial_point;
			x_i = step_increment + x_i_1;
			
			for(int i = x_i; i <= final_point; i+= step_increment)
			{
				y_i = (int) (Math.pow(x_i, 2));
				temp = (y_i)*(x_i-x_i_1);
				response += temp;
				
				x_i_1=x_i;
				x_i = step_increment + x_i_1;
			}
			
			return response;
		}	        	   

}
