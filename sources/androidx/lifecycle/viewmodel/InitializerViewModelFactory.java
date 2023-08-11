package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.applinks.AppLinkData;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nInitializerViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactory\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,115:1\n13579#2,2:116\n*S KotlinDebug\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactory\n*L\n105#1:116,2\n*E\n"})
/* compiled from: InitializerViewModelFactory.kt */
public final class InitializerViewModelFactory implements ViewModelProvider.Factory {
    private final ViewModelInitializer<?>[] initializers;

    public InitializerViewModelFactory(ViewModelInitializer<?>... viewModelInitializerArr) {
        C12775o.m28639i(viewModelInitializerArr, "initializers");
        this.initializers = viewModelInitializerArr;
    }

    public <T extends ViewModel> T create(Class<T> cls, CreationExtras creationExtras) {
        C12775o.m28639i(cls, "modelClass");
        C12775o.m28639i(creationExtras, AppLinkData.ARGUMENTS_EXTRAS_KEY);
        T t = null;
        for (ViewModelInitializer<?> viewModelInitializer : this.initializers) {
            if (C12775o.m28634d(viewModelInitializer.getClazz$lifecycle_viewmodel_release(), cls)) {
                T invoke = viewModelInitializer.getInitializer$lifecycle_viewmodel_release().invoke(creationExtras);
                if (invoke instanceof ViewModel) {
                    t = (ViewModel) invoke;
                } else {
                    t = null;
                }
            }
        }
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
