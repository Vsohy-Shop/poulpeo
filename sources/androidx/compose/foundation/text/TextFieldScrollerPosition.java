package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p002ui.geometry.Rect;
import androidx.compose.p002ui.text.TextRange;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nTextFieldScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollerPosition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,369:1\n76#2:370\n102#2,2:371\n76#2:373\n102#2,2:374\n76#2:376\n102#2,2:377\n*S KotlinDebug\n*F\n+ 1 TextFieldScroll.kt\nandroidx/compose/foundation/text/TextFieldScrollerPosition\n*L\n253#1:370\n253#1:371,2\n259#1:373\n259#1:374,2\n274#1:376\n274#1:377,2\n*E\n"})
@Stable
/* compiled from: TextFieldScroll.kt */
public final class TextFieldScrollerPosition {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Saver<TextFieldScrollerPosition, Object> Saver = ListSaverKt.listSaver(TextFieldScrollerPosition$Companion$Saver$1.INSTANCE, TextFieldScrollerPosition$Companion$Saver$2.INSTANCE);
    private final MutableState maximum$delegate;
    private final MutableState offset$delegate;
    private final MutableState orientation$delegate;
    private Rect previousCursorRect;
    private long previousSelection;

    /* compiled from: TextFieldScroll.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<TextFieldScrollerPosition, Object> getSaver() {
            return TextFieldScrollerPosition.Saver;
        }
    }

    public TextFieldScrollerPosition(Orientation orientation, float f) {
        C12775o.m28639i(orientation, "initialOrientation");
        this.offset$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(f), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.maximum$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), (SnapshotMutationPolicy) null, 2, (Object) null);
        this.previousCursorRect = Rect.Companion.getZero();
        this.previousSelection = TextRange.Companion.m37980getZerod9O1mEE();
        this.orientation$delegate = SnapshotStateKt.mutableStateOf(orientation, SnapshotStateKt.structuralEqualityPolicy());
    }

    private final void setMaximum(float f) {
        this.maximum$delegate.setValue(Float.valueOf(f));
    }

    public final void coerceOffset$foundation_release(float f, float f2, int i) {
        float f3;
        int i2;
        float offset = getOffset();
        float f4 = (float) i;
        float f5 = offset + f4;
        if (f2 > f5 || (f < offset && f2 - f > f4)) {
            f3 = f2 - f5;
        } else if (i2 >= 0 || f2 - f > f4) {
            f3 = 0.0f;
        } else {
            f3 = f - offset;
        }
        setOffset(getOffset() + f3);
    }

    public final float getMaximum() {
        return ((Number) this.maximum$delegate.getValue()).floatValue();
    }

    public final float getOffset() {
        return ((Number) this.offset$delegate.getValue()).floatValue();
    }

    /* renamed from: getOffsetToFollow-5zc-tL8  reason: not valid java name */
    public final int m33726getOffsetToFollow5zctL8(long j) {
        if (TextRange.m37975getStartimpl(j) != TextRange.m37975getStartimpl(this.previousSelection)) {
            return TextRange.m37975getStartimpl(j);
        }
        if (TextRange.m37970getEndimpl(j) != TextRange.m37970getEndimpl(this.previousSelection)) {
            return TextRange.m37970getEndimpl(j);
        }
        return TextRange.m37973getMinimpl(j);
    }

    public final Orientation getOrientation() {
        return (Orientation) this.orientation$delegate.getValue();
    }

    /* renamed from: getPreviousSelection-d9O1mEE  reason: not valid java name */
    public final long m33727getPreviousSelectiond9O1mEE() {
        return this.previousSelection;
    }

    public final void setOffset(float f) {
        this.offset$delegate.setValue(Float.valueOf(f));
    }

    public final void setOrientation(Orientation orientation) {
        C12775o.m28639i(orientation, "<set-?>");
        this.orientation$delegate.setValue(orientation);
    }

    /* renamed from: setPreviousSelection-5zc-tL8  reason: not valid java name */
    public final void m33728setPreviousSelection5zctL8(long j) {
        this.previousSelection = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        if (r0 == false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void update(androidx.compose.foundation.gestures.Orientation r5, androidx.compose.p002ui.geometry.Rect r6, int r7, int r8) {
        /*
            r4 = this;
            java.lang.String r0 = "orientation"
            kotlin.jvm.internal.C12775o.m28639i(r5, r0)
            java.lang.String r0 = "cursorRect"
            kotlin.jvm.internal.C12775o.m28639i(r6, r0)
            int r8 = r8 - r7
            float r8 = (float) r8
            r4.setMaximum(r8)
            float r0 = r6.getLeft()
            androidx.compose.ui.geometry.Rect r1 = r4.previousCursorRect
            float r1 = r1.getLeft()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0021
            r0 = r1
            goto L_0x0022
        L_0x0021:
            r0 = r2
        L_0x0022:
            if (r0 == 0) goto L_0x0037
            float r0 = r6.getTop()
            androidx.compose.ui.geometry.Rect r3 = r4.previousCursorRect
            float r3 = r3.getTop()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0034
            r0 = r1
            goto L_0x0035
        L_0x0034:
            r0 = r2
        L_0x0035:
            if (r0 != 0) goto L_0x0058
        L_0x0037:
            androidx.compose.foundation.gestures.Orientation r0 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r5 != r0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r1 = r2
        L_0x003d:
            if (r1 == 0) goto L_0x0044
            float r5 = r6.getTop()
            goto L_0x0048
        L_0x0044:
            float r5 = r6.getLeft()
        L_0x0048:
            if (r1 == 0) goto L_0x004f
            float r0 = r6.getBottom()
            goto L_0x0053
        L_0x004f:
            float r0 = r6.getRight()
        L_0x0053:
            r4.coerceOffset$foundation_release(r5, r0, r7)
            r4.previousCursorRect = r6
        L_0x0058:
            float r5 = r4.getOffset()
            r6 = 0
            float r5 = p436tf.C13537l.m30885l(r5, r6, r8)
            r4.setOffset(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldScrollerPosition.update(androidx.compose.foundation.gestures.Orientation, androidx.compose.ui.geometry.Rect, int, int):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TextFieldScrollerPosition(Orientation orientation, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(orientation, (i & 2) != 0 ? 0.0f : f);
    }

    public TextFieldScrollerPosition() {
        this(Orientation.Vertical, 0.0f, 2, (DefaultConstructorMarker) null);
    }
}
