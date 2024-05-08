package Lec17_1;

import java.io.*;

public class FileNotFound {
    public static void main(String[] args) {
        try(InputStream x = new FileInputStream("404.jpg")){
            int i = x.read();
            System.out.println(i);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
