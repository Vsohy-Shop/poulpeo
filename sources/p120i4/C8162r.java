package p120i4;

import android.content.Context;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p231t4.C9713p;

/* renamed from: i4.r */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public abstract class C8162r {

    /* renamed from: a */
    private final Context f11492a;

    /* renamed from: b */
    private final String f11493b;

    /* renamed from: c */
    private final C8161q0 f11494c = new C8161q0(this, (C8159p0) null);

    protected C8162r(@NonNull Context context, @NonNull String str) {
        this.f11492a = ((Context) C9713p.m20275j(context)).getApplicationContext();
        this.f11493b = C9713p.m20271f(str);
    }

    @Nullable
    /* renamed from: a */
    public abstract C8156o mo32791a(@Nullable String str);

    @NonNull
    /* renamed from: b */
    public final String mo42060b() {
        return this.f11493b;
    }

    @NonNull
    /* renamed from: c */
    public final Context mo42061c() {
        return this.f11492a;
    }

    /* renamed from: d */
    public abstract boolean mo32792d();

    @NonNull
    /* renamed from: e */
    public final IBinder mo42062e() {
        return this.f11494c;
    }
}
