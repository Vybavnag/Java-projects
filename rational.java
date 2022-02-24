import java.util.*; 
public class rational {
	private double n;
	private double d;

	//creating a rational number
	public rational(double num, double den){
		if (den==0){
			throw new RuntimeException("Denominator is zero");
		}
		double k = gcd(num,den);
		n= num/k;
		d= den/k;
	}
	
	//gcd of number 
	private static double gcd(double a, double b){
		if (a<0){
			a=-a;
		}
		if (b<0){
			b=-b;
		}
		if(b==0){
			return a;
		}
		else{
			return gcd(a,a%b);
		}
	}
	
	// lcm of rational number    
	private static double lcm (double a, double b){
		if (a<0){
			a=-a;
		}
		if (b<0){
			b=-b;
		}
		return (b/ gcd(a,b));
	}

	//converting a rational number to string 
	 public String tostring(){
	 	 if (d==1){
		 	 return n +" ";
		 }
		 else {
		 	 return n + "/"+ d;
		 }
	 }

	 //adding two rational numbers
	 public static rational add(rational a, rational b){
	 	 double num=(a.n * b.d)+(a.d * b.n);
		 double den = a.d* b.d;
		 return new rational(num, den);
	 }

	 public rational add(rational b){
	 	 return add (this,b);
	 }

	 //subtracting two rational numbers
	  public static rational sub(rational a, rational b){
	 	 double num=(a.n * b.d)-(a.d * b.n);
		 double den = a.d* b.d;
		 return new rational(num, den);
	 }

	 public rational sub(rational b){
	 	 return sub (this,b);
	 }

	 //multiplying two rational numbers
	 public static rational mult(rational a, rational b){
	 	 return new rational(a.n*b.n, a.d*b.d);
	 }

	 public rational mult (rational b){
	 	 return mult(this,b);
	 }
	  
	//gets the reciprocal of the rational number
	  public rational reciprocal(){
	  	  return new rational(d,n);
	  }
	
	//divides two rational numbers
	public static rational divide(rational a, rational b){
		return a.mult(b.reciprocal());
	}

	public rational divide(rational b){
		return divide(this,b);
	}


	//turns a decimal number into a rational number 
	public rational round (double a){
     
	double valueint = Math.floor(a); 
    double fractval = a - valueint; 
    double b = 10000; 
   
 
    double gcdofa = gcd(Math.round(fractval * b), b); 
    
    double num = Math.round(fractval * b) / gcdofa; 
    double den = b / gcdofa; 
	return new rational (num, den);
	}

	
	}