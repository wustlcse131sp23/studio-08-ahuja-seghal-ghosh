package studio8;

import java.util.Objects;

public class Time {
	
	private int hour; 
	private int minute; 
	private boolean format;
	
	public Time (int h, int m, boolean f) { 
		hour = h;  //input in 24 hours 
		minute = m; 
		format = f; // true = 24 hour format 
	}

	public String toString () {
		if (format == true) { 
		return hour + ":" + minute;
	}
		else {
			return (hour - 12) + ":" + minute; 
	}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

	public static void main(String[] args) {
    	
    }

}