package androidx.compose.p002ui.text.caches;

import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.text.caches.ContainerHelpersKt */
/* compiled from: ContainerHelpers.kt */
public final class ContainerHelpersKt {
    public static final int[] EMPTY_INTS = new int[0];
    public static final Object[] EMPTY_OBJECTS = new Object[0];

    public static final int binarySearchInternal(int[] iArr, int i, int i2) {
        C12775o.m28639i(iArr, "<this>");
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }
}
