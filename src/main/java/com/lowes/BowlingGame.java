package com.lowes;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
    private final List<Integer> rolls = new ArrayList<Integer>(21);

    public void roll(int... pins) {
        for (int pinCount : pins) {
            rolls.add(pinCount);
        }
    }

    public Integer score() {
        int total = 0;

        for (int frameCounter = 0, roll = 0; frameCounter < 10; ++frameCounter) {

            int thisFrame = rolls.get(roll) + rolls.get(roll + 1);
            total += thisFrame;
            if (thisFrame >= 10) {
                total += rolls.get(roll + 2);
            }
            roll += (rolls.get(roll) == 10)?1:2;
        }
        return total;
    }
}
