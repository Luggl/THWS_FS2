package Second_Round.Lec16_1;

public class Brett
{
  boolean[][] brett = new boolean[8][8];
  
  public Brett()
  {
    
  }
  
  public void markiereFeld(int x, int y)
  {
    brett[x-1][y-1] = true;
  }
  
  public boolean gibFeld(int x, int y)
  {
    return brett[x-1][y-1];
  }

  public Brett kombiniere(Brett brettNew){
    Brett out = new Brett();
    for(int i = 0; i<brett.length; i++){
      for(int j = 0; j<brett[i].length; j++){
        if(brettNew.brett[i][j]){
          out.brett[i][j] = true;
        }else if(brett[i][j]){
          out.brett[i][j] = true;
        }
      }
    }
    return(out);
  }
  
}
