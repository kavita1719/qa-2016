package Login;

public class OneOne {
	private int calc;
public void setBMI(int h, int w){
	int height = h;
	int weight = w;
	calc = ((weight*703)/(height* height));
		}	
public int getcalc(){
	return calc;
	}
public void saying(){
	System.out.println("Your BMI is  :" + getcalc());
}
}
