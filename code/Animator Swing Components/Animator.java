package Clases; //Change the default package

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.Timer;

/**
 * Use this class to animate any Swing Component
 *
 * @author Angel
 */
public class Animator {

    private static int frames = 27;
    private static int interval = 9;

    /**
     * Animate effect
     *
     * @param component Require the component to animate (This component should be in starting position) 
     * @param newPoint Require the end point to animate
     */
    public static void animate(JComponent component, Point newPoint) {
        Rectangle compBounds = component.getBounds();

        Point oldPoint = new Point(compBounds.x, compBounds.y),
                animFrame = new Point((newPoint.x - oldPoint.x) / frames,
                        (newPoint.y - oldPoint.y) / frames);

        new Timer(interval, new ActionListener() {
            int currentFrame = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                component.setBounds(oldPoint.x + (animFrame.x * currentFrame),
                        oldPoint.y + (animFrame.y * currentFrame),
                        compBounds.width,
                        compBounds.height);

                if (currentFrame != frames) {
                    currentFrame++;
                } else {
                    ((Timer) e.getSource()).stop();
                }
            }
        }).start();
    }
}
