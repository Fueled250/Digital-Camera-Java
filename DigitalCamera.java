/*S.McDonald 11/5/2016
DigitalCamera.java
This program creates a class for Shutterbug's Camera Store. This program creates data fields of the brand
of camera, megapixels of the camera and the price of the camera (with certain conditions).
This program also creates a method to display the values as output.
*/


public class DigitalCamera
{
   //holds three data fields
   String brand;
   int megapixels; //number of megapixels in the resolution
   double price;
   
   //create a constructor with the required parameters
   public DigitalCamera(String br, int mega)
   {
      brand = br;
      
      //set a max value of 10 for the megapixels
      if (mega > 10) //if mega is > 10, set it to 10
         megapixels = 10;
      else
         megapixels = mega; //if mega is < 10, set megapixels to number entered
      //set a sale price for how many megapixels the camera has
      if (mega <= 6) //if mega is <= 6, then the camera is $99
         price = 99;
      else
         price = 129; //if mega is any other number aside from <= 6, then the camera is $129
   
   }//constructor
   
   public void show()
   {
      System.out.println("Brand: " + brand);
      System.out.println("Megapixels: " + megapixels);
      System.out.println("Price: $" + price);
   
   }//show method

}//class