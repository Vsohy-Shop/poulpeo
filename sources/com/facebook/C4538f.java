package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.io.IOException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p198q2.C9144e0;
import p295z2.C10795b;

/* renamed from: com.facebook.f */
/* compiled from: AuthenticationToken.kt */
public final class C4538f implements Parcelable {
    public static final Parcelable.Creator<C4538f> CREATOR = new C4539a();

    /* renamed from: g */
    public static final C4540b f4181g = new C4540b((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final String f4182b;

    /* renamed from: c */
    private final String f4183c;

    /* renamed from: d */
    private final C4544h f4184d;

    /* renamed from: e */
    private final C4541g f4185e;

    /* renamed from: f */
    private final String f4186f;

    /* renamed from: com.facebook.f$a */
    /* compiled from: AuthenticationToken.kt */
    public static final class C4539a implements Parcelable.Creator<C4538f> {
        C4539a() {
        }

        /* renamed from: a */
        public C4538f createFromParcel(Parcel parcel) {
            C12775o.m28639i(parcel, APIParams.SOURCE);
            return new C4538f(parcel);
        }

        /* renamed from: b */
        public C4538f[] newArray(int i) {
            return new C4538f[i];
        }
    }

    /* renamed from: com.facebook.f$b */
    /* compiled from: AuthenticationToken.kt */
    public static final class C4540b {
        private C4540b() {
        }

        public /* synthetic */ C4540b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C4538f(String str, String str2) {
        C12775o.m28639i(str, "token");
        C12775o.m28639i(str2, "expectedNonce");
        C9144e0.m18688g(str, "token");
        C9144e0.m18688g(str2, "expectedNonce");
        List t0 = C13755w.m31594t0(str, new String[]{"."}, false, 0, 6, (Object) null);
        if (t0.size() == 3) {
            String str3 = (String) t0.get(0);
            String str4 = (String) t0.get(1);
            String str5 = (String) t0.get(2);
            this.f4182b = str;
            this.f4183c = str2;
            C4544h hVar = new C4544h(str3);
            this.f4184d = hVar;
            this.f4185e = new C4541g(str4, str2);
            if (m5591a(str3, str4, str5, hVar.mo31577a())) {
                this.f4186f = str5;
                return;
            }
            throw new IllegalArgumentException("Invalid Signature".toString());
        }
        throw new IllegalArgumentException("Invalid IdToken string".toString());
    }

    /* renamed from: a */
    private final boolean m5591a(String str, String str2, String str3, String str4) {
        try {
            String b = C10795b.m22971b(str4);
            if (b != null) {
                PublicKey a = C10795b.m22970a(b);
                return C10795b.m22972c(a, str + '.' + str2, str3);
            }
        } catch (IOException | InvalidKeySpecException unused) {
        }
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4538f)) {
            return false;
        }
        return C12775o.m28634d(this.f4182b, ((C4538f) obj).f4182b);
    }

    public int hashCode() {
        return 527 + this.f4182b.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C12775o.m28639i(parcel, "dest");
        parcel.writeString(this.f4182b);
        parcel.writeString(this.f4183c);
    }

    public C4538f(Parcel parcel) {
        C12775o.m28639i(parcel, "parcel");
        String readString = parcel.readString();
        C9144e0.m18692k(readString, "token");
        if (readString != null) {
            this.f4182b = readString;
            String readString2 = parcel.readString();
            C9144e0.m18691j(readString2, "expectedNonce");
            if (readString2 != null) {
                this.f4183c = readString2;
                List t0 = C13755w.m31594t0(readString, new String[]{"."}, false, 0, 6, (Object) null);
                this.f4184d = new C4544h((String) t0.get(0));
                this.f4185e = new C4541g((String) t0.get(1), readString2);
                this.f4186f = (String) t0.get(2);
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
