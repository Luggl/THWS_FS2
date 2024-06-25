package Second_Round.Lec18_1;

public class MatrikelnrExcept extends Throwable{
    String error;
    public MatrikelnrExcept(){
        this.error = "Standard-Error";
    }
    public MatrikelnrExcept(String error){
        this.error = error;
    }

    public String getError() {
        return error;
    }
}
