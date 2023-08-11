package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.f */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C4797f implements DynamiteModule.C4789a {
    C4797f() {
    }

    /* renamed from: a */
    public final DynamiteModule.C4789a.C4791b mo32583a(Context context, String str, DynamiteModule.C4789a.C4790a aVar) {
        DynamiteModule.C4789a.C4791b bVar = new DynamiteModule.C4789a.C4791b();
        int a = aVar.mo32584a(context, str, false);
        bVar.f5089b = a;
        if (a == 0) {
            bVar.f5090c = 0;
        } else {
            bVar.f5090c = 1;
        }
        return bVar;
    }
}
