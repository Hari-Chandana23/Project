package additional;

import additional.CountUniqueWords;
import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class CountUniqueWordsTest {

    CountUniqueWords cw = new CountUniqueWords();
    @Test
    public void test1(){
        Assert.assertEquals(3,cw.countUniqueWords("this is hari"));

        Assert.assertEquals(1,cw.countUniqueWords("this is hari chandana"));

        Assert.assertEquals(0,cw.countUniqueWords("this is hari chandana reddy"));
    }
}
