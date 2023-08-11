package androidx.compose.p002ui.node;

import android.view.View;
import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;
import p404of.C13074a;

@SourceDebugExtension({"SMAP\nViewInterop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/ViewInterop_androidKt\n+ 2 ViewInterop.android.kt\nandroidx/compose/ui/node/MergedViewAdapter\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,97:1\n54#2:98\n55#2,4:108\n116#3,2:99\n33#3,6:101\n118#3:107\n*S KotlinDebug\n*F\n+ 1 ViewInterop.android.kt\nandroidx/compose/ui/node/ViewInterop_androidKt\n*L\n45#1:98\n45#1:108,4\n45#1:99,2\n45#1:101,6\n45#1:107\n*E\n"})
/* renamed from: androidx.compose.ui.node.ViewInterop_androidKt */
/* compiled from: ViewInterop.android.kt */
public final class ViewInterop_androidKt {
    private static final int viewAdaptersKey = tagKey("ViewAdapter");

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <T extends ViewAdapter> T getOrAddAdapter(View view, int i, C13074a<? extends T> aVar) {
        T t;
        T t2;
        boolean z;
        C12775o.m28639i(view, "<this>");
        C12775o.m28639i(aVar, "factory");
        MergedViewAdapter viewAdapter = getViewAdapter(view);
        List<ViewAdapter> adapters = viewAdapter.getAdapters();
        int size = adapters.size();
        int i2 = 0;
        while (true) {
            t = null;
            if (i2 >= size) {
                t2 = null;
                break;
            }
            t2 = adapters.get(i2);
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
        viewAdapter.getAdapters().add(t3);
        return t3;
    }

    public static final MergedViewAdapter getViewAdapter(View view) {
        MergedViewAdapter mergedViewAdapter;
        C12775o.m28639i(view, "<this>");
        int i = viewAdaptersKey;
        Object tag = view.getTag(i);
        if (tag instanceof MergedViewAdapter) {
            mergedViewAdapter = (MergedViewAdapter) tag;
        } else {
            mergedViewAdapter = null;
        }
        if (mergedViewAdapter != null) {
            return mergedViewAdapter;
        }
        MergedViewAdapter mergedViewAdapter2 = new MergedViewAdapter();
        view.setTag(i, mergedViewAdapter2);
        return mergedViewAdapter2;
    }

    public static final MergedViewAdapter getViewAdapterIfExists(View view) {
        C12775o.m28639i(view, "<this>");
        Object tag = view.getTag(viewAdaptersKey);
        if (tag instanceof MergedViewAdapter) {
            return (MergedViewAdapter) tag;
        }
        return null;
    }

    public static final int tagKey(String str) {
        C12775o.m28639i(str, "key");
        return str.hashCode() | 50331648;
    }
}
