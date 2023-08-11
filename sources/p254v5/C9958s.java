package p254v5;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.gtm.C5512qb;

/* renamed from: v5.s */
public abstract class C9958s extends C5512qb implements C9957r {
    public C9958s() {
        super("com.google.android.gms.tagmanager.ITagManagerServiceProvider");
    }

    public static C9957r asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tagmanager.ITagManagerServiceProvider");
        if (queryLocalInterface instanceof C9957r) {
            return (C9957r) queryLocalInterface;
        }
        return new C9959t(iBinder);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo33210E(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
        /*
            r4 = this;
            r8 = 1
            if (r5 != r8) goto L_0x004b
            android.os.IBinder r5 = r6.readStrongBinder()
            b5.a r5 = p036b5.C2888a.C2889a.m2295G(r5)
            android.os.IBinder r0 = r6.readStrongBinder()
            r1 = 0
            if (r0 != 0) goto L_0x0014
            r2 = r1
            goto L_0x0026
        L_0x0014:
            java.lang.String r2 = "com.google.android.gms.tagmanager.IMeasurementProxy"
            android.os.IInterface r2 = r0.queryLocalInterface(r2)
            boolean r3 = r2 instanceof p254v5.C9951l
            if (r3 == 0) goto L_0x0021
            v5.l r2 = (p254v5.C9951l) r2
            goto L_0x0026
        L_0x0021:
            v5.n r2 = new v5.n
            r2.<init>(r0)
        L_0x0026:
            android.os.IBinder r6 = r6.readStrongBinder()
            if (r6 != 0) goto L_0x002d
            goto L_0x0040
        L_0x002d:
            java.lang.String r0 = "com.google.android.gms.tagmanager.ICustomEvaluatorProxy"
            android.os.IInterface r0 = r6.queryLocalInterface(r0)
            boolean r1 = r0 instanceof p254v5.C9942c
            if (r1 == 0) goto L_0x003b
            r1 = r0
            v5.c r1 = (p254v5.C9942c) r1
            goto L_0x0040
        L_0x003b:
            v5.e r1 = new v5.e
            r1.<init>(r6)
        L_0x0040:
            com.google.android.gms.internal.gtm.h3 r5 = r4.getService(r5, r2, r1)
            r7.writeNoException()
            com.google.android.gms.internal.gtm.C5513qc.m8435c(r7, r5)
            return r8
        L_0x004b:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p254v5.C9958s.mo33210E(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
