package pizzaBillGenerator;

public class DeluxPizza extends pizza{

	public DeluxPizza(Boolean veg) {
		super(veg);
		System.out.println(" : DELUX  PIZZA :");
		super.addExtracheese();
		super.addExtratoppings();
		super.takeAway();
		// TODO Auto-generated constructor stub
	}
}
