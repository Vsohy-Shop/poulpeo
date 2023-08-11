package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.viewmodel.C2351R;
import kotlin.jvm.internal.C12775o;

/* compiled from: ViewTreeViewModelStoreOwner.kt */
public final class ViewTreeViewModelStoreOwner {
    public static final ViewModelStoreOwner get(View view) {
        C12775o.m28639i(view, "<this>");
        return (ViewModelStoreOwner) C13662o.m31283p(C13662o.m31288u(C13657m.m31272f(view, ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$1.INSTANCE), ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2.INSTANCE));
    }

    public static final void set(View view, ViewModelStoreOwner viewModelStoreOwner) {
        C12775o.m28639i(view, "<this>");
        view.setTag(C2351R.C2352id.view_tree_view_model_store_owner, viewModelStoreOwner);
    }
}
