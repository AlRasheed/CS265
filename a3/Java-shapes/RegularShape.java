/**
 * RegularShape abstract superclass for <u>regular</u> geometric shapes.
 * These are closed shapes where all sides and angles are congruent
 * <p>
 * 2/08
 * <p>
 * EDITOR: tabstop=2, cols=80
 *
 * @author Kurt Schmidt
 * @since Java(TM) SE Runtime Environment (build 1.6.0-b105
 */

public abstract class RegularShape
{
	protected String _label ;
	protected double _len ;

		/** Only c'tor
		 * @param len - the length (these are all regular shapes, so, 1
		 * dimension suffices.  <u>You</u> had better give meaning to this
		 * dimension, for each shape).
		 * @param label - just some label, to distinguish shapes
		 */
	public RegularShape( double len, String label )
	{ _label = label; _len = len; }

		/** Get the label of the shape.
		 * @return label attribute */
	public String label() { return _label; }

		/** Get the length of the single dimension.
		 * @return _len attribute */
	public double length() { return _len; }

		/** compute area of the shape.
		 * @return the area, a double */
	public abstract double area();

		/** compute perimeter (circumference) of the shape.
		 * @return perimeter (circumference) */
	public abstract double perimeter();

		/**  Being careful of somebody implementing <code>clone</code> in an
		 * inherited class.
		 * <p>
		 * Don't worry about this, even a little bit.  I'm
		 * just playing, don't want to implement cloneable
		 * <p>
		 * You do <i>not</i> need to do anything w/this.
		 *
		 * @throws CloneNotSupportedException if we ever get here */
	protected Object clone() throws CloneNotSupportedException
	{ return super.clone(); }
}
