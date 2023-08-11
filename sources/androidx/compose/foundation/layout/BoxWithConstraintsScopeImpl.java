package androidx.compose.foundation.layout;

import androidx.compose.p002ui.Alignment;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.p002ui.unit.Constraints;
import androidx.compose.p002ui.unit.Density;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
/* compiled from: BoxWithConstraints.kt */
final class BoxWithConstraintsScopeImpl implements BoxWithConstraintsScope, BoxScope {
    private final /* synthetic */ BoxScopeInstance $$delegate_0;
    private final long constraints;
    private final Density density;

    public /* synthetic */ BoxWithConstraintsScopeImpl(Density density2, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(density2, j);
    }

    private final Density component1() {
        return this.density;
    }

    /* renamed from: copy-0kLqBqw$default  reason: not valid java name */
    public static /* synthetic */ BoxWithConstraintsScopeImpl m33227copy0kLqBqw$default(BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl, Density density2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            density2 = boxWithConstraintsScopeImpl.density;
        }
        if ((i & 2) != 0) {
            j = boxWithConstraintsScopeImpl.m33230getConstraintsmsEJaDk();
        }
        return boxWithConstraintsScopeImpl.m33229copy0kLqBqw(density2, j);
    }

    @Stable
    public Modifier align(Modifier modifier, Alignment alignment) {
        C12775o.m28639i(modifier, "<this>");
        C12775o.m28639i(alignment, "alignment");
        return this.$$delegate_0.align(modifier, alignment);
    }

    /* renamed from: component2-msEJaDk  reason: not valid java name */
    public final long m33228component2msEJaDk() {
        return m33230getConstraintsmsEJaDk();
    }

    /* renamed from: copy-0kLqBqw  reason: not valid java name */
    public final BoxWithConstraintsScopeImpl m33229copy0kLqBqw(Density density2, long j) {
        C12775o.m28639i(density2, "density");
        return new BoxWithConstraintsScopeImpl(density2, j, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxWithConstraintsScopeImpl)) {
            return false;
        }
        BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
        if (C12775o.m28634d(this.density, boxWithConstraintsScopeImpl.density) && Constraints.m38405equalsimpl0(m33230getConstraintsmsEJaDk(), boxWithConstraintsScopeImpl.m33230getConstraintsmsEJaDk())) {
            return true;
        }
        return false;
    }

    /* renamed from: getConstraints-msEJaDk  reason: not valid java name */
    public long m33230getConstraintsmsEJaDk() {
        return this.constraints;
    }

    /* renamed from: getMaxHeight-D9Ej5fM  reason: not valid java name */
    public float m33231getMaxHeightD9Ej5fM() {
        Density density2 = this.density;
        if (Constraints.m38407getHasBoundedHeightimpl(m33230getConstraintsmsEJaDk())) {
            return density2.m38446toDpu2uoSUM(Constraints.m38411getMaxHeightimpl(m33230getConstraintsmsEJaDk()));
        }
        return C1232Dp.Companion.m38487getInfinityD9Ej5fM();
    }

    /* renamed from: getMaxWidth-D9Ej5fM  reason: not valid java name */
    public float m33232getMaxWidthD9Ej5fM() {
        Density density2 = this.density;
        if (Constraints.m38408getHasBoundedWidthimpl(m33230getConstraintsmsEJaDk())) {
            return density2.m38446toDpu2uoSUM(Constraints.m38412getMaxWidthimpl(m33230getConstraintsmsEJaDk()));
        }
        return C1232Dp.Companion.m38487getInfinityD9Ej5fM();
    }

    /* renamed from: getMinHeight-D9Ej5fM  reason: not valid java name */
    public float m33233getMinHeightD9Ej5fM() {
        return this.density.m38446toDpu2uoSUM(Constraints.m38413getMinHeightimpl(m33230getConstraintsmsEJaDk()));
    }

    /* renamed from: getMinWidth-D9Ej5fM  reason: not valid java name */
    public float m33234getMinWidthD9Ej5fM() {
        return this.density.m38446toDpu2uoSUM(Constraints.m38414getMinWidthimpl(m33230getConstraintsmsEJaDk()));
    }

    public int hashCode() {
        return (this.density.hashCode() * 31) + Constraints.m38415hashCodeimpl(m33230getConstraintsmsEJaDk());
    }

    @Stable
    public Modifier matchParentSize(Modifier modifier) {
        C12775o.m28639i(modifier, "<this>");
        return this.$$delegate_0.matchParentSize(modifier);
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.density + ", constraints=" + Constraints.m38417toStringimpl(m33230getConstraintsmsEJaDk()) + ')';
    }

    private BoxWithConstraintsScopeImpl(Density density2, long j) {
        this.density = density2;
        this.constraints = j;
        this.$$delegate_0 = BoxScopeInstance.INSTANCE;
    }
}
