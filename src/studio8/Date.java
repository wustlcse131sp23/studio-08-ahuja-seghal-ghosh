package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	
	private int month; 
	private int day; 
	private int year; 
	
	public Date (int m, int d, int y) { 
		month = m; 
		day = d; 
		year = y; 
	}
	
	public String toString () {
		return month + "/" + day + "/" + year;
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	 public static void main(String[] args) {
		 Date d1 = new Date (6, 7, 2022); 
		 Date d2 = new Date (7, 8, 2022); 
		 Date d3 = new Date (6, 7, 2022); 
		 Date d4 = new Date (3, 19, 2022); 
		 Date d5 = new Date (1, 12, 2022); 
		 
		 LinkedList<Date> list = new LinkedList<Date> (); 
		 list.add(d1); 
		 list.add(d2); 
		 list.add(d3);
		 list.add(d4);
		 list.add(d5); 
		 System.out.println(list); 
		 
		// System.out.println(d1.equals(d2));
		// System.out.println(d2.equals(d2));
		// System.out.println(d1.equals(d3));
		 
		HashSet<Date> set = new HashSet<Date> (); 
		set.add(d1); 
		set.add(d2); 
		set.add(d3); 
		set.add(d4); 
		set.add(d5); 
		System.out.println(set); 
 		
	    }
	
}
