package pizzaBillGenerator;
import java.util.*;
public class Main {
	public static void main(String args[])
	{
		pizza basePizza=new pizza(true);
		basePizza.addExtracheese();
		basePizza.addExtratoppings();
		basePizza.takeAway();
		basePizza.paybill();
//		System.out.println("--------------------------------------------------");
//		DeluxPizza bp=new DeluxPizza(true);
//		bp.addExtracheese();
//		bp.addExtratoppings();
//		bp.takeAway();
//		bp.paybill();
	}
}
