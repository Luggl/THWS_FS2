package Klausurvorbereitung.Twotter;

public class Message {
    String text;
    String date;
    User user;

    public Message(String text){
        if(text.length()<=140){
            this.text = text;
        }
    }


}
