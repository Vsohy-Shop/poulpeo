package p200q4;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import p141k5.C8567e;

/* renamed from: q4.j0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public final class C9235j0 extends Fragment implements C9226f {

    /* renamed from: e */
    private static final WeakHashMap<Activity, WeakReference<C9235j0>> f13574e = new WeakHashMap<>();

    /* renamed from: b */
    private final Map<String, LifecycleCallback> f13575b = Collections.synchronizedMap(new ArrayMap());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f13576c = 0;
    /* access modifiers changed from: private */
    @Nullable

    /* renamed from: d */
    public Bundle f13577d;

    /* renamed from: c */
    public static C9235j0 m18967c(Activity activity) {
        C9235j0 j0Var;
        WeakHashMap<Activity, WeakReference<C9235j0>> weakHashMap = f13574e;
        WeakReference weakReference = weakHashMap.get(activity);
        if (weakReference != null && (j0Var = (C9235j0) weakReference.get()) != null) {
            return j0Var;
        }
        try {
            C9235j0 j0Var2 = (C9235j0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (j0Var2 == null || j0Var2.isRemoving()) {
                j0Var2 = new C9235j0();
                activity.getFragmentManager().beginTransaction().add(j0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(j0Var2));
            return j0Var2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    @Nullable
    /* renamed from: b0 */
    public final <T extends LifecycleCallback> T mo43518b0(String str, Class<T> cls) {
        return (LifecycleCallback) cls.cast(this.f13575b.get(str));
    }

    public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback a : this.f13575b.values()) {
            a.mo32446a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback e : this.f13575b.values()) {
            e.mo32448e(i, i2, intent);
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f13576c = 1;
        this.f13577d = bundle;
        for (Map.Entry next : this.f13575b.entrySet()) {
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
        this.f13576c = 5;
        for (LifecycleCallback g : this.f13575b.values()) {
            g.mo32450g();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f13576c = 3;
        for (LifecycleCallback h : this.f13575b.values()) {
            h.mo32451h();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry next : this.f13575b.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) next.getValue()).mo32452i(bundle2);
                bundle.putBundle((String) next.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f13576c = 2;
        for (LifecycleCallback j : this.f13575b.values()) {
            j.mo32453j();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f13576c = 4;
        for (LifecycleCallback k : this.f13575b.values()) {
            k.mo32454k();
        }
    }

    @Nullable
    /* renamed from: t0 */
    public final Activity mo43520t0() {
        return getActivity();
    }

    /* renamed from: v */
    public final void mo43521v(String str, @NonNull LifecycleCallback lifecycleCallback) {
        if (!this.f13575b.containsKey(str)) {
            this.f13575b.put(str, lifecycleCallback);
            if (this.f13576c > 0) {
                new C8567e(Looper.getMainLooper()).post(new C9233i0(this, lifecycleCallback, str));
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
