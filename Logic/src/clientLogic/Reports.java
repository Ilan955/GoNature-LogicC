package clientLogic;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Reports {

	int numOfVisitors;
	String type;
	LocalTime entrance;
	LocalTime exit;
	long Stay;
	LocalDate date;

	public Reports(String num, String type, String entrance, String exit, String date) {
		this.numOfVisitors = Integer.valueOf(num);
		this.type = type;
		this.entrance = LocalTime.parse(entrance);
		this.exit = LocalTime.parse(exit);
		this.Stay = Duration.between(this.entrance, this.exit).toMinutes();
		this.date = LocalDate.parse(date);
	}

	public Float getEntranceTime() {
		int hours, minutes;
		float res;
		String[] hourMin = entrance.toString().split(":");
		hours = Integer.parseInt(hourMin[0]);
		minutes = Integer.parseInt(hourMin[1]);
		res = (minutes > 0 ? (float) (hours + minutes / 100.0) : (float) hours);
		return res;

	}

	public int getNumOfVisit() {
		return numOfVisitors;
	}

	public long getStay() {
		return Stay;
	}

	public LocalDate getDate() {
		return this.date;
	}
}
