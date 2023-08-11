package p123i7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;

/* renamed from: i7.h */
/* compiled from: IDynamicLinksCallbacks */
public interface C8201h extends IInterface {
    /* renamed from: H0 */
    void mo42101H0(Status status, C8206j jVar);

    /* renamed from: U1 */
    void mo42102U1(Status status, C8188a aVar);

    /* renamed from: i7.h$a */
    /* compiled from: IDynamicLinksCallbacks */
    public static abstract class C8202a extends Binder implements C8201h {
        public C8202a() {
            attachInterface(this, "com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: i7.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: i7.j} */
        /* JADX WARNING: type inference failed for: r0v0 */
        /* JADX WARNING: type inference failed for: r0v7 */
        /* JADX WARNING: type inference failed for: r0v8 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
                r4 = this;
                r0 = 0
                r1 = 1
                java.lang.String r2 = "com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks"
                if (r5 == r1) goto L_0x003d
                r3 = 2
                if (r5 == r3) goto L_0x0017
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r5 == r0) goto L_0x0013
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0013:
                r7.writeString(r2)
                return r1
            L_0x0017:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0029
                android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r5 = com.google.android.gms.common.api.Status.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                com.google.android.gms.common.api.Status r5 = (com.google.android.gms.common.api.Status) r5
                goto L_0x002a
            L_0x0029:
                r5 = r0
            L_0x002a:
                int r7 = r6.readInt()
                if (r7 == 0) goto L_0x0039
                android.os.Parcelable$Creator<i7.j> r7 = p123i7.C8206j.CREATOR
                java.lang.Object r6 = r7.createFromParcel(r6)
                r0 = r6
                i7.j r0 = (p123i7.C8206j) r0
            L_0x0039:
                r4.mo42101H0(r5, r0)
                return r1
            L_0x003d:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x004f
                android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r5 = com.google.android.gms.common.api.Status.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                com.google.android.gms.common.api.Status r5 = (com.google.android.gms.common.api.Status) r5
                goto L_0x0050
            L_0x004f:
                r5 = r0
            L_0x0050:
                int r7 = r6.readInt()
                if (r7 == 0) goto L_0x005f
                android.os.Parcelable$Creator<i7.a> r7 = p123i7.C8188a.CREATOR
                java.lang.Object r6 = r7.createFromParcel(r6)
                r0 = r6
                i7.a r0 = (p123i7.C8188a) r0
            L_0x005f:
                r4.mo42102U1(r5, r0)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p123i7.C8201h.C8202a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }

        public IBinder asBinder() {
            return this;
        }
    }
}
