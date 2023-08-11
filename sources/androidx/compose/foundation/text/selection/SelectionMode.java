package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Rect;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: SelectionMode.kt */
public enum SelectionMode {
    ;

    /* compiled from: SelectionMode.kt */
    static final class Horizontal extends SelectionMode {
        Horizontal(String str, int i) {
            super(str, i, (DefaultConstructorMarker) null);
        }

        /* renamed from: compare-3MmeM6k$foundation_release  reason: not valid java name */
        public int m33829compare3MmeM6k$foundation_release(long j, Rect rect) {
            C12775o.m28639i(rect, "bounds");
            if (rect.m35448containsk4lQ0M(j)) {
                return 0;
            }
            if (Offset.m35422getXimpl(j) < rect.getLeft()) {
                return -1;
            }
            if (Offset.m35423getYimpl(j) >= rect.getTop() || Offset.m35422getXimpl(j) >= rect.getRight()) {
                return 1;
            }
            return -1;
        }
    }

    /* compiled from: SelectionMode.kt */
    static final class Vertical extends SelectionMode {
        Vertical(String str, int i) {
            super(str, i, (DefaultConstructorMarker) null);
        }

        /* renamed from: compare-3MmeM6k$foundation_release  reason: not valid java name */
        public int m33830compare3MmeM6k$foundation_release(long j, Rect rect) {
            C12775o.m28639i(rect, "bounds");
            if (rect.m35448containsk4lQ0M(j)) {
                return 0;
            }
            if (Offset.m35423getYimpl(j) < rect.getTop()) {
                return -1;
            }
            if (Offset.m35422getXimpl(j) >= rect.getLeft() || Offset.m35423getYimpl(j) >= rect.getBottom()) {
                return 1;
            }
            return -1;
        }
    }

    /* renamed from: compare-3MmeM6k$foundation_release  reason: not valid java name */
    public abstract int m33827compare3MmeM6k$foundation_release(long j, Rect rect);

    /* renamed from: isSelected-2x9bVx0$foundation_release  reason: not valid java name */
    public final boolean m33828isSelected2x9bVx0$foundation_release(Rect rect, long j, long j2) {
        boolean z;
        C12775o.m28639i(rect, "bounds");
        boolean z2 = true;
        if (rect.m35448containsk4lQ0M(j) || rect.m35448containsk4lQ0M(j2)) {
            return true;
        }
        int r4 = m33827compare3MmeM6k$foundation_release(j, rect);
        int r3 = m33827compare3MmeM6k$foundation_release(j2, rect);
        if (r4 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (r3 <= 0) {
            z2 = false;
        }
        return z ^ z2;
    }
}
