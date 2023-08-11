package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.gtm.C5426l3;
import com.google.android.gms.internal.gtm.C5472o4;
import com.google.android.gms.internal.gtm.C5519r3;
import p036b5.C2888a;
import p036b5.C2890b;
import p254v5.C9942c;
import p254v5.C9951l;
import p254v5.C9955p;

@DynamiteApi
public class TagManagerApiImpl extends C9955p {

    /* renamed from: a */
    private C5472o4 f8466a;

    public void initialize(C2888a aVar, C9951l lVar, C9942c cVar) {
        C5472o4 d = C5472o4.m8292d((Context) C2890b.m2296J(aVar), lVar, cVar);
        this.f8466a = d;
        d.mo33422i((String[]) null);
    }

    @Deprecated
    public void preview(Intent intent, C2888a aVar) {
        C5426l3.m8134d("Deprecated. Please use previewIntent instead.");
    }

    public void previewIntent(Intent intent, C2888a aVar, C2888a aVar2, C9951l lVar, C9942c cVar) {
        Context context = (Context) C2890b.m2296J(aVar);
        C5472o4 d = C5472o4.m8292d(context, lVar, cVar);
        this.f8466a = d;
        new C5519r3(intent, context, (Context) C2890b.m2296J(aVar2), d).mo33496b();
    }
}
