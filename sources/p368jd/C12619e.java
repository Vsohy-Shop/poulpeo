package p368jd;

import com.rmn.p324ui.screens.AnimatedActivity;
import kotlin.jvm.internal.C12775o;
import p401oc.C13059a;
import p446vd.C13633n;
import p462yb.C13857a;

/* renamed from: jd.e */
/* compiled from: TrackableFragment.kt */
public abstract class C12619e extends C12617c {

    /* renamed from: c */
    private C13059a f20268c;

    /* renamed from: N0 */
    public final C13059a mo50359N0() {
        C13059a aVar = this.f20268c;
        if (aVar != null) {
            C12775o.m28636f(aVar);
            return aVar;
        }
        throw new IllegalStateException("The trackingScreenName was not set");
    }

    /* renamed from: R0 */
    public final String mo50360R0() {
        C13059a aVar = this.f20268c;
        if (aVar != null) {
            C12775o.m28636f(aVar);
            String str = aVar.f20871a;
            C12775o.m28638h(str, "trackableScreenController!!.trackingScreenName");
            return str;
        }
        throw new IllegalStateException("The trackingScreenName was not set");
    }

    /* access modifiers changed from: protected */
    /* renamed from: l2 */
    public final void mo50361l2(String str, boolean z) {
        C12775o.m28639i(str, "trackingScreenName");
        this.f20268c = C13857a.f22382a.mo53543f().mo41542a(str, z);
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            AnimatedActivity M0 = mo50355M0();
            C13059a aVar = this.f20268c;
            if (aVar == null) {
                String name = getClass().getName();
                C13633n.m31166v("A trackable fragment has no initialized tracking : " + name);
                return;
            }
            C12775o.m28636f(aVar);
            aVar.mo50960d(M0.mo47878o2());
        }
    }

    public void onResume() {
        super.onResume();
        if (isVisible()) {
            AnimatedActivity M0 = mo50355M0();
            C13059a aVar = this.f20268c;
            if (aVar == null) {
                String name = getClass().getName();
                C13633n.m31166v("A trackable fragment has no initialized tracking : " + name);
                return;
            }
            C12775o.m28636f(aVar);
            aVar.mo50960d(M0.mo47878o2());
        }
    }
}
