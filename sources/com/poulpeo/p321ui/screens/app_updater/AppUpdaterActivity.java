package com.poulpeo.p321ui.screens.app_updater;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.utils.IntentDelegate;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12783v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p462yb.C13861e;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: com.poulpeo.ui.screens.app_updater.AppUpdaterActivity */
/* compiled from: AppUpdaterActivity.kt */
public final class AppUpdaterActivity extends Activity implements View.OnClickListener {

    /* renamed from: c */
    public static final C11106a f17245c = new C11106a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f17246d = 8;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final IntentDelegate.Boolean f17247e = new IntentDelegate.Boolean("forceUpdate");

    /* renamed from: b */
    public Map<Integer, View> f17248b = new LinkedHashMap();

    /* renamed from: com.poulpeo.ui.screens.app_updater.AppUpdaterActivity$a */
    /* compiled from: AppUpdaterActivity.kt */
    public static final class C11106a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f17249a = {C12764h0.m28590f(new C12783v(C11106a.class, "forceUpdate", "getForceUpdate(Landroid/content/Intent;)Z", 0))};

        private C11106a() {
        }

        public /* synthetic */ C11106a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final boolean m23934b(Intent intent) {
            return AppUpdaterActivity.f17247e.getValue(intent, (KProperty<?>) f17249a[0]).booleanValue();
        }

        /* renamed from: d */
        private final void m23935d(Intent intent, boolean z) {
            AppUpdaterActivity.f17247e.setValue(intent, (KProperty<?>) f17249a[0], z);
        }

        /* renamed from: c */
        public final Intent mo46190c(Context context, boolean z) {
            C12775o.m28639i(context, "context");
            Intent intent = new Intent(context, AppUpdaterActivity.class);
            AppUpdaterActivity.f17245c.m23935d(intent, z);
            intent.setFlags(268468224);
            return intent;
        }
    }

    /* renamed from: c */
    private final void m23931c() {
        ComponentName componentName;
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (launchIntentForPackage != null) {
            componentName = launchIntentForPackage.getComponent();
        } else {
            componentName = null;
        }
        startActivity(Intent.makeRestartActivityTask(componentName));
        System.exit(0);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }

    /* renamed from: a */
    public View mo46186a(int i) {
        Map<Integer, View> map = this.f17248b;
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

    public void onClick(View view) {
        C12775o.m28639i(view, "v");
        if (view == ((Button) mo46186a(C13865f.buttonUpdate))) {
            if (!C13861e.f22396e.mo53556a().mo53552i(this)) {
                finish();
            }
        } else if (view == ((Button) mo46186a(C13865f.buttonCancel))) {
            m23931c();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_app_updater);
        C11106a aVar = f17245c;
        Intent intent = getIntent();
        C12775o.m28638h(intent, "intent");
        boolean a = aVar.m23934b(intent);
        ((Button) mo46186a(C13865f.buttonUpdate)).setOnClickListener(this);
        if (a) {
            ((Button) mo46186a(C13865f.buttonCancel)).setVisibility(8);
        } else {
            ((Button) mo46186a(C13865f.buttonCancel)).setOnClickListener(this);
        }
    }

    public void onBackPressed() {
    }
}
