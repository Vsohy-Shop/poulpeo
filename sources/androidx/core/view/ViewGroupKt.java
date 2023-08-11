package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0127Px;
import androidx.annotation.RequiresApi;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13088o;
import p436tf.C13528f;
import p448vf.C13650g;

/* compiled from: ViewGroup.kt */
public final class ViewGroupKt {
    public static final boolean contains(ViewGroup viewGroup, View view) {
        C12775o.m28639i(viewGroup, "<this>");
        C12775o.m28639i(view, "view");
        if (viewGroup.indexOfChild(view) != -1) {
            return true;
        }
        return false;
    }

    public static final void forEach(ViewGroup viewGroup, Function1<? super View, C11921v> function1) {
        C12775o.m28639i(viewGroup, "<this>");
        C12775o.m28639i(function1, "action");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            C12775o.m28638h(childAt, "getChildAt(index)");
            function1.invoke(childAt);
        }
    }

    public static final void forEachIndexed(ViewGroup viewGroup, C13088o<? super Integer, ? super View, C11921v> oVar) {
        C12775o.m28639i(viewGroup, "<this>");
        C12775o.m28639i(oVar, "action");
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Integer valueOf = Integer.valueOf(i);
            View childAt = viewGroup.getChildAt(i);
            C12775o.m28638h(childAt, "getChildAt(index)");
            oVar.invoke(valueOf, childAt);
        }
    }

    public static final View get(ViewGroup viewGroup, int i) {
        C12775o.m28639i(viewGroup, "<this>");
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + viewGroup.getChildCount());
    }

    public static final C13650g<View> getChildren(ViewGroup viewGroup) {
        C12775o.m28639i(viewGroup, "<this>");
        return new ViewGroupKt$children$1(viewGroup);
    }

    public static final C13650g<View> getDescendants(ViewGroup viewGroup) {
        C12775o.m28639i(viewGroup, "<this>");
        return C13654k.m31268b(new ViewGroupKt$descendants$1(viewGroup, (C12074d<? super ViewGroupKt$descendants$1>) null));
    }

    public static final C13528f getIndices(ViewGroup viewGroup) {
        C12775o.m28639i(viewGroup, "<this>");
        return C13537l.m30893t(0, viewGroup.getChildCount());
    }

    public static final int getSize(ViewGroup viewGroup) {
        C12775o.m28639i(viewGroup, "<this>");
        return viewGroup.getChildCount();
    }

    public static final boolean isEmpty(ViewGroup viewGroup) {
        C12775o.m28639i(viewGroup, "<this>");
        if (viewGroup.getChildCount() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean isNotEmpty(ViewGroup viewGroup) {
        C12775o.m28639i(viewGroup, "<this>");
        if (viewGroup.getChildCount() != 0) {
            return true;
        }
        return false;
    }

    public static final Iterator<View> iterator(ViewGroup viewGroup) {
        C12775o.m28639i(viewGroup, "<this>");
        return new ViewGroupKt$iterator$1(viewGroup);
    }

    public static final void minusAssign(ViewGroup viewGroup, View view) {
        C12775o.m28639i(viewGroup, "<this>");
        C12775o.m28639i(view, "view");
        viewGroup.removeView(view);
    }

    public static final void plusAssign(ViewGroup viewGroup, View view) {
        C12775o.m28639i(viewGroup, "<this>");
        C12775o.m28639i(view, "view");
        viewGroup.addView(view);
    }

    public static final void setMargins(ViewGroup.MarginLayoutParams marginLayoutParams, @C0127Px int i) {
        C12775o.m28639i(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i, i, i, i);
    }

    public static final void updateMargins(ViewGroup.MarginLayoutParams marginLayoutParams, @C0127Px int i, @C0127Px int i2, @C0127Px int i3, @C0127Px int i4) {
        C12775o.m28639i(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i, i2, i3, i4);
    }

    public static /* synthetic */ void updateMargins$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = marginLayoutParams.leftMargin;
        }
        if ((i5 & 2) != 0) {
            i2 = marginLayoutParams.topMargin;
        }
        if ((i5 & 4) != 0) {
            i3 = marginLayoutParams.rightMargin;
        }
        if ((i5 & 8) != 0) {
            i4 = marginLayoutParams.bottomMargin;
        }
        C12775o.m28639i(marginLayoutParams, "<this>");
        marginLayoutParams.setMargins(i, i2, i3, i4);
    }

    @RequiresApi(17)
    public static final void updateMarginsRelative(ViewGroup.MarginLayoutParams marginLayoutParams, @C0127Px int i, @C0127Px int i2, @C0127Px int i3, @C0127Px int i4) {
        C12775o.m28639i(marginLayoutParams, "<this>");
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.bottomMargin = i4;
    }

    public static /* synthetic */ void updateMarginsRelative$default(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = marginLayoutParams.getMarginStart();
        }
        if ((i5 & 2) != 0) {
            i2 = marginLayoutParams.topMargin;
        }
        if ((i5 & 4) != 0) {
            i3 = marginLayoutParams.getMarginEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = marginLayoutParams.bottomMargin;
        }
        C12775o.m28639i(marginLayoutParams, "<this>");
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.bottomMargin = i4;
    }
}
