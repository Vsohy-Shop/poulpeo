package p037b6;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* renamed from: b6.j0 */
public final class C2911j0 extends C2905g0 implements C2915l0 {
    C2911j0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    /* renamed from: J2 */
    public final void mo28436J2(String str, Bundle bundle, C2919n0 n0Var) {
        Parcel E = mo28430E();
        E.writeString(str);
        C2909i0.m2328c(E, bundle);
        C2909i0.m2327b(E, n0Var);
        mo28431G(10, E);
    }

    /* renamed from: P2 */
    public final void mo28437P2(String str, Bundle bundle, Bundle bundle2, C2919n0 n0Var) {
        Parcel E = mo28430E();
        E.writeString(str);
        C2909i0.m2328c(E, bundle);
        C2909i0.m2328c(E, bundle2);
        C2909i0.m2327b(E, n0Var);
        mo28431G(9, E);
    }

    /* renamed from: S */
    public final void mo28438S(String str, Bundle bundle, Bundle bundle2, C2919n0 n0Var) {
        Parcel E = mo28430E();
        E.writeString(str);
        C2909i0.m2328c(E, bundle);
        C2909i0.m2328c(E, bundle2);
        C2909i0.m2327b(E, n0Var);
        mo28431G(7, E);
    }

    /* renamed from: W2 */
    public final void mo28439W2(String str, Bundle bundle, C2919n0 n0Var) {
        Parcel E = mo28430E();
        E.writeString(str);
        C2909i0.m2328c(E, bundle);
        C2909i0.m2327b(E, n0Var);
        mo28431G(5, E);
    }

    /* renamed from: r0 */
    public final void mo28440r0(String str, Bundle bundle, Bundle bundle2, C2919n0 n0Var) {
        Parcel E = mo28430E();
        E.writeString(str);
        C2909i0.m2328c(E, bundle);
        C2909i0.m2328c(E, bundle2);
        C2909i0.m2327b(E, n0Var);
        mo28431G(6, E);
    }

    /* renamed from: t2 */
    public final void mo28441t2(String str, List<Bundle> list, Bundle bundle, C2919n0 n0Var) {
        Parcel E = mo28430E();
        E.writeString(str);
        E.writeTypedList(list);
        C2909i0.m2328c(E, bundle);
        C2909i0.m2327b(E, n0Var);
        mo28431G(14, E);
    }

    /* renamed from: v2 */
    public final void mo28442v2(String str, Bundle bundle, Bundle bundle2, C2919n0 n0Var) {
        Parcel E = mo28430E();
        E.writeString(str);
        C2909i0.m2328c(E, bundle);
        C2909i0.m2328c(E, bundle2);
        C2909i0.m2327b(E, n0Var);
        mo28431G(11, E);
    }
}
