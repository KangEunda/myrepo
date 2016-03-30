package com.j1.w4;

import ch.aplu.turtle.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class TurtleKeyListener extends Turtle {
  public TurtleKeyListener() {
    TurtleKeyAdapter tka = new TurtleKeyAdapter();
    addKeyListener(new KeyAdapter() {
      public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        switch(keyCode) {
          case KeyEvent.VK_UP:
            setStatusText("forward 20");
            forward(20);
            break;
          case KeyEvent.VK_DOWN:
            setStatusText("back 20");
            back(20);
            break;
          case KeyEvent.VK_Q:
            setStatusText("Q pressed and exiting.");
            break;
          case KeyEvent.VK_RIGHT:
            setStatusText("right 90");
            right(90);
            break;
          case KeyEvent.VK_LEFT:
            setStatusText("left 20");
            left(90);
            break;
        }
      }
    });
  }
}

public class TurtleKeyObserverMain {
  public static void main(String[] args) {
    TurtleKeyListener t = new TurtleKeyListener();
    t.addStatusBar(20);
    t.setStatusText("Press any key!");
  }
}