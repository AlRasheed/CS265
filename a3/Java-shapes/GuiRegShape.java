/**
 * GuiRegShape abstract superclass for <u>regular</u> geometric shapes that
 * can be placed on a canvas.
 * These are closed shapes where all sides and angles are congruent
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


public abstract class GuiRegShape 
	extends RegularShape
	implements GuiObj
{
	protected Color _fill ;
	protected Point _location ;

	public GuiRegShape( double len, String label )
	{
		super( len, label );
		_location = new Point( 0, 0 ) ;
		_fill = Color.BLACK ;
	}

	public GuiRegShape( double len, String label, Color color  )
	{
		super( len, label );
		// TODO fill in color and position
		_location = new Point( 0, 0 ) ;
		_fill = color;
	}

	public Color color() { return _fill ; }

	public void color( Color c ) { _fill = c ; }

	// The code is the same for any shapes you create, so, this is why this
	// intermediate superclass exists
	public Point location() { return new Point( _location ); }
	public void location( Point l ) { _location = new Point( l ); }

	public void move( int dx, int dy ) { _location.translate( dx, dy ); }

}
