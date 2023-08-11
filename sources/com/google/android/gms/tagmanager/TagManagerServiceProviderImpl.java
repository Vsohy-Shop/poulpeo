package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.internal.gtm.C5277b5;
import com.google.android.gms.internal.gtm.C5366h3;
import p036b5.C2888a;
import p036b5.C2890b;
import p254v5.C9942c;
import p254v5.C9951l;
import p254v5.C9958s;

@DynamiteApi
public class TagManagerServiceProviderImpl extends C9958s {

    /* renamed from: a */
    private static volatile C5277b5 f8468a;

    public C5366h3 getService(C2888a aVar, C9951l lVar, C9942c cVar) {
        C5277b5 b5Var = f8468a;
        if (b5Var == null) {
            synchronized (TagManagerServiceProviderImpl.class) {
                b5Var = f8468a;
                if (b5Var == null) {
                    b5Var = new C5277b5((Context) C2890b.m2296J(aVar), lVar, cVar);
                    f8468a = b5Var;
                }
            }
        }
        return b5Var;
    }
}
