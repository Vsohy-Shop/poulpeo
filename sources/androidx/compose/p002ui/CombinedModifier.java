package androidx.compose.p002ui;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p404of.C13088o;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.CombinedModifier */
/* compiled from: Modifier.kt */
public final class CombinedModifier implements Modifier {
    public static final int $stable = 0;
    private final Modifier inner;
    private final Modifier outer;

    public CombinedModifier(Modifier modifier, Modifier modifier2) {
        C12775o.m28639i(modifier, "outer");
        C12775o.m28639i(modifier2, "inner");
        this.outer = modifier;
        this.inner = modifier2;
    }

    public boolean all(Function1<? super Modifier.Element, Boolean> function1) {
        C12775o.m28639i(function1, "predicate");
        if (!this.outer.all(function1) || !this.inner.all(function1)) {
            return false;
        }
        return true;
    }

    public boolean any(Function1<? super Modifier.Element, Boolean> function1) {
        C12775o.m28639i(function1, "predicate");
        if (this.outer.any(function1) || this.inner.any(function1)) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof CombinedModifier) {
            CombinedModifier combinedModifier = (CombinedModifier) obj;
            if (!C12775o.m28634d(this.outer, combinedModifier.outer) || !C12775o.m28634d(this.inner, combinedModifier.inner)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public <R> R foldIn(R r, C13088o<? super R, ? super Modifier.Element, ? extends R> oVar) {
        C12775o.m28639i(oVar, "operation");
        return this.inner.foldIn(this.outer.foldIn(r, oVar), oVar);
    }

    public <R> R foldOut(R r, C13088o<? super Modifier.Element, ? super R, ? extends R> oVar) {
        C12775o.m28639i(oVar, "operation");
        return this.outer.foldOut(this.inner.foldOut(r, oVar), oVar);
    }

    public final Modifier getInner$ui_release() {
        return this.inner;
    }

    public final Modifier getOuter$ui_release() {
        return this.outer;
    }

    public int hashCode() {
        return this.outer.hashCode() + (this.inner.hashCode() * 31);
    }

    public String toString() {
        return '[' + ((String) foldIn("", CombinedModifier$toString$1.INSTANCE)) + ']';
    }
}
