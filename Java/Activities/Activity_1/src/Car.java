
public class Car {
String name = "Maruthi";
String colour;
String transmission;
int make;
int tyres;
int doors;

Car()
{
	tyres = 4;
	doors = 4;
}
public void displayCharacteristics()
{
	System.out.println("Name of the car is"+" "+name);
	System.out.println("colour of the car is"+" "+colour);
	System.out.println("Transmision of the car is"+" "+transmission);
	System.out.println("make of the car is"+" "+make);
	System.out.println("tyres of the car is"+" "+tyres);
	System.out.println("doors of the car is"+" "+doors);
}
public void accelarate()
{
	System.out.println("Car is moving forward.");
	
}
public void brake() 
{
	System.out.println("Car has stopped.");
}
}
