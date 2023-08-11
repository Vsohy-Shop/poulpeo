package p112h7;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import p123i7.C8195g;

/* renamed from: h7.a */
/* compiled from: DynamicLink */
public final class C8024a {

    /* renamed from: a */
    private final C8195g f11260a;

    /* renamed from: b */
    private final Bundle f11261b;

    /* renamed from: c */
    private final Bundle f11262c;

    public C8024a(C8195g gVar) {
        this.f11260a = gVar;
        Bundle bundle = new Bundle();
        this.f11261b = bundle;
        bundle.putString("apiKey", gVar.mo42099f().mo39769k().mo39784b());
        Bundle bundle2 = new Bundle();
        this.f11262c = bundle2;
        bundle.putBundle("parameters", bundle2);
    }

    /* renamed from: c */
    private void m15790c() {
        if (this.f11261b.getString("apiKey") == null) {
            throw new IllegalArgumentException("Missing API key. Set with setApiKey().");
        }
    }

    @NonNull
    /* renamed from: a */
    public Task<C8027d> mo41853a() {
        m15790c();
        return this.f11260a.mo42098e(this.f11261b);
    }

    @NonNull
    /* renamed from: b */
    public C8024a mo41854b(@NonNull Uri uri) {
        this.f11261b.putParcelable("dynamicLink", uri);
        return this;
    }
}
