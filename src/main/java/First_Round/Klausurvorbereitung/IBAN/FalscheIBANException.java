package First_Round.Klausurvorbereitung.IBAN;

public class FalscheIBANException  extends Throwable{
    String exceptionText;

    public FalscheIBANException() {
        this.exceptionText = "FEHLER: Datei enthält ungültige IBAN";
    }

    public FalscheIBANException(String message){
        exceptionText = message;
    }
}
