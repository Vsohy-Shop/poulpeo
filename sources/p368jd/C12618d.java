package p368jd;

import com.rmn.p324ui.screens.AnimatedActivity;
import kotlin.jvm.internal.C12775o;
import p401oc.C13059a;
import p446vd.C13633n;
import p462yb.C13857a;

/* renamed from: jd.d */
/* compiled from: TrackableActivity.kt */
public abstract class C12618d extends AnimatedActivity {

    /* renamed from: l */
    private C13059a f20267l;

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C13059a aVar = this.f20267l;
        if (aVar == null) {
            String name = getClass().getName();
            C13633n.m31166v("A trackable activity has no initialized tracking : " + name);
            return;
        }
        C12775o.m28636f(aVar);
        aVar.mo50960d(mo47878o2());
    }

    /* renamed from: v2 */
    public final C13059a mo50356v2() {
        C13059a aVar = this.f20267l;
        if (aVar != null) {
            C12775o.m28636f(aVar);
            return aVar;
        }
        throw new IllegalStateException("The trackingScreenName was not set");
    }

    /* access modifiers changed from: protected */
    /* renamed from: w2 */
    public final String mo50357w2() {
        C13059a aVar = this.f20267l;
        if (aVar != null) {
            C12775o.m28636f(aVar);
            String str = aVar.f20871a;
            C12775o.m28638h(str, "trackableScreenController!!.trackingScreenName");
            return str;
        }
        throw new IllegalStateException("The trackingScreenName was not set");
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public final void mo50358x2(String str, boolean z) {
        C12775o.m28639i(str, "trackingScreenName");
        this.f20267l = C13857a.f22382a.mo53543f().mo41542a(str, z);
    }
}
