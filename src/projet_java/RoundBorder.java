package projet_java;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.border.AbstractBorder;

public class RoundBorder extends AbstractBorder {
    private final Color color;
    private final int arc;

    public RoundBorder(Color color, int arc) {
        this.color = color;
        this.arc = arc;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        g.setColor(color);
        Shape shape = new RoundRectangle2D.Double(x, y, width - 1, height - 1, arc, arc);
        Insets insets = getBorderInsets(c);
        shape = new RoundRectangle2D.Double(
            x + insets.left, y + insets.top, width - insets.right - insets.left - 1,
            height - insets.bottom - insets.top - 1, arc, arc);
        g.drawRoundRect(x, y, width - 1, height - 1, arc, arc);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(arc / 2, arc / 2, arc / 2, arc / 2);
    }

    @Override
    public Insets getBorderInsets(Component c, Insets insets) {
        insets.left = insets.right = insets.bottom = insets.top = arc / 2;
        return insets;
    }
}