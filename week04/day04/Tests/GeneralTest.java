import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


public class GeneralTest {

    @Test
    public void appleTest (){
        Apples apple = new Apples();
        assertEquals("apple", apple.getApple());



    }


}
