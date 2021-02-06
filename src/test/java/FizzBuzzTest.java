import static org.junit.Assert.assertEquals;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fizzbuzz.interfaces.FizzBuzz;

/**
 * Tests for FizzBuzz
 */
public class FizzBuzzTest {

    private PrintStream out;
    private FizzBuzz fb;

    /**
     * @return void
     */
    @Before
    public void setUp() {
        final ApplicationContext context = new ClassPathXmlApplicationContext(
                TestConstants.SPRING_XML);
        fb = (FizzBuzz) context.getBean(TestConstants.STANDARD_FIZZ_BUZZ);
        out = System.out;
        ((ConfigurableApplicationContext) context).close();
    }

    /**
     * @return void
     */
    @After
    public void tearDown() {
        System.setOut(out);
    }

    /**
     * @param n
     *            int
     * @param s
     *            String
     * @throws IOException
     */
    private void doFizzBuzz(final int n, final String s) throws IOException {
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        final BufferedOutputStream bos = new BufferedOutputStream(baos);
        PrintStream ps = new PrintStream(bos);
        System.setOut(ps);

        fb.fizzBuzz(n);

        System.out.flush();
        String expectedResult = s.replaceAll("\\n", System.getProperty("line.separator"));
        assertEquals(expectedResult, baos.toString());
    }

    /**
     * @throws IOException
     * @return void
     */
    @Test
    public void testFizzBuzz() throws IOException {
        doFizzBuzz(TestConstants.INT_1, TestConstants._1_);
        doFizzBuzz(TestConstants.INT_2, TestConstants._1_2_);
        doFizzBuzz(TestConstants.INT_3, TestConstants._1_2_FIZZ);
        doFizzBuzz(TestConstants.INT_4, TestConstants._1_2_FIZZ_4);
        doFizzBuzz(TestConstants.INT_5, TestConstants._1_2_FIZZ_4_BUZZ);
        doFizzBuzz(TestConstants.INT_6, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ);
        doFizzBuzz(TestConstants.INT_7, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7);
        doFizzBuzz(TestConstants.INT_8, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8);
        doFizzBuzz(TestConstants.INT_9, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ);
        doFizzBuzz(TestConstants.INT_10, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ);
        doFizzBuzz(TestConstants.INT_11, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11);
        doFizzBuzz(TestConstants.INT_12, TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ);
        doFizzBuzz(TestConstants.INT_13,
                TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13);
        doFizzBuzz(TestConstants.INT_14,
                TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14);
        doFizzBuzz(TestConstants.INT_15,
                TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14_FIZZ_BUZZ);
        doFizzBuzz(TestConstants.INT_16,
                TestConstants._1_2_FIZZ_4_BUZZ_FIZZ_7_8_FIZZ_BUZZ_11_FIZZ_13_14_FIZZ_BUZZ_16);
    }

}
