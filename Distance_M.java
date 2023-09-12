import java.util.Scanner;
class Distance_M {
	public static void main(String[] args){
	double distance,hour,minute,second;
	Scanner s= new Scanner(System.in);
System.out.println(" Enter your distance in m/second");	
distance = s.nextDouble();
System.out.println(" Enter hour to meter per second");	
hour = s.nextDouble();

System.out.println("Enter minutes to km per second");
minute =s.nextDouble();

System.out.println("Enter second to miles per hour");
second= s.nextDouble();
double time=(hour*3600)+(minute*60)+(second);
double speed= distance/time;
double speed1 =(distance/1000)/(time/3600);
double speed2 = (distance/1609)/(time/3600);

System.out.println(" speed in m/second:"+ speed);
System.out.println(" speed in km/h:"+ speed1+ "km/h");
System.out.println(" speed in mile/second:"+speed2 + "miles/h");
	}
}
