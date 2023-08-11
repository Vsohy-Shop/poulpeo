package p215s;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.C12775o;
import p215s.C9406c;
import p355hf.C12074d;

/* renamed from: s.d */
/* compiled from: DisplaySizeResolver.kt */
public final class C9409d implements C9416j {

    /* renamed from: b */
    private final Context f13983b;

    public C9409d(Context context) {
        this.f13983b = context;
    }

    /* renamed from: a */
    public Object mo41580a(C12074d<? super C9414i> dVar) {
        DisplayMetrics displayMetrics = this.f13983b.getResources().getDisplayMetrics();
        C9406c.C9407a a = C9404a.m19457a(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new C9414i(a, a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9409d) || !C12775o.m28634d(this.f13983b, ((C9409d) obj).f13983b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f13983b.hashCode();
    }
}
