package stupid.Models;

import java.awt.*;

/**
 * Created by NguyenDuc on 7/9/2016.
 */
public class ProgressBar {
    int width, height;
    double percentage = 1;

    public ProgressBar(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public void updatePercentage(Position pos, double percentage, Graphics g) {
        this.percentage = percentage;
        g.setColor(Color.YELLOW);
        g.setColor(Color.YELLOW);
        g.fillRect((int)(pos.x), (int)pos.y, (int) (percentage * width), height);
    }
}
