package com.rmn.p324ui.views.listview;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C12775o;
import p463yc.C13867a;

@StabilityInferred(parameters = 0)
/* renamed from: com.rmn.ui.views.listview.e */
/* compiled from: GridSpacingItemDecoration.kt */
public final class C11656e extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    private final int f18128a;

    /* renamed from: b */
    private final int f18129b;

    /* renamed from: c */
    private final int f18130c;

    public C11656e(int i, int i2, int i3) {
        this.f18128a = i;
        this.f18129b = i2;
        this.f18130c = i3;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        C12775o.m28639i(rect, "outRect");
        C12775o.m28639i(view, "view");
        C12775o.m28639i(recyclerView, "parent");
        C12775o.m28639i(state, "state");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition >= 0) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            C12775o.m28637g(adapter, "null cannot be cast to non-null type com.rmn.ui.adapters.BaseAdapter");
            C13867a aVar = (C13867a) adapter;
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            C12775o.m28637g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
            int spanCount = ((GridLayoutManager) layoutManager).getSpanCount() - 1;
            int n = aVar.mo53564n();
            int i = 0;
            boolean z = false;
            for (int i2 = 0; i2 < n; i2++) {
                if (aVar.getItem(i2) instanceof C11655d) {
                    if (i2 == childAdapterPosition) {
                        z = true;
                    }
                    i += spanCount;
                }
            }
            int i3 = childAdapterPosition + i;
            int i4 = this.f18128a;
            int i5 = i3 % i4;
            int i6 = this.f18130c;
            if (i6 == 1) {
                if (i5 == 0 || z) {
                    rect.left = this.f18129b;
                } else {
                    rect.left = this.f18129b / 2;
                }
                if (i5 == i4 - 1 || z) {
                    rect.right = this.f18129b;
                } else {
                    rect.right = this.f18129b / 2;
                }
                if (i3 < i4) {
                    rect.top = this.f18129b;
                }
                rect.bottom = this.f18129b;
            } else if (i6 == 0) {
                if (i5 == 0 || z) {
                    rect.top = this.f18129b;
                } else {
                    rect.top = this.f18129b / 2;
                }
                if (i5 == i4 - 1 || z) {
                    rect.bottom = this.f18129b;
                } else {
                    rect.bottom = this.f18129b / 2;
                }
                if (i3 < i4) {
                    rect.left = this.f18129b;
                }
                rect.right = this.f18129b;
            }
        }
    }
}
