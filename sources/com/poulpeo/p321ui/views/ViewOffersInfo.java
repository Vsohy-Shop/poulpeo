package com.poulpeo.p321ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.web.WebActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import p394nb.C12981f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.views.ViewOffersInfo */
/* compiled from: ViewOffersInfo.kt */
public final class ViewOffersInfo extends AppCompatTextView {

    /* renamed from: b */
    public Map<Integer, View> f17761b = new LinkedHashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewOffersInfo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C12775o.m28639i(context, "context");
        C12775o.m28639i(attributeSet, "attributeSet");
        setOnClickListener(new C12981f(this));
        setColorAtBlue(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m24882b(ViewOffersInfo viewOffersInfo, View view) {
        C12775o.m28639i(viewOffersInfo, "this$0");
        Context context = viewOffersInfo.getContext();
        if (context != null) {
            WebActivity.C11223a aVar = WebActivity.f17745z;
            Context context2 = viewOffersInfo.getContext();
            C12775o.m28638h(context2, "context");
            context.startActivity(aVar.mo46523b(context2));
        }
    }

    public final void setColorAtBlue(boolean z) {
        if (z) {
            setBackgroundColor(getContext().getColor(R.color.background_theme));
            setTextColor(getContext().getColor(R.color.text_title_alternative));
            return;
        }
        setBackgroundColor(getContext().getColor(R.color.background_alternative));
        setTextColor(getContext().getColor(R.color.text_title_default));
    }
}
