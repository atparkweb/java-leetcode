import com.leetcode.LongestCommonPrefix.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest {
    Solution solution;
    @BeforeEach
    public void setup() {
        solution = new Solution();
    }
    @Test
    public void test() {
        String result1 = solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        Assertions.assertEquals("fl", result1);

        String result2 = solution.longestCommonPrefix(new String[]{"dog", "racecar", "car"});
        Assertions.assertEquals("", result2);

        String result3 = solution.longestCommonPrefix(new String[]{"lonely"});
        Assertions.assertEquals("lonely", result3);

        String result4 = solution.longestCommonPrefix(new String[]{});
        Assertions.assertEquals("", result4);
    }
}