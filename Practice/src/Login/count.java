package Login;

public class count {
	public void count(String  name){
System.out.println("Hello" + name + "This is the first object creation and calling method from another class");
}
	public void printAgain(){
		System.out.println("This is the third method called from the same class ");
	}
public void first(){
int i = 4;
int k = 4;
double tot;
tot = i * k;
System.out.println("This is the second method from the same class");
System.out.println("This is the sum output of two number " + tot);
	
}

}