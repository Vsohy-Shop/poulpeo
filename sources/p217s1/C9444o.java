package p217s1;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.C4362b;
import com.bumptech.glide.C4371h;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: s1.o */
/* compiled from: SupportRequestManagerFragment */
public class C9444o extends Fragment {

    /* renamed from: b */
    private final C9425a f14037b;

    /* renamed from: c */
    private final C9442m f14038c;

    /* renamed from: d */
    private final Set<C9444o> f14039d;
    @Nullable

    /* renamed from: e */
    private C9444o f14040e;
    @Nullable

    /* renamed from: f */
    private C4371h f14041f;
    @Nullable

    /* renamed from: g */
    private Fragment f14042g;

    /* renamed from: s1.o$a */
    /* compiled from: SupportRequestManagerFragment */
    private class C9445a implements C9442m {
        C9445a() {
        }

        @NonNull
        /* renamed from: a */
        public Set<C4371h> mo43852a() {
            Set<C9444o> N0 = C9444o.this.mo43881N0();
            HashSet hashSet = new HashSet(N0.size());
            for (C9444o next : N0) {
                if (next.mo43883m2() != null) {
                    hashSet.add(next.mo43883m2());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + C9444o.this + "}";
        }
    }

    public C9444o() {
        this(new C9425a());
    }

    /* renamed from: M0 */
    private void m19536M0(C9444o oVar) {
        this.f14039d.add(oVar);
    }

    @Nullable
    /* renamed from: l2 */
    private Fragment m19537l2() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        return this.f14042g;
    }

    @Nullable
    /* renamed from: o2 */
    private static FragmentManager m19538o2(@NonNull Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    /* renamed from: p2 */
    private boolean m19539p2(@NonNull Fragment fragment) {
        Fragment l2 = m19537l2();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(l2)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    /* renamed from: q2 */
    private void m19540q2(@NonNull Context context, @NonNull FragmentManager fragmentManager) {
        m19542u2();
        C9444o j = C4362b.m5041c(context).mo31182k().mo43871j(context, fragmentManager);
        this.f14040e = j;
        if (!equals(j)) {
            this.f14040e.m19536M0(this);
        }
    }

    /* renamed from: r2 */
    private void m19541r2(C9444o oVar) {
        this.f14039d.remove(oVar);
    }

    /* renamed from: u2 */
    private void m19542u2() {
        C9444o oVar = this.f14040e;
        if (oVar != null) {
            oVar.m19541r2(this);
            this.f14040e = null;
        }
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: N0 */
    public Set<C9444o> mo43881N0() {
        C9444o oVar = this.f14040e;
        if (oVar == null) {
            return Collections.emptySet();
        }
        if (equals(oVar)) {
            return Collections.unmodifiableSet(this.f14039d);
        }
        HashSet hashSet = new HashSet();
        for (C9444o next : this.f14040e.mo43881N0()) {
            if (m19539p2(next.m19537l2())) {
                hashSet.add(next);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* access modifiers changed from: package-private */
    @NonNull
    /* renamed from: R0 */
    public C9425a mo43882R0() {
        return this.f14037b;
    }

    @Nullable
    /* renamed from: m2 */
    public C4371h mo43883m2() {
        return this.f14041f;
    }

    @NonNull
    /* renamed from: n2 */
    public C9442m mo43884n2() {
        return this.f14038c;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        FragmentManager o2 = m19538o2(this);
        if (o2 != null) {
            try {
                m19540q2(getContext(), o2);
            } catch (IllegalStateException e) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e);
                }
            }
        } else if (Log.isLoggable("SupportRMFragment", 5)) {
            Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f14037b.mo43846c();
        m19542u2();
    }

    public void onDetach() {
        super.onDetach();
        this.f14042g = null;
        m19542u2();
    }

    public void onStart() {
        super.onStart();
        this.f14037b.mo43847d();
    }

    public void onStop() {
        super.onStop();
        this.f14037b.mo43848e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s2 */
    public void mo43885s2(@Nullable Fragment fragment) {
        FragmentManager o2;
        this.f14042g = fragment;
        if (fragment != null && fragment.getContext() != null && (o2 = m19538o2(fragment)) != null) {
            m19540q2(fragment.getContext(), o2);
        }
    }

    /* renamed from: t2 */
    public void mo43886t2(@Nullable C4371h hVar) {
        this.f14041f = hVar;
    }

    public String toString() {
        return super.toString() + "{parent=" + m19537l2() + "}";
    }

    @VisibleForTesting
    public C9444o(@NonNull C9425a aVar) {
        this.f14038c = new C9445a();
        this.f14039d = new HashSet();
        this.f14037b = aVar;
    }
}
