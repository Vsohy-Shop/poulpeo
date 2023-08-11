package p231t4;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: t4.n */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C9705n {

    /* renamed from: t4.n$a */
    /* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    public static final class C9706a {

        /* renamed from: a */
        private final List<String> f14502a = new ArrayList();

        /* renamed from: b */
        private final Object f14503b;

        /* synthetic */ C9706a(Object obj, C9741y0 y0Var) {
            C9713p.m20275j(obj);
            this.f14503b = obj;
        }

        @NonNull
        /* renamed from: a */
        public C9706a mo44228a(@NonNull String str, @Nullable Object obj) {
            List<String> list = this.f14502a;
            C9713p.m20275j(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(str.length() + 1 + valueOf.length());
            sb.append(str);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        @NonNull
        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f14503b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f14502a.size();
            for (int i = 0; i < size; i++) {
                sb.append(this.f14502a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static boolean m20258a(@NonNull Bundle bundle, @NonNull Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            if (bundle == bundle2) {
                return true;
            }
            return false;
        } else if (bundle.size() != bundle2.size()) {
            return false;
        } else {
            Set<String> keySet = bundle.keySet();
            if (!keySet.containsAll(bundle2.keySet())) {
                return false;
            }
            for (String next : keySet) {
                if (!m20259b(bundle.get(next), bundle2.get(next))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    public static boolean m20259b(@Nullable Object obj, @Nullable Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static int m20260c(@NonNull Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @NonNull
    /* renamed from: d */
    public static C9706a m20261d(@NonNull Object obj) {
        return new C9706a(obj, (C9741y0) null);
    }
}
