package Lec16_1;

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

  public Brett kombiniere(Brett in){
    Brett out = this;
    for(int i = 0; i<in.brett.length; i++){
      for(int j = 0; j< in.brett[i].length; j++){
        if(in.brett[i][j]){
          out.brett[i][j] = true;
        }
      }

    }
    return(out);
  }

}
