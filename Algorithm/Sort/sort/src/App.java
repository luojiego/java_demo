import java.util.Arrays;

public class App {
    public void BabbleSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }

        for (int i = 0; i < n; i++) {
            boolean swap = false;
            for (int j = 0; j < n - 1 - i; j++) {
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

    public void InsertionSort(int []a, int n) {
        if (n <= 1) {
            return;
        }

        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int value = a[i];
            for (; j >= 0; j--) {
                if (a[j] > value) {
                    a[j+1] = a[j];
                } else {
                    break;
                }
            }
            a[j+1] = value;
        }
    }

    public void SelectionSort(int[] a, int n) {
        if (n <= 1) {
            return;
        }

        // 注意边界的判断 
        for (int i = 0; i < n-1; i++) {
            int index = i;
            // 找出剩余元素中最小的元素
            for (int j=i+1; j < n; j++) {
                if (a[j] < a[index]) {
                    index = j;
                }
            }
            if (index != i) {
                int tmp = a[i];
                a[i] = a[index];
                a[index] = tmp;
            }
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        App app = new App();
        int[] a1 = {4, 5, 6, 3, 2, 1};
        app.BabbleSort(a1, 6);
        System.out.println(Arrays.toString(a1));

        int[] a2 = {4, 5, 6, 3, 2, 1};
        app.InsertionSort(a2, 6);
        System.out.println(Arrays.toString(a2));

        int[] a3 = {4, 5, 6, 3, 2, 1};
        app.SelectionSort(a3, 6);
        System.out.println(Arrays.toString(a3));
    }
}
