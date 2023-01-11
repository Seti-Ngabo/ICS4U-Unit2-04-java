/*
* This program uses MrCoxallStack
*
* @author  Seti Ngabo
* @version 1.0
* @since   2022-09-27
*/

import java.util.Scanner;
/**
 * Class Main.
 */

final class Main {
    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The stack program.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Scanner myObj = new Scanner(System.in);
        // use MrCoxallStack class
        final MrCoxallStack aStack = new MrCoxallStack();
        final int popValue;

        System.out.print("Enter a number (! to leave loop): ");
        while (myObj.hasNext()) {
            final String myNewLine = myObj.nextLine();
            if ("!".equals(myNewLine)) {
                break;
            }

            try {
                final int userNumber = Integer.parseInt(myNewLine);
                aStack.push(userNumber);
            } catch (NumberFormatException ex) {
                System.out.println(myNewLine + " is NaN");
            }
            System.out.print("Enter a number (! to leave loop):");
        }

        System.out.println("");
        System.out.println(aStack.getStack());
        System.out.println(aStack.peekStack() + " was peeked");
        popValue = aStack.pop();
        System.out.println("Popped: " + popValue + " out of stack");

        aStack.clearStack();
        System.out.println("... clearing stack ...");
        System.out.println(aStack.getStack() + " stack cleared");

        System.out.println("\nDone.");
    }
}
