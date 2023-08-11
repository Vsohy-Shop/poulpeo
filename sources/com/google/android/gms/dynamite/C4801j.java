package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.j */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C4801j implements DynamiteModule.C4789a {
    C4801j() {
    }

    /* renamed from: a */
    public final DynamiteModule.C4789a.C4791b mo32583a(Context context, String str, DynamiteModule.C4789a.C4790a aVar) {
        int i;
        DynamiteModule.C4789a.C4791b bVar = new DynamiteModule.C4789a.C4791b();
        int b = aVar.mo32585b(context, str);
        bVar.f5088a = b;
        int i2 = 0;
        if (b != 0) {
            i = aVar.mo32584a(context, str, false);
            bVar.f5089b = i;
        } else {
            i = aVar.mo32584a(context, str, true);
            bVar.f5089b = i;
        }
        int i3 = bVar.f5088a;
        if (i3 != 0) {
            i2 = i3;
        } else if (i == 0) {
            bVar.f5090c = 0;
            return bVar;
        }
        if (i >= i2) {
            bVar.f5090c = 1;
        } else {
            bVar.f5090c = -1;
        }
        return bVar;
    }
}
