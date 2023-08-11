package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.input.pointer.PointerEvent;
import androidx.compose.p002ui.input.pointer.PointerInputChange;
import androidx.compose.p002ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13090q;

@SourceDebugExtension({"SMAP\nTransformGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,255:1\n132#2,3:256\n33#2,4:259\n135#2,2:263\n38#2:265\n137#2:266\n33#2,6:267\n33#2,6:273\n33#2,6:279\n*S KotlinDebug\n*F\n+ 1 TransformGestureDetector.kt\nandroidx/compose/foundation/gestures/TransformGestureDetectorKt\n*L\n116#1:256,3\n116#1:259,4\n116#1:263,2\n116#1:265\n116#1:266\n131#1:267,6\n216#1:273,6\n242#1:279,6\n*E\n"})
/* compiled from: TransformGestureDetector.kt */
public final class TransformGestureDetectorKt {
    /* renamed from: angle-k-4lQ0M  reason: not valid java name */
    private static final float m33150anglek4lQ0M(long j) {
        boolean z;
        boolean z2 = true;
        if (Offset.m35422getXimpl(j) == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (Offset.m35423getYimpl(j) != 0.0f) {
                z2 = false;
            }
            if (z2) {
                return 0.0f;
            }
        }
        return ((-((float) Math.atan2((double) Offset.m35422getXimpl(j), (double) Offset.m35423getYimpl(j)))) * 180.0f) / 3.1415927f;
    }

    public static final long calculateCentroid(PointerEvent pointerEvent, boolean z) {
        long j;
        C12775o.m28639i(pointerEvent, "<this>");
        long r0 = Offset.Companion.m35438getZeroF1C5BW0();
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = changes.get(i2);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                if (z) {
                    j = pointerInputChange.m37169getPositionF1C5BW0();
                } else {
                    j = pointerInputChange.m37170getPreviousPositionF1C5BW0();
                }
                r0 = Offset.m35427plusMKHz9U(r0, j);
                i++;
            }
        }
        if (i == 0) {
            return Offset.Companion.m35437getUnspecifiedF1C5BW0();
        }
        return Offset.m35417divtuRUvjQ(r0, (float) i);
    }

    public static /* synthetic */ long calculateCentroid$default(PointerEvent pointerEvent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return calculateCentroid(pointerEvent, z);
    }

    public static final float calculateCentroidSize(PointerEvent pointerEvent, boolean z) {
        long j;
        C12775o.m28639i(pointerEvent, "<this>");
        long calculateCentroid = calculateCentroid(pointerEvent, z);
        float f = 0.0f;
        if (Offset.m35419equalsimpl0(calculateCentroid, Offset.Companion.m35437getUnspecifiedF1C5BW0())) {
            return 0.0f;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = changes.get(i2);
            if (pointerInputChange.getPressed() && pointerInputChange.getPreviousPressed()) {
                if (z) {
                    j = pointerInputChange.m37169getPositionF1C5BW0();
                } else {
                    j = pointerInputChange.m37170getPreviousPositionF1C5BW0();
                }
                f += Offset.m35420getDistanceimpl(Offset.m35426minusMKHz9U(j, calculateCentroid));
                i++;
            }
        }
        return f / ((float) i);
    }

    public static /* synthetic */ float calculateCentroidSize$default(PointerEvent pointerEvent, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return calculateCentroidSize(pointerEvent, z);
    }

    public static final long calculatePan(PointerEvent pointerEvent) {
        C12775o.m28639i(pointerEvent, "<this>");
        long calculateCentroid = calculateCentroid(pointerEvent, true);
        Offset.Companion companion = Offset.Companion;
        if (Offset.m35419equalsimpl0(calculateCentroid, companion.m35437getUnspecifiedF1C5BW0())) {
            return companion.m35438getZeroF1C5BW0();
        }
        return Offset.m35426minusMKHz9U(calculateCentroid, calculateCentroid(pointerEvent, false));
    }

    public static final float calculateRotation(PointerEvent pointerEvent) {
        boolean z;
        PointerEvent pointerEvent2 = pointerEvent;
        C12775o.m28639i(pointerEvent2, "<this>");
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                break;
            }
            PointerInputChange pointerInputChange = changes.get(i);
            if (!pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) {
                i3 = 0;
            }
            i2 += i3;
            i++;
        }
        float f = 0.0f;
        if (i2 < 2) {
            return 0.0f;
        }
        long calculateCentroid = calculateCentroid(pointerEvent2, true);
        long calculateCentroid2 = calculateCentroid(pointerEvent2, false);
        List<PointerInputChange> changes2 = pointerEvent.getChanges();
        int size2 = changes2.size();
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i4 = 0;
        while (i4 < size2) {
            PointerInputChange pointerInputChange2 = changes2.get(i4);
            if (pointerInputChange2.getPressed() && pointerInputChange2.getPreviousPressed()) {
                long r13 = pointerInputChange2.m37169getPositionF1C5BW0();
                long r2 = Offset.m35426minusMKHz9U(pointerInputChange2.m37170getPreviousPositionF1C5BW0(), calculateCentroid2);
                long r12 = Offset.m35426minusMKHz9U(r13, calculateCentroid);
                float r15 = m33150anglek4lQ0M(r12) - m33150anglek4lQ0M(r2);
                float r22 = Offset.m35420getDistanceimpl(Offset.m35427plusMKHz9U(r12, r2)) / 2.0f;
                if (r15 > 180.0f) {
                    r15 -= 360.0f;
                } else if (r15 < -180.0f) {
                    r15 += 360.0f;
                }
                f3 += r15 * r22;
                f2 += r22;
            }
            i4++;
            f = 0.0f;
        }
        if (f2 == f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return f;
        }
        return f3 / f2;
    }

    public static final float calculateZoom(PointerEvent pointerEvent) {
        boolean z;
        C12775o.m28639i(pointerEvent, "<this>");
        boolean z2 = true;
        float calculateCentroidSize = calculateCentroidSize(pointerEvent, true);
        float calculateCentroidSize2 = calculateCentroidSize(pointerEvent, false);
        if (calculateCentroidSize == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 1.0f;
        }
        if (calculateCentroidSize2 != 0.0f) {
            z2 = false;
        }
        if (z2) {
            return 1.0f;
        }
        return calculateCentroidSize / calculateCentroidSize2;
    }

    public static final Object detectTransformGestures(PointerInputScope pointerInputScope, boolean z, C13090q<? super Offset, ? super Offset, ? super Float, ? super Float, C11921v> qVar, C12074d<? super C11921v> dVar) {
        Object awaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new TransformGestureDetectorKt$detectTransformGestures$2(z, qVar, (C12074d<? super TransformGestureDetectorKt$detectTransformGestures$2>) null), dVar);
        if (awaitEachGesture == C12150d.m26492c()) {
            return awaitEachGesture;
        }
        return C11921v.f18618a;
    }

    public static /* synthetic */ Object detectTransformGestures$default(PointerInputScope pointerInputScope, boolean z, C13090q qVar, C12074d dVar, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return detectTransformGestures(pointerInputScope, z, qVar, dVar);
    }
}
