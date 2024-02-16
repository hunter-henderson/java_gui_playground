import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ShapeIconPanel extends JPanel {

    private ArrayList<Icon> imgs;

    public ShapeIconPanel() {
        imgs = new ArrayList<Icon>();

        imgs.add(new MarsIcon(50));
        imgs.add(new HunterIcon(50));
        imgs.add(new PluteIcon(30,50));
        imgs.add(new EarthIcon(100));
        //add your Icons here.
        imgs.add(new EarthIcon(100));


        this.setPreferredSize(new Dimension(500, 250));
        this.setBackground(Color.black);


    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Icon img : imgs) {
            img.paintIcon(this, g, 0, 0 );
        }
    }









}
