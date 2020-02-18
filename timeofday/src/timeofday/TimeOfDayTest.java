package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {
	
	class TimeOfDay {
		/**houd uren en minuten bij */
		int hours;
		int minutes;
	}
	
	int getHours(TimeOfDay t) {
		return t.hours;
	}
	
	int getMinutes(TimeOfDay t) {
		return t.minutes;
	}
	
	void setHours(TimeOfDay t, int value) {
		t.hours = value;
	}
	
	void setMinutes(TimeOfDay t, int value) {
		t.minutes = value;
	}

	@Test
	void test() {
		TimeOfDay t = new TimeOfDay();
		assert t.hours == 0 && t.minutes == 0;
		t.hours += 12;
		assert t.hours == 12 && t.minutes == 0;
		
	}

}
