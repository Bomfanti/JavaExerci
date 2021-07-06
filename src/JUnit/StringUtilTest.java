package JUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class StringUtilTest {

    @Test
    public void testIsEmpty(){
        boolean b;

        b = StringUtil.isEmpty("abc");
        Assert.assertFalse(b);

        b = StringUtil.isEmpty(null);
        Assert.assertTrue(b);

        b = StringUtil.isEmpty("");
        Assert.assertTrue(b);
    }
    @Test
    public void testReverse(){
        String r = StringUtil.reverse("abcd");
        Assert.assertEquals("dcba", r);

        r = StringUtil.reverse(null);
        Assert.assertNull(r);
    }

    @Before
    public void before(){
        System.out.println("Inicializando o teste");
    }

    @After
    public void after(){
        System.out.println("Teste Finalizado");
    }
}
