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
    
    