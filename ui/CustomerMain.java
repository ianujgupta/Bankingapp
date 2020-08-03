package com.bank.Banking.ui;


import com.bank.Banking.entities.Account;
import com.bank.Banking.entities.*;
import com.bank.Banking.exceptions.*;
import com.bank.Banking.service.CustomerServiceImpl;
import com.bank.Banking.service.ICustomerService;
import com.bank.Banking.*;


import java.util.*;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
//import Banking.BusinessCustomer;
//import Banking.RegularCustomer;
//import Banking.Account;

public class CustomerMain {

	//private Map<String, Customer> store = new HashMap<>();
	
	private ICustomerService service = new CustomerServiceImpl();

	public static void main(String[] args) {
		CustomerMain demo = new CustomerMain();
		demo.runApp();
	}

	// Customer[] customers = new Customer[4];
	public void runApp() {
		try {
			Account account1 = new Account(1, "11111pan");
			Account account2 = new Account(2, "11111pan");
			Account account3 = new Account(3, "11111pan");
			Account account4 = new Account(4, "11111pan");

			//boolean issame = account1 == account2;// is to check t1, t2 are referring same object
			//boolean isEquals = account1.equals(account2);// two object are equal (in content)
			//System.out.println("is same=" + issame);
			//System.out.println("is equal=" + isEquals);

			final String name1 = "ankit", name2 = "ayushi", name3 = "rahul", name4 = "mohan";

			Customer customer1 = new RegularCustomer("Jabalpur", 1, "Mohan",234,account1);
			//customer1.setAccount(account1);
			service.add(customer1);
			int id1 = customer1.getId();
			
			
			RegularCustomer customer2 = new RegularCustomer("Bhopal", 2, "Sohan", 4567,account2);
			//customer2.setAccount(account2);
			service.add(customer2);
			int id2=customer2.getId();
			
			BusinessCustomer customer3 = new BusinessCustomer("Indore", 3, "Rohan", 8910,account3);
			//customer3.setAccount(account1);
			service.add(customer3);
			int id3=customer3.getId();
			//service.delete(id3);
			service.updateName(customer3.getId(), "Rohan Rathore");
			
			BusinessCustomer customer4 = new BusinessCustomer("Raipur", 3, "Gohan", 1112,account4);
			//customer4.setAccount(account2);
			service.add(customer4);
			int id4 = customer4.getId(); 
			//displayAll();
			
			Customer fetched = service.findById(id3);
			display(fetched);
			System.out.print("*********diplaying All Customers ***********");
			displayAll();
			}
			catch(InvalidCustomerArgumentException e) {
			e.printStackTrace();
			System.out.print(e.getMessage());
			}
			catch(CustomerNotFoundException e) {
			e.printStackTrace();
		 	System.out.println(e.getMessage());
			}	
			catch(Exception e) {
			e.printStackTrace();
			System.out.println("some thing went wrong");
			}
				
	}
		public void displayAll() {
			List<Customer> list=service.findAll();
			for(Customer customer:list) {
				display(customer);
			}
		}
	
		public void display(Customer customer){
			System.out.println("  Customer  -- : " +customer.getId() +" "+customer.getName()
			+" "+customer.getBalance());
			
			Account account = customer.getAccount();
			System.out.println("  Customer  pursuing Account -- : " + account.getBalance() + " Pancard Number -- "
					+ account.getPancard());
			
			if (customer instanceof RegularCustomer) {
				RegularCustomer ca = (RegularCustomer) customer;
				System.out.println("Account is " + ca.getHouseAddress());
			}

			if (customer instanceof BusinessCustomer) {
				BusinessCustomer ca = (BusinessCustomer) customer;
				System.out.println("Account is " + ca.getBusinessAddress());

			}

		}	
	
			
			/*
			 * customers[0] = customer1; customers[1] = customer2; customers[2] = customer3;
			 * customers[3] = customer4;
			 */
			
			/*
			 * }
			store.put(customer1.getName(), customer1);
			store.put(customer2.getName(), customer2);
			store.put(customer3.getName(), customer3);
			store.put(customer4.getName(), customer4);

			boolean issamee = customer1 == customer2;// is to check t1, t2 are referring same object
			boolean isEqualss = customer1.equals(customer2);// two object are equal (in content)

			System.out.println("is same=" + issamee);
			System.out.println("is equal=" + isEqualss);
			boolean isEqual = customer1 == customer2;
			System.out.println("check:" + isEqual);
			
			displayAll();
				
			System.out.println(" Fetched by Customer Name " + name4);

			Customer fetched = findByName(name4);

			if (fetched instanceof RegularCustomer) {
				RegularCustomer fetchRc = (RegularCustomer) fetched;
				display(fetchRc);
			}
			if (fetched instanceof BusinessCustomer) {
				BusinessCustomer fetchBc = (BusinessCustomer) fetched;
				display(fetchBc);
			}

			System.out.println("Displaying all Customers");
		} catch (InvalidCustomerArgumentException e) {
			System.out.println("Customer is Null");
		} catch (Exception e) {
			System.out.println("Some error");
		}

	}

	public Customer findByName(String name) {
		Customer customer = store.get(name);
		return customer;
	}

	public void displayAll() {
		Set<String> keys = store.keySet();
		for (String key : keys) {
			Customer current = store.get(key);
			boolean isRegularCustomer = current instanceof RegularCustomer;
			if (isRegularCustomer) {
				RegularCustomer ca = (RegularCustomer) current;
				display(ca);
			}
			boolean isBusinessCustomer = current instanceof BusinessCustomer;
			if (isBusinessCustomer) {
				BusinessCustomer ca = (BusinessCustomer) current;
				display(ca);
			}

			// boolean isEqual= customer1==customer2;
			// System.out.println("check:"+isEqual);

		}

	}

	public void checkNull(Customer customer) {
		if (customer == null) {
			InvalidCustomerArgumentException exception = new InvalidCustomerArgumentException("null argument");
			throw exception;
		}
	}

	public void displayCustomer(Customer customer) {
		checkNull(customer);
		String name = customer.getName();
		String id = customer.getId();
		double balance = customer.getBalance();

		Account account = customer.getAccount();
		System.out.println("  Customer  pursuing Account -- : " + account.getBalance() + " Pancard Number -- "
				+ account.getPancard());

	}

	public void display(RegularCustomer customer) {
		checkNull(customer);
		displayCustomer(customer);
		System.out.print("address=" + customer.getHouseAddress());
	}

	public void display(BusinessCustomer customer) {
		checkNull(customer);
		displayCustomer(customer);
		System.out.print("address=" + customer.getBusinessAddress());
	}

	/*
	 * // TYPE - 1 for (Customer custom : customers) { System.out.println( "Name " +
	 * custom.getName() + " ID " + custom.getId() + " Balance is: " +
	 * custom.getBalance()); } boolean isRegularCustomer = custom instanceof
	 * RegularCustomer; if (isRegularCustomer) { RegularCustomer ca =
	 * (RegularCustomer) custom; System.out.println("Regular Customer Address is = "
	 * + ca.getHouseAddress()); }
	 * 
	 * boolean isBusinessCustomer = custom instanceof BusinessCustomer; if
	 * (isBusinessCustomer) { BusinessCustomer ca = (BusinessCustomer) custom;
	 * System.out.println("Business Customer Address is = " +
	 * ca.getBusinessAddress()); }
	 */

}
/*
 * //TYPE -2 System.out.println("\n"); for(int i=0;i<customers.length;i++){
 * Customer customer = customers[i]; System.out.println( "Name " +
 * customer.getName() + " ID " + customer.getId() + " Balance is: " +
 * customer.getBalance()); // System.out.println((customer instanceof
 * RegularCustomer).getHouseAddress()); }
 * 
 * 
 * }
 */
