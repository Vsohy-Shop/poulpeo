package com.poulpeo.p321ui.views.listview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.rmn.p324ui.views.listview.BaseListView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import p311bd.C10930a;
import p432tb.C13477a;
import p463yc.C13867a;
import p463yc.C13873c;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.views.listview.ExpandableListView */
/* compiled from: ExpandableListView.kt */
public final class ExpandableListView extends BaseListView {

    /* renamed from: o */
    public Map<Integer, View> f17762o = new LinkedHashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpandableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C12775o.m28639i(context, "context");
        C12775o.m28639i(attributeSet, "attrs");
    }

    /* access modifiers changed from: protected */
    /* renamed from: J0 */
    public C10930a mo46555J0(Integer num) {
        return new C13477a(this, num);
    }

    public C13867a getAdapter() {
        return super.getAdapter();
    }

    public final C13477a getExpandableListViewController() {
        C10930a baseListViewController = getBaseListViewController();
        C12775o.m28637g(baseListViewController, "null cannot be cast to non-null type com.poulpeo.ui.views.listview.ExpandableListViewController");
        return (C13477a) baseListViewController;
    }

    public void setAdapter(C13867a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException();
        } else if (aVar instanceof C13873c) {
            super.setAdapter(aVar);
        } else {
            throw new IllegalArgumentException("The adapter must be an instance of ExpandableAdapter to manage items of IExpandableGroup type");
        }
    }
}
