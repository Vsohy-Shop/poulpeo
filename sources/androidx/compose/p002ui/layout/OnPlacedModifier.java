package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.layout.OnPlacedModifier */
/* compiled from: OnPlacedModifier.kt */
public interface OnPlacedModifier extends Modifier.Element {

    /* renamed from: androidx.compose.ui.layout.OnPlacedModifier$DefaultImpls */
    /* compiled from: OnPlacedModifier.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(OnPlacedModifier onPlacedModifier, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return OnPlacedModifier.super.all(function1);
        }

        @Deprecated
        public static boolean any(OnPlacedModifier onPlacedModifier, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return OnPlacedModifier.super.any(function1);
        }

        @Deprecated
        public static <R> R foldIn(OnPlacedModifier onPlacedModifier, R r, C13088o<? super R, ? super Modifier.Element, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return OnPlacedModifier.super.foldIn(r, oVar);
        }

        @Deprecated
        public static <R> R foldOut(OnPlacedModifier onPlacedModifier, R r, C13088o<? super Modifier.Element, ? super R, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return OnPlacedModifier.super.foldOut(r, oVar);
        }

        @Deprecated
        public static Modifier then(OnPlacedModifier onPlacedModifier, Modifier modifier) {
            C12775o.m28639i(modifier, "other");
            return OnPlacedModifier.super.then(modifier);
        }
    }

    void onPlaced(LayoutCoordinates layoutCoordinates);
}
