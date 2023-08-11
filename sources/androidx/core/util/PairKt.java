package androidx.core.util;

import android.util.Pair;
import kotlin.jvm.internal.C12775o;
import p336ef.C11906l;

/* compiled from: Pair.kt */
public final class PairKt {
    public static final <F, S> F component1(Pair<F, S> pair) {
        C12775o.m28639i(pair, "<this>");
        return pair.first;
    }

    public static final <F, S> S component2(Pair<F, S> pair) {
        C12775o.m28639i(pair, "<this>");
        return pair.second;
    }

    public static final <F, S> Pair<F, S> toAndroidPair(C11906l<? extends F, ? extends S> lVar) {
        C12775o.m28639i(lVar, "<this>");
        return new Pair<>(lVar.mo49111c(), lVar.mo49112d());
    }

    public static final <F, S> Pair<F, S> toAndroidXPair(C11906l<? extends F, ? extends S> lVar) {
        C12775o.m28639i(lVar, "<this>");
        return new Pair<>(lVar.mo49111c(), lVar.mo49112d());
    }

    public static final <F, S> C11906l<F, S> toKotlinPair(Pair<F, S> pair) {
        C12775o.m28639i(pair, "<this>");
        return new C11906l<>(pair.first, pair.second);
    }

    public static final <F, S> F component1(Pair<F, S> pair) {
        C12775o.m28639i(pair, "<this>");
        return pair.first;
    }

    public static final <F, S> S component2(Pair<F, S> pair) {
        C12775o.m28639i(pair, "<this>");
        return pair.second;
    }

    public static final <F, S> C11906l<F, S> toKotlinPair(Pair<F, S> pair) {
        C12775o.m28639i(pair, "<this>");
        return new C11906l<>(pair.first, pair.second);
    }
}
