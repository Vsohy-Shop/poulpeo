package p254v5;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.gtm.C5512qb;

/* renamed from: v5.p */
public abstract class C9955p extends C5512qb implements C9954o {
    public C9955p() {
        super("com.google.android.gms.tagmanager.ITagManagerApi");
    }

    public static C9954o asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.ITagManagerApi");
        if (queryLocalInterface instanceof C9954o) {
            return (C9954o) queryLocalInterface;
        }
        return new C9956q(iBinder);
    }

    /* JADX WARNING: type inference failed for: r13v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r11v4, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo33210E(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) {
        /*
            r9 = this;
            java.lang.String r13 = "com.google.android.gms.tagmanager.ICustomEvaluatorProxy"
            java.lang.String r0 = "com.google.android.gms.tagmanager.IMeasurementProxy"
            r1 = 1
            r2 = 0
            if (r10 == r1) goto L_0x0075
            r3 = 2
            if (r10 == r3) goto L_0x0061
            r3 = 3
            if (r10 == r3) goto L_0x0010
            r10 = 0
            return r10
        L_0x0010:
            android.os.Parcelable$Creator r10 = android.content.Intent.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.gtm.C5513qc.m8434b(r11, r10)
            r4 = r10
            android.content.Intent r4 = (android.content.Intent) r4
            android.os.IBinder r10 = r11.readStrongBinder()
            b5.a r5 = p036b5.C2888a.C2889a.m2295G(r10)
            android.os.IBinder r10 = r11.readStrongBinder()
            b5.a r6 = p036b5.C2888a.C2889a.m2295G(r10)
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 != 0) goto L_0x0031
            r7 = r2
            goto L_0x0042
        L_0x0031:
            android.os.IInterface r0 = r10.queryLocalInterface(r0)
            boolean r3 = r0 instanceof p254v5.C9951l
            if (r3 == 0) goto L_0x003c
            v5.l r0 = (p254v5.C9951l) r0
            goto L_0x0041
        L_0x003c:
            v5.n r0 = new v5.n
            r0.<init>(r10)
        L_0x0041:
            r7 = r0
        L_0x0042:
            android.os.IBinder r10 = r11.readStrongBinder()
            if (r10 != 0) goto L_0x004a
        L_0x0048:
            r8 = r2
            goto L_0x005c
        L_0x004a:
            android.os.IInterface r11 = r10.queryLocalInterface(r13)
            boolean r13 = r11 instanceof p254v5.C9942c
            if (r13 == 0) goto L_0x0056
            r2 = r11
            v5.c r2 = (p254v5.C9942c) r2
            goto L_0x0048
        L_0x0056:
            v5.e r2 = new v5.e
            r2.<init>(r10)
            goto L_0x0048
        L_0x005c:
            r3 = r9
            r3.previewIntent(r4, r5, r6, r7, r8)
            goto L_0x00b0
        L_0x0061:
            android.os.Parcelable$Creator r10 = android.content.Intent.CREATOR
            android.os.Parcelable r10 = com.google.android.gms.internal.gtm.C5513qc.m8434b(r11, r10)
            android.content.Intent r10 = (android.content.Intent) r10
            android.os.IBinder r11 = r11.readStrongBinder()
            b5.a r11 = p036b5.C2888a.C2889a.m2295G(r11)
            r9.preview(r10, r11)
            goto L_0x00b0
        L_0x0075:
            android.os.IBinder r10 = r11.readStrongBinder()
            b5.a r10 = p036b5.C2888a.C2889a.m2295G(r10)
            android.os.IBinder r3 = r11.readStrongBinder()
            if (r3 != 0) goto L_0x0085
            r0 = r2
            goto L_0x0095
        L_0x0085:
            android.os.IInterface r0 = r3.queryLocalInterface(r0)
            boolean r4 = r0 instanceof p254v5.C9951l
            if (r4 == 0) goto L_0x0090
            v5.l r0 = (p254v5.C9951l) r0
            goto L_0x0095
        L_0x0090:
            v5.n r0 = new v5.n
            r0.<init>(r3)
        L_0x0095:
            android.os.IBinder r11 = r11.readStrongBinder()
            if (r11 != 0) goto L_0x009c
            goto L_0x00ad
        L_0x009c:
            android.os.IInterface r13 = r11.queryLocalInterface(r13)
            boolean r2 = r13 instanceof p254v5.C9942c
            if (r2 == 0) goto L_0x00a8
            r2 = r13
            v5.c r2 = (p254v5.C9942c) r2
            goto L_0x00ad
        L_0x00a8:
            v5.e r2 = new v5.e
            r2.<init>(r11)
        L_0x00ad:
            r9.initialize(r10, r0, r2)
        L_0x00b0:
            r12.writeNoException()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p254v5.C9955p.mo33210E(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
