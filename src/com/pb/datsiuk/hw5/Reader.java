package com.pb.datsiuk.hw5;

public class Reader {
    private String FIO;
    private int number;
    private String Faculty;
    private String DateOfBirthday;
    private String phone;

    public Reader (String FIO, int number, String Faculty, String DateOfBirthday, String phone) {
        this.FIO = FIO;
        this.number = number;
        this.Faculty = Faculty;
        this.DateOfBirthday = DateOfBirthday;
        this.phone = phone;
    }

    public Reader () {
    }

    public String getFIO () {
        return FIO;
    }
    public void setFIO(String FIO){
        this.FIO= FIO;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number=number;
    }

    public String getFaculty() {
        return Faculty;
    }
    public void setFaculty(String Faculty) {
        this.Faculty = Faculty;
    }

    public String setDateOfBirthday() {
        return DateOfBirthday;
    }
    public void setDateOfBirthday(String DateOfBirthday) {
        this.DateOfBirthday=DateOfBirthday;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone=phone;
    }
    public void takeBook(int number) {
        System.out.println(this.FIO + " взяв " + number + " книжок.");
    }

    public void takeBook(String... books) {
        System.out.println(this.FIO + " взяв такі книжки:");
        for (String book : books) {
            System.out.println(books);
        }
        System.out.println();
    }


    public void takeBook(Book... books) {
        System.out.println(this.FIO + " взяв такі книжки:");
        for (Book book : books) {
            System.out.println(book.getName() + ", автор - " + book.getAuthor() + book.getDate());
        }
        System.out.println();
    }

    public void returnBook(int number) {
        System.out.println(this.FIO + " повернув " + number + " книжки.");
    }

    public void returnBook(String... books) {
        System.out.println(this.FIO + " повернув такі книжки:");
        for (String book : books) {
            System.out.println(books);
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.println(this.FIO + " повернув такі книжки:");
        for (Book book : books) {
            System.out.println(book.getName() + ", автор - " + book.getAuthor() + book.getDate());
        }
        System.out.println();
    }

    public String getInfo() {
        return "{" +
                "FIO='" + FIO + '\'' +
                ", number=" + number +
                ", Faculty='" + Faculty + '\'' +
                ", DateOfBirthday='" + DateOfBirthday + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
