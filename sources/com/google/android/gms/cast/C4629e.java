package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;
import p109h4.C7931g;
import p109h4.C7963s0;
import p220s4.C9493a;
import p231t4.C9705n;
import p242u4.C9882a;
import p242u4.C9883b;

/* renamed from: com.google.android.gms.cast.e */
/* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
public class C4629e extends C9882a {
    @NonNull
    public static final Parcelable.Creator<C4629e> CREATOR = new C4700o();

    /* renamed from: b */
    private int f4598b;
    @Nullable

    /* renamed from: c */
    private String f4599c;
    @Nullable

    /* renamed from: d */
    private List f4600d;
    @Nullable

    /* renamed from: e */
    private List f4601e;

    /* renamed from: f */
    private double f4602f;

    /* renamed from: com.google.android.gms.cast.e$a */
    /* compiled from: com.google.android.gms:play-services-cast@@21.2.0 */
    public static class C4630a {

        /* renamed from: a */
        private final C4629e f4603a = new C4629e((C7963s0) null);

        @NonNull
        /* renamed from: a */
        public C4629e mo32011a() {
            return new C4629e(this.f4603a, (C7963s0) null);
        }

        @NonNull
        /* renamed from: b */
        public final C4630a mo32012b(@NonNull JSONObject jSONObject) {
            C4629e.m6052J(this.f4603a, jSONObject);
            return this;
        }
    }

    private C4629e() {
        m6053K();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0074  */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* bridge */ /* synthetic */ void m6052J(com.google.android.gms.cast.C4629e r5, org.json.JSONObject r6) {
        /*
            r5.m6053K()
            java.lang.String r0 = "containerType"
            java.lang.String r1 = ""
            java.lang.String r0 = r6.optString(r0, r1)
            int r1 = r0.hashCode()
            r2 = 6924225(0x69a7c1, float:9.702906E-39)
            r3 = 0
            r4 = 1
            if (r1 == r2) goto L_0x0026
            r2 = 828666841(0x316473d9, float:3.3244218E-9)
            if (r1 == r2) goto L_0x001c
            goto L_0x0030
        L_0x001c:
            java.lang.String r1 = "GENERIC_CONTAINER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0030
            r0 = r3
            goto L_0x0031
        L_0x0026:
            java.lang.String r1 = "AUDIOBOOK_CONTAINER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0030
            r0 = r4
            goto L_0x0031
        L_0x0030:
            r0 = -1
        L_0x0031:
            if (r0 == 0) goto L_0x0039
            if (r0 == r4) goto L_0x0036
            goto L_0x003b
        L_0x0036:
            r5.f4598b = r4
            goto L_0x003b
        L_0x0039:
            r5.f4598b = r3
        L_0x003b:
            java.lang.String r0 = "title"
            java.lang.String r0 = p150l4.C8673a.m17444c(r6, r0)
            r5.f4599c = r0
            java.lang.String r0 = "sections"
            org.json.JSONArray r0 = r6.optJSONArray(r0)
            if (r0 == 0) goto L_0x006c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f4600d = r1
        L_0x0052:
            int r2 = r0.length()
            if (r3 >= r2) goto L_0x006c
            org.json.JSONObject r2 = r0.optJSONObject(r3)
            if (r2 == 0) goto L_0x0069
            h4.g r4 = new h4.g
            r4.<init>()
            r4.mo41713K(r2)
            r1.add(r4)
        L_0x0069:
            int r3 = r3 + 1
            goto L_0x0052
        L_0x006c:
            java.lang.String r0 = "containerImages"
            org.json.JSONArray r0 = r6.optJSONArray(r0)
            if (r0 == 0) goto L_0x007e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f4601e = r1
            p160m4.C8823b.m17884c(r1, r0)
        L_0x007e:
            java.lang.String r0 = "containerDuration"
            double r1 = r5.f4602f
            double r0 = r6.optDouble(r0, r1)
            r5.f4602f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.C4629e.m6052J(com.google.android.gms.cast.e, org.json.JSONObject):void");
    }

    /* renamed from: K */
    private final void m6053K() {
        this.f4598b = 0;
        this.f4599c = null;
        this.f4600d = null;
        this.f4601e = null;
        this.f4602f = 0.0d;
    }

    /* renamed from: A */
    public double mo32003A() {
        return this.f4602f;
    }

    @Nullable
    /* renamed from: F */
    public List<C9493a> mo32004F() {
        List list = this.f4601e;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    /* renamed from: G */
    public int mo32005G() {
        return this.f4598b;
    }

    @Nullable
    /* renamed from: H */
    public List<C7931g> mo32006H() {
        List list = this.f4600d;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    @Nullable
    /* renamed from: I */
    public String mo32007I() {
        return this.f4599c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4629e)) {
            return false;
        }
        C4629e eVar = (C4629e) obj;
        if (this.f4598b != eVar.f4598b || !TextUtils.equals(this.f4599c, eVar.f4599c) || !C9705n.m20259b(this.f4600d, eVar.f4600d) || !C9705n.m20259b(this.f4601e, eVar.f4601e) || this.f4602f != eVar.f4602f) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C9705n.m20260c(Integer.valueOf(this.f4598b), this.f4599c, this.f4600d, this.f4601e, Double.valueOf(this.f4602f));
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = C9883b.m20521a(parcel);
        C9883b.m20532l(parcel, 2, mo32005G());
        C9883b.m20539s(parcel, 3, mo32007I(), false);
        C9883b.m20543w(parcel, 4, mo32006H(), false);
        C9883b.m20543w(parcel, 5, mo32004F(), false);
        C9883b.m20527g(parcel, 6, mo32003A());
        C9883b.m20522b(parcel, a);
    }

    C4629e(int i, @Nullable String str, @Nullable List list, @Nullable List list2, double d) {
        this.f4598b = i;
        this.f4599c = str;
        this.f4600d = list;
        this.f4601e = list2;
        this.f4602f = d;
    }

    /* synthetic */ C4629e(C7963s0 s0Var) {
        m6053K();
    }

    /* synthetic */ C4629e(C4629e eVar, C7963s0 s0Var) {
        this.f4598b = eVar.f4598b;
        this.f4599c = eVar.f4599c;
        this.f4600d = eVar.f4600d;
        this.f4601e = eVar.f4601e;
        this.f4602f = eVar.f4602f;
    }
}
