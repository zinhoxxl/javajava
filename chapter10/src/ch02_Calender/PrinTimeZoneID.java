package ch02_Calender;

import java.util.TimeZone;

public class PrinTimeZoneID {
	public static void main(String[] args) {

		String[] availableIDs = TimeZone.getAvailableIDs(); // ������ timeZone id���
		for(String id : availableIDs)
			System.out.println(id);
	}
}
