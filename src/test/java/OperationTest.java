import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class OperationTest {
    @Test
    public void should_return_odd_count_when_input_array() {
        Operation op = new Operation();
        int[] array = {1, 2, 3, 4, 5};
        int result = op.odd_count(array);
        assertThat(result, is(2));
    }

}