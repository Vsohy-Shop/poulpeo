package p231t4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;

/* renamed from: t4.l1 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C9701l1 {

    /* renamed from: f */
    private static final Uri f14480f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    @Nullable

    /* renamed from: a */
    private final String f14481a;
    @Nullable

    /* renamed from: b */
    private final String f14482b;
    @Nullable

    /* renamed from: c */
    private final ComponentName f14483c = null;

    /* renamed from: d */
    private final int f14484d;

    /* renamed from: e */
    private final boolean f14485e;

    public C9701l1(String str, String str2, int i, boolean z) {
        C9713p.m20271f(str);
        this.f14481a = str;
        C9713p.m20271f(str2);
        this.f14482b = str2;
        this.f14484d = i;
        this.f14485e = z;
    }

    /* renamed from: a */
    public final int mo44208a() {
        return this.f14484d;
    }

    @Nullable
    /* renamed from: b */
    public final ComponentName mo44209b() {
        return this.f14483c;
    }

    /* renamed from: c */
    public final Intent mo44210c(Context context) {
        Bundle bundle;
        String str;
        if (this.f14481a == null) {
            return new Intent().setComponent(this.f14483c);
        }
        Intent intent = null;
        if (this.f14485e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f14481a);
            try {
                bundle = context.getContentResolver().call(f14480f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundle = null;
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
            }
            if (intent == null) {
                String valueOf = String.valueOf(this.f14481a);
                if (valueOf.length() != 0) {
                    str = "Dynamic lookup for intent failed for action: ".concat(valueOf);
                } else {
                    str = new String("Dynamic lookup for intent failed for action: ");
                }
                Log.w("ConnectionStatusConfig", str);
            }
        }
        if (intent != null) {
            return intent;
        }
        return new Intent(this.f14481a).setPackage(this.f14482b);
    }

    @Nullable
    /* renamed from: d */
    public final String mo44211d() {
        return this.f14482b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9701l1)) {
            return false;
        }
        C9701l1 l1Var = (C9701l1) obj;
        if (!C9705n.m20259b(this.f14481a, l1Var.f14481a) || !C9705n.m20259b(this.f14482b, l1Var.f14482b) || !C9705n.m20259b(this.f14483c, l1Var.f14483c) || this.f14484d != l1Var.f14484d || this.f14485e != l1Var.f14485e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C9705n.m20260c(this.f14481a, this.f14482b, this.f14483c, Integer.valueOf(this.f14484d), Boolean.valueOf(this.f14485e));
    }

    public final String toString() {
        String str = this.f14481a;
        if (str != null) {
            return str;
        }
        C9713p.m20275j(this.f14483c);
        return this.f14483c.flattenToString();
    }
}
