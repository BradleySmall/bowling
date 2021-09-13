package com.lowes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingTest {
    private BowlingGame game;

    @BeforeEach
    public void setUp() {
        this.game = new BowlingGame();
    }
    @AfterEach
    public void tearDown() {
        ;
    }
    @Test
    void shouldShowZeroForGutterGame(){

        game.roll(0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0);

        assertEquals(0, game.score());
    }
    @Test
    void shouldShow20ForAll1() {

        game.roll(1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 0);

        assertEquals(20, game.score());
    }
    @Test
    void shouldShow90ForAll9() {

        game.roll(5,4, 5,4, 5,4, 5,4, 5,4, 5,4, 5,4, 5,4, 5,4, 5,4, 0);

        assertEquals(90, game.score());
    }
    @Test
    void shouldShow20For1Spare555() {

        game.roll(5,5, 5,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0);

        assertEquals(20, game.score());
    }
    @Test
    void shouldShow28ForStrikeAnd54() {

        game.roll(10, 5,4, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0);

        assertEquals(28, game.score());
    }
    @Test
    void shouldShow300ForAllStrike() {

        game.roll(10, 10, 10, 10, 10, 10, 10, 10, 10, 10,10,10, 0,0,0,0,0,0,0,0,0,0);

        assertEquals(300, game.score());
    }
    @Test
    void shouldShow150ForAll5() {

        game.roll(5,5, 5,5, 5,5, 5,5, 5,5, 5,5, 5,5, 5,5, 5,5, 5,5,5);

        assertEquals(150, game.score());
    }
}
