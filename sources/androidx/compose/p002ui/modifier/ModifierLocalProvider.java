package androidx.compose.p002ui.modifier;

import androidx.compose.p002ui.Modifier;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p404of.C13088o;

@Stable
/* renamed from: androidx.compose.ui.modifier.ModifierLocalProvider */
/* compiled from: ModifierLocalProvider.kt */
public interface ModifierLocalProvider<T> extends Modifier.Element {

    /* renamed from: androidx.compose.ui.modifier.ModifierLocalProvider$DefaultImpls */
    /* compiled from: ModifierLocalProvider.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> boolean all(ModifierLocalProvider<T> modifierLocalProvider, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return ModifierLocalProvider.super.all(function1);
        }

        @Deprecated
        public static <T> boolean any(ModifierLocalProvider<T> modifierLocalProvider, Function1<? super Modifier.Element, Boolean> function1) {
            C12775o.m28639i(function1, "predicate");
            return ModifierLocalProvider.super.any(function1);
        }

        @Deprecated
        public static <T, R> R foldIn(ModifierLocalProvider<T> modifierLocalProvider, R r, C13088o<? super R, ? super Modifier.Element, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return ModifierLocalProvider.super.foldIn(r, oVar);
        }

        @Deprecated
        public static <T, R> R foldOut(ModifierLocalProvider<T> modifierLocalProvider, R r, C13088o<? super Modifier.Element, ? super R, ? extends R> oVar) {
            C12775o.m28639i(oVar, "operation");
            return ModifierLocalProvider.super.foldOut(r, oVar);
        }

        @Deprecated
        public static <T> Modifier then(ModifierLocalProvider<T> modifierLocalProvider, Modifier modifier) {
            C12775o.m28639i(modifier, "other");
            return ModifierLocalProvider.super.then(modifier);
        }
    }

    ProvidableModifierLocal<T> getKey();

    T getValue();
}
