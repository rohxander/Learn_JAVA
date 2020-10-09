import java.applet.*;
import java.awt.*;

public class RectangleTest extends Applet {
	int x, y, z, h;
	public void init(){
		x = Integer.parseInt(getParameter (" xValue"));
		y = Integer.parseInt(getParameter (" yValue"));
		z = Integer.parseInt(getParameter (" zValue"));
		h = Integer.parseInt(getParameter (" hValue")); 
	}
	public void paint(Graphics g){
		g.drawRect (x, y, z, h );
	}
}
