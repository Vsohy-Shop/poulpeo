package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.focus.FocusOrderModifier */
/* compiled from: FocusOrderModifier.kt */
public interface FocusOrderModifier extends Modifier.Element {

    /* renamed from: androidx.compose.ui.focus.FocusOrderModifier$DefaultImpls */
    /* compiled from: FocusOrderModifier.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(FocusOrderModifier focusOrderModifier, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return FocusOrderModifier.super.all(function1);
        }

        @Deprecated
        public static boolean any(FocusOrderModifier focusOrderModifier, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return FocusOrderModifier.super.any(function1);
        }

        @Deprecated
        public static <R> R foldIn(FocusOrderModifier focusOrderModifier, R r, C13088o<? super R, ? super Modifier.Element, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return FocusOrderModifier.super.foldIn(r, oVar);
        }

        @Deprecated
        public static <R> R foldOut(FocusOrderModifier focusOrderModifier, R r, C13088o<? super Modifier.Element, ? super R, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return FocusOrderModifier.super.foldOut(r, oVar);
        }

        @Deprecated
        public static Modifier then(FocusOrderModifier focusOrderModifier, Modifier modifier) {
            C12775o.m28639i(modifier, "other");
            return FocusOrderModifier.super.then(modifier);
        }
    }

    void populateFocusOrder(FocusOrder focusOrder);
}
