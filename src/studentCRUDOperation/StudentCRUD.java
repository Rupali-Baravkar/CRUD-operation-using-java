package studentCRUDOperation;
import java.io.*;
import java.sql.Connection;
public class StudentCRUD {
	Connection con;
	public static void main(String args[]) throws Exception {
		int choice = -1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DBConnection con = new DBConnection();
        
        do{
        	System.out.println("1.Insert");
        	System.out.println("2.Display all");
        	System.out.println("3.Search");
        	System.out.println("4.Delete");
        	System.out.println("5.Update");
        	
        	System.out.println("0.Exit");
        	System.out.println("Enter Your choice: ");
        	choice = Integer.parseInt(br.readLine());
        	
        	switch(choice) {
        	case 1:
        		System.out.print("Enter the student you want : ");
        		int n = Integer.parseInt(br.readLine());
        		
        		for(int i=0;i<n;i++) {
        		
        		System.out.print("Enter Student number :");
        		int sno = Integer.parseInt(br.readLine());
        		
        		System.out.print("Enter Student name :");
        		String sname = br.readLine();
        		
        		System.out.print("Enter Student DOB :");
        		int dob = Integer.parseInt(br.readLine());
        		
        		System.out.print("Enter Student DOJ :");
        		int doj = Integer.parseInt(br.readLine());
        		
        	    con.insert(sno,sname,dob,doj);
        		} 
            break;
            
        	case 2:
        		con.display();
        	break;
        	
        	case 3:
        		System.out.print("Enter the student number to Search : ");
        		int sno = Integer.parseInt(br.readLine());
        		con.search(sno);
        	break;
        	
        	case 4:
        		
        		System.out.print("Enter student number to Delete : ");
       		    sno = Integer.parseInt(br.readLine());
        		con.delete(sno);
        		
        		
        	break;

            
        	
             case 5:
        		
        		 System.out.print("Enter student number to update : ");
        		 sno = Integer.parseInt(br.readLine());
        		 
        		 System.out.print("Enter student name to update : ");
        		 String sname = br.readLine();
        		 
        		 System.out.print("Enter student DOB to update : ");
        		 int dob= Integer.parseInt(br.readLine());
        		 
        		 System.out.print("Enter student DOJ to update : ");
        		 int doj = Integer.parseInt(br.readLine());
        		 
        		 con.update(sno,sname,dob,doj);
        	 break;
        	
        	 case 0:
        	  	  con.close();
        		  System.out.println("Thanks...Bye...!");
             break;
       }
        }while(choice!=0);
        
        
        
        
		
		
	}
}