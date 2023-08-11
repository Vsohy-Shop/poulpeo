package p062d5;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p036b5.C2888a;
import p161m5.C8825b;
import p161m5.C8826c;

/* renamed from: d5.b */
/* compiled from: com.google.android.gms:play-services-flags@@17.0.1 */
public abstract class C7265b extends C8825b implements C7266c {
    public C7265b() {
        super("com.google.android.gms.flags.IFlagProvider");
    }

    public static C7266c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        if (queryLocalInterface instanceof C7266c) {
            return (C7266c) queryLocalInterface;
        }
        return new C7264a(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo40831E(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            init(C2888a.C2889a.m2295G(parcel.readStrongBinder()));
            parcel2.writeNoException();
        } else if (i == 2) {
            boolean booleanFlagValue = getBooleanFlagValue(parcel.readString(), C8826c.m17889b(parcel), parcel.readInt());
            parcel2.writeNoException();
            C8826c.m17888a(parcel2, booleanFlagValue);
        } else if (i == 3) {
            int intFlagValue = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(intFlagValue);
        } else if (i == 4) {
            long longFlagValue = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeLong(longFlagValue);
        } else if (i != 5) {
            return false;
        } else {
            String stringFlagValue = getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeString(stringFlagValue);
        }
        return true;
    }
}
