package p109h4;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p150l4.C8673a;
import p220s4.C9493a;
import p231t4.C9705n;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: h4.b */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public class C7910b extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C7910b> CREATOR = new C7973x0();

    /* renamed from: b */
    String f11069b;

    /* renamed from: c */
    String f11070c;

    /* renamed from: d */
    List f11071d;

    /* renamed from: e */
    String f11072e;

    /* renamed from: f */
    Uri f11073f;
    @Nullable

    /* renamed from: g */
    String f11074g;
    @Nullable

    /* renamed from: h */
    private String f11075h;

    private C7910b() {
        this.f11071d = new ArrayList();
    }

    @NonNull
    /* renamed from: A */
    public String mo41655A() {
        return this.f11069b;
    }

    @Nullable
    /* renamed from: F */
    public String mo41656F() {
        return this.f11074g;
    }

    @Deprecated
    @Nullable
    /* renamed from: G */
    public List<C9493a> mo41657G() {
        return null;
    }

    @NonNull
    /* renamed from: H */
    public String mo41658H() {
        return this.f11070c;
    }

    @NonNull
    /* renamed from: I */
    public String mo41659I() {
        return this.f11072e;
    }

    @NonNull
    /* renamed from: J */
    public List<String> mo41660J() {
        return Collections.unmodifiableList(this.f11071d);
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7910b)) {
            return false;
        }
        C7910b bVar = (C7910b) obj;
        if (!C8673a.m17455n(this.f11069b, bVar.f11069b) || !C8673a.m17455n(this.f11070c, bVar.f11070c) || !C8673a.m17455n(this.f11071d, bVar.f11071d) || !C8673a.m17455n(this.f11072e, bVar.f11072e) || !C8673a.m17455n(this.f11073f, bVar.f11073f) || !C8673a.m17455n(this.f11074g, bVar.f11074g) || !C8673a.m17455n(this.f11075h, bVar.f11075h)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C9705n.m20260c(this.f11069b, this.f11070c, this.f11071d, this.f11072e, this.f11073f, this.f11074g);
    }

    @NonNull
    public String toString() {
        int i;
        String str = this.f11069b;
        String str2 = this.f11070c;
        List list = this.f11071d;
        if (list == null) {
            i = 0;
        } else {
            i = list.size();
        }
        String str3 = this.f11072e;
        String valueOf = String.valueOf(this.f11073f);
        String str4 = this.f11074g;
        String str5 = this.f11075h;
        return "applicationId: " + str + ", name: " + str2 + ", namespaces.count: " + i + ", senderAppIdentifier: " + str3 + ", senderAppLaunchUrl: " + valueOf + ", iconUrl: " + str4 + ", type: " + str5;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20539s(parcel, 2, mo41655A(), false);
        C9883b.m20539s(parcel, 3, mo41658H(), false);
        C9883b.m20543w(parcel, 4, mo41657G(), false);
        C9883b.m20541u(parcel, 5, mo41660J(), false);
        C9883b.m20539s(parcel, 6, mo41659I(), false);
        C9883b.m20538r(parcel, 7, this.f11073f, i, false);
        C9883b.m20539s(parcel, 8, mo41656F(), false);
        C9883b.m20539s(parcel, 9, this.f11075h, false);
        C9883b.m20522b(parcel, a);
    }

    C7910b(String str, String str2, @Nullable List list, List list2, String str3, Uri uri, @Nullable String str4, @Nullable String str5) {
        this.f11069b = str;
        this.f11070c = str2;
        this.f11071d = list2;
        this.f11072e = str3;
        this.f11073f = uri;
        this.f11074g = str4;
        this.f11075h = str5;
    }
}
