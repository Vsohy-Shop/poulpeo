package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import p448vf.C13650g;

/* compiled from: ViewGroup.kt */
public final class ViewGroupKt$children$1 implements C13650g<View> {
    final /* synthetic */ ViewGroup $this_children;

    ViewGroupKt$children$1(ViewGroup viewGroup) {
        this.$this_children = viewGroup;
    }

    public Iterator<View> iterator() {
        return ViewGroupKt.iterator(this.$this_children);
    }
}
