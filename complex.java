public class complex{

    // real value
    private double a;
    
    // imaginary value 
    private double b;

    private static double epsilon = .0001;

    public complex(double x, double y){
        a = x;
        b = y;
    }

    public complex(double val){
        this(val, val);
    }

    // no argument constructors 
    public complex(){
        this(0.0, 0.0);
    }
	
    public double getReal(){
	return a;
	}

    public double getImaginary(){
	 return b;
	}

    public void setReal(double val){
		a = val;
	}

    public void setImaginary(double val){
		b = val;
	}

 

    //magnitute 
    public double mag(){
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
	
	// theta returned in radians 
    public double arg(){
        double theta = Math.atan(b / a);

        if (a >= 0)
        {
            if (b >= 0)
                return theta;
            else
                return theta + 2 * Math.PI;
        }
        else
        {
            return theta + Math.PI;
        }
    }

	//static methords for both maagnitude and theta 
    public static double mag(complex z){
        return z.mag();
    }
	
    public static double arg(complex z){
        return z.arg();
    }

    // returns the conjugate of the complex number
     public complex conjugate(){
        return new complex(a, -b);
    }

   public static complex conjugate(complex z){
        return z.conjugate(); 
    }

	 // setting the value of Epsilon 
    public static double getEpsilon(){
        return epsilon;
    }
    public static void setEpsilon(double r){
        epsilon = r;
    }

	//subrtaccting two complex numbers
	    public static complex subtract(complex z, complex y){
       return new complex(y.a - z.a, y.b - z.b);
    }
	public complex subtract(complex z){
		 return subtract(this,z);
        
    }
	
	//adding two complex numbers
    public static complex add(complex y, complex z){
        return new complex(y.a + z.a, y.b + z.b);
    }
    public complex add(complex z){
		return add(this,z);
       
    }
	
	//multiply two complex numbers
     public static complex multiply(complex z, complex y){
       return new complex(y.a * z.a - y.b * z.b, y.b * z.a + y.a * z.b);
    }
	public complex multiply(complex z){
	 return multiply(this,z);
        
    }

	
	//dividing a complex number by a complex number 
	 public static complex divide(complex y, complex z){
        complex numerator = y.multiply(z.conjugate());
        complex denominator = z.multiply(z.conjugate());
        return numerator.divide(denominator);
    }
    public complex divide(complex z){
        return divide(this,z);
    }

	//multipy a complex number with a constant
   public static complex multiply(double r, complex z){
        return new complex(z.a * r, z.b * r);
    } 
   public complex multiply(double r){
        return multiply(r,this);
    }

	
  //divide a complex number with a constant
  public static complex divide(complex z,double x){
        return new complex(z.a / x, z.b / x);

    }
  public complex divide( double x){
       return divide(this,x);
    }

	public boolean equals(complex z){
        return equals(z, .000000001);
    }

  public boolean equals(complex z, double epsilon){
	  // ? is if or else 
      if ((Math.abs((a - z.a) / ((a == 0) ? 1 : a)) < epsilon) && (Math.abs((b - z.b) / ((b == 0) ? 1 : b)) < epsilon))
           return true;
      else
           return false;
    }
	  
// returns the complex number as a string
  public String toString(){
       return "(" + a + ", " + b + "i)"; 
    }
	
	
// finds the complex number to the power of a constant
  public static complex power(double n,complex z){ 
	   double r = z.mag();
       double theta = z.arg();

       r = Math.pow(r, n);
       theta *= n;

       return new complex(r * Math.cos(theta), r * Math.sin(theta));
    
    }

	 
	// finds the nth roots of a number
    public static complex[] kroot(complex z, int n){
        complex[] roots = new complex[n];
        double r = z.mag();
        double theta = z.arg();

        r = Math.pow(r, (double)1 / n);

        for (int i = 0; i < n; i++)
        {
            roots[i] = new complex(r * Math.cos((theta + 2 * Math.PI * i) / n), r * Math.sin((theta + 2 * Math.PI * i) / n));
        }
        return roots;
    }
    public complex[] kroot (int n){
     
		return kroot(this, n);
    }

        //trig functions
    public static complex complexcos(complex z){
		double b = -1 * Math.sin(z.a) * (Math.exp(z.b) - Math.exp(-1 * z.b)) / 2;
        double a = Math.cos(z.a) * (Math.exp(z.b) + Math.exp(-1 * z.b)) / 2;
        return new complex(a, b);
    }

    public static complex complexsin(complex z){
		double b = Math.cos(z.a) * (Math.exp(z.b) - Math.exp((-1)*z.b)) / 2;
        double a = Math.sin(z.a) * (Math.exp(z.b) + Math.exp((-1)*z.b)) / 2;
        return new complex(a, b);
    }

	
    //log of a complex number
    public static complex[] complexlog(complex z, int n){
        double r = z.mag();
        double theta = z.arg();
        complex[] answer = new complex[n];

        for (int i = 0; i < n; i++)
        {
            answer[i] = new complex(Math.log(r), theta + 2 * Math.PI * i);
        }

        return answer;
    }

	 // returns the roots of a quaratic in an array 
    public static complex[] quad (complex a, complex b, complex c){
		complex[] s = new complex[2];

		complex r = multiply(b,b);
		s[0] = b.multiply(-1).subtract(kroot(r.subtract(a.multiply(c).multiply(4)), 2)[0]).divide(a.multiply(2));        
		s[1] = b.multiply(-1).add(kroot(r.subtract(a.multiply(c).multiply(4)), 2)[0]).divide(a.multiply(2));
        return s;
	}
}