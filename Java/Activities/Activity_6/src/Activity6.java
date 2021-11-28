import java.lang.Thread.*;
public class Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//plane with max 10 passengers
        Plane plane = new Plane(10);
        //Add passengers
        plane.onboard("John");
        plane.onboard("Steve");
        plane.onboard("Anna");
        //take off
        System.out.println("Plane took off at: " + plane.takeOff());
        //Print list of people on board
        System.out.println("People on the plane: " + plane.getPassengers());
        //Fly
        try {
            Thread.sleep(5000);
         } catch (Exception e) {
            System.out.println(e);
         }
        //land
        plane.land();
        //Plane lands
        System.out.println("Plane landed at: " + plane.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + plane.getPassengers());
	}

}
