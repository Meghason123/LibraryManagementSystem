CREATE DATABASE library_db;
use library_db;

CREATE TABLE books (
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100),
    author VARCHAR(100),
    isbn VARCHAR(50)
);
INSERT INTO book (title, author, isbn) VALUES
("The Great Indian Novel","Shashi Tharoor","9730885623"),
("The God Of Small Things","Arundhati Roy","8264957581"),
("Harry Potter Series","J.K. Rowling","9875933533"),
("Lord Of The Ring","J.R.R. Tolkien","4542134535"),
("Pride and Prejudice","Jane Austen","5922332323"),
("David Copperfield","Charles Dicken","7589452222");

select * from Book;

CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100)
);

INSERT INTO user (name, email) VALUES
("pratiksha unpane","punpane21@gmail.com"),
("rajju wanve","rajju@gmail.com"),
("prachi bahad","prachi@gmail.com"),
("shrutika wadibhasme","shrutika@gmail.com"),
("tanmay shirkhande","tanmay@gmail.com"),
("virat kolhi","virat@gmail.com"),
("rohit sharma","rohit@gmail.com"); 

select * from User;