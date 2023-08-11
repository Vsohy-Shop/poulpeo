package androidx.compose.p002ui.modifier;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p404of.C13074a;

@Stable
/* renamed from: androidx.compose.ui.modifier.ProvidableModifierLocal */
/* compiled from: ModifierLocal.kt */
public final class ProvidableModifierLocal<T> extends ModifierLocal<T> {
    public static final int $stable = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProvidableModifierLocal(C13074a<? extends T> aVar) {
        super(aVar, (DefaultConstructorMarker) null);
        C12775o.m28639i(aVar, "defaultFactory");
    }
}
