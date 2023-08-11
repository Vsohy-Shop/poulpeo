package com.facebook;

import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p198q2.C9138d0;
import p336ef.C11921v;

/* renamed from: com.facebook.u */
/* compiled from: ProfileManager.kt */
public final class C4592u {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static volatile C4592u f4352d;

    /* renamed from: e */
    public static final C4593a f4353e = new C4593a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private C4580s f4354a;

    /* renamed from: b */
    private final LocalBroadcastManager f4355b;

    /* renamed from: c */
    private final C4590t f4356c;

    /* renamed from: com.facebook.u$a */
    /* compiled from: ProfileManager.kt */
    public static final class C4593a {
        private C4593a() {
        }

        public /* synthetic */ C4593a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C4592u mo31790a() {
            if (C4592u.f4352d == null) {
                synchronized (this) {
                    if (C4592u.f4352d == null) {
                        LocalBroadcastManager instance = LocalBroadcastManager.getInstance(FacebookSdk.getApplicationContext());
                        C12775o.m28638h(instance, "LocalBroadcastManager.ge…tance(applicationContext)");
                        C4592u.f4352d = new C4592u(instance, new C4590t());
                    }
                    C11921v vVar = C11921v.f18618a;
                }
            }
            C4592u a = C4592u.f4352d;
            if (a != null) {
                return a;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public C4592u(LocalBroadcastManager localBroadcastManager, C4590t tVar) {
        C12775o.m28639i(localBroadcastManager, "localBroadcastManager");
        C12775o.m28639i(tVar, "profileCache");
        this.f4355b = localBroadcastManager;
        this.f4356c = tVar;
    }

    /* renamed from: e */
    private final void m5820e(C4580s sVar, C4580s sVar2) {
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", sVar);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", sVar2);
        this.f4355b.sendBroadcast(intent);
    }

    /* renamed from: g */
    private final void m5821g(C4580s sVar, boolean z) {
        C4580s sVar2 = this.f4354a;
        this.f4354a = sVar;
        if (z) {
            if (sVar != null) {
                this.f4356c.mo31786c(sVar);
            } else {
                this.f4356c.mo31784a();
            }
        }
        if (!C9138d0.m18625a(sVar2, sVar)) {
            m5820e(sVar2, sVar);
        }
    }

    /* renamed from: c */
    public final C4580s mo31787c() {
        return this.f4354a;
    }

    /* renamed from: d */
    public final boolean mo31788d() {
        C4580s b = this.f4356c.mo31785b();
        if (b == null) {
            return false;
        }
        m5821g(b, false);
        return true;
    }

    /* renamed from: f */
    public final void mo31789f(C4580s sVar) {
        m5821g(sVar, true);
    }
}
