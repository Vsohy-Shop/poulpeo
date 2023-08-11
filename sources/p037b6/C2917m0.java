package p037b6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b6.m0 */
public abstract class C2917m0 extends C2907h0 implements C2919n0 {
    public C2917m0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo28419E(int i, Parcel parcel) {
        switch (i) {
            case 2:
                mo28452j2(parcel.readInt(), (Bundle) C2909i0.m2326a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                int readInt = parcel.readInt();
                Bundle bundle = (Bundle) C2909i0.m2326a(parcel, Bundle.CREATOR);
                mo28457u(readInt);
                return true;
            case 4:
                int readInt2 = parcel.readInt();
                Bundle bundle2 = (Bundle) C2909i0.m2326a(parcel, Bundle.CREATOR);
                mo28446N1(readInt2);
                return true;
            case 5:
                mo28449a(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) C2909i0.m2326a(parcel, creator);
                mo28458v((Bundle) C2909i0.m2326a(parcel, creator));
                return true;
            case 7:
                mo28451b((Bundle) C2909i0.m2326a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle4 = (Bundle) C2909i0.m2326a(parcel, creator2);
                mo28454o((Bundle) C2909i0.m2326a(parcel, creator2));
                return true;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle5 = (Bundle) C2909i0.m2326a(parcel, creator3);
                mo28453k2((Bundle) C2909i0.m2326a(parcel, creator3));
                return true;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                mo28455p((Bundle) C2909i0.m2326a(parcel, creator4), (Bundle) C2909i0.m2326a(parcel, creator4));
                return true;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                mo28456s1((Bundle) C2909i0.m2326a(parcel, creator5), (Bundle) C2909i0.m2326a(parcel, creator5));
                return true;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                mo28447P1((Bundle) C2909i0.m2326a(parcel, creator6), (Bundle) C2909i0.m2326a(parcel, creator6));
                return true;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                Bundle bundle6 = (Bundle) C2909i0.m2326a(parcel, creator7);
                Bundle bundle7 = (Bundle) C2909i0.m2326a(parcel, creator7);
                mo28450b();
                return true;
            case 15:
                Bundle bundle8 = (Bundle) C2909i0.m2326a(parcel, Bundle.CREATOR);
                mo28448a();
                return true;
            default:
                return false;
        }
    }
}
