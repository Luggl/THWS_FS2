package First_Round.Lec16_1;

public class LaeuferImpl extends AbstractFigur implements Laeufer
{
  public LaeuferImpl(int x, int y)
  {
    super(x, y);
  }

  public Brett gibErlaubteFelder()
  {
    Brett brett = new Brett();
    int x_var = x;
    int y_var = y;
    int count = 0;
    while(x_var < 8 && y_var < 8){
      x_var++;
      y_var++;
    }

    while(x_var - count >= 1 && y_var - count >= 1){
      brett.markiereFeld(x_var - count, y_var - count);
      count++;
    }

    x_var = x;
    y_var = y;
    while(x_var > 1 && y_var < 8){
      x_var--;
      y_var++;
    }

    count = 0;

    while(x_var + count <= 8 && y_var - count >1){

      brett.markiereFeld(x_var + count, y_var - count);
      count++;
    }

    return brett;
  }
  
  public static void main(String[] args)
  {
    LaeuferImpl l = new LaeuferImpl(3,7);
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
