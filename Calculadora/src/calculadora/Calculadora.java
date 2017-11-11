

package calculadora;

/**
 * 
 * @author Cristhian Javier Ruiz León
 */
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	import java.text.DecimalFormat;

	public class Calculadora {
	    static BufferedReader br = new BufferedReader (new InputStreamReader ( System.in ) );
	    static BufferedWriter bw = new BufferedWriter (new OutputStreamWriter ( System.out ) );
	  
		
		public static void main(String[] args) throws IOException{
			int option;
			do
			{	 
				option=option();
				int[] parameters=getParameters(option);
				operation(option, parameters);
			}
			while (option !=11);
			
		}
		
		public static int option() throws IOException
		{
			bw.write("\n\nSeleccione alguna de las siguientes opciones: \n1. Suma \n2. Resta \n3. Multiplicacion \n4. Division \n5. Modulo \n6. Factorial \n7. Exponente \n8. Seno \n9. Coseno \n10. Integral \n11. Salir \n");
			bw.flush();
			int option = Integer.parseInt(br.readLine());
			return option;
		}
		
		public static int[] getParameters(int option) throws IOException
		{
			int[] parameters=null;
			
			switch (option)
			{
				case 1: //this is the operations of the sums
				{
					parameters = new int [2];
					bw.write("a continuacion se va a realizar una suma\n");
					bw.write("ingrese el primer numero:\n");
					bw.flush();
					parameters[0]=Integer.parseInt(br.readLine());
					bw.write("ingrese el segundo numero:\n");
					bw.flush();
					parameters[1]=Integer.parseInt(br.readLine());
				}break;
			
				case 2: //this is the operations of subtraction
				{
					parameters = new int [2];
					bw.write("a continuacion se va a realizar una resta\n");
					bw.write("ingrese el primer numero:\n");
					bw.flush();
					parameters[0]=Integer.parseInt(br.readLine());
					bw.write("ingrese el segundo numero:\n");
					bw.flush();
					parameters[1]=Integer.parseInt(br.readLine());
				
				}break;
			
				case 3: //this is the operations of multiplications.
				{
					parameters = new int [2];
					bw.write("a continuacion se va a realizar una multiplicacion\n");
					bw.write("ingrese el primer numero:\n");
					bw.flush();
					parameters[0]=Integer.parseInt(br.readLine());
					bw.write("ingrese el segundo numero:\n");
					bw.flush();
					parameters[1]=Integer.parseInt(br.readLine());
				}break;
			
				case 4: //this is the operations of the divisions.
				{
					parameters = new int [2];
					bw.write("a continuacion se va a realizar una division\n");
					bw.write("ingrese el primer numero:\n");
					bw.flush();
					parameters[0]=Integer.parseInt(br.readLine());
					bw.write("ingrese el segundo numero:\n");
					bw.flush();
					parameters[1]=Integer.parseInt(br.readLine());
				}break;
			
				case 5: //his is the operation of the module
				{
					parameters = new int [2];
					bw.write("a continuacion se va a realizar el modulo\n");
					bw.flush();					
					bw.write("ingrese el primer numero:\n");
					bw.flush();
					parameters[0]=Integer.parseInt(br.readLine());
					bw.write("ingrese el segundo numero:\n");
					bw.flush();
					parameters[1]=Integer.parseInt(br.readLine());
				}break;
			
				case 6: //this is the operation of the factorial
				{
					parameters = new int [1];
					bw.write("a continuacion se va a realizar el factorial\n");
					bw.flush();
					bw.write("ingrese el valor a calcular:\n");
					bw.flush();
					parameters[0]=Integer.parseInt(br.readLine());
				}break;
			
				case 7: //this is the exponential operation
				{
					parameters = new int [2];
					bw.write("a continuacion se va a realizar un exponencial\n");
					bw.write("ingrese el valor de la base:\n");
					bw.flush();
					parameters[0]=Integer.parseInt(br.readLine());
					bw.write("ingrese el valor del exponente:\n");
					bw.flush();
					parameters[1]=Integer.parseInt(br.readLine());
				}break;
			
				case 8: //this is the Seno operation
				{
					parameters = new int [1];
					bw.write("a continuacion se va a realizar el seno\n");
					bw.flush();
					bw.write("ingrese el valor a calcular:\n");
					bw.flush();
					parameters[0]=Integer.parseInt(br.readLine());
				}break;
			
				case 9: //this is the Coseno operation
				{
					parameters = new int [1];
					bw.write("a continuacion se va a realizar el coseno\n");
					bw.flush();
					bw.write("ingrese el valor a calcular:\n");
					bw.flush();
					parameters[0]=Integer.parseInt(br.readLine());
				}break;
			
				case 10: //Ithis is the operation for integral
				{
					parameters = new int [3];
					bw.write("a continuacion se va a realizar la integral de x^2\n");
					bw.flush();
					bw.write("ingrese el limite inferior:\n");
					bw.flush();
					parameters[0]=Integer.parseInt(br.readLine());
					bw.write("ingrese el limite superior:\n");
					bw.flush();
					parameters[1]=Integer.parseInt(br.readLine());
					bw.write("ingrese el incremento:\n");
					bw.flush();
					parameters[2]=Integer.parseInt(br.readLine());
				}break;
			
				default:
				{
					System.exit(0);
				}
			}
		   
			return parameters;
		}
		
		public static void operation(int option, int[]parameters) throws IOException
		{
			Operaciones operation =new Operaciones();
			
			switch (option)
			{
				case 1:
				{
					int result = operation.addition(parameters[0],parameters[1]);
					bw.write("El resultado de la suma es: "+result+"\n");
					bw.flush();
				}break;
			
				case 2:
				{
					int result = operation.subtraction(parameters[0],parameters[1]);
					bw.write("El resultado de la resta es: "+result+"\n");
					bw.flush();
				}break;
			
				case 3:
				{
					int result = operation.multiplication(parameters[0],parameters[1]);
					bw.write("El resultado de la multiplicacion es: "+result+"\n");
					bw.flush();
				}break;
			
				case 4:
				{
				
					double result =operation.division(parameters[0],parameters[1]);
					DecimalFormat df = new DecimalFormat("#0.000");
					if(result == Double.NaN)
					{
						bw.write("la division por 0 no es posible.\n"); //Mensaje de ERROR.
						bw.flush();
					
					}else
						{
							bw.write("El resultado de la division es: "+ df.format(result) +"\n");
							bw.flush(); //Resultado.
						}
				}break;
			
				case 5:
				{
				
					double result =operation.residue(parameters[0],parameters[1]);
					bw.write("El resultado del residuo es: "+result+"\n");
					bw.flush();
				}break;
			
				case 6:
				{
				
					double result =operation.factorial(parameters[0]);
					bw.write("El resultado de la suma es: "+result+"\n");
					bw.flush();
			
				}break;
				
				case 7:
				{
	        
					double result =operation.exponentiation(parameters[0],parameters[1]);
					bw.write("El resultado de la suma es: "+result+"\n");
					bw.flush();
			
				}break;
			
				case 8:
				{
				
					double result=operation.sin(parameters[0]);
					bw.write("El resultado del seno es: "+result+"\n");
					bw.flush();
			
				}break;
			
				case 9:
				{
	            
					double result=operation.cos(parameters[0]);
					bw.write("El resultado del coseno es: "+result+"\n");
					bw.flush();
			
				}break;

				case 10:
				{
	            
					double result=operation.integration(parameters[0],parameters[1],parameters[2]);
					bw.write("El resultado de la integral es: "+result+"\n");
					bw.flush();
			

				}break;
			
				default:
				{
			 
					System.exit(0);
			
				}
		}
		}
	}












