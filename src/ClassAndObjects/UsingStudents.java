package ClassAndObjects;

public class UsingStudents {
    public static void main(String[] args) {
        Student studentOne = new Student("James");
        Book book1 = new Book("java", "cybertek", 20);
        studentOne.read(book1);
    }
}
