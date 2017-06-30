package li.jesse.datatype.abstractdatatype;

import li.jesse.util.StackUtil;
import org.junit.Test;

import java.util.Stack;

public class StackTest
{
    @Test
    public void testStack()
    {
        Stack<String> sk = new Stack<String>();
        System.out.println(sk.isEmpty());

        sk.push("1");
        sk.push("2");
        sk.push("3");
        StackUtil.printStack(sk);

//        sk.pop();
//        StackUtil.printStack(sk);
//
//        sk.peek();
//        StackUtil.printStack(sk);

        System.out.println(sk.search("1"));
        System.out.println(sk.search("123"));
    }
}
