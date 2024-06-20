package First_Round.Klausurvorbereitung.Twotter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserManager implements ObjectManager{

    @Override
    public List<User> deserialize() {
        List<User> out = new ArrayList<>();
        try(InputStream is = new FileInputStream("user.dat");
            ObjectInputStream ois = new ObjectInputStream(is);
        ){
            while(true){
                out.add((User) ois.readObject());
            }

        }catch(Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public void serialize(List object){
        try(OutputStream os = new FileOutputStream("user.dat");
            ObjectOutputStream oos = new ObjectOutputStream(os);
        ){
            for(Object generic : object){
                oos.writeObject(generic);
                oos.flush();
            }

        }catch(Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
