//16.	Design the schema for a Library Management System and write JDBC programs for:
//•	Adding a book
//•	Viewing all books
//•	Issuing a book to a member
//•	Returning a book

package Library_Management_Project;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException, Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Username : ");
		String username = sc.nextLine();
		System.out.println("Password : ");
		String password = sc.nextLine();
		if(!LoginService.login(username, password)) {
			System.out.println("Login Failed!!");
			return;
		}
		
		while(true) {
			System.out.println("\nLibrary Management Menu");
            System.out.println("1. Register Member");
            System.out.println("2. View Members");
            System.out.println("3. Add Book");
            System.out.println("4. View Books");
            System.out.println("5. Issue Book");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
            case 1 -> MemberService.registerMember(sc);
            case 2 -> MemberService.viewMembers();
            case 3 -> BookService.addBook(sc);
            case 4 -> BookService.viewBooks();
            case 5 -> IssueService.issueBook(sc);
            case 6 -> {
                System.out.println("Goodbye!");
                return;
            }
            default -> System.out.println("Invalid choice");
            }
		}
	}

}

//Username : 
//admin
//Password : 
//admin123
//
//Library Management Menu
//1. Register Member
//2. View Members
//3. Add Book
//4. View Books
//5. Issue Book
//6. Exit
//Choose option: 2
//ID    Name                 Phone           Address                       
//1     Raniya               987654321       ABC villa, pqr                
//2     Riyaa                987654312       PQR villa, rty                
//
//Library Management Menu
//1. Register Member
//2. View Members
//3. Add Book
//4. View Books
//5. Issue Book
//6. Exit
//Choose option: 4
//ID    Title                     Author               Genre           Available 
//1     The Alchemist             Paulo Coelho         Fiction         No        
//2     A Brief History of Time   Stephen Hawking      Science         Yes       
//3     Wings of Fire             A.P.J. Abdul Kalam   Autobiography   Yes       
//4     I Too Had a Love Story    Ravinder Singh       Romance         Yes       
//5     One Arranged Murder       Chetan Bhagat        Mystery         Yes       
//6     The Fault in Our Stars    John Green           Romance         Yes       
//
//Library Management Menu
//1. Register Member
//2. View Members
//3. Add Book
//4. View Books
//5. Issue Book
//6. Exit
//Choose option: 6
//Goodbye!