class Complex {
	
	//Cartesian coordinates
	double x;
	double y;
	
	//Polar coordinates
	double r;  
	double arg; 
	
	/* 
	 * z = x + yi
	 * z = r(cos(arg) + i*sin(arg))
	 * 
	 * x = r * cos(arg)
	 * y = r * sin(arg)
	 * 
	 * r = sqrt(x*x + y*y)
	 * z = arctg(y/x)
	 */
	
	//ConvertDatasMethods
	private void ConvertCortesianToPolar() {
		r = Math.sqrt(x*x + y*y);
		arg = Math.atan(y/x);
	}
	private void ConvertPolarToCortesian() {
		x = r * Math.cos(arg);
		y = r * Math.sin(arg);
	}

	//Access methods
	public double getX() { return x; }
	public void setX(double x) { 
		this.x = x; 
		ConvertCortesianToPolar();
	}
	public double getY() { return y; }
	public void setY(double y) { 
		this.y = y; 
		ConvertCortesianToPolar();
	}
	
	public double getR() { return r; }
	public void setR(double r) { 
		this.r = r; 
		ConvertPolarToCortesian();
	}
	public double getArg() { return arg; }
	public void setArg(double arg) { 
		this.arg = arg; 
		ConvertPolarToCortesian();
	}
	
	//Constructor and constructor-methods
	public Complex() {
		setX(0);
		setY(0);
	}
	public void initComplexWithCartesian(double x, double y) {
		setX(x);
		setY(y);
	}
	public void initComplexWithPolar(double r, double arg) {
		setR(r);
		setArg(arg);
	}
	
	//Mathematics methods
	public void productOnNumber(double a) {
		x *= a;
		y *= a;
		ConvertCortesianToPolar();
	}
	public void divisonOnNumber(double a) {
		x /= a;
		y /= a;
		ConvertCortesianToPolar();
	}
	public static Complex sumComplex(Complex z1, Complex z2) {	
		z1.x = (z1.x + z2.x);
		z1.y = (z1.x + z2.y);
		z1.ConvertCortesianToPolar();

		return z1;
	}
	public static Complex differnceComplex(Complex z1, Complex z2) {
		z1.x = (z1.x - z2.x);
		z1.y = (z1.y - z2.y);
		z1.ConvertCortesianToPolar();
		
		return z1;
	}
	public static Complex productionComplex(Complex z1, Complex z2) {
		//(x1+iy1)(x2+iy2) = x1x2 - y1y2 + i(x1y2+x2y1)	
		Complex zres = new Complex();
		zres.initComplexWithCartesian(z1.x, z1.y);
		
		zres.x = (z1.x * z2.x - z1.y * z2.y);
		zres.y = (z1.x * z2.y + z1.y * z2.x);
		zres.ConvertCortesianToPolar();
		
		return zres;
	}
	public static Complex divisionComplex(Complex z1, Complex z2) {
		Complex zres = new Complex();
		zres.initComplexWithCartesian(z1.x, z1.y);
		Complex zh = new Complex();
		zh.initComplexWithCartesian(z2.x, -z2.y);
		
		zres = productionComplex(zres, zh);
		zres.divisonOnNumber(z2.x*z2.x + z2.y*z2.y);
		
		return zres;
	}
	public void Power(int n) {
		r = (Math.pow(r, n));
		arg *= n;
		ConvertPolarToCortesian();
	}
	public void SqrtN(int n) {
		ConvertCortesianToPolar();
		r = Math.pow(r, (double)1/n);
		//Math.pow()
		arg /= n;
		ConvertPolarToCortesian();
	}
}
