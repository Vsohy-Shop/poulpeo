package androidx.compose.p002ui.modifier;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p404of.C13088o;

@Stable
/* renamed from: androidx.compose.ui.modifier.ModifierLocalConsumer */
/* compiled from: ModifierLocalConsumer.kt */
public interface ModifierLocalConsumer extends Modifier.Element {

    /* renamed from: androidx.compose.ui.modifier.ModifierLocalConsumer$DefaultImpls */
    /* compiled from: ModifierLocalConsumer.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(ModifierLocalConsumer modifierLocalConsumer, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return ModifierLocalConsumer.super.all(function1);
        }

        @Deprecated
        public static boolean any(ModifierLocalConsumer modifierLocalConsumer, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return ModifierLocalConsumer.super.any(function1);
        }

        @Deprecated
        public static <R> R foldIn(ModifierLocalConsumer modifierLocalConsumer, R r, C13088o<? super R, ? super Modifier.Element, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return ModifierLocalConsumer.super.foldIn(r, oVar);
        }

        @Deprecated
        public static <R> R foldOut(ModifierLocalConsumer modifierLocalConsumer, R r, C13088o<? super Modifier.Element, ? super R, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return ModifierLocalConsumer.super.foldOut(r, oVar);
        }

        @Deprecated
        public static Modifier then(ModifierLocalConsumer modifierLocalConsumer, Modifier modifier) {
            C12775o.m28639i(modifier, "other");
            return ModifierLocalConsumer.super.then(modifier);
        }
    }

    void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope);
}
