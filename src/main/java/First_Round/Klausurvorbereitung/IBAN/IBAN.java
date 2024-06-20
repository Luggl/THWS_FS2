package First_Round.Klausurvorbereitung.IBAN;

import java.io.*;

public class IBAN {

    public boolean ibanCheck(String iban) throws FalscheIBANException{
        boolean failedLength = true;
        boolean failedCountryCode = true;
        char[] ibanArray = iban.toCharArray();

        if(iban.length() == 22){
            failedLength = false;
        }
        if(ibanArray[0] >= 'A' && ibanArray[0] <='Z' && ibanArray[1] >='A' && ibanArray[1] <='Z'){
            failedCountryCode = false;
        }
        if(!failedCountryCode && !failedLength){
            return true;
        }else{
            FalscheIBANException f = new FalscheIBANException("Folgende IBAN wurde geprüft:\n" + iban + "\n");
            if(failedLength) {
                f.exceptionText += "Länge stimmt nicht!\n";
            }
            if(failedCountryCode){
                f.exceptionText+="CountyCode stimmt nicht!\n";
            }
            throw f;
        }
    }

    public void ibanAusDateiLesen(String datei) throws FalscheIBANException{
        boolean allClear = true;

        try(InputStream is = new FileInputStream(datei);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            ){


            while(true){
                String iban = br.readLine();
                try{
                    ibanCheck(iban);
                }catch(FalscheIBANException f){
                    allClear = false;
                    throw f;
                }
            }

        }catch(FileNotFoundException f){
            System.out.println("Datei " + datei + " nicht gefunden");
        }catch(IOException i){
            System.out.println("Fehler beim Lesevorgang von Datei: " + datei);
        }catch(NullPointerException n){
            System.out.println("Datei "+datei + " existiert nicht");
        }
        finally {
            if(allClear){
                System.out.println("Alle IBANs korrekt!");
            }else{
                System.out.println("Something wrong");
            }
        }

    }

    public void dateienTest(String[] dateien){
        for(String s : dateien){
            try {
                ibanAusDateiLesen(s);
            }catch(FalscheIBANException f){
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        IBAN i = new IBAN();
        String[] dateien = new String[]{"IBAN1.txt", "IBAN2.txt", "IBAN3.txt", "IBAN4.txt", "IBANFehler.txt"};
        i.dateienTest(dateien);
    }

}
