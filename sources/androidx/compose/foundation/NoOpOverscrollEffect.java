package androidx.compose.foundation;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.unit.Velocity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

/* compiled from: Overscroll.kt */
public final class NoOpOverscrollEffect implements OverscrollEffect {
    public static final NoOpOverscrollEffect INSTANCE = new NoOpOverscrollEffect();

    private NoOpOverscrollEffect() {
    }

    /* renamed from: applyToFling-BMRW4eQ  reason: not valid java name */
    public Object m33023applyToFlingBMRW4eQ(long j, C13088o<? super Velocity, ? super C12074d<? super Velocity>, ? extends Object> oVar, C12074d<? super C11921v> dVar) {
        Object invoke = oVar.invoke(Velocity.m38684boximpl(j), dVar);
        if (invoke == C12150d.m26492c()) {
            return invoke;
        }
        return C11921v.f18618a;
    }

    /* renamed from: applyToScroll-Rhakbz0  reason: not valid java name */
    public long m33024applyToScrollRhakbz0(long j, int i, Function1<? super Offset, Offset> function1) {
        C12775o.m28639i(function1, "performScroll");
        return function1.invoke(Offset.m35411boximpl(j)).m35432unboximpl();
    }

    public Modifier getEffectModifier() {
        return Modifier.Companion;
    }

    public boolean isInProgress() {
        return false;
    }
}
