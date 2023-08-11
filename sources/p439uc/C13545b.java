package p439uc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.utils_common.IListener;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p415qc.C13240e;
import p415qc.C13242g;
import p446vd.C13628i;
import p446vd.C13636q;

/* renamed from: uc.b */
/* compiled from: FirebaseABTestWrapper */
public class C13545b {

    /* renamed from: uc.b$a */
    /* compiled from: FirebaseABTestWrapper */
    public static class C13546a {
        @NonNull

        /* renamed from: a */
        public final String f21804a;
        @NonNull

        /* renamed from: b */
        public final String f21805b;
        @NonNull

        /* renamed from: c */
        private final Map<String, String> f21806c;

        public C13546a(@NonNull String str, @NonNull String str2, @Nullable Map<String, String> map) {
            HashMap hashMap = new HashMap();
            this.f21806c = hashMap;
            this.f21804a = str;
            this.f21805b = str2;
            if (map != null) {
                hashMap.putAll(map);
            }
        }

        @NonNull
        /* renamed from: a */
        public Map<String, String> mo53188a() {
            return new HashMap(this.f21806c);
        }
    }

    /* renamed from: b */
    public static void m30928b(@NonNull ContextContainer contextContainer, @Nullable IListener<C13546a> iListener, @NonNull String... strArr) {
        HashSet hashSet = new HashSet(Arrays.asList(strArr));
        hashSet.add("experiment_id");
        hashSet.add("experiment_version");
        C13628i.m31124g(0, new C13544a(iListener, contextContainer), (String[]) hashSet.toArray(strArr));
    }

    @Nullable
    /* renamed from: c */
    public static C13546a m30929c(@NonNull ContextContainer contextContainer, @NonNull String... strArr) {
        C13636q b = C13636q.m31181b(contextContainer);
        String i = b.mo53298i("experiment_id", (String) null);
        String i2 = b.mo53298i("experiment_version", (String) null);
        if (i == null || i2 == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : strArr) {
            String i3 = b.mo53298i(str, (String) null);
            if (i3 != null) {
                hashMap.put(str, i3);
            }
        }
        return new C13546a(i, i2, hashMap);
    }

    /* renamed from: d */
    public static void m30930d(@NonNull ContextContainer contextContainer) {
        C13636q b = C13636q.m31181b(contextContainer);
        String i = b.mo53298i("experiment_id", (String) null);
        String i2 = b.mo53298i("experiment_version", (String) null);
        if (i != null && i2 != null) {
            C13240e.m30073a(contextContainer, C13242g.f21081L, i);
            C13240e.m30073a(contextContainer, C13242g.f21082M, i2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m30931e(IListener iListener, ContextContainer contextContainer, Map map) {
        if (map != null) {
            String str = (String) map.remove("experiment_id");
            String str2 = (String) map.remove("experiment_version");
            if (str != null && str2 != null) {
                C13636q b = C13636q.m31181b(contextContainer);
                b.mo53303n("experiment_id", str);
                b.mo53303n("experiment_version", str2);
                for (Map.Entry entry : map.entrySet()) {
                    b.mo53303n((String) entry.getKey(), (String) entry.getValue());
                }
                C13240e.m30073a(contextContainer, C13242g.f21081L, str);
                C13240e.m30073a(contextContainer, C13242g.f21082M, str2);
                if (iListener != null) {
                    iListener.mo40744J0(new C13546a(str, str2, map));
                }
            } else if (iListener != null) {
                iListener.mo40744J0(null);
            }
        } else if (iListener != null) {
            iListener.mo40744J0(null);
        }
    }
}
