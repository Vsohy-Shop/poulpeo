package androidx.compose.foundation;

import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.unit.Velocity;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@ExperimentalFoundationApi
@Stable
/* compiled from: Overscroll.kt */
public interface OverscrollEffect {
    /* renamed from: applyToFling-BMRW4eQ  reason: not valid java name */
    Object m33026applyToFlingBMRW4eQ(long j, C13088o<? super Velocity, ? super C12074d<? super Velocity>, ? extends Object> oVar, C12074d<? super C11921v> dVar);

    /* renamed from: applyToScroll-Rhakbz0  reason: not valid java name */
    long m33027applyToScrollRhakbz0(long j, int i, Function1<? super Offset, Offset> function1);

    Modifier getEffectModifier();

    boolean isInProgress();
}
