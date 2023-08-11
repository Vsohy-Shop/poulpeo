package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.i */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C4800i implements DynamiteModule.C4789a {
    C4800i() {
    }

    /* renamed from: a */
    public final DynamiteModule.C4789a.C4791b mo32583a(Context context, String str, DynamiteModule.C4789a.C4790a aVar) {
        DynamiteModule.C4789a.C4791b bVar = new DynamiteModule.C4789a.C4791b();
        bVar.f5088a = aVar.mo32585b(context, str);
        int a = aVar.mo32584a(context, str, true);
        bVar.f5089b = a;
        int i = bVar.f5088a;
        if (i == 0) {
            i = 0;
            if (a == 0) {
                bVar.f5090c = 0;
                return bVar;
            }
        }
        if (a >= i) {
            bVar.f5090c = 1;
        } else {
            bVar.f5090c = -1;
        }
        return bVar;
    }
}
