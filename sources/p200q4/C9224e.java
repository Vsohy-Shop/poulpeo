package p200q4;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import p231t4.C9713p;

/* renamed from: q4.e */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C9224e {

    /* renamed from: a */
    private final Object f13546a;

    public C9224e(@NonNull Activity activity) {
        C9713p.m20276k(activity, "Activity must not be null");
        this.f13546a = activity;
    }

    @NonNull
    /* renamed from: a */
    public final Activity mo43511a() {
        return (Activity) this.f13546a;
    }

    @NonNull
    /* renamed from: b */
    public final FragmentActivity mo43512b() {
        return (FragmentActivity) this.f13546a;
    }

    /* renamed from: c */
    public final boolean mo43513c() {
        return this.f13546a instanceof Activity;
    }

    /* renamed from: d */
    public final boolean mo43514d() {
        return this.f13546a instanceof FragmentActivity;
    }
}
