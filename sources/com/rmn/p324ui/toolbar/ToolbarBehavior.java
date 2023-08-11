package com.rmn.p324ui.toolbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* renamed from: com.rmn.ui.toolbar.ToolbarBehavior */
/* compiled from: ToolbarBehavior.kt */
public final class ToolbarBehavior extends AppBarLayout.Behavior {

    /* renamed from: a */
    private final RecyclerView f18105a;

    /* renamed from: b */
    private boolean f18106b;

    /* renamed from: c */
    private int f18107c;

    public ToolbarBehavior(RecyclerView recyclerView) {
        this.f18105a = recyclerView;
    }

    /* renamed from: c */
    private final void m25064c() {
        int i;
        RecyclerView recyclerView = this.f18105a;
        if (recyclerView != null) {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            boolean z = true;
            if (adapter == null) {
                this.f18106b = true;
            } else if (adapter.getItemCount() != this.f18107c) {
                this.f18106b = false;
                this.f18107c = adapter.getItemCount();
                RecyclerView.LayoutManager layoutManager = this.f18105a.getLayoutManager();
                if (layoutManager == null) {
                    this.f18106b = true;
                    return;
                }
                if (layoutManager instanceof LinearLayoutManager) {
                    i = Math.abs(((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition());
                } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                    StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                    int[] findLastCompletelyVisibleItemPositions = staggeredGridLayoutManager.findLastCompletelyVisibleItemPositions(new int[staggeredGridLayoutManager.getSpanCount()]);
                    i = Math.abs(findLastCompletelyVisibleItemPositions[findLastCompletelyVisibleItemPositions.length - 1]);
                } else {
                    i = 0;
                }
                if (i >= this.f18107c - 1) {
                    z = false;
                }
                this.f18106b = z;
            }
        }
    }

    /* renamed from: a */
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, MotionEvent motionEvent) {
        C12775o.m28639i(coordinatorLayout, "parent");
        C12775o.m28639i(appBarLayout, "child");
        C12775o.m28639i(motionEvent, "ev");
        if (!this.f18106b || !super.onInterceptTouchEvent(coordinatorLayout, appBarLayout, motionEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean onNestedFling(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, float f, float f2, boolean z) {
        C12775o.m28639i(coordinatorLayout, "coordinatorLayout");
        C12775o.m28639i(appBarLayout, "child");
        C12775o.m28639i(view, TypedValues.AttributesType.S_TARGET);
        if (!this.f18106b || !super.onNestedFling(coordinatorLayout, appBarLayout, view, f, f2, z)) {
            return false;
        }
        return true;
    }

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        C12775o.m28639i(coordinatorLayout, "parent");
        C12775o.m28639i(appBarLayout, "child");
        C12775o.m28639i(view, "directTargetChild");
        C12775o.m28639i(view2, TypedValues.AttributesType.S_TARGET);
        m25064c();
        return this.f18106b && super.onStartNestedScroll(coordinatorLayout, appBarLayout, view, view2, i, i2);
    }
}
