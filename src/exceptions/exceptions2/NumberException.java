package exceptions.exceptions2;

/**
 * Thrown to indicate that a method has been passed
 * an illegal or inappropriate ssid.
 */

class  NumberException extends Exception
{
	/**
   	 * Constructs an NumberException with no detail message
	 */
	public NumberException()	{
		super();
	}

	/**
   	 * Constructs an NumberException with Number.Exception detail message
	 *
	 ** @param    s    the detail message.
	 */
	public NumberException(String s)	{
		super(s);
	}
}
