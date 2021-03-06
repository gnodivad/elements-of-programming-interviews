import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SearchSortedTest {

    private int n;
    private int k;

    @Test
    public void search1() throws Exception {
        n = 10;
        k = 5;

        test(n, k);
    }

    @Test
    public void search2() throws Exception {
        n = 50;
        k = 20;

        test(n, k);
    }

    @Test
    public void search3() throws Exception {
        n = 100;
        k = 73;

        test(n, k);
    }

    @Test
    public void search4() throws Exception {
        n = 100;
        k = 1;

        test(n, k);
    }

    @Test
    public void search5() throws Exception {
        n = 100;
        k = 99;

        test(n, k);
    }

    @Test
    public void search6() throws Exception {
        List<Integer> list = Arrays.asList(-14, -10, 2, 108, 108, 243, 285, 285, 401);

        testWithList(list, 108);
    }

    @Test
    public void search7() throws Exception {
        List<Integer> list = Arrays.asList(-14, -10, 2, 108, 108, 243, 285, 285, 401);

        testWithList(list, 285);
    }

    public void test(int n, int k) throws Exception {
        List<Integer> list = StreamUtil.sequence(n);
        assertEquals(list.indexOf(k), SearchSorted.search(list, k));
    }

    public void testWithList(List<Integer> list, int k) throws Exception {
        assertEquals(list.indexOf(k), SearchSorted.search(list, k));
    }

}