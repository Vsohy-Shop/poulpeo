package p210r4;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: r4.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public abstract class C9379a<T> {

    /* renamed from: d */
    private static final Object f13955d = new Object();
    @NonNull

    /* renamed from: a */
    protected final String f13956a;
    @NonNull

    /* renamed from: b */
    protected final T f13957b;
    @Nullable

    /* renamed from: c */
    private T f13958c = null;

    protected C9379a(@NonNull String str, @NonNull T t) {
        this.f13956a = str;
        this.f13957b = t;
    }

    @NonNull
    /* renamed from: a */
    public static C9379a<Float> m19405a(@NonNull String str, @NonNull Float f) {
        return new C9383e(str, f);
    }

    @NonNull
    /* renamed from: b */
    public static C9379a<Integer> m19406b(@NonNull String str, @NonNull Integer num) {
        return new C9382d(str, num);
    }

    @NonNull
    /* renamed from: c */
    public static C9379a<Long> m19407c(@NonNull String str, @NonNull Long l) {
        return new C9381c(str, l);
    }

    @NonNull
    /* renamed from: d */
    public static C9379a<String> m19408d(@NonNull String str, @NonNull String str2) {
        return new C9384f(str, str2);
    }

    @NonNull
    /* renamed from: e */
    public static C9379a<Boolean> m19409e(@NonNull String str, boolean z) {
        return new C9380b(str, Boolean.valueOf(z));
    }
}
