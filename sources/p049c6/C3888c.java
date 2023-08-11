package p049c6;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.Nullable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p037b6.C2900e;
import p075e6.C7479a;

/* renamed from: c6.c */
public abstract class C3888c<StateT> {

    /* renamed from: a */
    protected final C2900e f2969a;

    /* renamed from: b */
    private final IntentFilter f2970b;

    /* renamed from: c */
    private final Context f2971c;

    /* renamed from: d */
    protected final Set<C3886a<StateT>> f2972d = new HashSet();
    @Nullable

    /* renamed from: e */
    private C3887b f2973e = null;

    /* renamed from: f */
    private volatile boolean f2974f = false;

    protected C3888c(C2900e eVar, IntentFilter intentFilter, Context context) {
        this.f2969a = eVar;
        this.f2970b = intentFilter;
        this.f2971c = C7479a.m14655a(context);
    }

    /* renamed from: e */
    private final void m4374e() {
        C3887b bVar;
        if ((this.f2974f || !this.f2972d.isEmpty()) && this.f2973e == null) {
            C3887b bVar2 = new C3887b(this);
            this.f2973e = bVar2;
            this.f2971c.registerReceiver(bVar2, this.f2970b);
        }
        if (!this.f2974f && this.f2972d.isEmpty() && (bVar = this.f2973e) != null) {
            this.f2971c.unregisterReceiver(bVar);
            this.f2973e = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo29929a(Context context, Intent intent);

    /* renamed from: b */
    public final synchronized void mo29930b(StateT statet) {
        Iterator it = new HashSet(this.f2972d).iterator();
        while (it.hasNext()) {
            ((C3886a) it.next()).mo29927a(statet);
        }
    }

    /* renamed from: c */
    public final synchronized void mo29931c(boolean z) {
        this.f2974f = z;
        m4374e();
    }

    /* renamed from: d */
    public final synchronized boolean mo29932d() {
        if (this.f2973e != null) {
            return true;
        }
        return false;
    }
}
