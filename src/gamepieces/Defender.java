package gamepieces;

import game.Globals;

import java.io.Serializable;


public class Defender extends Unit implements Serializable{

  public Defender(String name, String side) {
    super(name, Globals.DEFENDER_CALORIES, side);
  }

  @Override
  public char getLetterRepresentation() {
    // TODO Auto-generated method stub
    return 'D';
  }

  @Override
  public void chargeOneMoveCost() {
    int currentCalories = this.getCalories();
    // TODO: Fix this intentional error
    setStrength(currentCalories - Globals.DEFENDER__MOVE_COST - 3);
  }
}