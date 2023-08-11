package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.focus.FocusRequesterModifier */
/* compiled from: FocusRequesterModifier.kt */
public interface FocusRequesterModifier extends Modifier.Element {

    /* renamed from: androidx.compose.ui.focus.FocusRequesterModifier$DefaultImpls */
    /* compiled from: FocusRequesterModifier.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(FocusRequesterModifier focusRequesterModifier, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return FocusRequesterModifier.super.all(function1);
        }

        @Deprecated
        public static boolean any(FocusRequesterModifier focusRequesterModifier, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return FocusRequesterModifier.super.any(function1);
        }

        @Deprecated
        public static <R> R foldIn(FocusRequesterModifier focusRequesterModifier, R r, C13088o<? super R, ? super Modifier.Element, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return FocusRequesterModifier.super.foldIn(r, oVar);
        }

        @Deprecated
        public static <R> R foldOut(FocusRequesterModifier focusRequesterModifier, R r, C13088o<? super Modifier.Element, ? super R, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return FocusRequesterModifier.super.foldOut(r, oVar);
        }

        @Deprecated
        public static Modifier then(FocusRequesterModifier focusRequesterModifier, Modifier modifier) {
            C12775o.m28639i(modifier, "other");
            return FocusRequesterModifier.super.then(modifier);
        }
    }

    FocusRequester getFocusRequester();
}
