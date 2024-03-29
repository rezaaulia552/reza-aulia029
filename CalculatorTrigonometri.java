import java.lang.Math;
/**
 * Abstract class CalculatorTrigonometri 
 *
 * @author reza aulia
 * @version 0.5
 */
public abstract class CalculatorTrigonometri extends Calculator
{
    protected double sudut;
   public abstract void konversi(double sudut);
   
   public double sin()
   {
       return Math.sin(this.sudut); 
   }
   
   public double cos()
   {
       return Math.cos(this.sudut);
    }
   // tan
   public double tan()
   {
       return Math.tan(this.sudut);
    }

   
}