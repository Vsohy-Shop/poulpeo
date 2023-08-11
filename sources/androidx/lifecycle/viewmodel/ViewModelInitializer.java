package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;

/* compiled from: InitializerViewModelFactory.kt */
public final class ViewModelInitializer<T extends ViewModel> {
    private final Class<T> clazz;
    private final Function1<CreationExtras, T> initializer;

    public ViewModelInitializer(Class<T> cls, Function1<? super CreationExtras, ? extends T> function1) {
        C12775o.m28639i(cls, "clazz");
        C12775o.m28639i(function1, "initializer");
        this.clazz = cls;
        this.initializer = function1;
    }

    public final Class<T> getClazz$lifecycle_viewmodel_release() {
        return this.clazz;
    }

    public final Function1<CreationExtras, T> getInitializer$lifecycle_viewmodel_release() {
        return this.initializer;
    }
}
