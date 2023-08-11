package androidx.lifecycle;

import android.view.View;
import androidx.lifecycle.viewmodel.C2351R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;

/* compiled from: ViewTreeViewModelStoreOwner.kt */
final class ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2 extends C12777p implements Function1<View, ViewModelStoreOwner> {
    public static final ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2 INSTANCE = new ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2();

    ViewTreeViewModelStoreOwner$findViewTreeViewModelStoreOwner$2() {
        super(1);
    }

    public final ViewModelStoreOwner invoke(View view) {
        C12775o.m28639i(view, "view");
        Object tag = view.getTag(C2351R.C2352id.view_tree_view_model_store_owner);
        if (tag instanceof ViewModelStoreOwner) {
            return (ViewModelStoreOwner) tag;
        }
        return null;
    }
}
