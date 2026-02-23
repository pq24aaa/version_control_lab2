 /* @author paris */

public class Complex {
    private double real;
    private double imaginary;
    
    public Complex (double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    
    public Complex (double real){
        this.real = real;
        this.imaginary = 0;
    }
    
    public double getRealPart(){
        return real;
    }
    
    public double getimaginaryPart(){
        return imaginary;
    }
    
    public Complex add (Complex other){
        return new Complex (this.real + other.real, this.imaginary + other.imaginary);
    }
    
    public Complex subtract (Complex other){
        return new Complex (this.real - other.real, this.imaginary - other.imaginary);
    }
    
    public Complex multiply(Complex other) {
        double r = (this.real * other.real) - (this.imaginary * other.imaginary);
        double i = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new Complex(r, i);
    }
     
    public Complex divide (Complex other){
        return new Complex (this.real  other.real, this.imaginary  other.imaginary);
    }
    
    public double abs(){
        
    }
    
    toString */

 }