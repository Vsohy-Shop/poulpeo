package p180o4;

import android.util.Log;
import androidx.annotation.NonNull;

/* renamed from: o4.b0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
class C8973b0 {

    /* renamed from: d */
    private static final C8973b0 f13055d = new C8973b0(true, (String) null, (Throwable) null);

    /* renamed from: a */
    final boolean f13056a;

    /* renamed from: b */
    final String f13057b;

    /* renamed from: c */
    final Throwable f13058c;

    C8973b0(boolean z, String str, Throwable th) {
        this.f13056a = z;
        this.f13057b = str;
        this.f13058c = th;
    }

    /* renamed from: b */
    static C8973b0 m18212b() {
        return f13055d;
    }

    /* renamed from: c */
    static C8973b0 m18213c(@NonNull String str) {
        return new C8973b0(false, str, (Throwable) null);
    }

    /* renamed from: d */
    static C8973b0 m18214d(@NonNull String str, @NonNull Throwable th) {
        return new C8973b0(false, str, th);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo43141a() {
        return this.f13057b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo43145e() {
        if (!this.f13056a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.f13058c != null) {
                Log.d("GoogleCertificatesRslt", mo43141a(), this.f13058c);
            } else {
                Log.d("GoogleCertificatesRslt", mo43141a());
            }
        }
    }
}
