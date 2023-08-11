package p217s1;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.C4362b;
import com.bumptech.glide.C4371h;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: s1.k */
/* compiled from: RequestManagerFragment */
public class C9437k extends Fragment {

    /* renamed from: b */
    private final C9425a f14018b;

    /* renamed from: c */
    private final C9442m f14019c;

    /* renamed from: d */
    private final Set<C9437k> f14020d;
    @Nullable

    /* renamed from: e */
    private C4371h f14021e;
    @Nullable

    /* renamed from: f */
    private C9437k f14022f;
    @Nullable

    /* renamed from: g */
    private Fragment f14023g;

    /* renamed from: s1.k$a */
    /* compiled from: RequestManagerFragment */
    private class C9438a implements C9442m {
        C9438a() {
        }

        @NonNull
        /* renamed from: a */
        public Set<C4371h> mo43852a() {
            Set<C9437k> b = C9437k.this.mo43853b();
            HashSet hashSet = new HashSet(b.size());
            for (C9437k next : b) {
                if (next.mo43855e() != null) {
                    hashSet.add(next.mo43855e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + C9437k.this + "}";
        }
    }

    public C9437k() {
        this(new C9425a());
    }

    /* renamed from: a */
    private void m19500a(C9437k kVar) {
        this.f14020d.add(kVar);
    }

    @Nullable
    /* renamed from: d */
    private Fragment m19501d() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        return this.f14023g;
    }

    /* renamed from: g */
    private boolean m19502g(@NonNull Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    /* renamed from: h */
    private void m19503h(@NonNull Activity activity) {
        m19505l();
        C9437k h = C4362b.m5041c(activity).mo31182k().mo43869h(activity);
        this.f14022f = h;
        if (!equals(h)) {
            this.f14022f.m19500a(this);
        }
    }

    /* renamed from: i */
    private void m19504i(C9437k kVar) {
        this.f14020d.remove(kVar);
    }

    /* renamed from: l */
    private void m19505l() {
        C9437k kVar = this.f14022f;
        if (kVar != null) {
            kVar.m19504i(this);
            this.f14022f = null;
        }
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: b */
    public Set<C9437k> mo43853b() {
        if (equals(this.f14022f)) {
            return Collections.unmodifiableSet(this.f14020d);
        }
        if (this.f14022f == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (C9437k next : this.f14022f.mo43853b()) {
            if (m19502g(next.getParentFragment())) {
                hashSet.add(next);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: c */
    public C9425a mo43854c() {
        return this.f14018b;
    }

    @Nullable
    /* renamed from: e */
    public C4371h mo43855e() {
        return this.f14021e;
    }

    @NonNull
    /* renamed from: f */
    public C9442m mo43856f() {
        return this.f14019c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo43857j(@Nullable Fragment fragment) {
        this.f14023g = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            m19503h(fragment.getActivity());
        }
    }

    /* renamed from: k */
    public void mo43858k(@Nullable C4371h hVar) {
        this.f14021e = hVar;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            m19503h(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f14018b.mo43846c();
        m19505l();
    }

    public void onDetach() {
        super.onDetach();
        m19505l();
    }

    public void onStart() {
        super.onStart();
        this.f14018b.mo43847d();
    }

    public void onStop() {
        super.onStop();
        this.f14018b.mo43848e();
    }

    public String toString() {
        return super.toString() + "{parent=" + m19501d() + "}";
    }

    @VisibleForTesting
    C9437k(@NonNull C9425a aVar) {
        this.f14019c = new C9438a();
        this.f14020d = new HashSet();
        this.f14018b = aVar;
    }
}
