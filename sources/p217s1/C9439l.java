package p217s1;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.C4362b;
import com.bumptech.glide.C4371h;
import java.util.HashMap;
import java.util.Map;
import p294z1.C10792k;

/* renamed from: s1.l */
/* compiled from: RequestManagerRetriever */
public class C9439l implements Handler.Callback {

    /* renamed from: j */
    private static final C9441b f14025j = new C9440a();

    /* renamed from: b */
    private volatile C4371h f14026b;
    @VisibleForTesting

    /* renamed from: c */
    final Map<FragmentManager, C9437k> f14027c = new HashMap();
    @VisibleForTesting

    /* renamed from: d */
    final Map<androidx.fragment.app.FragmentManager, C9444o> f14028d = new HashMap();

    /* renamed from: e */
    private final Handler f14029e;

    /* renamed from: f */
    private final C9441b f14030f;

    /* renamed from: g */
    private final ArrayMap<View, Fragment> f14031g = new ArrayMap<>();

    /* renamed from: h */
    private final ArrayMap<View, android.app.Fragment> f14032h = new ArrayMap<>();

    /* renamed from: i */
    private final Bundle f14033i = new Bundle();

    /* renamed from: s1.l$a */
    /* compiled from: RequestManagerRetriever */
    class C9440a implements C9441b {
        C9440a() {
        }

        @NonNull
        /* renamed from: a */
        public C4371h mo43872a(@NonNull C4362b bVar, @NonNull C9434h hVar, @NonNull C9442m mVar, @NonNull Context context) {
            return new C4371h(bVar, hVar, mVar, context);
        }
    }

    /* renamed from: s1.l$b */
    /* compiled from: RequestManagerRetriever */
    public interface C9441b {
        @NonNull
        /* renamed from: a */
        C4371h mo43872a(@NonNull C4362b bVar, @NonNull C9434h hVar, @NonNull C9442m mVar, @NonNull Context context);
    }

    public C9439l(@Nullable C9441b bVar) {
        this.f14030f = bVar == null ? f14025j : bVar;
        this.f14029e = new Handler(Looper.getMainLooper(), this);
    }

    /* renamed from: a */
    private static void m19513a(@NonNull Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    @Nullable
    /* renamed from: b */
    private static Activity m19514b(@NonNull Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m19514b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @NonNull
    @Deprecated
    /* renamed from: c */
    private C4371h m19515c(@NonNull Context context, @NonNull FragmentManager fragmentManager, @Nullable android.app.Fragment fragment, boolean z) {
        C9437k i = m19517i(fragmentManager, fragment, z);
        C4371h e = i.mo43855e();
        if (e != null) {
            return e;
        }
        C4371h a = this.f14030f.mo43872a(C4362b.m5041c(context), i.mo43854c(), i.mo43856f(), context);
        i.mo43858k(a);
        return a;
    }

    @NonNull
    /* renamed from: g */
    private C4371h m19516g(@NonNull Context context) {
        if (this.f14026b == null) {
            synchronized (this) {
                if (this.f14026b == null) {
                    this.f14026b = this.f14030f.mo43872a(C4362b.m5041c(context.getApplicationContext()), new C9426b(), new C9433g(), context.getApplicationContext());
                }
            }
        }
        return this.f14026b;
    }

    @NonNull
    /* renamed from: i */
    private C9437k m19517i(@NonNull FragmentManager fragmentManager, @Nullable android.app.Fragment fragment, boolean z) {
        C9437k kVar = (C9437k) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (kVar == null && (kVar = this.f14027c.get(fragmentManager)) == null) {
            kVar = new C9437k();
            kVar.mo43857j(fragment);
            if (z) {
                kVar.mo43854c().mo43847d();
            }
            this.f14027c.put(fragmentManager, kVar);
            fragmentManager.beginTransaction().add(kVar, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f14029e.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return kVar;
    }

    @NonNull
    /* renamed from: k */
    private C9444o m19518k(@NonNull androidx.fragment.app.FragmentManager fragmentManager, @Nullable Fragment fragment, boolean z) {
        C9444o oVar = (C9444o) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (oVar == null && (oVar = this.f14028d.get(fragmentManager)) == null) {
            oVar = new C9444o();
            oVar.mo43885s2(fragment);
            if (z) {
                oVar.mo43882R0().mo43847d();
            }
            this.f14028d.put(fragmentManager, oVar);
            fragmentManager.beginTransaction().add((Fragment) oVar, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f14029e.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return oVar;
    }

    /* renamed from: l */
    private static boolean m19519l(Context context) {
        Activity b = m19514b(context);
        if (b == null || !b.isFinishing()) {
            return true;
        }
        return false;
    }

    @NonNull
    /* renamed from: m */
    private C4371h m19520m(@NonNull Context context, @NonNull androidx.fragment.app.FragmentManager fragmentManager, @Nullable Fragment fragment, boolean z) {
        C9444o k = m19518k(fragmentManager, fragment, z);
        C4371h m2 = k.mo43883m2();
        if (m2 != null) {
            return m2;
        }
        C4371h a = this.f14030f.mo43872a(C4362b.m5041c(context), k.mo43882R0(), k.mo43884n2(), context);
        k.mo43886t2(a);
        return a;
    }

    @NonNull
    /* renamed from: d */
    public C4371h mo43866d(@NonNull Activity activity) {
        if (C10792k.m22964o()) {
            return mo43867e(activity.getApplicationContext());
        }
        m19513a(activity);
        return m19515c(activity, activity.getFragmentManager(), (android.app.Fragment) null, m19519l(activity));
    }

    @NonNull
    /* renamed from: e */
    public C4371h mo43867e(@NonNull Context context) {
        if (context != null) {
            if (C10792k.m22965p() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return mo43868f((FragmentActivity) context);
                }
                if (context instanceof Activity) {
                    return mo43866d((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return mo43867e(contextWrapper.getBaseContext());
                    }
                }
            }
            return m19516g(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    @NonNull
    /* renamed from: f */
    public C4371h mo43868f(@NonNull FragmentActivity fragmentActivity) {
        if (C10792k.m22964o()) {
            return mo43867e(fragmentActivity.getApplicationContext());
        }
        m19513a(fragmentActivity);
        return m19520m(fragmentActivity, fragmentActivity.getSupportFragmentManager(), (Fragment) null, m19519l(fragmentActivity));
    }

    /* access modifiers changed from: package-private */
    @NonNull
    @Deprecated
    /* renamed from: h */
    public C9437k mo43869h(Activity activity) {
        return m19517i(activity.getFragmentManager(), (android.app.Fragment) null, m19519l(activity));
    }

    public boolean handleMessage(Message message) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i = message.what;
        boolean z = true;
        if (i == 1) {
            obj3 = (FragmentManager) message.obj;
            obj4 = this.f14027c.remove(obj3);
        } else if (i != 2) {
            obj = null;
            z = false;
            obj2 = null;
            if (z && obj == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
            }
            return z;
        } else {
            obj3 = (androidx.fragment.app.FragmentManager) message.obj;
            obj4 = this.f14028d.remove(obj3);
        }
        Object obj5 = obj4;
        obj2 = obj3;
        obj = obj5;
        Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        return z;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: j */
    public C9444o mo43871j(Context context, androidx.fragment.app.FragmentManager fragmentManager) {
        return m19518k(fragmentManager, (Fragment) null, m19519l(context));
    }
}
