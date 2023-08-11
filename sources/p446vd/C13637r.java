package p446vd;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* renamed from: vd.r */
/* compiled from: UniqueCodeCacheUtil */
public class C13637r {
    @NonNull

    /* renamed from: b */
    public static final C13637r f21957b = new C13637r();
    @NonNull

    /* renamed from: a */
    private final HashMap<String, String> f21958a = new HashMap<>();

    private C13637r() {
    }

    @Nullable
    /* renamed from: a */
    public String mo53304a(@NonNull String str) {
        return this.f21958a.getOrDefault(str, (Object) null);
    }

    /* renamed from: b */
    public boolean mo53305b(@NonNull String str) {
        return this.f21958a.containsKey(str);
    }

    /* renamed from: c */
    public void mo53306c(@NonNull String str, @NonNull String str2) {
        this.f21958a.put(str, str2);
    }
}
