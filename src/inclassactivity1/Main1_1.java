/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InClassActivity1;

/**
 *
 * @author mhorner
 */
public class Main1 
{
     public  static void main (String [] args)
     {
         FuelGauge fuel = new FuelGuage();
         
         Odometer odometer  = new Odoemeter(0, fuel);
         
         for ( int i = 0; i < fuel.MAX_GALLONS; i++ )
             fuel.incrementGallons();
         
         while (fuel.getGallons() > 0)
         {
             odometer.incrementMileage();
             
             System.out.println("Mileage: " + odometer.getMileage());
             
             System.out.println("Fuel level: " + fuel.getGallons() + "gallons");
             
             System.out.println("------------------------------" );
         }
     }
}
