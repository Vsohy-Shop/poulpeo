package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.cast.C5240z0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: com.google.android.gms.cast.framework.media.g */
/* compiled from: com.google.android.gms:play-services-cast-framework@@21.2.0 */
public class C4646g extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C4646g> CREATOR = new C4657j();

    /* renamed from: J */
    private static final C5240z0 f4691J = C5240z0.m7714z(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK, MediaIntentReceiver.ACTION_STOP_CASTING);

    /* renamed from: K */
    private static final int[] f4692K = {0, 1};

    /* renamed from: A */
    private final int f4693A;

    /* renamed from: B */
    private final int f4694B;

    /* renamed from: C */
    private final int f4695C;

    /* renamed from: D */
    private final int f4696D;

    /* renamed from: E */
    private final int f4697E;

    /* renamed from: F */
    private final int f4698F;
    @Nullable

    /* renamed from: G */
    private final C4658j0 f4699G;

    /* renamed from: H */
    private final boolean f4700H;

    /* renamed from: I */
    private final boolean f4701I;

    /* renamed from: b */
    private final List f4702b;

    /* renamed from: c */
    private final int[] f4703c;

    /* renamed from: d */
    private final long f4704d;

    /* renamed from: e */
    private final String f4705e;

    /* renamed from: f */
    private final int f4706f;

    /* renamed from: g */
    private final int f4707g;

    /* renamed from: h */
    private final int f4708h;

    /* renamed from: i */
    private final int f4709i;

    /* renamed from: j */
    private final int f4710j;

    /* renamed from: k */
    private final int f4711k;

    /* renamed from: l */
    private final int f4712l;

    /* renamed from: m */
    private final int f4713m;

    /* renamed from: n */
    private final int f4714n;

    /* renamed from: o */
    private final int f4715o;

    /* renamed from: p */
    private final int f4716p;

    /* renamed from: q */
    private final int f4717q;

    /* renamed from: r */
    private final int f4718r;

    /* renamed from: s */
    private final int f4719s;

    /* renamed from: t */
    private final int f4720t;

    /* renamed from: u */
    private final int f4721u;

    /* renamed from: v */
    private final int f4722v;

    /* renamed from: w */
    private final int f4723w;

    /* renamed from: x */
    private final int f4724x;

    /* renamed from: y */
    private final int f4725y;

    /* renamed from: z */
    private final int f4726z;

    public C4646g(@NonNull List list, @NonNull int[] iArr, long j, @NonNull String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, @Nullable IBinder iBinder, boolean z, boolean z2) {
        IBinder iBinder2 = iBinder;
        List list2 = list;
        this.f4702b = new ArrayList(list);
        this.f4703c = Arrays.copyOf(iArr, iArr.length);
        this.f4704d = j;
        this.f4705e = str;
        this.f4706f = i;
        this.f4707g = i2;
        this.f4708h = i3;
        this.f4709i = i4;
        this.f4710j = i5;
        this.f4711k = i6;
        this.f4712l = i7;
        this.f4713m = i8;
        this.f4714n = i9;
        this.f4715o = i10;
        this.f4716p = i11;
        this.f4717q = i12;
        this.f4718r = i13;
        this.f4719s = i14;
        this.f4720t = i15;
        this.f4721u = i16;
        this.f4722v = i17;
        this.f4723w = i18;
        this.f4724x = i19;
        this.f4725y = i20;
        this.f4726z = i21;
        this.f4693A = i22;
        this.f4694B = i23;
        this.f4695C = i24;
        this.f4696D = i25;
        this.f4697E = i26;
        this.f4698F = i27;
        this.f4700H = z;
        this.f4701I = z2;
        if (iBinder2 == null) {
            this.f4699G = null;
            return;
        }
        IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider");
        this.f4699G = queryLocalInterface instanceof C4658j0 ? (C4658j0) queryLocalInterface : new C4656i0(iBinder2);
    }

    @NonNull
    /* renamed from: A */
    public List<String> mo32112A() {
        return this.f4702b;
    }

    /* renamed from: F */
    public int mo32113F() {
        return this.f4720t;
    }

    @NonNull
    /* renamed from: G */
    public int[] mo32114G() {
        int[] iArr = this.f4703c;
        return Arrays.copyOf(iArr, iArr.length);
    }

    /* renamed from: H */
    public int mo32115H() {
        return this.f4718r;
    }

    /* renamed from: I */
    public int mo32116I() {
        return this.f4713m;
    }

    /* renamed from: J */
    public int mo32117J() {
        return this.f4714n;
    }

    /* renamed from: K */
    public int mo32118K() {
        return this.f4712l;
    }

    /* renamed from: L */
    public int mo32119L() {
        return this.f4708h;
    }

    /* renamed from: M */
    public int mo32120M() {
        return this.f4709i;
    }

    /* renamed from: N */
    public int mo32121N() {
        return this.f4716p;
    }

    /* renamed from: O */
    public int mo32122O() {
        return this.f4717q;
    }

    /* renamed from: P */
    public int mo32123P() {
        return this.f4715o;
    }

    /* renamed from: Q */
    public int mo32124Q() {
        return this.f4710j;
    }

    /* renamed from: R */
    public int mo32125R() {
        return this.f4711k;
    }

    /* renamed from: S */
    public long mo32126S() {
        return this.f4704d;
    }

    /* renamed from: T */
    public int mo32127T() {
        return this.f4706f;
    }

    /* renamed from: U */
    public int mo32128U() {
        return this.f4707g;
    }

    /* renamed from: V */
    public int mo32129V() {
        return this.f4721u;
    }

    @NonNull
    /* renamed from: W */
    public String mo32130W() {
        return this.f4705e;
    }

    /* renamed from: X */
    public final int mo32131X() {
        return this.f4698F;
    }

    /* renamed from: Y */
    public final int mo32132Y() {
        return this.f4693A;
    }

    /* renamed from: Z */
    public final int mo32133Z() {
        return this.f4694B;
    }

    /* renamed from: a0 */
    public final int mo32134a0() {
        return this.f4726z;
    }

    /* renamed from: b0 */
    public final int mo32135b0() {
        return this.f4719s;
    }

    /* renamed from: c0 */
    public final int mo32136c0() {
        return this.f4722v;
    }

    /* renamed from: d0 */
    public final int mo32137d0() {
        return this.f4723w;
    }

    /* renamed from: e0 */
    public final int mo32138e0() {
        return this.f4696D;
    }

    /* renamed from: f0 */
    public final int mo32139f0() {
        return this.f4697E;
    }

    /* renamed from: g0 */
    public final int mo32140g0() {
        return this.f4695C;
    }

    /* renamed from: h0 */
    public final int mo32141h0() {
        return this.f4724x;
    }

    /* renamed from: i0 */
    public final int mo32142i0() {
        return this.f4725y;
    }

    @Nullable
    /* renamed from: j0 */
    public final C4658j0 mo32143j0() {
        return this.f4699G;
    }

    /* renamed from: k0 */
    public final boolean mo32144k0() {
        return this.f4701I;
    }

    /* renamed from: l0 */
    public final boolean mo32145l0() {
        return this.f4700H;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        IBinder iBinder;
        int a = C9883b.m20521a(parcel);
        C9883b.m20541u(parcel, 2, mo32112A(), false);
        C9883b.m20533m(parcel, 3, mo32114G(), false);
        C9883b.m20535o(parcel, 4, mo32126S());
        C9883b.m20539s(parcel, 5, mo32130W(), false);
        C9883b.m20532l(parcel, 6, mo32127T());
        C9883b.m20532l(parcel, 7, mo32128U());
        C9883b.m20532l(parcel, 8, mo32119L());
        C9883b.m20532l(parcel, 9, mo32120M());
        C9883b.m20532l(parcel, 10, mo32124Q());
        C9883b.m20532l(parcel, 11, mo32125R());
        C9883b.m20532l(parcel, 12, mo32118K());
        C9883b.m20532l(parcel, 13, mo32116I());
        C9883b.m20532l(parcel, 14, mo32117J());
        C9883b.m20532l(parcel, 15, mo32123P());
        C9883b.m20532l(parcel, 16, mo32121N());
        C9883b.m20532l(parcel, 17, mo32122O());
        C9883b.m20532l(parcel, 18, mo32115H());
        C9883b.m20532l(parcel, 19, this.f4719s);
        C9883b.m20532l(parcel, 20, mo32113F());
        C9883b.m20532l(parcel, 21, mo32129V());
        C9883b.m20532l(parcel, 22, this.f4722v);
        C9883b.m20532l(parcel, 23, this.f4723w);
        C9883b.m20532l(parcel, 24, this.f4724x);
        C9883b.m20532l(parcel, 25, this.f4725y);
        C9883b.m20532l(parcel, 26, this.f4726z);
        C9883b.m20532l(parcel, 27, this.f4693A);
        C9883b.m20532l(parcel, 28, this.f4694B);
        C9883b.m20532l(parcel, 29, this.f4695C);
        C9883b.m20532l(parcel, 30, this.f4696D);
        C9883b.m20532l(parcel, 31, this.f4697E);
        C9883b.m20532l(parcel, 32, this.f4698F);
        C4658j0 j0Var = this.f4699G;
        if (j0Var == null) {
            iBinder = null;
        } else {
            iBinder = j0Var.asBinder();
        }
        C9883b.m20531k(parcel, 33, iBinder, false);
        C9883b.m20523c(parcel, 34, this.f4700H);
        C9883b.m20523c(parcel, 35, this.f4701I);
        C9883b.m20522b(parcel, a);
    }
}
