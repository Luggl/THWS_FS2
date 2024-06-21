package Second_Round.Lec16_1;

public class LaeuferImpl extends AbstractFigur implements Laeufer
{
  public LaeuferImpl(int x, int y)
  {
    super(x, y);
  }

  public Brett gibErlaubteFelder()
  {
    Brett brett = new Brett();
    int count = 0;
    for(int i = x; i <=8; i++) {
      if(y+count <9){
        brett.markiereFeld(i, y+count);
      }
      if(y-count >=1){
        brett.markiereFeld(i, y-count);
      }
      count++;
    }

    count = 0;
    for(int i = x; i>=1; i--){
      if(y+count <=8){
        brett.markiereFeld(i, y+count);
      }
      if(y-count >1){
        brett.markiereFeld(i, y-count);
      }
      count++;
    }
    return brett;
  }
  
  public static void main(String[] args)
  {
    LaeuferImpl l = new LaeuferImpl(1,4);
    Brett brett = l.gibErlaubteFelder();
    for (int j = 1; j <= 8; j++)
    {
      for (int i = 1; i <= 8; i++)
      {
        if (brett.gibFeld(i, j)) System.out.print("x");
        else System.out.print("o");
      }
      System.out.println();
    }
  }
}
