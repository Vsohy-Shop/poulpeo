package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p150l4.C8673a;
import p150l4.C8708r0;
import p150l4.C8710s0;
import p220s4.C9493a;
import p242u4.C9882a;
import p242u4.C9883b;

/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public class CastDevice extends C9882a implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<CastDevice> CREATOR = new C4705t();

    /* renamed from: b */
    private final String f4493b;

    /* renamed from: c */
    String f4494c;

    /* renamed from: d */
    private InetAddress f4495d;

    /* renamed from: e */
    private final String f4496e;

    /* renamed from: f */
    private final String f4497f;

    /* renamed from: g */
    private final String f4498g;

    /* renamed from: h */
    private final int f4499h;

    /* renamed from: i */
    private final List f4500i;

    /* renamed from: j */
    private final int f4501j;

    /* renamed from: k */
    private final int f4502k;

    /* renamed from: l */
    private final String f4503l;
    @Nullable

    /* renamed from: m */
    private final String f4504m;

    /* renamed from: n */
    private final int f4505n;
    @Nullable

    /* renamed from: o */
    private final String f4506o;

    /* renamed from: p */
    private final byte[] f4507p;
    @Nullable

    /* renamed from: q */
    private final String f4508q;

    /* renamed from: r */
    private final boolean f4509r;
    @Nullable

    /* renamed from: s */
    private final C8710s0 f4510s;

    CastDevice(String str, @Nullable String str2, String str3, String str4, String str5, int i, List list, int i2, int i3, String str6, @Nullable String str7, int i4, @Nullable String str8, byte[] bArr, @Nullable String str9, boolean z, @Nullable C8710s0 s0Var) {
        List list2;
        this.f4493b = m5963Q(str);
        String Q = m5963Q(str2);
        this.f4494c = Q;
        if (!TextUtils.isEmpty(Q)) {
            try {
                this.f4495d = InetAddress.getByName(this.f4494c);
            } catch (UnknownHostException e) {
                String str10 = this.f4494c;
                String message = e.getMessage();
                Log.i("CastDevice", "Unable to convert host address (" + str10 + ") to ipaddress: " + message);
            }
        }
        this.f4496e = m5963Q(str3);
        this.f4497f = m5963Q(str4);
        this.f4498g = m5963Q(str5);
        this.f4499h = i;
        if (list != null) {
            list2 = list;
        } else {
            list2 = new ArrayList();
        }
        this.f4500i = list2;
        this.f4501j = i2;
        this.f4502k = i3;
        this.f4503l = m5963Q(str6);
        this.f4504m = str7;
        this.f4505n = i4;
        this.f4506o = str8;
        this.f4507p = bArr;
        this.f4508q = str9;
        this.f4509r = z;
        this.f4510s = s0Var;
    }

    @Nullable
    /* renamed from: H */
    public static CastDevice m5962H(@Nullable Bundle bundle) {
        ClassLoader classLoader;
        if (bundle == null || (classLoader = CastDevice.class.getClassLoader()) == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    /* renamed from: Q */
    private static String m5963Q(@Nullable String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    @NonNull
    /* renamed from: A */
    public String mo31896A() {
        if (this.f4493b.startsWith("__cast_nearby__")) {
            return this.f4493b.substring(16);
        }
        return this.f4493b;
    }

    @NonNull
    /* renamed from: F */
    public String mo31897F() {
        return this.f4498g;
    }

    @NonNull
    /* renamed from: G */
    public String mo31898G() {
        return this.f4496e;
    }

    @NonNull
    /* renamed from: I */
    public List<C9493a> mo31899I() {
        return Collections.unmodifiableList(this.f4500i);
    }

    @NonNull
    /* renamed from: J */
    public String mo31900J() {
        return this.f4497f;
    }

    /* renamed from: K */
    public int mo31901K() {
        return this.f4499h;
    }

    /* renamed from: L */
    public boolean mo31902L(int i) {
        if ((this.f4501j & i) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public void mo31903M(@NonNull Bundle bundle) {
        if (bundle != null) {
            bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this);
        }
    }

    /* renamed from: N */
    public final int mo31904N() {
        return this.f4501j;
    }

    @Nullable
    /* renamed from: O */
    public final C8710s0 mo31905O() {
        if (this.f4510s == null) {
            boolean L = mo31902L(32);
            boolean L2 = mo31902L(64);
            if (L || L2) {
                return C8708r0.m17599a(1);
            }
        }
        return this.f4510s;
    }

    @Nullable
    /* renamed from: P */
    public final String mo31906P() {
        return this.f4504m;
    }

    public boolean equals(@Nullable Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        String str = this.f4493b;
        if (str == null) {
            if (castDevice.f4493b == null) {
                return true;
            }
            return false;
        } else if (!C8673a.m17455n(str, castDevice.f4493b) || !C8673a.m17455n(this.f4495d, castDevice.f4495d) || !C8673a.m17455n(this.f4497f, castDevice.f4497f) || !C8673a.m17455n(this.f4496e, castDevice.f4496e) || !C8673a.m17455n(this.f4498g, castDevice.f4498g) || this.f4499h != castDevice.f4499h || !C8673a.m17455n(this.f4500i, castDevice.f4500i) || this.f4501j != castDevice.f4501j || this.f4502k != castDevice.f4502k || !C8673a.m17455n(this.f4503l, castDevice.f4503l) || !C8673a.m17455n(Integer.valueOf(this.f4505n), Integer.valueOf(castDevice.f4505n)) || !C8673a.m17455n(this.f4506o, castDevice.f4506o) || !C8673a.m17455n(this.f4504m, castDevice.f4504m) || !C8673a.m17455n(this.f4498g, castDevice.mo31897F()) || this.f4499h != castDevice.mo31901K() || ((((bArr = this.f4507p) != null || castDevice.f4507p != null) && !Arrays.equals(bArr, castDevice.f4507p)) || !C8673a.m17455n(this.f4508q, castDevice.f4508q) || this.f4509r != castDevice.f4509r || !C8673a.m17455n(mo31905O(), castDevice.mo31905O()))) {
            return false;
        } else {
            return true;
        }
    }

    public int hashCode() {
        String str = this.f4493b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NonNull
    public String toString() {
        return String.format("\"%s\" (%s)", new Object[]{this.f4496e, this.f4493b});
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20539s(parcel, 2, this.f4493b, false);
        C9883b.m20539s(parcel, 3, this.f4494c, false);
        C9883b.m20539s(parcel, 4, mo31898G(), false);
        C9883b.m20539s(parcel, 5, mo31900J(), false);
        C9883b.m20539s(parcel, 6, mo31897F(), false);
        C9883b.m20532l(parcel, 7, mo31901K());
        C9883b.m20543w(parcel, 8, mo31899I(), false);
        C9883b.m20532l(parcel, 9, this.f4501j);
        C9883b.m20532l(parcel, 10, this.f4502k);
        C9883b.m20539s(parcel, 11, this.f4503l, false);
        C9883b.m20539s(parcel, 12, this.f4504m, false);
        C9883b.m20532l(parcel, 13, this.f4505n);
        C9883b.m20539s(parcel, 14, this.f4506o, false);
        C9883b.m20526f(parcel, 15, this.f4507p, false);
        C9883b.m20539s(parcel, 16, this.f4508q, false);
        C9883b.m20523c(parcel, 17, this.f4509r);
        C9883b.m20538r(parcel, 18, mo31905O(), i, false);
        C9883b.m20522b(parcel, a);
    }
}
