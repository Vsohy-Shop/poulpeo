package androidx.compose.p002ui.modifier;

import androidx.compose.p002ui.platform.InspectorInfo;
import androidx.compose.p002ui.platform.InspectorValueInfo;
import androidx.compose.runtime.Stable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

@Stable
/* renamed from: androidx.compose.ui.modifier.ModifierLocalConsumerImpl */
/* compiled from: ModifierLocalConsumer.kt */
final class ModifierLocalConsumerImpl extends InspectorValueInfo implements ModifierLocalConsumer {
    private final Function1<ModifierLocalReadScope, C11921v> consumer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ModifierLocalConsumerImpl(Function1<? super ModifierLocalReadScope, C11921v> function1, Function1<? super InspectorInfo, C11921v> function12) {
        super(function12);
        C12775o.m28639i(function1, "consumer");
        C12775o.m28639i(function12, "debugInspectorInfo");
        this.consumer = function1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ModifierLocalConsumerImpl) || !C12775o.m28634d(((ModifierLocalConsumerImpl) obj).consumer, this.consumer)) {
            return false;
        }
        return true;
    }

    public final Function1<ModifierLocalReadScope, C11921v> getConsumer() {
        return this.consumer;
    }

    public int hashCode() {
        return this.consumer.hashCode();
    }

    public void onModifierLocalsUpdated(ModifierLocalReadScope modifierLocalReadScope) {
        C12775o.m28639i(modifierLocalReadScope, "scope");
        this.consumer.invoke(modifierLocalReadScope);
    }
}
