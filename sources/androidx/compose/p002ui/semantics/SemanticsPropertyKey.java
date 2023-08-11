package androidx.compose.p002ui.semantics;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p404of.C13088o;

@StabilityInferred(parameters = 0)
/* renamed from: androidx.compose.ui.semantics.SemanticsPropertyKey */
/* compiled from: SemanticsProperties.kt */
public final class SemanticsPropertyKey<T> {
    public static final int $stable = 0;
    private final C13088o<T, T, T> mergePolicy;
    private final String name;

    public SemanticsPropertyKey(String str, C13088o<? super T, ? super T, ? extends T> oVar) {
        C12775o.m28639i(str, HintConstants.AUTOFILL_HINT_NAME);
        C12775o.m28639i(oVar, "mergePolicy");
        this.name = str;
        this.mergePolicy = oVar;
    }

    public final C13088o<T, T, T> getMergePolicy$ui_release() {
        return this.mergePolicy;
    }

    public final String getName() {
        return this.name;
    }

    public final T getValue(SemanticsPropertyReceiver semanticsPropertyReceiver, KProperty<?> kProperty) {
        C12775o.m28639i(semanticsPropertyReceiver, "thisRef");
        C12775o.m28639i(kProperty, "property");
        return SemanticsPropertiesKt.throwSemanticsGetNotSupported();
    }

    public final T merge(T t, T t2) {
        return this.mergePolicy.invoke(t, t2);
    }

    public final void setValue(SemanticsPropertyReceiver semanticsPropertyReceiver, KProperty<?> kProperty, T t) {
        C12775o.m28639i(semanticsPropertyReceiver, "thisRef");
        C12775o.m28639i(kProperty, "property");
        semanticsPropertyReceiver.set(this, t);
    }

    public String toString() {
        return "SemanticsPropertyKey: " + this.name;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SemanticsPropertyKey(String str, C13088o oVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? C11951.INSTANCE : oVar);
    }
}
