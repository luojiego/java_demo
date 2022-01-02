import java.util.Arrays; // Arrays.toString() 需要

public class Sort {
    public void BabbleSort(int [] a, int n) {
        if (n <= 1) {
            return;
        }

        for (int i = 0; i < n; i++) {
            bool swap = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j+1]) {
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Sort s = new Sort();
        int[] a = {6, 3, 2, 5, 1, 4, 7};
        // System.out.println(a);
        s.BabbleSort(a, 6);
        System.out.println(Arrays.toString(a));
    }
}