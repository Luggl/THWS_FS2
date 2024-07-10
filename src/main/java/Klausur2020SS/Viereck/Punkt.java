package Klausur2020SS.Viereck;

import java.util.*;

public class Punkt implements Comparable<Punkt>
{
  int x;
  int y;
  
  public Punkt(int x, int y)
  {
    this.x = x;
    this.y = y;
  }

  public int compareTo(Punkt d){
    if(this.x < d.x){
      return(-1);
    }else if (this.x > d.x){
      return(1);
    }else{
      if(this.y < d.y){
        return(-1);
      }else if(this.y > d.y){
        return(1);
      }else {
        return(0);
      }
    }
  }
  
  //only relevant if HashSet is used
  @Override
  public int hashCode()
  {
    final int prime = 31;
    int result = 1;
    result = prime * result + x;
    result = prime * result + y;
    return result;
  }
  @Override
  public String toString(){
    String out = "(" + x + "; "+ y + ")";
    return(out);
  }

  @Override
  public boolean equals(Object obj)
  {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Punkt other = (Punkt) obj;
    if (x != other.x) return false;
    if (y != other.y) return false;
    return true;
  }

  public static void main(String[] args) {
    Punkt a = new Punkt(-1, 2);
    Punkt b = new Punkt( 1,1);
    Punkt z = new Punkt(1,4);
    Punkt d = new Punkt(2,3);
    Punkt[] punkte = new Punkt[]{d, z, b, a};
      TreeSet<Punkt> punktTreeSet = new TreeSet<>(Arrays.asList(punkte));


    for(Punkt p : punktTreeSet){
      System.out.println(p);
    }

  }
}
