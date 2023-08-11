package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.layout.OnGloballyPositionedModifier */
/* compiled from: OnGloballyPositionedModifier.kt */
public interface OnGloballyPositionedModifier extends Modifier.Element {

    /* renamed from: androidx.compose.ui.layout.OnGloballyPositionedModifier$DefaultImpls */
    /* compiled from: OnGloballyPositionedModifier.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(OnGloballyPositionedModifier onGloballyPositionedModifier, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return OnGloballyPositionedModifier.super.all(function1);
        }

        @Deprecated
        public static boolean any(OnGloballyPositionedModifier onGloballyPositionedModifier, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return OnGloballyPositionedModifier.super.any(function1);
        }

        @Deprecated
        public static <R> R foldIn(OnGloballyPositionedModifier onGloballyPositionedModifier, R r, C13088o<? super R, ? super Modifier.Element, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return OnGloballyPositionedModifier.super.foldIn(r, oVar);
        }

        @Deprecated
        public static <R> R foldOut(OnGloballyPositionedModifier onGloballyPositionedModifier, R r, C13088o<? super Modifier.Element, ? super R, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return OnGloballyPositionedModifier.super.foldOut(r, oVar);
        }

        @Deprecated
        public static Modifier then(OnGloballyPositionedModifier onGloballyPositionedModifier, Modifier modifier) {
            C12775o.m28639i(modifier, "other");
            return OnGloballyPositionedModifier.super.then(modifier);
        }
    }

    void onGloballyPositioned(LayoutCoordinates layoutCoordinates);
}
