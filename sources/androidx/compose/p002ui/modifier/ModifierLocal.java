package androidx.compose.p002ui.modifier;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p404of.C13074a;

@Stable
/* renamed from: androidx.compose.ui.modifier.ModifierLocal */
/* compiled from: ModifierLocal.kt */
public abstract class ModifierLocal<T> {
    public static final int $stable = 0;
    private final C13074a<T> defaultFactory;

    public /* synthetic */ ModifierLocal(C13074a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    public final C13074a<T> getDefaultFactory$ui_release() {
        return this.defaultFactory;
    }

    private ModifierLocal(C13074a<? extends T> aVar) {
        this.defaultFactory = aVar;
    }
}
