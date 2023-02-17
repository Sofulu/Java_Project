package Exercise;

/*
 This code explain traffic light. if current red light ,the code  return green e.t.c
 */
public class TrafficLight {
	public static void main(String[] args) {
		updateLight("red");
	}
	
	public static String updateLight(String current) {
		if(current=="green") 
			return "yellow";
		else if(current=="yellow")
			return "red";
		  
		    return "green";
		  }

}
