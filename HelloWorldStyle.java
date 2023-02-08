/**
* The HelloWorld program implements an application that
* simply displays "Hello World!" to the standard output.
*
* @author  Ms Raffin
* @version 1.0
* @since   2023-02-08
*/
public final class HelloWorldStyle {

    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private HelloWorldStyle() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        System.out.println("Hello world! with style");
    }
}
