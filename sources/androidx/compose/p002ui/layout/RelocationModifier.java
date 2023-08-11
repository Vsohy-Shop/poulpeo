package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.ExperimentalComposeUiApi;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.geometry.Rect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;

@ExperimentalComposeUiApi
/* renamed from: androidx.compose.ui.layout.RelocationModifier */
/* compiled from: RelocationModifier.kt */
public interface RelocationModifier extends Modifier.Element {

    /* renamed from: androidx.compose.ui.layout.RelocationModifier$DefaultImpls */
    /* compiled from: RelocationModifier.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(RelocationModifier relocationModifier, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return RelocationModifier.super.all(function1);
        }

        @Deprecated
        public static boolean any(RelocationModifier relocationModifier, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return RelocationModifier.super.any(function1);
        }

        @Deprecated
        public static <R> R foldIn(RelocationModifier relocationModifier, R r, C13088o<? super R, ? super Modifier.Element, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return RelocationModifier.super.foldIn(r, oVar);
        }

        @Deprecated
        public static <R> R foldOut(RelocationModifier relocationModifier, R r, C13088o<? super Modifier.Element, ? super R, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return RelocationModifier.super.foldOut(r, oVar);
        }

        @Deprecated
        public static Modifier then(RelocationModifier relocationModifier, Modifier modifier) {
            C12775o.m28639i(modifier, "other");
            return RelocationModifier.super.then(modifier);
        }
    }

    Rect computeDestination(Rect rect, LayoutCoordinates layoutCoordinates);

    Object performRelocation(Rect rect, Rect rect2, C12074d<? super C11921v> dVar);
}
