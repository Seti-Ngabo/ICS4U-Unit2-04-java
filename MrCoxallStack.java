/*
* This is the MrCoxallStack
*
* @author  Seti Ngabo
* @version 1.0
* @since   2022-09-27
*/

import java.util.ArrayList;
/**
*  Make class MrCoxallStack.
*/

public class MrCoxallStack {

    /**
    * An ArrayList that will hold the tack elements.
    */
    private ArrayList<Integer> theStack = new ArrayList<Integer>();

    /**
    * Getter.
    * The showStack method.
    *
    * @return regets stack and returns it
    */
    public ArrayList<Integer> getStack() {
        return theStack;
    }

    /**
    * The push() function.
    *
    * @param pushNumber The int to be added to the stack
    */
    public void push(final int pushNumber) {
        final int index = theStack.size();
        theStack.add(index, pushNumber);
    }
    /**
    * The pop() function.
    *
    * @return Remove the top element and return it
    */

    public int pop() {
        final int item;
        if (theStack.size() == 0) {
            item = 0;
            System.out.println("Nothing in stack");
        } else {
            item = theStack.remove(theStack.size() - 1);
        }

        return item;
    }
    /**
    * The peek() function.
    *
    * @return views the top element and return it
    */

    public int peekStack() {
        final int item;
        final int size = theStack.size();
        if (theStack.size() == 0) {
            item = 0;
            System.out.println("Nothing to peek");
        } else {
            item = theStack.get(size - 1);
        }
        return item;
    }
    /**
    * The clear() function.
    * <p>
    * Clears entire Stack.
    * </p>
    */

    public void clearStack() {
        theStack.clear();
    }
}
