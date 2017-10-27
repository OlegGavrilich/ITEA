package week3;

public class SchoolManagerImp implements SchoolManager{

    private StudentGroup group = new StudentGroup();
    private MyScanner scanner = new IO();

    @Override
    public void showMenu() {
        // TODO: 9/27/17
        scanner.write("Menu:");
        scanner.write("1. Add Student");
        scanner.write("2. Remove Student");
        scanner.write("3. Search Student");
        scanner.write("4. Sort Students");
        scanner.write("5. Show Students");
        scanner.write("EXIT");
    }

    @Override
    public void addStudent() {
        group.add(new Student(scanner.readString("Enter First Name: "), scanner.readString("Enter second name: "), scanner.readInt("Enter age: "),
                scanner.readDouble("Enter average mark: ")));
        scanner.write("Student was successfully added!!!");

    }

    @Override
    public void removeStudent() {
        group.removeStudent(scanner.readString("Enter Student's first name: "));
        scanner.write("Student was successfully DELETED!!!");

    }

    @Override
    public void searchStudent() {
        //
    }

    @Override
    public void sortByName() {

        scanner.write(group.showStudents(group.sort()));
    }

    @Override
    public void showAllStudents() {
        scanner.write(group.showStudents());
    }
}