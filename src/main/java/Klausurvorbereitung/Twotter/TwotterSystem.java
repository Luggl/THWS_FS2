package Klausurvorbereitung.Twotter;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TwotterSystem {

    List<Message> messages = new ArrayList<>();

    public void addMessage(User u, Message m){
        m.user = u;
        m.date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        messages.add(m);
    }

    public List<Message> getAllMessages(){
        return(messages);
    }

    public List<Message> getAllMessagesFromDate(String date){
        List<Message> out = new ArrayList<>();
        for(Message m : messages){
            if(m.date.equals(date)){
                out.add(m);
            }
        }
        return(out);
    }

    public List<Message> getAllMessagesFromUser(User user){
        List<Message> out = new ArrayList<>();
        for(Message m : messages){
            if(m.user == user){
                out.add(m);
            }
        }
        return(out);
    }
}
