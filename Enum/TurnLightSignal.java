package Enum;

public class TurnLightSignal {
    enum Turn{
        left,
        right
    }

    public static void main(String[] args) {
        Turn myVar = Turn.left; 
        System.out.println(myVar.getClass());
      }
}
