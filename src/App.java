import java.util.*;

public class App {
	public static void main(String args[]) {
//		new Clock_Frame();
		
		Timer timer = new Timer();
			TimerTask task = new TimerTask() {
				
				@Override
				public void run() {
					System.out.println("Task Completed!");
				}
			};			
			Calendar date= Calendar.getInstance();
			date.set(Calendar.YEAR, 2023);
			date.set(Calendar.MONTH, Calendar.OCTOBER);
			date.set(Calendar.DAY_OF_MONTH, 18);
			date.set(Calendar.HOUR_OF_DAY, 17);
			date.set(Calendar.MINUTE, 50);
			date.set(Calendar.SECOND, 15);
			timer.schedule(task, date.getTime());
	}
}