package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;

/* compiled from: InitializerViewModelFactory.kt */
public final class InitializerViewModelFactoryKt {
    public static final /* synthetic */ <VM extends ViewModel> void initializer(InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder, Function1<? super CreationExtras, ? extends VM> function1) {
        C12775o.m28639i(initializerViewModelFactoryBuilder, "<this>");
        C12775o.m28639i(function1, "initializer");
        C12775o.m28644n(4, "VM");
        initializerViewModelFactoryBuilder.addInitializer(C12764h0.m28586b(ViewModel.class), function1);
    }

    public static final ViewModelProvider.Factory viewModelFactory(Function1<? super InitializerViewModelFactoryBuilder, C11921v> function1) {
        C12775o.m28639i(function1, "builder");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        function1.invoke(initializerViewModelFactoryBuilder);
        return initializerViewModelFactoryBuilder.build();
    }
}
