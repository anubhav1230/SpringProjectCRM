package programs;

public class CloseToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int[] arr = { 12, 44, 56, 78 };
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int a = Math.abs(arr[i]);
            if (a < max) {
                max = a;
            }
        }
        System.out.println(max);
    }

	}
