package week3;

public interface MyScanner {

    String readString(String message);
    int readInt(String message);
    void write(String message);
    void write(Object o);
    double readDouble(String message);
}