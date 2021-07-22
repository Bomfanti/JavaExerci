package JUnit;

import org.junit.Assert;
import org.junit.Test;

public class IdentifierTest {

    @Test
    public void testvalidateIdentifier(){

        boolean s;

        s = Identifier.validateIdentifier("a5");
        Assert.assertTrue(s);

        s = Identifier.validateIdentifier(" ");
        Assert.assertFalse(s);

        s = Identifier.validateIdentifier("665432197");
        Assert.assertFalse(s);

        s = Identifier.validateIdentifier("B*ss1");
        Assert.assertFalse(s);


    }
}
