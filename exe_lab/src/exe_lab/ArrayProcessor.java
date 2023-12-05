package exe_lab;

public class ArrayProcessor {
	public int getArrayLength(Object[] a) {
        int count = 0;
        try {
            while (true) {
                Object t = a[count];
                count++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // ArrayIndexOutOfBoundsException indicates the end of the array
        }
        return count;
    }

}
