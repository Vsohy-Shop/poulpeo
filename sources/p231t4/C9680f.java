package p231t4;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.C4718a;
import com.google.android.gms.common.api.Scope;
import p180o4.C8974c;
import p231t4.C9692j;
import p242u4.C9882a;

/* renamed from: t4.f */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C9680f extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C9680f> CREATOR = new C9698k1();

    /* renamed from: b */
    final int f14443b;

    /* renamed from: c */
    final int f14444c;

    /* renamed from: d */
    int f14445d;

    /* renamed from: e */
    String f14446e;

    /* renamed from: f */
    IBinder f14447f;

    /* renamed from: g */
    Scope[] f14448g;

    /* renamed from: h */
    Bundle f14449h;
    @Nullable

    /* renamed from: i */
    Account f14450i;

    /* renamed from: j */
    C8974c[] f14451j;

    /* renamed from: k */
    C8974c[] f14452k;

    /* renamed from: l */
    boolean f14453l;

    /* renamed from: m */
    int f14454m;

    /* renamed from: n */
    boolean f14455n;
    @Nullable

    /* renamed from: o */
    private String f14456o;

    C9680f(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C8974c[] cVarArr, C8974c[] cVarArr2, boolean z, int i4, boolean z2, @Nullable String str2) {
        this.f14443b = i;
        this.f14444c = i2;
        this.f14445d = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f14446e = "com.google.android.gms";
        } else {
            this.f14446e = str;
        }
        if (i < 2) {
            this.f14450i = iBinder != null ? C9659a.m20099J(C9692j.C9693a.m20236G(iBinder)) : null;
        } else {
            this.f14447f = iBinder;
            this.f14450i = account;
        }
        this.f14448g = scopeArr;
        this.f14449h = bundle;
        this.f14451j = cVarArr;
        this.f14452k = cVarArr2;
        this.f14453l = z;
        this.f14454m = i4;
        this.f14455n = z2;
        this.f14456o = str2;
    }

    @Nullable
    /* renamed from: A */
    public final String mo44187A() {
        return this.f14456o;
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        C9698k1.m20241a(this, parcel, i);
    }

    public C9680f(int i, @Nullable String str) {
        this.f14443b = 6;
        this.f14445d = C4718a.f4882a;
        this.f14444c = i;
        this.f14453l = true;
        this.f14456o = str;
    }
}
