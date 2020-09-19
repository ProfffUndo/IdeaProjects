package mephi.Lab5.dop.tryresoursesstacktrace;

import java.io.IOException;

public class ExampleChain {
    public static void main(String[] args) throws Throwable {
        try
        {
            NumberFormatException ex = new NumberFormatException("Exception");
            ex.initCause(new NullPointerException("This is actual cause of the exception"));
            throw ex;
        }

        catch(NumberFormatException ex)
        {
            System.out.println(ex);
            System.out.println(ex.getCause());
        }
    }
}

