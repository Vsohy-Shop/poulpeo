package androidx.compose.p002ui.node;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nViewInterop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,97:1\n116#2,2:98\n33#2,6:100\n118#2:106\n33#2,6:107\n33#2,6:113\n33#2,6:119\n*S KotlinDebug\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n*L\n54#1:98,2\n54#1:100,6\n54#1:106\n62#1:107,6\n66#1:113,6\n70#1:119,6\n*E\n"})
/* renamed from: androidx.compose.ui.node.MergedViewAdapter */
/* compiled from: ViewInterop.android.kt */
public final class MergedViewAdapter implements ViewAdapter {
    private final List<ViewAdapter> adapters = new ArrayList();

    /* renamed from: id */
    private final int f367id;

    public void didInsert(View view, ViewGroup viewGroup) {
        C12775o.m28639i(view, "view");
        C12775o.m28639i(viewGroup, "parent");
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).didInsert(view, viewGroup);
        }
    }

    public void didUpdate(View view, ViewGroup viewGroup) {
        C12775o.m28639i(view, "view");
        C12775o.m28639i(viewGroup, "parent");
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).didUpdate(view, viewGroup);
        }
    }

    public final <T extends ViewAdapter> T get(int i, C13074a<? extends T> aVar) {
        T t;
        T t2;
        boolean z;
        C12775o.m28639i(aVar, "factory");
        List<ViewAdapter> adapters2 = getAdapters();
        int size = adapters2.size();
        int i2 = 0;
        while (true) {
            t = null;
            if (i2 >= size) {
                t2 = null;
                break;
            }
            t2 = adapters2.get(i2);
            if (((ViewAdapter) t2).getId() == i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            i2++;
        }
        if (t2 instanceof ViewAdapter) {
            t = (ViewAdapter) t2;
        }
        if (t != null) {
            return t;
        }
        T t3 = (ViewAdapter) aVar.invoke();
        getAdapters().add(t3);
        return t3;
    }

    public final List<ViewAdapter> getAdapters() {
        return this.adapters;
    }

    public int getId() {
        return this.f367id;
    }

    public void willInsert(View view, ViewGroup viewGroup) {
        C12775o.m28639i(view, "view");
        C12775o.m28639i(viewGroup, "parent");
        List<ViewAdapter> list = this.adapters;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).willInsert(view, viewGroup);
        }
    }
}
