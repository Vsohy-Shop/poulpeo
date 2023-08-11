package com.rmn.p324ui.views.listview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import kotlin.jvm.internal.C12775o;

@StabilityInferred(parameters = 0)
/* renamed from: com.rmn.ui.views.listview.NPAGridLayoutManager */
/* compiled from: NPAGridLayoutManager.kt */
public final class NPAGridLayoutManager extends GridLayoutManager {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NPAGridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i, i2, z);
        C12775o.m28639i(context, "context");
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NPAGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C12775o.m28639i(context, "context");
        C12775o.m28639i(attributeSet, "attrs");
    }
}
