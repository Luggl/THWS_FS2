package Klausur2020SS.Viereck;

import java.util.Comparator;

public class PunktComparator implements Comparator<Punkt>
{
  private static double distance(Punkt p)
  {
    return Math.sqrt(p.x * p.x + p.y * p.y); 
  }

  public int compare(Punkt p1, Punkt p2){
    if(distance(p1) < distance(p2)){
      return(-1);
    }else if (distance(p1) > distance(p2)){
      return(1);
    }else{
      return(p1.compareTo(p2));
    }
  }

}
