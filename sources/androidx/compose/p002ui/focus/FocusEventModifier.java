package androidx.compose.p002ui.focus;

import androidx.compose.p002ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.focus.FocusEventModifier */
/* compiled from: FocusEventModifier.kt */
public interface FocusEventModifier extends Modifier.Element {

    /* renamed from: androidx.compose.ui.focus.FocusEventModifier$DefaultImpls */
    /* compiled from: FocusEventModifier.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(FocusEventModifier focusEventModifier, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return FocusEventModifier.super.all(function1);
        }

        @Deprecated
        public static boolean any(FocusEventModifier focusEventModifier, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return FocusEventModifier.super.any(function1);
        }

        @Deprecated
        public static <R> R foldIn(FocusEventModifier focusEventModifier, R r, C13088o<? super R, ? super Modifier.Element, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return FocusEventModifier.super.foldIn(r, oVar);
        }

        @Deprecated
        public static <R> R foldOut(FocusEventModifier focusEventModifier, R r, C13088o<? super Modifier.Element, ? super R, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return FocusEventModifier.super.foldOut(r, oVar);
        }

        @Deprecated
        public static Modifier then(FocusEventModifier focusEventModifier, Modifier modifier) {
            C12775o.m28639i(modifier, "other");
            return FocusEventModifier.super.then(modifier);
        }
    }

    void onFocusEvent(FocusState focusState);
}
