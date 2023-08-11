package androidx.compose.p002ui.input.pointer;

import android.os.SystemClock;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.PointerInteropFilter;
import androidx.compose.p002ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,350:1\n101#2,2:351\n33#2,6:353\n103#2:359\n86#2,2:360\n33#2,6:362\n88#2:368\n101#2,2:369\n33#2,6:371\n103#2:377\n33#2,6:378\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1\n*L\n223#1:351,2\n223#1:353,6\n223#1:359\n238#1:360,2\n238#1:362,6\n238#1:368\n280#1:369,2\n280#1:371,6\n280#1:377\n314#1:378,6\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1 */
/* compiled from: PointerInteropFilter.android.kt */
public final class PointerInteropFilter$pointerInputFilter$1 extends PointerInputFilter {
    /* access modifiers changed from: private */
    public PointerInteropFilter.DispatchToViewState state = PointerInteropFilter.DispatchToViewState.Unknown;
    final /* synthetic */ PointerInteropFilter this$0;

    PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter pointerInteropFilter) {
        this.this$0 = pointerInteropFilter;
    }

    private final void dispatchToView(PointerEvent pointerEvent) {
        boolean z;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            } else if (changes.get(i).isConsumed()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
                LayoutCoordinates layoutCoordinates$ui_release = getLayoutCoordinates$ui_release();
                if (layoutCoordinates$ui_release != null) {
                    PointerInteropUtils_androidKt.m37228toCancelMotionEventScoped4ec7I(pointerEvent, layoutCoordinates$ui_release.m37343localToRootMKHz9U(Offset.Companion.m35438getZeroF1C5BW0()), new PointerInteropFilter$pointerInputFilter$1$dispatchToView$2(this.this$0));
                } else {
                    throw new IllegalStateException("layoutCoordinates not set".toString());
                }
            }
            this.state = PointerInteropFilter.DispatchToViewState.NotDispatching;
            return;
        }
        LayoutCoordinates layoutCoordinates$ui_release2 = getLayoutCoordinates$ui_release();
        if (layoutCoordinates$ui_release2 != null) {
            PointerInteropUtils_androidKt.m37229toMotionEventScoped4ec7I(pointerEvent, layoutCoordinates$ui_release2.m37343localToRootMKHz9U(Offset.Companion.m35438getZeroF1C5BW0()), new PointerInteropFilter$pointerInputFilter$1$dispatchToView$3(this, this.this$0));
            if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
                int size2 = changes.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    changes.get(i2).consume();
                }
                InternalPointerEvent internalPointerEvent$ui_release = pointerEvent.getInternalPointerEvent$ui_release();
                if (internalPointerEvent$ui_release != null) {
                    internalPointerEvent$ui_release.setSuppressMovementConsumption(!this.this$0.getDisallowIntercept$ui_release());
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("layoutCoordinates not set".toString());
    }

    private final void reset() {
        this.state = PointerInteropFilter.DispatchToViewState.Unknown;
        this.this$0.setDisallowIntercept$ui_release(false);
    }

    public boolean getShareWithSiblings() {
        return true;
    }

    public void onCancel() {
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            PointerInteropUtils_androidKt.emptyCancelMotionEventScope(SystemClock.uptimeMillis(), new PointerInteropFilter$pointerInputFilter$1$onCancel$1(this.this$0));
            reset();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* renamed from: onPointerEvent-H0pRuoY  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m37227onPointerEventH0pRuoY(androidx.compose.p002ui.input.pointer.PointerEvent r6, androidx.compose.p002ui.input.pointer.PointerEventPass r7, long r8) {
        /*
            r5 = this;
            java.lang.String r8 = "pointerEvent"
            kotlin.jvm.internal.C12775o.m28639i(r6, r8)
            java.lang.String r8 = "pass"
            kotlin.jvm.internal.C12775o.m28639i(r7, r8)
            java.util.List r8 = r6.getChanges()
            androidx.compose.ui.input.pointer.PointerInteropFilter r9 = r5.this$0
            boolean r9 = r9.getDisallowIntercept$ui_release()
            r0 = 0
            r1 = 1
            if (r9 != 0) goto L_0x0042
            int r9 = r8.size()
            r2 = r0
        L_0x001d:
            if (r2 >= r9) goto L_0x003c
            java.lang.Object r3 = r8.get(r2)
            androidx.compose.ui.input.pointer.PointerInputChange r3 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r3
            boolean r4 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(r3)
            if (r4 != 0) goto L_0x0034
            boolean r3 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r3)
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r3 = r0
            goto L_0x0035
        L_0x0034:
            r3 = r1
        L_0x0035:
            if (r3 == 0) goto L_0x0039
            r9 = r1
            goto L_0x003d
        L_0x0039:
            int r2 = r2 + 1
            goto L_0x001d
        L_0x003c:
            r9 = r0
        L_0x003d:
            if (r9 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r9 = r0
            goto L_0x0043
        L_0x0042:
            r9 = r1
        L_0x0043:
            androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState r2 = r5.state
            androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState r3 = androidx.compose.p002ui.input.pointer.PointerInteropFilter.DispatchToViewState.NotDispatching
            if (r2 == r3) goto L_0x005b
            androidx.compose.ui.input.pointer.PointerEventPass r2 = androidx.compose.p002ui.input.pointer.PointerEventPass.Initial
            if (r7 != r2) goto L_0x0052
            if (r9 == 0) goto L_0x0052
            r5.dispatchToView(r6)
        L_0x0052:
            androidx.compose.ui.input.pointer.PointerEventPass r2 = androidx.compose.p002ui.input.pointer.PointerEventPass.Final
            if (r7 != r2) goto L_0x005b
            if (r9 != 0) goto L_0x005b
            r5.dispatchToView(r6)
        L_0x005b:
            androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.p002ui.input.pointer.PointerEventPass.Final
            if (r7 != r6) goto L_0x007c
            int r6 = r8.size()
            r7 = r0
        L_0x0064:
            if (r7 >= r6) goto L_0x0076
            java.lang.Object r9 = r8.get(r7)
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.p002ui.input.pointer.PointerInputChange) r9
            boolean r9 = androidx.compose.p002ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r9)
            if (r9 != 0) goto L_0x0073
            goto L_0x0077
        L_0x0073:
            int r7 = r7 + 1
            goto L_0x0064
        L_0x0076:
            r0 = r1
        L_0x0077:
            if (r0 == 0) goto L_0x007c
            r5.reset()
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.input.pointer.PointerInteropFilter$pointerInputFilter$1.m37227onPointerEventH0pRuoY(androidx.compose.ui.input.pointer.PointerEvent, androidx.compose.ui.input.pointer.PointerEventPass, long):void");
    }
}
