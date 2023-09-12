import java .util.SimleDateFarmat;
import java.util.Date;
import java. util.TimeZone;
class Date{

public static void main(String []args){
	SimleDateFarmat dateFarmat=new SimpleDateFarmat("dd/MM/yyyy hh:mm:ss a");
dateFormat.setTimeZone(TimeZone.getTimeZ one("GMT"));
String gmtTime=dateFarmat.farmat(new Date());
System.out.println("current Time in GMT: " +gmtTime);


}



}


