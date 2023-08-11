package p254v5;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.gtm.C5511qa;
import java.util.Map;

/* renamed from: v5.e */
public final class C9944e extends C5511qa implements C9942c {
    C9944e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
    }

    /* renamed from: O0 */
    public final void mo35448O0(String str, Map map) {
        Parcel E = mo33480E();
        E.writeString(str);
        E.writeMap(map);
        mo33482J(1, E);
    }

    /* renamed from: i1 */
    public final String mo35449i1(String str, Map map) {
        Parcel E = mo33480E();
        E.writeString(str);
        E.writeMap(map);
        Parcel G = mo33481G(2, E);
        String readString = G.readString();
        G.recycle();
        return readString;
    }
}
