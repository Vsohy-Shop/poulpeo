package com.google.android.gms.internal.gtm;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import p265w5.C10113a;

/* renamed from: com.google.android.gms.internal.gtm.r3 */
public final class C5519r3 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f6274a;

    /* renamed from: b */
    private final Context f6275b;

    /* renamed from: c */
    private final Intent f6276c;

    /* renamed from: d */
    private final C5472o4 f6277d;

    public C5519r3(Intent intent, Context context, Context context2, C5472o4 o4Var) {
        this.f6274a = context;
        this.f6275b = context2;
        this.f6276c = intent;
        this.f6277d = o4Var;
    }

    /* renamed from: b */
    public final void mo33496b() {
        String str;
        try {
            this.f6277d.mo33421h(this.f6276c.getData());
            String string = this.f6275b.getResources().getString(C10113a.f15280c);
            String string2 = this.f6275b.getResources().getString(C10113a.f15279b);
            String string3 = this.f6275b.getResources().getString(C10113a.f15278a);
            AlertDialog create = new AlertDialog.Builder(this.f6274a).create();
            create.setTitle(string);
            create.setMessage(string2);
            create.setButton(-1, string3, new C5534s3(this));
            create.show();
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str = "Calling preview threw an exception: ".concat(valueOf);
            } else {
                str = new String("Calling preview threw an exception: ");
            }
            C5426l3.m8135e(str);
        }
    }
}
