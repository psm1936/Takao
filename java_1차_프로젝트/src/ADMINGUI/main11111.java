package ADMINGUI;

import java.text.SimpleDateFormat;

public class main11111 {

	public static void main(String[] args) {

		
		
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format_time1 = format1.format (System.currentTimeMillis());
		System.out.println(format_time1);
		
}
}