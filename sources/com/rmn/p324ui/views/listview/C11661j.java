package com.rmn.p324ui.views.listview;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* renamed from: com.rmn.ui.views.listview.j */
/* compiled from: SyncedParallaxScrollListener.kt */
public final class C11661j extends RecyclerView.OnScrollListener {

    /* renamed from: a */
    private final View f18133a;

    /* renamed from: b */
    private final float f18134b;

    public C11661j(View view, float f) {
        C12775o.m28639i(view, "itemView");
        this.f18133a = view;
        this.f18134b = f;
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        C12775o.m28639i(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        this.f18133a.setY(this.f18133a.getY() - (((float) i2) * this.f18134b));
    }
}
