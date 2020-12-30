package clientLogic;

import java.time.Duration;
import java.time.LocalTime;

public class Reports {
	int numOfVisitors;
	String type;
	LocalTime entrance;
	LocalTime exit;
	long Stay;

	public Reports(String num, String type, String entrance, String exit) {
		this.numOfVisitors = Integer.valueOf(num);
		this.type = type;
		this.entrance = LocalTime.parse(entrance);
		this.exit = LocalTime.parse(exit);
		this.Stay = Duration.between(this.entrance, this.exit).toMinutes();
	}
}
