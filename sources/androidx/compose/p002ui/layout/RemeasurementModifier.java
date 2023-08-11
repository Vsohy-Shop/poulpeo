package androidx.compose.p002ui.layout;

import androidx.compose.p002ui.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p404of.C13088o;

/* renamed from: androidx.compose.ui.layout.RemeasurementModifier */
/* compiled from: RemeasurementModifier.kt */
public interface RemeasurementModifier extends Modifier.Element {

    /* renamed from: androidx.compose.ui.layout.RemeasurementModifier$DefaultImpls */
    /* compiled from: RemeasurementModifier.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(RemeasurementModifier remeasurementModifier, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return RemeasurementModifier.super.all(function1);
        }

        @Deprecated
        public static boolean any(RemeasurementModifier remeasurementModifier, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return RemeasurementModifier.super.any(function1);
        }

        @Deprecated
        public static <R> R foldIn(RemeasurementModifier remeasurementModifier, R r, C13088o<? super R, ? super Modifier.Element, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return RemeasurementModifier.super.foldIn(r, oVar);
        }

        @Deprecated
        public static <R> R foldOut(RemeasurementModifier remeasurementModifier, R r, C13088o<? super Modifier.Element, ? super R, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return RemeasurementModifier.super.foldOut(r, oVar);
        }

        @Deprecated
        public static Modifier then(RemeasurementModifier remeasurementModifier, Modifier modifier) {
            C12775o.m28639i(modifier, "other");
            return RemeasurementModifier.super.then(modifier);
        }
    }

    void onRemeasurementAvailable(Remeasurement remeasurement);
}
