import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class PluteIcon implements Icon {
    private int width;
    private int height;
    public PluteIcon(int width, int height)
    {
        this.height = height;
        this.width = width;
    }

    public int getIconWidth()
    {
        return width;
    }

    public int getIconHeight()
    {
        return height;
    }

    public void paintIcon(Component c, Graphics g, int x, int y)
    {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D.Double strangePlanet = new Rectangle2D.Double(x, y,
                width, height);
        g2.setColor(Color.yellow);
        g2.fill(strangePlanet);
    }
}
