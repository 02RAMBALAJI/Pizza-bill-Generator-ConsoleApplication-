package pizzaBillGenerator;
import java.util.*;
public class pizza {
	private int price;
	private int basePizzaPrice;
	private Boolean veg;
	private int ExtracheesePrice=100;
	private int ExtratoppingsPrice=150;
	private int takeAwayPrice=20;
	
	private boolean isOptedForExtraCheese=false;
	private boolean isOptedForExtraToppings=false;
	private boolean isOptedForTakeAway=false;
	public pizza(Boolean veg) {
		this.veg = veg;
		if(this.veg)
		{
			this.price=300;
		}else {
			this.price=400;
		}
	    basePizzaPrice=this.price; 
	}
	public void addExtracheese() {
		isOptedForExtraCheese=true;
		this.price+=ExtracheesePrice;
	}
	public void addExtratoppings() {
		this.price+=ExtratoppingsPrice;
		isOptedForExtraToppings=true;
	}
	public void takeAway(){
		isOptedForTakeAway=true;
		this.price+=takeAwayPrice;
	}
	public void paybill() {
		String bill="";
		System.out.println("pizza :"+basePizzaPrice);
		if(isOptedForExtraCheese){
		   bill += "Extra Cheese Added:"+ExtracheesePrice+"\n";
		}
		if(isOptedForExtraToppings){
			bill += "Extra Toppings Added:"+ExtratoppingsPrice+"\n";
			//System.out.println(;
		}
		if(isOptedForTakeAway) {
			bill += "Take Away : "+takeAwayPrice+"\n";
		}
		System.out.print(bill);
		bill="TOTAL PRICE : "+this.price+"\n";
		System.out.print(bill);
	}
}
