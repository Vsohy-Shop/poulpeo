package androidx.compose.p002ui.platform;

import kotlin.jvm.internal.C12777p;
import p336ef.C11921v;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendScrollEventIfNeeded$1 */
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
final class C1077x595e4e0d extends C12777p implements C13074a<C11921v> {
    final /* synthetic */ ScrollObservationScope $scrollObservationScope;
    final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1077x595e4e0d(ScrollObservationScope scrollObservationScope, AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        super(0);
        this.$scrollObservationScope = scrollObservationScope;
        this.this$0 = androidComposeViewAccessibilityDelegateCompat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        if (r6 == false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke() {
        /*
            r15 = this;
            androidx.compose.ui.platform.ScrollObservationScope r0 = r15.$scrollObservationScope
            androidx.compose.ui.semantics.ScrollAxisRange r0 = r0.getHorizontalScrollAxisRange()
            androidx.compose.ui.platform.ScrollObservationScope r1 = r15.$scrollObservationScope
            androidx.compose.ui.semantics.ScrollAxisRange r1 = r1.getVerticalScrollAxisRange()
            androidx.compose.ui.platform.ScrollObservationScope r2 = r15.$scrollObservationScope
            java.lang.Float r2 = r2.getOldXValue()
            androidx.compose.ui.platform.ScrollObservationScope r3 = r15.$scrollObservationScope
            java.lang.Float r3 = r3.getOldYValue()
            r4 = 0
            if (r0 == 0) goto L_0x0031
            if (r2 == 0) goto L_0x0031
            of.a r5 = r0.getValue()
            java.lang.Object r5 = r5.invoke()
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            float r2 = r2.floatValue()
            float r5 = r5 - r2
            goto L_0x0032
        L_0x0031:
            r5 = r4
        L_0x0032:
            if (r1 == 0) goto L_0x004a
            if (r3 == 0) goto L_0x004a
            of.a r2 = r1.getValue()
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r3 = r3.floatValue()
            float r2 = r2 - r3
            goto L_0x004b
        L_0x004a:
            r2 = r4
        L_0x004b:
            int r3 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r3 != 0) goto L_0x0053
            r3 = r7
            goto L_0x0054
        L_0x0053:
            r3 = r6
        L_0x0054:
            if (r3 == 0) goto L_0x005d
            int r3 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x005b
            r6 = r7
        L_0x005b:
            if (r6 != 0) goto L_0x00dd
        L_0x005d:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r3 = r15.this$0
            androidx.compose.ui.platform.ScrollObservationScope r4 = r15.$scrollObservationScope
            int r4 = r4.getSemanticsNodeId()
            int r3 = r3.semanticsNodeIdToAccessibilityVirtualNodeId(r4)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r8 = r15.this$0
            r10 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r12 = 0
            r13 = 8
            r14 = 0
            r9 = r3
            androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView$default(r8, r9, r10, r11, r12, r13, r14)
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r4 = r15.this$0
            r6 = 4096(0x1000, float:5.74E-42)
            android.view.accessibility.AccessibilityEvent r3 = r4.createEvent$ui_release(r3, r6)
            if (r0 == 0) goto L_0x00a7
            of.a r4 = r0.getValue()
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r4 = (int) r4
            r3.setScrollX(r4)
            of.a r4 = r0.getMaxValue()
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r4 = (int) r4
            r3.setMaxScrollX(r4)
        L_0x00a7:
            if (r1 == 0) goto L_0x00cd
            of.a r4 = r1.getValue()
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r4 = (int) r4
            r3.setScrollY(r4)
            of.a r4 = r1.getMaxValue()
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r4 = (int) r4
            r3.setMaxScrollY(r4)
        L_0x00cd:
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 28
            if (r4 < r6) goto L_0x00d8
            int r4 = (int) r5
            int r2 = (int) r2
            androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat.Api28Impl.setScrollEventDelta(r3, r4, r2)
        L_0x00d8:
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r2 = r15.this$0
            boolean unused = r2.sendEvent(r3)
        L_0x00dd:
            if (r0 == 0) goto L_0x00ee
            androidx.compose.ui.platform.ScrollObservationScope r2 = r15.$scrollObservationScope
            of.a r0 = r0.getValue()
            java.lang.Object r0 = r0.invoke()
            java.lang.Float r0 = (java.lang.Float) r0
            r2.setOldXValue(r0)
        L_0x00ee:
            if (r1 == 0) goto L_0x00ff
            androidx.compose.ui.platform.ScrollObservationScope r0 = r15.$scrollObservationScope
            of.a r1 = r1.getValue()
            java.lang.Object r1 = r1.invoke()
            java.lang.Float r1 = (java.lang.Float) r1
            r0.setOldYValue(r1)
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.C1077x595e4e0d.invoke():void");
    }
}
