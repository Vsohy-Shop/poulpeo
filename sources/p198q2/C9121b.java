package p198q2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p033b2.C2867m;
import p251v2.C9925a;
import p454wf.C13735j;

/* renamed from: q2.b */
/* compiled from: BoltsMeasurementEventListener.kt */
public final class C9121b extends BroadcastReceiver {

    /* renamed from: b */
    private static C9121b f13309b;

    /* renamed from: c */
    private static final String f13310c = "com.parse.bolts.measurement_event";

    /* renamed from: d */
    public static final C9122a f13311d = new C9122a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Context f13312a;

    /* renamed from: q2.b$a */
    /* compiled from: BoltsMeasurementEventListener.kt */
    public static final class C9122a {
        private C9122a() {
        }

        public /* synthetic */ C9122a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C9121b mo43391a(Context context) {
            C12775o.m28639i(context, "context");
            if (C9121b.m18572a() != null) {
                return C9121b.m18572a();
            }
            C9121b bVar = new C9121b(context, (DefaultConstructorMarker) null);
            C9121b.m18573b(bVar);
            C9121b.m18574c(bVar);
            return C9121b.m18572a();
        }
    }

    private C9121b(Context context) {
        Context applicationContext = context.getApplicationContext();
        C12775o.m28638h(applicationContext, "context.applicationContext");
        this.f13312a = applicationContext;
    }

    /* renamed from: a */
    public static final /* synthetic */ C9121b m18572a() {
        Class<C9121b> cls = C9121b.class;
        if (C9925a.m20734d(cls)) {
            return null;
        }
        try {
            return f13309b;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ void m18573b(C9121b bVar) {
        Class<C9121b> cls = C9121b.class;
        if (!C9925a.m20734d(cls)) {
            try {
                bVar.m18576e();
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ void m18574c(C9121b bVar) {
        Class<C9121b> cls = C9121b.class;
        if (!C9925a.m20734d(cls)) {
            try {
                f13309b = bVar;
            } catch (Throwable th) {
                C9925a.m20732b(th, cls);
            }
        }
    }

    /* renamed from: d */
    private final void m18575d() {
        if (!C9925a.m20734d(this)) {
            try {
                LocalBroadcastManager instance = LocalBroadcastManager.getInstance(this.f13312a);
                C12775o.m28638h(instance, "LocalBroadcastManager.ge…tance(applicationContext)");
                instance.unregisterReceiver(this);
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    /* renamed from: e */
    private final void m18576e() {
        if (!C9925a.m20734d(this)) {
            try {
                LocalBroadcastManager instance = LocalBroadcastManager.getInstance(this.f13312a);
                C12775o.m28638h(instance, "LocalBroadcastManager.ge…tance(applicationContext)");
                instance.registerReceiver(this, new IntentFilter(f13310c));
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    public final void finalize() {
        if (!C9925a.m20734d(this)) {
            try {
                m18575d();
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        String str;
        Bundle bundle;
        if (!C9925a.m20734d(this)) {
            try {
                C2867m mVar = new C2867m(context);
                StringBuilder sb = new StringBuilder();
                sb.append("bf_");
                Set<String> set = null;
                if (intent != null) {
                    str = intent.getStringExtra("event_name");
                } else {
                    str = null;
                }
                sb.append(str);
                String sb2 = sb.toString();
                if (intent != null) {
                    bundle = intent.getBundleExtra("event_args");
                } else {
                    bundle = null;
                }
                Bundle bundle2 = new Bundle();
                if (bundle != null) {
                    set = bundle.keySet();
                }
                if (set != null) {
                    for (String next : set) {
                        C12775o.m28638h(next, "key");
                        bundle2.putString(new C13735j("[ -]*$").mo53413f(new C13735j("^[ -]*").mo53413f(new C13735j("[^0-9a-zA-Z _-]").mo53413f(next, "-"), ""), ""), (String) bundle.get(next));
                    }
                }
                mVar.mo28389d(sb2, bundle2);
            } catch (Throwable th) {
                C9925a.m20732b(th, this);
            }
        }
    }

    public /* synthetic */ C9121b(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }
}
