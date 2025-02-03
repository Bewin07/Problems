import java.util.ArrayList;
import java.util.Scanner;

// Book Class
class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isIssued;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isIssued() {
        return isIssued;
    }

    public void issueBook() {
        this.isIssued = true;
    }

    public void returnBook() {
        this.isIssued = false;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Issued: "
                + (isIssued ? "Yes" : "No");
    }
}

// User Class
class User {
    private int userId;
    private String name;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User ID: " + userId + ", Name: " + name;
    }
}

// Library Class
class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    // Add a new book
    public void addBook(int bookId, String title, String author) {
        books.add(new Book(bookId, title, author));
        System.out.println("Book added successfully!");
    }

    // View all books
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Add a new user
    public void addUser(int userId, String name) {
        users.add(new User(userId, name));
        System.out.println("User added successfully!");
    }

    // View all users
    public void viewUsers() {
        if (users.isEmpty()) {
            System.out.println("No users available.");
            return;
        }
        for (User user : users) {
            System.out.println(user);
        }
    }

    // Issue a book to a user
    public void issueBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                if (!book.isIssued()) {
                    book.issueBook();
                    System.out.println("Book issued successfully!");
                } else {
                    System.out.println("Book is already issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Return a book
    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                if (book.isIssued()) {
                    book.returnBook();
                    System.out.println("Book returned successfully!");
                } else {
                    System.out.println("Book was not issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Delete a book
    public void deleteBook(int bookId) {
        books.removeIf(book -> book.getBookId() == bookId);
        System.out.println("Book deleted successfully!");
    }

    // Delete a user
    public void deleteUser(int userId) {
        users.removeIf(user -> user.getUserId() == userId);
        System.out.println("User deleted successfully!");
    }
}

// Main Class
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        int choice;

        do {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Add User");
            System.out.println("4. View Users");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Delete Book");
            System.out.println("8. Delete User");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author Name: ");
                    String author = scanner.nextLine();
                    library.addBook(bookId, title, author);
                    break;
                case 2:
                    library.viewBooks();
                    break;
                case 3:
                    System.out.print("Enter User ID: ");
                    int userId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter User Name: ");
                    String name = scanner.nextLine();
                    library.addUser(userId, name);
                    break;
                case 4:
                    library.viewUsers();
                    break;
                case 5:
                    System.out.print("Enter Book ID to Issue: ");
                    int issueBookId = scanner.nextInt();
                    library.issueBook(issueBookId);
                    break;
                case 6:
                    System.out.print("Enter Book ID to Return: ");
                    int returnBookId = scanner.nextInt();
                    library.returnBook(returnBookId);
                    break;
                case 7:
                    System.out.print("Enter Book ID to Delete: ");
                    int deleteBookId = scanner.nextInt();
                    library.deleteBook(deleteBookId);
                    break;
                case 8:
                    System.out.print("Enter User ID to Delete: ");
                    int deleteUserId = scanner.nextInt();
                    library.deleteUser(deleteUserId);
                    break;
                case 9:
                    System.out.println("Exiting the Library Management System. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 9.");
            }
        } while (choice != 9);

        scanner.close();
    }
}
