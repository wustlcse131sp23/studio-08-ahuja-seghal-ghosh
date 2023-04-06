package studio8;

import java.util.Objects;

public class Appointment {
	private Date date ; 
	private Time time; 
	
	public Appointment (Date d, Time t) { 
		date = d; 
		time = t;
	}
	
	public String toString() {
		return date + ", " + time; 
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}
	public static void main(String[] args) { 
		Appointment a1 = new Appointment (new Date (1, 3, 2022) , new Time (1 ,15, true)); 
		System.out.println(a1); 
	}
	
}
