public class Fraction {

	// instance varialbe (attribute or fields)
	private int numerator, denominator; 
	// constructors 
	public Fraction () {// default constructor
		numerator = 1;
		denominator = 1;
	} 
	
	public Fraction (int n, int d ) { // parameterized constructor
		numerator = n;
		setDenom(d);
	}
	
	public Fraction (String s){
		for (int i = 0; i < s.length(); i++){
			if (s.substring(i,i+1).equals("/")){
				numerator = Integer.parseInt( s.substring(0,i) );
				setDenom(Integer.parseInt(s.substring(i+1)));
			}
		}
	}
	
	public Fraction (Fraction f){
		numerator = f.numerator;
		denominator = f.denominator;
	}
	// behavior methods (accessor, mutator, helper)
	public int getNum(){ // accessor method
		return numerator;
}

	public int getDenom(){ // accessor method
		return denominator;
	}
	
	public String toString(){
		return numerator + "/" + denominator;
	}
	//Mutator Methods
	public void setNum ( int n ){
		numerator = n;
	}
	public void setDenom(int d){
			if (d != 0) {
			denominator = d;
		}else{
			denominator = 1;
			System.out.println("Error: denominator cannot be zero");
		}
}
}
