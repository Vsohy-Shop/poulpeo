package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import androidx.autofill.HintConstants;
import com.adjust.sdk.Constants;
import com.rmn.apiclient.impl.api.call.APIParams;
import java.util.HashMap;
import p296z3.C10810n;

/* renamed from: com.google.android.gms.internal.gtm.nd */
public final class C5466nd extends C10810n<C5466nd> {

    /* renamed from: a */
    private String f6157a;

    /* renamed from: b */
    private String f6158b;

    /* renamed from: c */
    private String f6159c;

    /* renamed from: d */
    private String f6160d;

    /* renamed from: e */
    private String f6161e;

    /* renamed from: f */
    private String f6162f;

    /* renamed from: g */
    private String f6163g;

    /* renamed from: h */
    private String f6164h;

    /* renamed from: i */
    private String f6165i;

    /* renamed from: j */
    private String f6166j;

    /* renamed from: d */
    public final /* synthetic */ void mo33104d(C10810n nVar) {
        C5466nd ndVar = (C5466nd) nVar;
        if (!TextUtils.isEmpty(this.f6157a)) {
            ndVar.f6157a = this.f6157a;
        }
        if (!TextUtils.isEmpty(this.f6158b)) {
            ndVar.f6158b = this.f6158b;
        }
        if (!TextUtils.isEmpty(this.f6159c)) {
            ndVar.f6159c = this.f6159c;
        }
        if (!TextUtils.isEmpty(this.f6160d)) {
            ndVar.f6160d = this.f6160d;
        }
        if (!TextUtils.isEmpty(this.f6161e)) {
            ndVar.f6161e = this.f6161e;
        }
        if (!TextUtils.isEmpty(this.f6162f)) {
            ndVar.f6162f = this.f6162f;
        }
        if (!TextUtils.isEmpty(this.f6163g)) {
            ndVar.f6163g = this.f6163g;
        }
        if (!TextUtils.isEmpty(this.f6164h)) {
            ndVar.f6164h = this.f6164h;
        }
        if (!TextUtils.isEmpty(this.f6165i)) {
            ndVar.f6165i = this.f6165i;
        }
        if (!TextUtils.isEmpty(this.f6166j)) {
            ndVar.f6166j = this.f6166j;
        }
    }

    /* renamed from: e */
    public final String mo33394e() {
        return this.f6162f;
    }

    /* renamed from: f */
    public final String mo33395f() {
        return this.f6157a;
    }

    /* renamed from: g */
    public final String mo33396g() {
        return this.f6158b;
    }

    /* renamed from: h */
    public final void mo33397h(String str) {
        this.f6157a = str;
    }

    /* renamed from: i */
    public final String mo33398i() {
        return this.f6159c;
    }

    /* renamed from: j */
    public final String mo33399j() {
        return this.f6160d;
    }

    /* renamed from: k */
    public final String mo33400k() {
        return this.f6161e;
    }

    /* renamed from: l */
    public final String mo33401l() {
        return this.f6163g;
    }

    /* renamed from: m */
    public final String mo33402m() {
        return this.f6164h;
    }

    /* renamed from: n */
    public final String mo33403n() {
        return this.f6165i;
    }

    /* renamed from: o */
    public final String mo33404o() {
        return this.f6166j;
    }

    /* renamed from: p */
    public final void mo33405p(String str) {
        this.f6158b = str;
    }

    /* renamed from: q */
    public final void mo33406q(String str) {
        this.f6159c = str;
    }

    /* renamed from: r */
    public final void mo33407r(String str) {
        this.f6160d = str;
    }

    /* renamed from: s */
    public final void mo33408s(String str) {
        this.f6161e = str;
    }

    /* renamed from: t */
    public final void mo33409t(String str) {
        this.f6162f = str;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put(HintConstants.AUTOFILL_HINT_NAME, this.f6157a);
        hashMap.put(APIParams.SOURCE, this.f6158b);
        hashMap.put(Constants.MEDIUM, this.f6159c);
        hashMap.put("keyword", this.f6160d);
        hashMap.put("content", this.f6161e);
        hashMap.put("id", this.f6162f);
        hashMap.put("adNetworkId", this.f6163g);
        hashMap.put("gclid", this.f6164h);
        hashMap.put("dclid", this.f6165i);
        hashMap.put("aclid", this.f6166j);
        return C10810n.m23055a(hashMap);
    }

    /* renamed from: u */
    public final void mo33411u(String str) {
        this.f6163g = str;
    }

    /* renamed from: v */
    public final void mo33412v(String str) {
        this.f6164h = str;
    }

    /* renamed from: w */
    public final void mo33413w(String str) {
        this.f6165i = str;
    }

    /* renamed from: x */
    public final void mo33414x(String str) {
        this.f6166j = str;
    }
}
