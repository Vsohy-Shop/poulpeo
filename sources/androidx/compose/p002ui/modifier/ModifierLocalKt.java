package androidx.compose.p002ui.modifier;

import kotlin.jvm.internal.C12775o;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.modifier.ModifierLocalKt */
/* compiled from: ModifierLocal.kt */
public final class ModifierLocalKt {
    public static final <T> ProvidableModifierLocal<T> modifierLocalOf(C13074a<? extends T> aVar) {
        C12775o.m28639i(aVar, "defaultFactory");
        return new ProvidableModifierLocal<>(aVar);
    }
}
