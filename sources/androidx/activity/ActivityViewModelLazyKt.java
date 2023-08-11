package androidx.activity;

import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Lazy;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import p404of.C13074a;

/* compiled from: ActivityViewModelLazy.kt */
public final class ActivityViewModelLazyKt {
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> Lazy<VM> viewModels(ComponentActivity componentActivity, C13074a<? extends ViewModelProvider.Factory> aVar) {
        C12775o.m28639i(componentActivity, "<this>");
        if (aVar == null) {
            aVar = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        C12775o.m28644n(4, "VM");
        return new ViewModelLazy(C12764h0.m28586b(ViewModel.class), new ActivityViewModelLazyKt$viewModels$1(componentActivity), aVar, new ActivityViewModelLazyKt$viewModels$2(componentActivity));
    }

    public static /* synthetic */ Lazy viewModels$default(ComponentActivity componentActivity, C13074a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        C12775o.m28639i(componentActivity, "<this>");
        if (aVar == null) {
            aVar = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        C12775o.m28644n(4, "VM");
        return new ViewModelLazy(C12764h0.m28586b(ViewModel.class), new ActivityViewModelLazyKt$viewModels$1(componentActivity), aVar, new ActivityViewModelLazyKt$viewModels$2(componentActivity));
    }

    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> Lazy<VM> viewModels(ComponentActivity componentActivity, C13074a<? extends CreationExtras> aVar, C13074a<? extends ViewModelProvider.Factory> aVar2) {
        C12775o.m28639i(componentActivity, "<this>");
        if (aVar2 == null) {
            aVar2 = new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        C12775o.m28644n(4, "VM");
        return new ViewModelLazy(C12764h0.m28586b(ViewModel.class), new ActivityViewModelLazyKt$viewModels$3(componentActivity), aVar2, new ActivityViewModelLazyKt$viewModels$4(aVar, componentActivity));
    }

    public static /* synthetic */ Lazy viewModels$default(ComponentActivity componentActivity, C13074a aVar, C13074a aVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        if ((i & 2) != 0) {
            aVar2 = null;
        }
        C12775o.m28639i(componentActivity, "<this>");
        if (aVar2 == null) {
            aVar2 = new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        C12775o.m28644n(4, "VM");
        return new ViewModelLazy(C12764h0.m28586b(ViewModel.class), new ActivityViewModelLazyKt$viewModels$3(componentActivity), aVar2, new ActivityViewModelLazyKt$viewModels$4(aVar, componentActivity));
    }
}
