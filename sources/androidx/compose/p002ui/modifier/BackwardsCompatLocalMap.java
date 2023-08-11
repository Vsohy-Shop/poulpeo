package androidx.compose.p002ui.modifier;

import com.rmn.api.p322v2.cloud.general.CloudMethodReturns;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.modifier.BackwardsCompatLocalMap */
/* compiled from: ModifierLocalNode.kt */
public final class BackwardsCompatLocalMap extends ModifierLocalMap {
    private ModifierLocalProvider<?> element;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackwardsCompatLocalMap(ModifierLocalProvider<?> modifierLocalProvider) {
        super((DefaultConstructorMarker) null);
        C12775o.m28639i(modifierLocalProvider, CloudMethodReturns.RETURN_KEYNAME_ELEMENT);
        this.element = modifierLocalProvider;
    }

    public boolean contains$ui_release(ModifierLocal<?> modifierLocal) {
        C12775o.m28639i(modifierLocal, "key");
        if (modifierLocal == this.element.getKey()) {
            return true;
        }
        return false;
    }

    public <T> T get$ui_release(ModifierLocal<T> modifierLocal) {
        boolean z;
        C12775o.m28639i(modifierLocal, "key");
        if (modifierLocal == this.element.getKey()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.element.getValue();
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final ModifierLocalProvider<?> getElement() {
        return this.element;
    }

    public <T> void set$ui_release(ModifierLocal<T> modifierLocal, T t) {
        C12775o.m28639i(modifierLocal, "key");
        throw new IllegalStateException("Set is not allowed on a backwards compat provider".toString());
    }

    public final void setElement(ModifierLocalProvider<?> modifierLocalProvider) {
        C12775o.m28639i(modifierLocalProvider, "<set-?>");
        this.element = modifierLocalProvider;
    }
}
