import junit.framework.TestCase;
import org.junit.BeforeClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class EX1Test {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}, new int[]{1, 7}},
                {new int[]{1, 2, 4, 2, 1, 1, 3}, new int[]{2, 1, 1, 3}},
                {new int[]{4, 15, 231}, new int[]{15, 231}},
                {new int[]{1, 2, 4}, new int[0]}
        });
    }

    @Parameterized.Parameter
    public int[] ints;

    @Parameterized.Parameter(1)
    public int[] resultInts;

    @Test
    public void testCreateNewArrayAfterNum() {
        assertArrayEquals(resultInts, EX1.createNewArrayAfterNum(ints));
    }


    @Test(expected = RuntimeException.class)
    public void testExCreateNewArrayAfterNum() {
        final int[] ints = {1, 2, 3, 5};
        EX1.createNewArrayAfterNum(ints);

    }
}






