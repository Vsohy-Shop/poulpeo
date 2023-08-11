package p222s6;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import p255v6.C9972g;

/* renamed from: s6.e */
/* compiled from: DevelopmentPlatformProvider */
public class C9508e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f14178a;
    @Nullable

    /* renamed from: b */
    private C9510b f14179b = null;

    /* renamed from: s6.e$b */
    /* compiled from: DevelopmentPlatformProvider */
    private class C9510b {
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: a */
        public final String f14180a;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: b */
        public final String f14181b;

        private C9510b() {
            int q = C9972g.m20827q(C9508e.this.f14178a, "com.google.firebase.crashlytics.unity_version", TypedValues.Custom.S_STRING);
            if (q != 0) {
                this.f14180a = "Unity";
                String string = C9508e.this.f14178a.getResources().getString(q);
                this.f14181b = string;
                C9511f f = C9511f.m19696f();
                f.mo43971i("Unity Editor version is: " + string);
            } else if (C9508e.this.m19689c("flutter_assets")) {
                this.f14180a = "Flutter";
                this.f14181b = null;
                C9511f.m19696f().mo43971i("Development platform is: Flutter");
            } else {
                this.f14180a = null;
                this.f14181b = null;
            }
        }
    }

    public C9508e(Context context) {
        this.f14178a = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m19689c(String str) {
        String[] list;
        try {
            if (this.f14178a.getAssets() == null || (list = this.f14178a.getAssets().list(str)) == null || list.length <= 0) {
                return false;
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: f */
    private C9510b m19690f() {
        if (this.f14179b == null) {
            this.f14179b = new C9510b();
        }
        return this.f14179b;
    }

    @Nullable
    /* renamed from: d */
    public String mo43963d() {
        return m19690f().f14180a;
    }

    @Nullable
    /* renamed from: e */
    public String mo43964e() {
        return m19690f().f14181b;
    }
}
