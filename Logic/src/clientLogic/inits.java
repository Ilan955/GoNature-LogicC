package clientLogic;

import java.time.LocalDate;
import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class inits {
	public static ObservableList<String> setWantedParkCB() {
		ArrayList<String> parks = new ArrayList<String>();
		parks.add("Park A");
		parks.add("Park B");
		parks.add("Park C");
		ObservableList<String> listForParks = FXCollections.observableArrayList(parks);
		return listForParks;
	}

	public static ObservableList<String> setYearCB() {
		ArrayList<String> years = new ArrayList<String>();
		LocalDate lY = LocalDate.now();
		int base = 2018;
		for (int i = 2017; i < lY.getYear(); i++) {
			base++;
			years.add(Integer.toString(base));
		}
		ObservableList<String> listForYears = FXCollections.observableArrayList(years);
		return listForYears;
	}

	public static ObservableList<String> setMonthCB() {
		ArrayList<String> months = new ArrayList<String>();
		months.add("Jan");
		months.add("Fab");
		months.add("Mar");
		months.add("Apr");
		months.add("May");
		months.add("Jun");
		months.add("Jul");
		months.add("Aug");
		months.add("Sep");
		months.add("Oct");
		months.add("Nov");
		months.add("Dec");
		ObservableList<String> listForMonth = FXCollections.observableArrayList(months);
		return listForMonth;
	}
}