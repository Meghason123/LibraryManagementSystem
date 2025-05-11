package com.library_management_system;
import Dao.UserDAO;
import Dao.BookDAO;
import Model.User;
import Model.Book;

import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserDAO userDAO = new UserDAO();
        BookDAO bookDAO = new BookDAO();

        while (true) {
            System.out.println("\n========= Library Management =========");
            System.out.println("1. Add User");
            System.out.println("2. View All Users");
            System.out.println("3. Add Book");
            System.out.println("4. View All Books");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter user name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter user email: ");
                    String email = scanner.nextLine();

                    User user = new User();
                    user.setName(name);
                    user.setEmail(email);

                    userDAO.saveUser(user);
                    System.out.println("User added successfully.");
                    break;

                case 2:
                    List<User> users = userDAO.getAllUsers();
                    System.out.println("\n--- User List ---");
                    for (User u : users) {
                        System.out.println("ID: " + u.getId() + ", Name: " + u.getName() + ", Email: " + u.getEmail());
                    }
                    break;

                case 3:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book ISBN: ");
                    String isbn = scanner.nextLine();

                    Book book = new Book();
                    book.setTitle(title);
                    book.setAuthor(author);
                    book.setIsbn(isbn);

                    bookDAO.saveBook(book);
                    System.out.println("Book added successfully.");
                    break;

                case 4:
                    List<Book> books = bookDAO.getAllBooks();
                    System.out.println("\n--- Book List ---");
                    for (Book b : books) {
                        System.out.println("ID: " + b.getId() + ", Title: " + b.getTitle() + ", Author: " + b.getAuthor() + ", ISBN: " + b.getIsbn());
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}