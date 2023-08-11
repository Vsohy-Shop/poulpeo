package androidx.core.view;

import android.view.ViewParent;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12771l;
import kotlin.jvm.internal.C12775o;

/* compiled from: View.kt */
/* synthetic */ class ViewKt$ancestors$1 extends C12771l implements Function1<ViewParent, ViewParent> {
    public static final ViewKt$ancestors$1 INSTANCE = new ViewKt$ancestors$1();

    ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    public final ViewParent invoke(ViewParent viewParent) {
        C12775o.m28639i(viewParent, "p0");
        return viewParent.getParent();
    }
}
