package p339fc;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fc.e */
/* compiled from: DeepLinkData */
public class C11940e {
    @NonNull

    /* renamed from: a */
    private final Map<String, String> f18657a = new HashMap();

    public C11940e() {
    }

    @Nullable
    /* renamed from: a */
    public final String mo49173a(@NonNull String str) {
        return this.f18657a.get(str);
    }

    @NonNull
    /* renamed from: b */
    public final String mo49174b(@NonNull String str, @NonNull String str2) {
        String a = mo49173a(str);
        if (a == null) {
            return str2;
        }
        return a;
    }

    /* renamed from: c */
    public final void mo49175c(@NonNull String str, @Nullable String str2) {
        if (str2 == null) {
            this.f18657a.remove(str);
        } else {
            this.f18657a.put(str, str2);
        }
    }

    public C11940e(@Nullable Bundle bundle) {
        if (bundle != null) {
            for (String next : bundle.keySet()) {
                mo49175c(next, bundle.getString(next));
            }
        }
    }
}
