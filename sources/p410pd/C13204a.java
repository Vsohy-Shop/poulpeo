package p410pd;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.rmn.api.p322v2.common.user.LogoutListener;
import com.rmn.iosadapters.android.content.ContextContainer;
import java.util.HashMap;
import p305ad.C10864c;
import p305ad.C10865d;
import p446vd.C13623d;
import p446vd.C13630k;

/* renamed from: pd.a */
/* compiled from: PLPCashbackShareController */
public class C13204a extends C10865d {

    /* renamed from: pd.a$a */
    /* compiled from: PLPCashbackShareController */
    public static class C13205a extends C10865d.C10866a {
        /* access modifiers changed from: private */
        @NonNull

        /* renamed from: d */
        public final String f21012d;

        public C13205a(@NonNull ContextContainer contextContainer, @NonNull String str) {
            super(contextContainer, (LogoutListener) null);
            this.f21012d = str;
        }
    }

    public C13204a(@NonNull C13205a aVar) {
        super((C10864c) null, aVar);
    }

    @NonNull
    /* renamed from: n2 */
    private String m29976n2(@Nullable String str, @Nullable String str2) {
        String str3;
        if (str == null) {
            str3 = "https://www.poulpeo.com" + "/home";
        } else if (str2 != null) {
            str3 = "https://www.poulpeo.com" + "/merchant/" + str + "/offer/" + str2;
        } else {
            str3 = "https://www.poulpeo.com" + "/merchant/" + str;
        }
        return str3 + "?origin=" + m29978v2().f21012d + "&fingerprint=" + C13623d.m31108h(mo45820l2());
    }

    @NonNull
    /* renamed from: q2 */
    private String m29977q2(@Nullable String str, @Nullable String str2) {
        if (str == null) {
            return "https://www.poulpeo.com";
        }
        String str3 = "https://www.poulpeo.com" + "/m-" + str;
        if (str2 == null) {
            return str3;
        }
        return str3 + "_c-" + str2;
    }

    @NonNull
    /* renamed from: v2 */
    private C13205a m29978v2() {
        return (C13205a) this.f16656c;
    }

    @NonNull
    /* renamed from: o2 */
    public String mo52851o2(@Nullable String str) {
        return mo52852p2(str, (String) null);
    }

    @NonNull
    /* renamed from: p2 */
    public String mo52852p2(@Nullable String str, @Nullable String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("link", m29976n2(str, str2));
        hashMap.put("ofl", m29977q2(str, str2));
        hashMap.put("apn", "com.poulpeo");
        hashMap.put("ibi", "com.miwim.poulpeo");
        hashMap.put("isi", "545935519");
        hashMap.put("efr", "1");
        return C13630k.m31136a("https://poulpeo.page.link", hashMap);
    }

    /* renamed from: r2 */
    public void mo52853r2() {
    }

    /* renamed from: s2 */
    public void mo52854s2() {
    }

    /* renamed from: t2 */
    public void mo52855t2() {
    }

    /* renamed from: u2 */
    public void mo52856u2() {
    }
}
