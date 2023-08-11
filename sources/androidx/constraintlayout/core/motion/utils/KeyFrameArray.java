package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import java.io.PrintStream;
import java.util.Arrays;

public class KeyFrameArray {

    public static class CustomArray {
        private static final int EMPTY = 999;
        int count;
        int[] keys = new int[101];
        CustomAttribute[] values = new CustomAttribute[101];

        public CustomArray() {
            clear();
        }

        public void append(int i, CustomAttribute customAttribute) {
            if (this.values[i] != null) {
                remove(i);
            }
            this.values[i] = customAttribute;
            int[] iArr = this.keys;
            int i2 = this.count;
            this.count = i2 + 1;
            iArr[i2] = i;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.keys, EMPTY);
            Arrays.fill(this.values, (Object) null);
            this.count = 0;
        }

        public void dump() {
            String str;
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.keys, this.count)));
            System.out.print("K: [");
            for (int i = 0; i < this.count; i++) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                if (i == 0) {
                    str = "";
                } else {
                    str = ", ";
                }
                sb.append(str);
                sb.append(valueAt(i));
                printStream2.print(sb.toString());
            }
            System.out.println("]");
        }

        public int keyAt(int i) {
            return this.keys[i];
        }

        public void remove(int i) {
            this.values[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.count;
                if (i2 < i4) {
                    int[] iArr = this.keys;
                    if (i == iArr[i2]) {
                        iArr[i2] = EMPTY;
                        i3++;
                    }
                    if (i2 != i3) {
                        iArr[i2] = iArr[i3];
                    }
                    i3++;
                    i2++;
                } else {
                    this.count = i4 - 1;
                    return;
                }
            }
        }

        public int size() {
            return this.count;
        }

        public CustomAttribute valueAt(int i) {
            return this.values[this.keys[i]];
        }
    }

    public static class CustomVar {
        private static final int EMPTY = 999;
        int count;
        int[] keys = new int[101];
        CustomVariable[] values = new CustomVariable[101];

        public CustomVar() {
            clear();
        }

        public void append(int i, CustomVariable customVariable) {
            if (this.values[i] != null) {
                remove(i);
            }
            this.values[i] = customVariable;
            int[] iArr = this.keys;
            int i2 = this.count;
            this.count = i2 + 1;
            iArr[i2] = i;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.keys, EMPTY);
            Arrays.fill(this.values, (Object) null);
            this.count = 0;
        }

        public void dump() {
            String str;
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.keys, this.count)));
            System.out.print("K: [");
            for (int i = 0; i < this.count; i++) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                if (i == 0) {
                    str = "";
                } else {
                    str = ", ";
                }
                sb.append(str);
                sb.append(valueAt(i));
                printStream2.print(sb.toString());
            }
            System.out.println("]");
        }

        public int keyAt(int i) {
            return this.keys[i];
        }

        public void remove(int i) {
            this.values[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.count;
                if (i2 < i4) {
                    int[] iArr = this.keys;
                    if (i == iArr[i2]) {
                        iArr[i2] = EMPTY;
                        i3++;
                    }
                    if (i2 != i3) {
                        iArr[i2] = iArr[i3];
                    }
                    i3++;
                    i2++;
                } else {
                    this.count = i4 - 1;
                    return;
                }
            }
        }

        public int size() {
            return this.count;
        }

        public CustomVariable valueAt(int i) {
            return this.values[this.keys[i]];
        }
    }

    static class FloatArray {
        private static final int EMPTY = 999;
        int count;
        int[] keys = new int[101];
        float[][] values = new float[101][];

        public FloatArray() {
            clear();
        }

        public void append(int i, float[] fArr) {
            if (this.values[i] != null) {
                remove(i);
            }
            this.values[i] = fArr;
            int[] iArr = this.keys;
            int i2 = this.count;
            this.count = i2 + 1;
            iArr[i2] = i;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.keys, EMPTY);
            Arrays.fill(this.values, (Object) null);
            this.count = 0;
        }

        public void dump() {
            String str;
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.keys, this.count)));
            System.out.print("K: [");
            for (int i = 0; i < this.count; i++) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                if (i == 0) {
                    str = "";
                } else {
                    str = ", ";
                }
                sb.append(str);
                sb.append(Arrays.toString(valueAt(i)));
                printStream2.print(sb.toString());
            }
            System.out.println("]");
        }

        public int keyAt(int i) {
            return this.keys[i];
        }

        public void remove(int i) {
            this.values[i] = null;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int i4 = this.count;
                if (i2 < i4) {
                    int[] iArr = this.keys;
                    if (i == iArr[i2]) {
                        iArr[i2] = EMPTY;
                        i3++;
                    }
                    if (i2 != i3) {
                        iArr[i2] = iArr[i3];
                    }
                    i3++;
                    i2++;
                } else {
                    this.count = i4 - 1;
                    return;
                }
            }
        }

        public int size() {
            return this.count;
        }

        public float[] valueAt(int i) {
            return this.values[this.keys[i]];
        }
    }
}
