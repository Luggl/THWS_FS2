package Klausur2020SS_2.Gif;

import w3resource.Iterator.Arr;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GIFutilities {

    static byte[] a = "GIF78a".getBytes();
    static byte[] b = "GIF89a".getBytes();

    public static boolean checkGIF(String file){
        try(FileInputStream fis = new FileInputStream(file)
        ){
            byte[] bytes = fis.readNBytes(a.length);
            if(Arrays.equals(bytes, a) || Arrays.equals(bytes, b)){
                return true;
            }

        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args) {
        FileWalk fw = new FileWalk();
        List<File> files = fw.getFiles();
        List<File> gifs = new ArrayList<>();
        for(File f : files){
            if(checkGIF(f.getAbsolutePath())){
                gifs.add(f);
            }
        }

        for(File f: gifs){
            f.renameTo(new File(f.getAbsolutePath() + ".gif"));
        }
    }
}
