package androidx.compose.p002ui.platform;

import java.lang.Comparable;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.platform.OpenEndRange */
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
public interface OpenEndRange<T extends Comparable<? super T>> {
    boolean contains(T t) {
        C12775o.m28639i(t, "value");
        if (t.compareTo(getStart()) < 0 || t.compareTo(getEndExclusive()) >= 0) {
            return false;
        }
        return true;
    }

    T getEndExclusive();

    T getStart();

    boolean isEmpty() {
        if (getStart().compareTo(getEndExclusive()) >= 0) {
            return true;
        }
        return false;
    }
}
