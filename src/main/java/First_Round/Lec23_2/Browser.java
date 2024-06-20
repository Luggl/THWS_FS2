package First_Round.Lec23_2;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

public class Browser {
    public Optional<URL> back()
    {
        Optional<URL> out;
        try
        {
            //simulate: fetch last URL from Stack
            out =  Math.random() < 0.5 ? Optional.of(new URL("http://google.de")) : Optional.empty();
        }
        catch(MalformedURLException e)
        {
            out = Optional.empty();
        }

        return(out);
    }

    public String retrieveSite(URL url)
    {
        //simulate download site:
        return url.toString();
    }
    public static void main(String[] args)
    {
        System.out.println("Normal back");
        Browser browser = new Browser();

        browser.back().ifPresent(Url -> System.out.println(browser.retrieveSite(Url)));


//        if (back.isPresent()){
//            browser.retrieveSite(back.get());
//            System.out.println("retrieve done");
//        }else{
//            System.out.println("Nothing there");
//        }
    }

}
