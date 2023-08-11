package com.poulpeo.p321ui.screens.video;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p416qd.C13244b;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.video.PLPFullScreenVideoActivity */
/* compiled from: PLPFullScreenVideoActivity.kt */
public final class PLPFullScreenVideoActivity extends C13244b {

    /* renamed from: v */
    public static final C11222a f17741v = new C11222a((DefaultConstructorMarker) null);

    /* renamed from: w */
    public static final int f17742w = 8;

    /* renamed from: u */
    public Map<Integer, View> f17743u = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.video.PLPFullScreenVideoActivity$a */
    /* compiled from: PLPFullScreenVideoActivity.kt */
    public static final class C11222a {
        private C11222a() {
        }

        public /* synthetic */ C11222a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo46518a(Context context) {
            C12775o.m28639i(context, "context");
            return C13244b.f21116q.mo52899e(context, PLPFullScreenVideoActivity.class, R.raw.onboarding_how_it_works, "how-it-works");
        }
    }

    /* renamed from: B2 */
    public View mo46517B2(int i) {
        Map<Integer, View> map = this.f17743u;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }
}
