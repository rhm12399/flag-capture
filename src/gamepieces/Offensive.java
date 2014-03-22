package gamepieces;

import game.Globals;

import java.io.Serializable;


public class Offensive extends Unit implements Serializable {
   
  public Offensive(String name, String side) {
    super(name, Globals.RUNNER_CALORIES, side);
  }

  @Override
  public char getLetterRepresentation() {
    return 'R';
  }

  @Override
  public void chargeOneMoveCost() {
    int currentCalories = this.getCalories();
    setStrength(currentCalories - Globals.RUNNER__MOVE_COST);
  }
}