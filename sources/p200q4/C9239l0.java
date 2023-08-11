package p200q4;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import p141k5.C8567e;

/* renamed from: q4.l0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C9239l0 extends Fragment implements C9226f {

    /* renamed from: e */
    private static final WeakHashMap<FragmentActivity, WeakReference<C9239l0>> f13581e = new WeakHashMap<>();

    /* renamed from: b */
    private final Map<String, LifecycleCallback> f13582b = Collections.synchronizedMap(new ArrayMap());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f13583c = 0;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: d */
    public Bundle f13584d;

    /* renamed from: R0 */
    public static C9239l0 m18975R0(FragmentActivity fragmentActivity) {
        C9239l0 l0Var;
        WeakHashMap<FragmentActivity, WeakReference<C9239l0>> weakHashMap = f13581e;
        WeakReference weakReference = weakHashMap.get(fragmentActivity);
        if (weakReference != null && (l0Var = (C9239l0) weakReference.get()) != null) {
            return l0Var;
        }
        try {
            C9239l0 l0Var2 = (C9239l0) fragmentActivity.getSupportFragmentManager().findFragmentByTag("SupportLifecycleFragmentImpl");
            if (l0Var2 == null || l0Var2.isRemoving()) {
                l0Var2 = new C9239l0();
                fragmentActivity.getSupportFragmentManager().beginTransaction().add((Fragment) l0Var2, "SupportLifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(fragmentActivity, new WeakReference(l0Var2));
            return l0Var2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
        }
    }

    @Nullable
    /* renamed from: b0 */
    public final <T extends LifecycleCallback> T mo43518b0(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f13582b.get(str));
    }

    public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f13582b.values()) {
            a.mo32446a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback e : this.f13582b.values()) {
            e.mo32448e(i, i2, intent);
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f13583c = 1;
        this.f13584d = bundle;
        for (Map.Entry next : this.f13582b.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) next.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) next.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.mo32449f(bundle2);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f13583c = 5;
        for (LifecycleCallback g : this.f13582b.values()) {
            g.mo32450g();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f13583c = 3;
        for (LifecycleCallback h : this.f13582b.values()) {
            h.mo32451h();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry next : this.f13582b.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) next.getValue()).mo32452i(bundle2);
                bundle.putBundle((String) next.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f13583c = 2;
        for (LifecycleCallback j : this.f13582b.values()) {
            j.mo32453j();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f13583c = 4;
        for (LifecycleCallback k : this.f13582b.values()) {
            k.mo32454k();
        }
    }

    @Nullable
    /* renamed from: t0 */
    public final /* synthetic */ Activity mo43520t0() {
        return getActivity();
    }

    /* renamed from: v */
    public final void mo43521v(String str, @NonNull LifecycleCallback lifecycleCallback) {
        if (!this.f13582b.containsKey(str)) {
            this.f13582b.put(str, lifecycleCallback);
            if (this.f13583c > 0) {
                new C8567e(Looper.getMainLooper()).post(new C9237k0(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }
}
