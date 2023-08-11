package p201q5;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.C5899p0;
import com.google.android.gms.internal.measurement.C5915q0;
import com.google.android.gms.measurement.internal.C6103c;
import com.google.android.gms.measurement.internal.C6190j9;
import com.google.android.gms.measurement.internal.C6289s9;
import com.google.android.gms.measurement.internal.C6290t;
import java.util.List;

/* renamed from: q5.c */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
public abstract class C9256c extends C5899p0 implements C9257d {
    public C9256c() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo33878E(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                mo34767z1((C6290t) C5915q0.m9775a(parcel, C6290t.CREATOR), (C6289s9) C5915q0.m9775a(parcel, C6289s9.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                mo34766y2((C6190j9) C5915q0.m9775a(parcel, C6190j9.CREATOR), (C6289s9) C5915q0.m9775a(parcel, C6289s9.CREATOR));
                parcel2.writeNoException();
                return true;
            case 4:
                mo34759e1((C6289s9) C5915q0.m9775a(parcel, C6289s9.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                mo34967A2((C6290t) C5915q0.m9775a(parcel, C6290t.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                mo34763r1((C6289s9) C5915q0.m9775a(parcel, C6289s9.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                List<C6190j9> x2 = mo34765x2((C6289s9) C5915q0.m9775a(parcel, C6289s9.CREATOR), C5915q0.m9780f(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(x2);
                return true;
            case 9:
                byte[] S0 = mo34757S0((C6290t) C5915q0.m9775a(parcel, C6290t.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(S0);
                return true;
            case 10:
                mo34754G1(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String v0 = mo34764v0((C6289s9) C5915q0.m9775a(parcel, C6289s9.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(v0);
                return true;
            case 12:
                mo34758X((C6103c) C5915q0.m9775a(parcel, C6103c.CREATOR), (C6289s9) C5915q0.m9775a(parcel, C6289s9.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                mo34968D0((C6103c) C5915q0.m9775a(parcel, C6103c.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                List<C6190j9> J1 = mo34755J1(parcel.readString(), parcel.readString(), C5915q0.m9780f(parcel), (C6289s9) C5915q0.m9775a(parcel, C6289s9.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(J1);
                return true;
            case 15:
                List<C6190j9> f0 = mo34760f0(parcel.readString(), parcel.readString(), parcel.readString(), C5915q0.m9780f(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(f0);
                return true;
            case 16:
                List<C6103c> g1 = mo34761g1(parcel.readString(), parcel.readString(), (C6289s9) C5915q0.m9775a(parcel, C6289s9.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(g1);
                return true;
            case 17:
                List<C6103c> F0 = mo34753F0(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(F0);
                return true;
            case 18:
                mo34762i0((C6289s9) C5915q0.m9775a(parcel, C6289s9.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                mo34756R((Bundle) C5915q0.m9775a(parcel, Bundle.CREATOR), (C6289s9) C5915q0.m9775a(parcel, C6289s9.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                mo34752D1((C6289s9) C5915q0.m9775a(parcel, C6289s9.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
