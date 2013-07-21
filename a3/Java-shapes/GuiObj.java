/**
 * GuiObj - interface for objects to be placed on a canvas.
 * <p>
 * Objects can have be positioned at a {@link Point}, moved around, and will
 * have a fill {@link Color}.
 * <p>
 * 2/08
 * <p>
 * EDITOR: tabstop=2, cols=80
 *
 * @author Kurt Schmidt
 * @since Java(TM) SE Runtime Environment (build 1.6.0-b105
 */

import java.awt.Color ;
import java.awt.Point ;

public interface GuiObj
{
		/** get the fill color
		 * @return fill color */
	public Color color() ;
		/** set the fill color
		 * @param fill color */
	public void color( Color c ) ;

		/** get the location.  Note, we needn't supply meaning to this until we
		 * actually draw on our canvas.  So, it could be the center, or the
		 * top-leftmost point, etc.
		 * @return object's location on the canvas */
	public Point location() ;
		/** set the location.  Note, we needn't supply meaning to this until we
		 * actually draw on our canvas.  So, it could be the center, or the
		 * top-leftmost point, etc.
		 * @param object's location on the canvas */
	public void location( Point l ) ;

		/** move (translate) the object.
		 * @param dx - move to the right (left if negative)
		 * @param dy - move down (up if negative) */
	public void move( int dx, int dy ) ;
}

