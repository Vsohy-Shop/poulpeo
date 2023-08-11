package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.layout.OnRemeasuredModifier */
/* compiled from: OnRemeasuredModifier.kt */
public interface OnRemeasuredModifier extends Modifier.Element {

    /* renamed from: androidx.compose.ui.layout.OnRemeasuredModifier$DefaultImpls */
    /* compiled from: OnRemeasuredModifier.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(OnRemeasuredModifier onRemeasuredModifier, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return OnRemeasuredModifier.super.all(function1);
        }

        @Deprecated
        public static boolean any(OnRemeasuredModifier onRemeasuredModifier, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return OnRemeasuredModifier.super.any(function1);
        }

        @Deprecated
        public static <R> R foldIn(OnRemeasuredModifier onRemeasuredModifier, R r, C13088o<? super R, ? super Modifier.Element, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return OnRemeasuredModifier.super.foldIn(r, oVar);
        }

        @Deprecated
        public static <R> R foldOut(OnRemeasuredModifier onRemeasuredModifier, R r, C13088o<? super Modifier.Element, ? super R, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return OnRemeasuredModifier.super.foldOut(r, oVar);
        }

        @Deprecated
        public static Modifier then(OnRemeasuredModifier onRemeasuredModifier, Modifier modifier) {
            C12775o.m28639i(modifier, "other");
            return OnRemeasuredModifier.super.then(modifier);
        }
    }

    /* renamed from: onRemeasured-ozmzZPI  reason: not valid java name */
    void m37395onRemeasuredozmzZPI(long j);
}
