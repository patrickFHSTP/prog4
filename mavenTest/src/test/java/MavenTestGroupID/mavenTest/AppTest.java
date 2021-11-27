package MavenTestGroupID.mavenTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
		List<Integer> list = Arrays.asList(5, 2, 4);

        assertThat(list, hasSize(3));
    }

}
