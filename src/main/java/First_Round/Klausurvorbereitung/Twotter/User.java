package First_Round.Klausurvorbereitung.Twotter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
    private final String BENUTZERNAME;
    private String passwort;

    public User(String BENUTZERNAME, String passwort){
        this.BENUTZERNAME = BENUTZERNAME;
        this.passwort = passwort;
    }

    public void trySafe(){
        if(!BENUTZERNAME.isEmpty() && !passwort.isEmpty()){
            safeData();
        }else{
            System.out.println("No gonna happen!");
        }
    }

    private void safeData(){
        try(OutputStream os = new FileOutputStream("user.dat");
            ObjectOutputStream oos = new ObjectOutputStream(os);
        ){
            oos.writeObject(this);
            oos.flush();
        }catch(Exception e){

        }

    }

    public static void main(String[] args) {
        List<User> user = new ArrayList<>();
        UserManager um = new UserManager();
        user.add(new User("DGASHI", "passwort"));
        user.add(new User("DKÜCÜK", "1234"));
        user.add(new User("TSTENGER", "TS10"));
        user.add(new User("JVOGT", "RAINERBESTERMANN"));

        um.serialize(user);
    }
}
