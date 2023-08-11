package p286y4;

import android.os.SystemClock;
import androidx.annotation.NonNull;

/* renamed from: y4.h */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C10674h implements C10671e {

    /* renamed from: a */
    private static final C10674h f16249a = new C10674h();

    private C10674h() {
    }

    @NonNull
    /* renamed from: c */
    public static C10671e m22680c() {
        return f16249a;
    }

    /* renamed from: a */
    public final long mo33547a() {
        return System.currentTimeMillis();
    }

    /* renamed from: b */
    public final long mo33548b() {
        return SystemClock.elapsedRealtime();
    }

    public final long nanoTime() {
        return System.nanoTime();
    }
}
