package p150l4;

import android.os.Parcel;
import com.google.android.gms.internal.cast.C4917g0;
import com.google.android.gms.internal.cast.C5205x;
import p109h4.C7910b;

/* renamed from: l4.j */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public abstract class C8691j extends C5205x implements C8693k {
    public C8691j() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean mo32147E(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                int readInt = parcel.readInt();
                C4917g0.m6984b(parcel);
                mo41764q(readInt);
                return true;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                boolean g = C4917g0.m6989g(parcel);
                C4917g0.m6984b(parcel);
                mo41765q1((C7910b) C4917g0.m6983a(parcel, C7910b.CREATOR), readString, readString2, g);
                return true;
            case 3:
                int readInt2 = parcel.readInt();
                C4917g0.m6984b(parcel);
                mo41766t(readInt2);
                return true;
            case 4:
                String readString3 = parcel.readString();
                double readDouble = parcel.readDouble();
                boolean g2 = C4917g0.m6989g(parcel);
                C4917g0.m6984b(parcel);
                mo41758c2(readString3, readDouble, g2);
                return true;
            case 5:
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                C4917g0.m6984b(parcel);
                mo41759d1(readString4, readString5);
                return true;
            case 6:
                String readString6 = parcel.readString();
                byte[] createByteArray = parcel.createByteArray();
                C4917g0.m6984b(parcel);
                mo41754N2(readString6, createByteArray);
                return true;
            case 7:
                int readInt3 = parcel.readInt();
                C4917g0.m6984b(parcel);
                mo41760i(readInt3);
                return true;
            case 8:
                int readInt4 = parcel.readInt();
                C4917g0.m6984b(parcel);
                mo41756a(readInt4);
                return true;
            case 9:
                int readInt5 = parcel.readInt();
                C4917g0.m6984b(parcel);
                mo41761m(readInt5);
                return true;
            case 10:
                String readString7 = parcel.readString();
                long readLong = parcel.readLong();
                int readInt6 = parcel.readInt();
                C4917g0.m6984b(parcel);
                mo41763o0(readString7, readLong, readInt6);
                return true;
            case 11:
                String readString8 = parcel.readString();
                long readLong2 = parcel.readLong();
                C4917g0.m6984b(parcel);
                mo41762n2(readString8, readLong2);
                return true;
            case 12:
                C4917g0.m6984b(parcel);
                mo41757c1((C8677c) C4917g0.m6983a(parcel, C8677c.CREATOR));
                return true;
            case 13:
                C4917g0.m6984b(parcel);
                mo41753I2((C8681e) C4917g0.m6983a(parcel, C8681e.CREATOR));
                return true;
            case 14:
                int readInt7 = parcel.readInt();
                C4917g0.m6984b(parcel);
                mo41755R1(readInt7);
                return true;
            case 15:
                int readInt8 = parcel.readInt();
                C4917g0.m6984b(parcel);
                mo41767z2(readInt8);
                return true;
            default:
                return false;
        }
    }
}
