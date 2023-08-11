package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.d */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C4795d implements DynamiteModule.C4789a {
    C4795d() {
    }

    /* renamed from: a */
    public final DynamiteModule.C4789a.C4791b mo32583a(Context context, String str, DynamiteModule.C4789a.C4790a aVar) {
        DynamiteModule.C4789a.C4791b bVar = new DynamiteModule.C4789a.C4791b();
        int a = aVar.mo32584a(context, str, true);
        bVar.f5089b = a;
        if (a != 0) {
            bVar.f5090c = 1;
        } else {
            int b = aVar.mo32585b(context, str);
            bVar.f5088a = b;
            if (b != 0) {
                bVar.f5090c = -1;
            }
        }
        return bVar;
    }
}
