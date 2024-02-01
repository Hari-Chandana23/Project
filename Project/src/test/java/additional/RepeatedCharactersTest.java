package additional;

import additional.RepeatedCharacters;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class RepeatedCharactersTest {
    RepeatedCharacters rc = new RepeatedCharacters();
    @Test
    public void test1(){
        Assert.assertEquals("ra",rc.findRepeatedCharacters("HariErla"));
        Assert.assertEquals("anr",rc.findRepeatedCharacters("HariChandanaErla"));
    }
}
