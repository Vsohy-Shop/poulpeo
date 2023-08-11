package p446vd;

import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.C7028a;
import com.rmn.utils_common.IListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: vd.i */
/* compiled from: FirebaseRemoteConfigWrapper */
public class C13628i {
    /* renamed from: e */
    public static void m31122e(IListener<Void> iListener) {
        Task<Boolean> d = C7028a.m12458f().mo40020d();
        if (iListener != null) {
            d.mo35452c(new C13627h(iListener));
        }
    }

    /* renamed from: f */
    public static void m31123f(long j, IListener<String> iListener, String str) {
        C13625f fVar;
        if (iListener != null) {
            fVar = new C13625f(iListener, str);
        } else {
            fVar = null;
        }
        m31124g(j, fVar, str);
    }

    /* renamed from: g */
    public static void m31124g(long j, IListener<Map<String, String>> iListener, String... strArr) {
        C7028a.m12458f().mo40021e(j).mo35456g(new C13624e(iListener, strArr));
    }

    /* renamed from: h */
    public static String m31125h(String str) {
        return C7028a.m12458f().mo40022h(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ void m31127j(IListener iListener, String str, Map map) {
        if (map != null) {
            iListener.mo40744J0((String) map.get(str));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ void m31129l(String[] strArr, IListener iListener, Void voidR) {
        HashMap hashMap = new HashMap();
        for (String str : strArr) {
            hashMap.put(str, m31125h(str));
        }
        iListener.mo40744J0(hashMap);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static void m31130m(IListener<Map<String, String>> iListener, String... strArr) {
        if (iListener == null) {
            m31122e((IListener<Void>) null);
        } else {
            m31122e(new C13626g(strArr, iListener));
        }
    }
}
