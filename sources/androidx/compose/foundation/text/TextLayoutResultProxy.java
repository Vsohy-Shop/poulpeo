package androidx.compose.foundation.text;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import androidx.compose.p002ui.text.TextLayoutResult;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nTextLayoutResultProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutResultProxy.kt\nandroidx/compose/foundation/text/TextLayoutResultProxy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1#2:126\n*E\n"})
/* compiled from: TextLayoutResultProxy.kt */
public final class TextLayoutResultProxy {
    private LayoutCoordinates decorationBoxCoordinates;
    private LayoutCoordinates innerTextFieldCoordinates;
    private final TextLayoutResult value;

    public TextLayoutResultProxy(TextLayoutResult textLayoutResult) {
        C12775o.m28639i(textLayoutResult, "value");
        this.value = textLayoutResult;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r2 == null) goto L_0x001e;
     */
    /* renamed from: coercedInVisibleBoundsOfInputText-MK-Hz9U  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m33737coercedInVisibleBoundsOfInputTextMKHz9U(long r6) {
        /*
            r5 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r5.innerTextFieldCoordinates
            if (r0 == 0) goto L_0x001e
            boolean r1 = r0.isAttached()
            if (r1 == 0) goto L_0x0016
            androidx.compose.ui.layout.LayoutCoordinates r1 = r5.decorationBoxCoordinates
            r2 = 0
            if (r1 == 0) goto L_0x001c
            r3 = 0
            r4 = 2
            androidx.compose.ui.geometry.Rect r2 = androidx.compose.p002ui.layout.LayoutCoordinates.localBoundingBoxOf$default(r1, r0, r3, r4, r2)
            goto L_0x001c
        L_0x0016:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.p002ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
        L_0x001c:
            if (r2 != 0) goto L_0x0024
        L_0x001e:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.p002ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
        L_0x0024:
            long r6 = androidx.compose.foundation.text.TextLayoutResultProxyKt.m33743coerceIn3MmeM6k(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextLayoutResultProxy.m33737coercedInVisibleBoundsOfInputTextMKHz9U(long):long");
    }

    public static /* synthetic */ int getLineEnd$default(TextLayoutResultProxy textLayoutResultProxy, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayoutResultProxy.getLineEnd(i, z);
    }

    /* renamed from: getOffsetForPosition-3MmeM6k$default  reason: not valid java name */
    public static /* synthetic */ int m33738getOffsetForPosition3MmeM6k$default(TextLayoutResultProxy textLayoutResultProxy, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return textLayoutResultProxy.m33740getOffsetForPosition3MmeM6k(j, z);
    }

    /* renamed from: relativeToInputText-MK-Hz9U  reason: not valid java name */
    private final long m33739relativeToInputTextMKHz9U(long j) {
        Offset offset;
        long j2;
        LayoutCoordinates layoutCoordinates = this.innerTextFieldCoordinates;
        if (layoutCoordinates == null) {
            return j;
        }
        LayoutCoordinates layoutCoordinates2 = this.decorationBoxCoordinates;
        if (layoutCoordinates2 != null) {
            if (!layoutCoordinates.isAttached() || !layoutCoordinates2.isAttached()) {
                j2 = j;
            } else {
                j2 = layoutCoordinates.m37342localPositionOfR5De75A(layoutCoordinates2, j);
            }
            offset = Offset.m35411boximpl(j2);
        } else {
            offset = null;
        }
        if (offset != null) {
            return offset.m35432unboximpl();
        }
        return j;
    }

    public final LayoutCoordinates getDecorationBoxCoordinates() {
        return this.decorationBoxCoordinates;
    }

    public final LayoutCoordinates getInnerTextFieldCoordinates() {
        return this.innerTextFieldCoordinates;
    }

    public final int getLineEnd(int i, boolean z) {
        return this.value.getLineEnd(i, z);
    }

    public final int getLineForVerticalPosition(float f) {
        return this.value.getLineForVerticalPosition(Offset.m35423getYimpl(m33739relativeToInputTextMKHz9U(m33737coercedInVisibleBoundsOfInputTextMKHz9U(OffsetKt.Offset(0.0f, f)))));
    }

    /* renamed from: getOffsetForPosition-3MmeM6k  reason: not valid java name */
    public final int m33740getOffsetForPosition3MmeM6k(long j, boolean z) {
        if (z) {
            j = m33737coercedInVisibleBoundsOfInputTextMKHz9U(j);
        }
        return this.value.m37947getOffsetForPositionk4lQ0M(m33739relativeToInputTextMKHz9U(j));
    }

    public final TextLayoutResult getValue() {
        return this.value;
    }

    /* renamed from: isPositionOnText-k-4lQ0M  reason: not valid java name */
    public final boolean m33741isPositionOnTextk4lQ0M(long j) {
        long r4 = m33739relativeToInputTextMKHz9U(m33737coercedInVisibleBoundsOfInputTextMKHz9U(j));
        int lineForVerticalPosition = this.value.getLineForVerticalPosition(Offset.m35423getYimpl(r4));
        if (Offset.m35422getXimpl(r4) < this.value.getLineLeft(lineForVerticalPosition) || Offset.m35422getXimpl(r4) > this.value.getLineRight(lineForVerticalPosition)) {
            return false;
        }
        return true;
    }

    public final void setDecorationBoxCoordinates(LayoutCoordinates layoutCoordinates) {
        this.decorationBoxCoordinates = layoutCoordinates;
    }

    public final void setInnerTextFieldCoordinates(LayoutCoordinates layoutCoordinates) {
        this.innerTextFieldCoordinates = layoutCoordinates;
    }
}
