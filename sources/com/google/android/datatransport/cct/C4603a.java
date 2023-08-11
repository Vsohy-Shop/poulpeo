package com.google.android.datatransport.cct;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.adjust.sdk.Constants;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p119i3.C8109b;
import p139k3.C8537g;

/* renamed from: com.google.android.datatransport.cct.a */
/* compiled from: CCTDestination */
public final class C4603a implements C8537g {

    /* renamed from: c */
    static final String f4395c;

    /* renamed from: d */
    static final String f4396d;

    /* renamed from: e */
    private static final String f4397e;

    /* renamed from: f */
    private static final Set<C8109b> f4398f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C8109b[]{C8109b.m15970b("proto"), C8109b.m15970b("json")})));

    /* renamed from: g */
    public static final C4603a f4399g;

    /* renamed from: h */
    public static final C4603a f4400h;
    @NonNull

    /* renamed from: a */
    private final String f4401a;
    @Nullable

    /* renamed from: b */
    private final String f4402b;

    static {
        String a = C4609e.m5891a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f4395c = a;
        String a2 = C4609e.m5891a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f4396d = a2;
        String a3 = C4609e.m5891a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f4397e = a3;
        f4399g = new C4603a(a, (String) null);
        f4400h = new C4603a(a2, a3);
    }

    public C4603a(@NonNull String str, @Nullable String str2) {
        this.f4401a = str;
        this.f4402b = str2;
    }

    @NonNull
    /* renamed from: c */
    public static C4603a m5870c(@NonNull byte[] bArr) {
        String str = new String(bArr, Charset.forName(Constants.ENCODING));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new C4603a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    /* renamed from: a */
    public Set<C8109b> mo31818a() {
        return f4398f;
    }

    @Nullable
    /* renamed from: b */
    public byte[] mo31819b() {
        String str = this.f4402b;
        if (str == null && this.f4401a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f4401a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName(Constants.ENCODING));
    }

    @Nullable
    /* renamed from: d */
    public String mo31820d() {
        return this.f4402b;
    }

    @NonNull
    /* renamed from: e */
    public String mo31821e() {
        return this.f4401a;
    }

    @Nullable
    public byte[] getExtras() {
        return mo31819b();
    }

    @NonNull
    public String getName() {
        return "cct";
    }
}
