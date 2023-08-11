package p254v5;

import android.os.Parcel;
import com.google.android.gms.internal.gtm.C5512qb;
import com.google.android.gms.internal.gtm.C5513qc;

/* renamed from: v5.d */
public abstract class C9943d extends C5512qb implements C9942c {
    public C9943d() {
        super("com.google.android.gms.tagmanager.ICustomEvaluatorProxy");
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo33210E(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            mo35448O0(parcel.readString(), C5513qc.m8438f(parcel));
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            String i1 = mo35449i1(parcel.readString(), C5513qc.m8438f(parcel));
            parcel2.writeNoException();
            parcel2.writeString(i1);
        }
        return true;
    }
}
