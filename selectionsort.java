public class SelectionSort \{\
	 private int temp;\
\
	/** Creates a new instance of SelectionSort */\
    public SelectionSort() \{\
    \}\
    \
    /* A simple SelectionSort algorithm\
     * pre-condition: \
     * post-condition:\
     * inputs:\
     * outputs:\
     * special conditions:\
     */    \
    public int[] basicSelectionSort(int[] x) \{\
        for (int i = 0; i < x.length; ++i) \{\
            for (int j= i+1; j < x.length; ++j) \{\
                if (x[i] > x[j]) \{\
                    temp = x[i];\
                    x[i] = x[j];\
                    x[j] = temp; // FIXED THIS LINE \
                \}\
            \} // end of inner for loop\
        \} // end of outer for loop\
        return x;\
    \} // end of basicSelectionSort method\
\
\}\
\
\
import static org.junit.Assert.*;\
\
import org.junit.Test;\
\
import static org.junit.Assert.*;\
import org.junit.Assert;\
import org.junit.Test;\
\
public class testSelectionSort \{\
	@Test\
	public void test() \{\
		testPositive();\
		testNegative();\
		testMixed();\
		testDuplicates();\
	\}\
\
    public testSelectionSort() \{\
    \}\
    \
    public void testPositive()\{\
        int[] arr = new int[5];\
        arr[0] = 8;\
        arr[1] = 9;\
        arr[2] = 7;\
        arr[3] = 10;\
        arr[4] = 2;\
        \
        int[] Sortedarr = new int[5];\
        Sortedarr[0] = 2;\
        Sortedarr[1] = 7;\
        Sortedarr[2] = 8;\
        Sortedarr[3] = 9;\
        Sortedarr[4] = 10;\
        \
        /** add tests to check for this unit test **/\
    \}\
    \
    public void testNegative()\{\
        \
    	int[] arr = new int [5];\
    	arr[0] = -8;\
        arr[1] = -9;\
        arr[2] = -7;\
        arr[3] = -10;\
        arr[4] = -2;\
        /** Test data contains negative values only **/\
    \}\
    \
    public void testMixed()\{\
        \
    	int[] arr = new int [5];\
    	arr[0] = -8;\
        arr[1] = 9;\
        arr[2] = 7;\
        arr[3] = 10;\
        arr[4] = -2;\
        /** Test data contains with both positive, negative and zeros **/\
    \}\
    \
    public void testDuplicates()\{\
        \
    	int[] arr = new int [5];\
    	arr[0] = -8;\
        arr[1] = -9;\
        arr[2] = -7;\
        arr[3] = -10;\
        arr[4] = -2;\
        /** Test data contains duplicates **/\
    \}\
\
\
\}\
}