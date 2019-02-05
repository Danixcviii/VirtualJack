package data;

public class Carta {

  private Codigo codigo;
  private Palo palo;
  private Color color;
}

public enum Codigo{
  A,1,2,3,4,5,6,7,8,9,10,J,Q,K
}

public enum Palo{
  PICAS,TREBOLES,CORAZONES,DIAMANTES
}
