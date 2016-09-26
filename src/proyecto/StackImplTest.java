package proyecto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Turpitude on 26/09/2016.
 */
public class StackImplTest {

    Stack<Integer> st1;

    @Before
    public void setUp() throws Exception {


        st1= new StackImpl<Integer>(10);
       for(int i=0;i<8;i++)
        {
            st1.push(i);
        }
    }

    @After
    public void tearDown() throws Exception {

        this.st1=null;

    }

    @Test
    public void size() throws Exception {
        assertEquals(8,st1.size());
    }

    @Test (expected= Pilallena.class)
    public void push() throws Exception {
        st1.push(9);
        st1.push(10);
        st1.push(11);

    }


    @Test ( expected = Pilavacia.class)
    public void pop() throws Exception {

        for(int i=0;i<9;i++)
        {
            st1.pop();
        }


    }

}