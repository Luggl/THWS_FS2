package Lec16_1;

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
    int countLoop;
    while(x_var < 8 && y_var < 8){
      x_var++;
      y_var++;
    }

    if(x_var<=y_var){
      countLoop = x_var;
    }else{
      countLoop = y_var;
    }
    for(int i = 0; i<=countLoop; i++){
      brett.markiereFeld(x_var-countLoop, y_var-countLoop);
    }

    x_var = x;
    y_var = y;
    while(x_var > 1 && y_var < 8){
      x_var--;
      y_var++;
    }

    if(x_var<=y_var){
      countLoop = x_var;
    }else{
      countLoop = y_var;
    }
    for(int i = 0; i<=countLoop; i++){
      brett.markiereFeld(x_var+countLoop, y_var+countLoop);
    }

    return brett;
  }
  
  public static void main(String[] args)
  {
    LaeuferImpl l = new LaeuferImpl(4,5);
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
