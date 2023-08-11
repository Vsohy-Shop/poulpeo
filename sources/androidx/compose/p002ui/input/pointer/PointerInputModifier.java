package androidx.compose.p002ui.input.pointer;

import androidx.compose.p002ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.input.pointer.PointerInputModifier */
/* compiled from: PointerEvent.kt */
public interface PointerInputModifier extends Modifier.Element {

    /* renamed from: androidx.compose.ui.input.pointer.PointerInputModifier$DefaultImpls */
    /* compiled from: PointerEvent.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(PointerInputModifier pointerInputModifier, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return PointerInputModifier.super.all(function1);
        }

        @Deprecated
        public static boolean any(PointerInputModifier pointerInputModifier, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return PointerInputModifier.super.any(function1);
        }

        @Deprecated
        public static <R> R foldIn(PointerInputModifier pointerInputModifier, R r, C13088o<? super R, ? super Modifier.Element, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return PointerInputModifier.super.foldIn(r, oVar);
        }

        @Deprecated
        public static <R> R foldOut(PointerInputModifier pointerInputModifier, R r, C13088o<? super Modifier.Element, ? super R, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return PointerInputModifier.super.foldOut(r, oVar);
        }

        @Deprecated
        public static Modifier then(PointerInputModifier pointerInputModifier, Modifier modifier) {
            C12775o.m28639i(modifier, "other");
            return PointerInputModifier.super.then(modifier);
        }
    }

    PointerInputFilter getPointerInputFilter();
}
