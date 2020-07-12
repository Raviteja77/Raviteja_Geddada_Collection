package Com.CustomCollection;

import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main  {
	
	public static final Logger LOGGER = LogManager.getLogger(Main.class);

	public static void main(String[] args) {
	
		CustomCollections clist = new CustomCollections();
		Scanner sc = new Scanner(System.in);
		clist.insert("Ravi", 10,"ECE",3);
		clist.insert("Lohitha", 9, "ECE", 3);
		clist.insert("Shiva", 8,"ECE",3);
		clist.insert("Karthik", 7, "MECH", 3);
		clist.insert("Veera",6,"MBA",2);
		clist.insert("Satya", 5, "MA", 1);
		clist.insert("Sameer",4,"CSE",3);
		clist.insert("Teja", 3, "MS", 2);
		clist.insert("Snehith",2,"MS",2);
		clist.insert("Pavan", 1, "CSE", 3);
		clist.customPrint();
		clist.popElementAtSpecifiedIndex(4);
		clist.customPrint();
		clist.fetchDetailsOfStudentById(9);
		clist.removeLastElement();
		clist.customPrint();
		LOGGER.info("Do you want to Perform any operation?press 'Yes' or 'No'");
		String option = sc.nextLine();
		LOGGER.info(option);
		while (option.equalsIgnoreCase("yes")) {
				LOGGER.info("\nEnter \t1. Insert\n\t2. Pop\n\t\3. Remove\n\t4. Fetch\n\t5. PrintList\n\t6. Exit");
				int choice = sc.nextInt();
				LOGGER.info(choice);
				if (choice == 1) {
					LOGGER.info("Enter Id, Year, Name of the ECE Student");
					int id = sc.nextInt();
					int year = sc.nextInt();
					String dept = sc.nextLine();
					String name = sc.nextLine();
					LOGGER.info(id+"\n"+year+"\n"+name);
					clist.insert(name,id,"ECE",year);
				}
				else if (choice == 2) {
					LOGGER.info("Enter the Specified Position of Data to Pop");
					int position = sc.nextInt();
					LOGGER.info(position);
					clist.popElementAtSpecifiedIndex(position);
				}
				else if (choice == 3) 
					clist.removeLastElement();
				
				else if (choice == 4) {
					LOGGER.info("Enter Id of the Student to Fetch the Details");
					int number = sc.nextInt();
					LOGGER.info(number);
					clist.fetchDetailsOfStudentById(number);
				}
				else if (choice == 5) 
					clist.customPrint();
				
				else if (choice == 6) 
					break;
				
				else 
					LOGGER.info("Enter a Valid Option");
			
		}
		sc.close();
	}
}
