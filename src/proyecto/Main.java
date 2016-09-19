package proyecto;

public class Main {

    public static void main(String[] args) throws Exception {

	Stack<Integer> st1= new StackImpl<Integer>(10);
try {
    st1.push(1);
    st1.push(2);
    st1.push(3);
    st1.push(4);
    st1.push(5);
    st1.push(6);
    st1.push(7);
    st1.push(8);
    st1.push(9);
    st1.push(10);

    st1.pop();
    st1.pop();
    st1.pop();
    st1.pop();
    st1.pop();
    st1.pop();
    st1.pop();
    st1.pop();
    st1.pop();
    st1.pop();
    st1.pop();
}
catch(Exception e)
{
    System.out.print(e.getMessage());
}
        System.out.print(st1.size());

}

}
