package Lec17_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileNotFound {
    public static void main(String[] args) {
        int b = new FileInputStream("404.exe").read();

    }
}
