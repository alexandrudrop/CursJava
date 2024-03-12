package curs4;


/*
 * operator unar Ex: numar++   numar--
 * operator binar: numar1 + numar2
 * operator ternar
 */
public class IncrementDecrement {

	public static void main(String[] args) {
		
		//num + 1 --> num++
		//num++ --> POST increment
		//++num --> PRE increment
		
		System.out.println("-------POST increment-------------");
		int num = 10;
		System.out.println("Num inainte de increment:" + num);
		System.out.println("Num in POST increment:" + num++);
		System.out.println("Num dupa POST de increment:" + num);
		
		
		
		System.out.println("-------PRE increment-------------");
		int num2 = 10;
		System.out.println("Num2 inainte de increment:" + num2);
		System.out.println("Num2 in PRE increment:" + ++num2);
		System.out.println("Num2 dupa PRE de increment:" + num2);
		
		// pre increment --> ++num
		// post increment --> num++
		
		//pre decrement --> --num
		//post decrement --> num--
		
		int num3 = 0;
		System.out.println(--num3);

	}

}
