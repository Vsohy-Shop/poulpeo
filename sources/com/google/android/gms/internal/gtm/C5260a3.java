package com.google.android.gms.internal.gtm;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import p286y4.C10671e;
import p286y4.C10674h;

/* renamed from: com.google.android.gms.internal.gtm.a3 */
final class C5260a3 extends Thread implements C5636z2 {

    /* renamed from: h */
    private static C5260a3 f5802h;

    /* renamed from: b */
    private final LinkedBlockingQueue<Runnable> f5803b = new LinkedBlockingQueue<>();

    /* renamed from: c */
    private volatile boolean f5804c = false;

    /* renamed from: d */
    private volatile boolean f5805d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public volatile C5290c3 f5806e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Context f5807f;

    /* renamed from: g */
    private final C10671e f5808g = C10674h.m22680c();

    private C5260a3(Context context) {
        super("GAThread");
        if (context != null) {
            this.f5807f = context.getApplicationContext();
        } else {
            this.f5807f = context;
        }
        start();
    }

    /* renamed from: f */
    static C5260a3 m7737f(Context context) {
        if (f5802h == null) {
            f5802h = new C5260a3(context);
        }
        return f5802h;
    }

    /* renamed from: a */
    public final void mo33094a(Runnable runnable) {
        this.f5803b.add(runnable);
    }

    /* renamed from: b */
    public final void mo33095b(String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, String> map, @Nullable String str4) {
        mo33094a(new C5275b3(this, this, this.f5808g.mo33547a(), str, str2, str3, map, str4));
    }

    public final void run() {
        String str;
        while (true) {
            try {
                Runnable take = this.f5803b.take();
                if (!this.f5804c) {
                    take.run();
                }
            } catch (InterruptedException e) {
                try {
                    C5426l3.m8136f(e.toString());
                } catch (Exception e2) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    PrintStream printStream = new PrintStream(byteArrayOutputStream);
                    C5360gd.m7986a(e2, printStream);
                    printStream.flush();
                    String str2 = new String(byteArrayOutputStream.toByteArray());
                    if (str2.length() != 0) {
                        str = "Error on Google TagManager Thread: ".concat(str2);
                    } else {
                        str = new String("Error on Google TagManager Thread: ");
                    }
                    C5426l3.m8135e(str);
                    C5426l3.m8135e("Google TagManager is shutting down.");
                    this.f5804c = true;
                }
            }
        }
    }
}
