package proyecto;

import org.junit.Test;

/**
 * Created by Turpitude on 19/09/2016.
 */
public class StackImpl<E>  implements  Stack<E> {

    int size=0;
    E[] elements;

    public StackImpl(int len) {
        this.elements= (E[])new Object[len];
    }
    public int size()   {

        return this.size;
    }

    public void push (E e) throws Pilallena  {
        if (this.size==elements.length)
    {
        throw new Pilallena();
    }

        elements[this.size]=e;
        this.size++;


    }

    public E pop()  throws Pilavacia {

        if (this.size==0)
    {
        throw new Pilavacia();
    }
        this.size--;
        return elements[this.size];


    }


}
