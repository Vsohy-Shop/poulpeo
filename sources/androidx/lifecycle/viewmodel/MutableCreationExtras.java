package androidx.lifecycle.viewmodel;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: CreationExtras.kt */
public final class MutableCreationExtras extends CreationExtras {
    public MutableCreationExtras() {
        this((CreationExtras) null, 1, (DefaultConstructorMarker) null);
    }

    public <T> T get(CreationExtras.Key<T> key) {
        C12775o.m28639i(key, "key");
        return getMap$lifecycle_viewmodel_release().get(key);
    }

    public final <T> void set(CreationExtras.Key<T> key, T t) {
        C12775o.m28639i(key, "key");
        getMap$lifecycle_viewmodel_release().put(key, t);
    }

    public MutableCreationExtras(CreationExtras creationExtras) {
        C12775o.m28639i(creationExtras, "initialExtras");
        getMap$lifecycle_viewmodel_release().putAll(creationExtras.getMap$lifecycle_viewmodel_release());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutableCreationExtras(CreationExtras creationExtras, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CreationExtras.Empty.INSTANCE : creationExtras);
    }
}
