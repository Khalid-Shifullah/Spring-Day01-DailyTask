package com.AutowiringExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private Game game;

    @Autowired
    GameRunner(Game game) {
        this.game = game;
    }

    public void run() {
        this.up();
        this.down();
    }

    private void up() {
        System.out.println("up");
    }

    private void down() {
        System.out.println("down");
    }
}
