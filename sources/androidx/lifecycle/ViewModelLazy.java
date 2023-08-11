package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p398nf.C13018a;
import p404of.C13074a;
import p442uf.C13591c;

/* compiled from: ViewModelLazy.kt */
public final class ViewModelLazy<VM extends ViewModel> implements Lazy<VM> {
    private VM cached;
    private final C13074a<CreationExtras> extrasProducer;
    private final C13074a<ViewModelProvider.Factory> factoryProducer;
    private final C13074a<ViewModelStore> storeProducer;
    private final C13591c<VM> viewModelClass;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ViewModelLazy(C13591c<VM> cVar, C13074a<? extends ViewModelStore> aVar, C13074a<? extends ViewModelProvider.Factory> aVar2) {
        this(cVar, aVar, aVar2, (C13074a) null, 8, (DefaultConstructorMarker) null);
        C12775o.m28639i(cVar, "viewModelClass");
        C12775o.m28639i(aVar, "storeProducer");
        C12775o.m28639i(aVar2, "factoryProducer");
    }

    public boolean isInitialized() {
        if (this.cached != null) {
            return true;
        }
        return false;
    }

    public ViewModelLazy(C13591c<VM> cVar, C13074a<? extends ViewModelStore> aVar, C13074a<? extends ViewModelProvider.Factory> aVar2, C13074a<? extends CreationExtras> aVar3) {
        C12775o.m28639i(cVar, "viewModelClass");
        C12775o.m28639i(aVar, "storeProducer");
        C12775o.m28639i(aVar2, "factoryProducer");
        C12775o.m28639i(aVar3, "extrasProducer");
        this.viewModelClass = cVar;
        this.storeProducer = aVar;
        this.factoryProducer = aVar2;
        this.extrasProducer = aVar3;
    }

    public VM getValue() {
        VM vm = this.cached;
        if (vm != null) {
            return vm;
        }
        VM vm2 = new ViewModelProvider(this.storeProducer.invoke(), this.factoryProducer.invoke(), this.extrasProducer.invoke()).get(C13018a.m29392a(this.viewModelClass));
        this.cached = vm2;
        return vm2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ViewModelLazy(C13591c cVar, C13074a aVar, C13074a aVar2, C13074a aVar3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, aVar, aVar2, (i & 8) != 0 ? C23351.INSTANCE : aVar3);
    }
}
