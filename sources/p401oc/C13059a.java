package p401oc;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.rmn.iosadapters.android.content.ContextContainer;
import p415qc.C13240e;
import p427sc.C13395k;
import p446vd.C13633n;

/* renamed from: oc.a */
/* compiled from: TrackableScreenController */
public class C13059a {
    @NonNull

    /* renamed from: a */
    public final String f20871a;

    /* renamed from: b */
    public final boolean f20872b;

    public C13059a(@NonNull String str, boolean z) {
        this.f20871a = str;
        this.f20872b = z;
    }

    /* renamed from: b */
    public static void m29453b(@NonNull ContextContainer contextContainer, @NonNull String str) {
        m29454c(new C13240e(contextContainer), str);
    }

    /* renamed from: c */
    public static void m29454c(@NonNull C13240e eVar, @NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            C13633n.m31166v("WARNING trackPageViewCloud : screenName is null");
        } else {
            eVar.mo52889g(new C13395k(str));
        }
    }

    /* renamed from: a */
    public void mo50959a(@NonNull ContextContainer contextContainer) {
        m29453b(contextContainer, this.f20871a);
    }

    /* renamed from: d */
    public void mo50960d(@NonNull ContextContainer contextContainer) {
        if (this.f20872b && !TextUtils.isEmpty(this.f20871a)) {
            mo50959a(contextContainer);
        }
    }
}
