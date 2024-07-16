package Klausur2020SS_2.Gif;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileWalk {
    List<File> files = new ArrayList<>();
    final File path = new File ("C:\\Users\\llang\\BilderDownloaderMaterialien\\");

    public FileWalk(){
        walk(path);
    }
    public void walk(File path){
        for(File x : path.listFiles()){
            if(x.isFile()){
                files.add(x);
            }else{
                walk(x);
            }
        }
    }

    public List<File> getFiles(){
        return(files);
    }


}
