import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Player implements KeyListener, ActionListener {

    private int score;


    public Player( int score) {
        this.score = score;
    }

    // Simply checks if the player is moving
    public boolean isMoving(KeyEvent e) {
        if ((e.getKeyCode() == KeyEvent.VK_W) ||
        (e.getKeyCode() == KeyEvent.VK_S) ||
        (e.getKeyCode() == KeyEvent.VK_D) || (e.getKeyCode() == KeyEvent.VK_A)) {
            return true;
        }
        return false;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            isMoving(e);
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            isMoving(e);
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            isMoving(e);
        }  else if (e.getKeyCode() == KeyEvent.VK_A) {
            isMoving(e);
        } else if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}