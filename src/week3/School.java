package week3;

public class School {

    private SchoolManager schoolManager = new SchoolManagerImp();
    private MyScanner scanner = new IO();


    public SchoolManager getSchoolManager() {
        return schoolManager;
    }

    public MyScanner getScanner() {
        return scanner;
    }

}