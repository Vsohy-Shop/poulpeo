package androidx.compose.p002ui.geometry;

import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.geometry.MutableRectKt */
/* compiled from: MutableRect.kt */
public final class MutableRectKt {
    public static final Rect toRect(MutableRect mutableRect) {
        C12775o.m28639i(mutableRect, "<this>");
        return new Rect(mutableRect.getLeft(), mutableRect.getTop(), mutableRect.getRight(), mutableRect.getBottom());
    }
}
