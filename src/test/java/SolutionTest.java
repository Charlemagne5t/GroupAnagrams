import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    @Test
    public void groupAnagramsTest1() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> output = new ArrayList<>();
        List<String> list1 = new ArrayList<>(List.of("bat"));
        List<String> list2 = new ArrayList<>(List.of("nat", "tan"));
        List<String> list3 = new ArrayList<>(List.of("ate", "eat", "tea"));
        output.add(list1);
        output.add(list2);
        output.add(list3);
        Assert.assertEquals(output, new Solution().groupAnagrams(strs));
    }

    @Test
    public void groupAnagramsTest2() {
        String[] strs = {};
        List<List<String>> output = new ArrayList<>();
        output.add(new ArrayList<>());
        Assert.assertEquals(output, new Solution().groupAnagrams(strs));
    }

    @Test
    public void groupAnagramsTest3() {
        String[] strs = {"a"};
        List<List<String>> output = new ArrayList<>();
        List<String> list1 = new ArrayList<>(List.of("a"));
        output.add(list1);
        Assert.assertEquals(output, new Solution().groupAnagrams(strs));
    }
}
