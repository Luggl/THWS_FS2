package de.thws.SteamBundles;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class SiteData {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        try {
            URL url = new URL("https://steamdb.info/bundles/");
            Scanner scanner = new Scanner(url.openStream());
            sb = new StringBuffer();

            while(scanner.hasNext()){
                sb.append(scanner.next());
            }

        }catch(Exception e){
            e.printStackTrace();
        }


        Document doc = Jsoup.parse(sb.toString());
        System.out.println(doc.body());
    }
}
