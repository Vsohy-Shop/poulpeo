package androidx.compose.p002ui.viewinterop;

import android.util.SparseArray;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

/* renamed from: androidx.compose.ui.viewinterop.ViewFactoryHolder$registerSaveStateProvider$1 */
/* compiled from: AndroidView.android.kt */
final class ViewFactoryHolder$registerSaveStateProvider$1 extends C12777p implements C13074a<Object> {
    final /* synthetic */ ViewFactoryHolder<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ViewFactoryHolder$registerSaveStateProvider$1(ViewFactoryHolder<T> viewFactoryHolder) {
        super(0);
        this.this$0 = viewFactoryHolder;
    }

    public final Object invoke() {
        SparseArray sparseArray = new SparseArray();
        this.this$0.getTypedView().saveHierarchyState(sparseArray);
        return sparseArray;
    }
}
