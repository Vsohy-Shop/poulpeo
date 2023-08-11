package p332eb;

import androidx.annotation.NonNull;
import com.rmn.iosadapters.android.content.ContextContainer;
import com.rmn.utils_common.IListener;
import java.util.HashMap;
import p305ad.C10865d;
import p446vd.C13630k;

/* renamed from: eb.l */
/* compiled from: CashbackAffiliationController */
public class C11878l extends C10865d {

    /* renamed from: d */
    private boolean f18558d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f18559e;

    /* renamed from: f */
    private IListener<Void> f18560f;

    /* renamed from: eb.l$a */
    /* compiled from: CashbackAffiliationController */
    class C11879a extends HashMap<String, String> {
        C11879a() {
            put(C11878l.this.m25644t2(), C11878l.this.f18559e);
        }
    }

    /* renamed from: eb.l$b */
    /* compiled from: CashbackAffiliationController */
    public static class C11880b extends C10865d.C10866a {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final String f18562d;

        public C11880b(@NonNull ContextContainer contextContainer, String str) {
            super(contextContainer);
            this.f18562d = str;
        }
    }

    public C11878l(C11881m mVar, @NonNull C11880b bVar) {
        super(mVar, bVar);
    }

    @NonNull
    /* renamed from: A2 */
    private C11880b m25638A2() {
        return (C11880b) this.f16656c;
    }

    /* renamed from: q2 */
    private boolean m25642q2() {
        return m25645u2();
    }

    /* renamed from: r2 */
    private C11881m m25643r2() {
        return (C11881m) this.f16655b;
    }

    /* access modifiers changed from: private */
    @NonNull
    /* renamed from: t2 */
    public String m25644t2() {
        return "googleaid";
    }

    /* renamed from: u2 */
    private boolean m25645u2() {
        if (m25638A2().f18562d.equals("24198") || m25638A2().f18562d.equals("47940")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public /* synthetic */ void m25646v2(String str) {
        this.f18559e = str;
        this.f18558d = true;
        IListener<Void> iListener = this.f18560f;
        if (iListener != null) {
            iListener.mo40744J0(null);
            this.f18560f = null;
        }
    }

    /* renamed from: B2 */
    public void mo49079B2(@NonNull IListener<Void> iListener) {
        if (!m25642q2() || this.f18558d) {
            iListener.mo40744J0(null);
        } else {
            this.f18560f = iListener;
        }
    }

    @NonNull
    /* renamed from: s2 */
    public String mo49080s2(@NonNull String str) {
        if (m25645u2()) {
            return C13630k.m31136a(str, new C11879a());
        }
        return str;
    }

    /* renamed from: w2 */
    public void mo49081w2() {
        if (m25643r2() != null && m25642q2()) {
            m25643r2().mo46449T0(new C11877k(this));
        }
    }

    /* renamed from: x2 */
    public void mo49082x2() {
    }

    /* renamed from: y2 */
    public void mo49083y2() {
    }

    /* renamed from: z2 */
    public void mo49084z2() {
    }
}
