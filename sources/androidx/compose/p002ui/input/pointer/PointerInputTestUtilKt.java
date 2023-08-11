package androidx.compose.p002ui.input.pointer;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.unit.IntSize;
import androidx.compose.p002ui.unit.IntSizeKt;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p336ef.C11921v;
import p404of.C13089p;

@SourceDebugExtension({"SMAP\nPointerInputTestUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputTestUtil.kt\nandroidx/compose/ui/input/pointer/PointerInputTestUtilKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,148:1\n33#2,6:149\n*S KotlinDebug\n*F\n+ 1 PointerInputTestUtil.kt\nandroidx/compose/ui/input/pointer/PointerInputTestUtilKt\n*L\n144#1:149,6\n*E\n"})
/* renamed from: androidx.compose.ui.input.pointer.PointerInputTestUtilKt */
/* compiled from: PointerInputTestUtil.kt */
public final class PointerInputTestUtilKt {
    public static final PointerInputChange down(long j, long j2, float f, float f2) {
        return new PointerInputChange(PointerId.m37152constructorimpl(j), j2, OffsetKt.Offset(f, f2), true, 1.0f, j2, OffsetKt.Offset(f, f2), false, false, 0, 0, 1536, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PointerInputChange down$default(long j, long j2, float f, float f2, int i, Object obj) {
        float f3;
        float f4;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long j3 = j2;
        if ((i & 4) != 0) {
            f3 = 0.0f;
        } else {
            f3 = f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        } else {
            f4 = f2;
        }
        return down(j, j3, f3, f4);
    }

    /* renamed from: invokeOverAllPasses-H0pRuoY  reason: not valid java name */
    public static final void m37219invokeOverAllPassesH0pRuoY(C13089p<? super PointerEvent, ? super PointerEventPass, ? super IntSize, C11921v> pVar, PointerEvent pointerEvent, long j) {
        C12775o.m28639i(pVar, "$this$invokeOverAllPasses");
        C12775o.m28639i(pointerEvent, "pointerEvent");
        m37223invokeOverPasseshUlJWOE(pVar, pointerEvent, (List<? extends PointerEventPass>) C12726w.m28527n(PointerEventPass.Initial, PointerEventPass.Main, PointerEventPass.Final), j);
    }

    /* renamed from: invokeOverAllPasses-H0pRuoY$default  reason: not valid java name */
    public static /* synthetic */ void m37220invokeOverAllPassesH0pRuoY$default(C13089p pVar, PointerEvent pointerEvent, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m37219invokeOverAllPassesH0pRuoY(pVar, pointerEvent, j);
    }

    /* renamed from: invokeOverPass-hUlJWOE  reason: not valid java name */
    public static final void m37221invokeOverPasshUlJWOE(C13089p<? super PointerEvent, ? super PointerEventPass, ? super IntSize, C11921v> pVar, PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j) {
        C12775o.m28639i(pVar, "$this$invokeOverPass");
        C12775o.m28639i(pointerEvent, "pointerEvent");
        C12775o.m28639i(pointerEventPass, "pointerEventPass");
        m37223invokeOverPasseshUlJWOE(pVar, pointerEvent, (List<? extends PointerEventPass>) C12723v.m28509d(pointerEventPass), j);
    }

    /* renamed from: invokeOverPass-hUlJWOE$default  reason: not valid java name */
    public static /* synthetic */ void m37222invokeOverPasshUlJWOE$default(C13089p pVar, PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m37221invokeOverPasshUlJWOE(pVar, pointerEvent, pointerEventPass, j);
    }

    /* renamed from: invokeOverPasses-hUlJWOE  reason: not valid java name */
    public static final void m37224invokeOverPasseshUlJWOE(C13089p<? super PointerEvent, ? super PointerEventPass, ? super IntSize, C11921v> pVar, PointerEvent pointerEvent, PointerEventPass[] pointerEventPassArr, long j) {
        C12775o.m28639i(pVar, "$this$invokeOverPasses");
        C12775o.m28639i(pointerEvent, "pointerEvent");
        C12775o.m28639i(pointerEventPassArr, "pointerEventPasses");
        m37223invokeOverPasseshUlJWOE(pVar, pointerEvent, (List<? extends PointerEventPass>) C12710p.m28405g0(pointerEventPassArr), j);
    }

    /* renamed from: invokeOverPasses-hUlJWOE$default  reason: not valid java name */
    public static /* synthetic */ void m37226invokeOverPasseshUlJWOE$default(C13089p pVar, PointerEvent pointerEvent, PointerEventPass[] pointerEventPassArr, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m37224invokeOverPasseshUlJWOE((C13089p<? super PointerEvent, ? super PointerEventPass, ? super IntSize, C11921v>) pVar, pointerEvent, pointerEventPassArr, j);
    }

    public static final PointerInputChange moveBy(PointerInputChange pointerInputChange, long j, float f, float f2) {
        C12775o.m28639i(pointerInputChange, "<this>");
        long r3 = pointerInputChange.m37168getIdJ3iCeTQ();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(r3, pointerInputChange.getUptimeMillis() + j, OffsetKt.Offset(Offset.m35422getXimpl(pointerInputChange.m37169getPositionF1C5BW0()) + f, Offset.m35423getYimpl(pointerInputChange.m37169getPositionF1C5BW0()) + f2), true, 1.0f, uptimeMillis, pointerInputChange.m37169getPositionF1C5BW0(), pressed, false, 0, 0, 1536, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PointerInputChange moveBy$default(PointerInputChange pointerInputChange, long j, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        return moveBy(pointerInputChange, j, f, f2);
    }

    public static final PointerInputChange moveTo(PointerInputChange pointerInputChange, long j, float f, float f2) {
        C12775o.m28639i(pointerInputChange, "<this>");
        long r1 = pointerInputChange.m37168getIdJ3iCeTQ();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(r1, j, OffsetKt.Offset(f, f2), true, 1.0f, uptimeMillis, pointerInputChange.m37169getPositionF1C5BW0(), pressed, false, 0, 0, 1536, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PointerInputChange moveTo$default(PointerInputChange pointerInputChange, long j, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        return moveTo(pointerInputChange, j, f, f2);
    }

    /* renamed from: up */
    public static final PointerInputChange m605up(PointerInputChange pointerInputChange, long j) {
        C12775o.m28639i(pointerInputChange, "<this>");
        long r1 = pointerInputChange.m37168getIdJ3iCeTQ();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(r1, j, pointerInputChange.m37169getPositionF1C5BW0(), false, 1.0f, uptimeMillis, pointerInputChange.m37169getPositionF1C5BW0(), pressed, false, 0, 0, 1536, (DefaultConstructorMarker) null);
    }

    /* renamed from: invokeOverPasses-hUlJWOE  reason: not valid java name */
    public static final void m37223invokeOverPasseshUlJWOE(C13089p<? super PointerEvent, ? super PointerEventPass, ? super IntSize, C11921v> pVar, PointerEvent pointerEvent, List<? extends PointerEventPass> list, long j) {
        C12775o.m28639i(pVar, "$this$invokeOverPasses");
        C12775o.m28639i(pointerEvent, "pointerEvent");
        C12775o.m28639i(list, "pointerEventPasses");
        if (!(!pointerEvent.getChanges().isEmpty())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!list.isEmpty()) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                pVar.invoke(pointerEvent, (PointerEventPass) list.get(i), IntSize.m38620boximpl(j));
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: invokeOverPasses-hUlJWOE$default  reason: not valid java name */
    public static /* synthetic */ void m37225invokeOverPasseshUlJWOE$default(C13089p pVar, PointerEvent pointerEvent, List list, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m37223invokeOverPasseshUlJWOE((C13089p<? super PointerEvent, ? super PointerEventPass, ? super IntSize, C11921v>) pVar, pointerEvent, (List<? extends PointerEventPass>) list, j);
    }
}
