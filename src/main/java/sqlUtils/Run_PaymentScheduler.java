package sqlUtils;

import java.io.IOException;
import java.sql.SQLException;

import driver.TestBase;

public class Run_PaymentScheduler extends TestBase {

	public static void RunFilewithoutlpp() throws IOException, InterruptedException
	{
		System.out.println("Started ");
		//String path = "\"C:\\Program Files (x86)\\Scheduler\\PDL.TaskScheduler.exe\"";
		String path = getPropertyValue("SchedulerPath");
		System.out.println("Scheduler path is ------- "+path);
		Runtime run  = Runtime.getRuntime(); 
        Process proc = run.exec(path); 
		System.out.println("Waiting for Payment Scheduler to finish ...");
        proc.waitFor(); 
		
        /*
        //Added on 05-Dec-2023 Start Revised
        try {
			MsSqlUtility.checkSchedulerPaymentStatus(getMapData.get("eMail"));
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      //Added on 05-Dec-2023 End Revised
       */
		System.out.println("Payment Scheduler execution is completed.");
		
	}
	public static void main(String[] args) throws IOException, InterruptedException
	{
		RunFilewithoutlpp();
		RunFilewithlpp();
	}
	

		public static void RunFilewithlpp() throws IOException, InterruptedException
		{
			System.out.println("Started ");
			//String path = "\"C:\\Program Files (x86)\\Scheduler\\PDL.TaskScheduler.exe\"";
			String path = getPropertyValue("LPP_SchedulerPath");
			System.out.println("Scheduler path is ------- "+path);
			Runtime run  = Runtime.getRuntime(); 
	        Process proc = run.exec(path); 
			System.out.println("Waiting for Payment Scheduler to finish ...");
	        proc.waitFor();
			System.out.println("Payment Scheduler execution is completed.");
		}
		
}
