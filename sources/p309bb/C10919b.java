package p309bb;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.utils.BundleDelegate;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12783v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p360id.C12136d;
import p368jd.C12617c;
import p462yb.C13865f;

@StabilityInferred(parameters = 0)
/* renamed from: bb.b */
/* compiled from: OnboardingFragment.kt */
public final class C10919b extends C12617c {

    /* renamed from: d */
    public static final C10920a f16834d = new C10920a((DefaultConstructorMarker) null);

    /* renamed from: e */
    public static final int f16835e = 8;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final BundleDelegate.Int f16836f = new BundleDelegate.Int("titleId");
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final BundleDelegate.Int f16837g = new BundleDelegate.Int("descriptionId");
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final BundleDelegate.Int f16838h = new BundleDelegate.Int("imageIdBackground");
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final BundleDelegate.Int f16839i = new BundleDelegate.Int("imageIdForeground");
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final BundleDelegate.Int f16840j = new BundleDelegate.Int("onboardingVersion");

    /* renamed from: c */
    public Map<Integer, View> f16841c = new LinkedHashMap();

    /* renamed from: bb.b$a */
    /* compiled from: OnboardingFragment.kt */
    public static final class C10920a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f16842a;

        static {
            Class<C10920a> cls = C10920a.class;
            f16842a = new KProperty[]{C12764h0.m28590f(new C12783v(cls, "titleId", "getTitleId(Landroid/os/Bundle;)I", 0)), C12764h0.m28590f(new C12783v(cls, "descriptionId", "getDescriptionId(Landroid/os/Bundle;)I", 0)), C12764h0.m28590f(new C12783v(cls, "imageIdBackground", "getImageIdBackground(Landroid/os/Bundle;)I", 0)), C12764h0.m28590f(new C12783v(cls, "imageIdForeground", "getImageIdForeground(Landroid/os/Bundle;)I", 0)), C12764h0.m28590f(new C12783v(cls, "onboardingVersion", "getOnboardingVersion(Landroid/os/Bundle;)I", 0))};
        }

        private C10920a() {
        }

        public /* synthetic */ C10920a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: f */
        private final int m23487f(int i, int i2) {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new UnsupportedOperationException("Not supported");
                } else if (i == 0) {
                    return R.drawable.onboarding_v2_1;
                } else {
                    if (i == 1) {
                        return R.drawable.onboarding_v2_2;
                    }
                    if (i == 2) {
                        return R.drawable.onboarding_v2_3;
                    }
                    if (i != 3) {
                        return 0;
                    }
                    return R.drawable.onboarding_v2_4;
                }
            } else if (i == 0) {
                return R.drawable.onboarding_bg_1;
            } else {
                if (i == 1) {
                    return R.drawable.onboarding_bg_2;
                }
                if (i == 2) {
                    return R.drawable.onboarding_bg_3;
                }
                throw new UnsupportedOperationException("Not supported");
            }
        }

        /* renamed from: g */
        private final int m23488g(int i, int i2) {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new UnsupportedOperationException("Not supported");
                } else if (i == 0) {
                    return R.string.onboarding_new_description_1_version2;
                } else {
                    if (i == 1) {
                        return R.string.onboarding_new_description_2_version2;
                    }
                    if (i == 2) {
                        return R.string.onboarding_new_description_3_version2;
                    }
                    if (i != 3) {
                        return 0;
                    }
                    return R.string.onboarding_new_description_4_version2;
                }
            } else if (i == 0) {
                return R.string.onboarding_description_1;
            } else {
                if (i == 1) {
                    return R.string.onboarding_description_2;
                }
                if (i != 2) {
                    return 0;
                }
                return R.string.onboarding_description_3;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public final int m23489h(Bundle bundle) {
            return C10919b.f16837g.getValue(bundle, (KProperty<?>) f16842a[1]).intValue();
        }

        /* renamed from: i */
        private final int m23490i(int i, int i2) {
            if (i2 != 0) {
                if (i2 == 1) {
                    return 0;
                }
                throw new UnsupportedOperationException("Not supported");
            } else if (i == 0) {
                return R.drawable.onboarding_fg_1;
            } else {
                if (i == 1) {
                    return R.drawable.onboarding_fg_2;
                }
                if (i != 2) {
                    return 0;
                }
                return R.drawable.onboarding_fg_3;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public final int m23491j(Bundle bundle) {
            return C10919b.f16838h.getValue(bundle, (KProperty<?>) f16842a[2]).intValue();
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public final int m23492k(Bundle bundle) {
            return C10919b.f16839i.getValue(bundle, (KProperty<?>) f16842a[3]).intValue();
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public final int m23493l(Bundle bundle) {
            return C10919b.f16840j.getValue(bundle, (KProperty<?>) f16842a[4]).intValue();
        }

        /* renamed from: m */
        private final int m23494m(int i, int i2) {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new UnsupportedOperationException("Not supported");
                } else if (i == 0) {
                    return R.string.onboarding_new_title_1_version2;
                } else {
                    if (i == 1) {
                        return R.string.onboarding_new_title_2_version2;
                    }
                    if (i == 2) {
                        return R.string.onboarding_new_title_3_version2;
                    }
                    if (i == 3) {
                        return R.string.onboarding_new_title_4_version2;
                    }
                    throw new UnsupportedOperationException("Not supported");
                }
            } else if (i == 0) {
                return R.string.onboarding_title_1;
            } else {
                if (i == 1) {
                    return R.string.onboarding_title_2;
                }
                if (i == 2) {
                    return R.string.onboarding_title_3;
                }
                throw new UnsupportedOperationException("Not supported");
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public final int m23495n(Bundle bundle) {
            return C10919b.f16836f.getValue(bundle, (KProperty<?>) f16842a[0]).intValue();
        }

        /* renamed from: p */
        private final void m23496p(Bundle bundle, int i) {
            C10919b.f16837g.setValue(bundle, (KProperty<?>) f16842a[1], i);
        }

        /* renamed from: q */
        private final void m23497q(Bundle bundle, int i) {
            C10919b.f16838h.setValue(bundle, (KProperty<?>) f16842a[2], i);
        }

        /* renamed from: r */
        private final void m23498r(Bundle bundle, int i) {
            C10919b.f16839i.setValue(bundle, (KProperty<?>) f16842a[3], i);
        }

        /* renamed from: s */
        private final void m23499s(Bundle bundle, int i) {
            C10919b.f16840j.setValue(bundle, (KProperty<?>) f16842a[4], i);
        }

        /* renamed from: t */
        private final void m23500t(Bundle bundle, int i) {
            C10919b.f16836f.setValue(bundle, (KProperty<?>) f16842a[0], i);
        }

        /* renamed from: o */
        public final C10919b mo45940o(int i, int i2) {
            C10919b bVar = new C10919b();
            Bundle bundle = new Bundle();
            C10920a aVar = C10919b.f16834d;
            aVar.m23500t(bundle, aVar.m23494m(i, i2));
            aVar.m23496p(bundle, aVar.m23488g(i, i2));
            aVar.m23497q(bundle, aVar.m23487f(i, i2));
            aVar.m23498r(bundle, aVar.m23490i(i, i2));
            aVar.m23499s(bundle, i2);
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    /* renamed from: p2 */
    private final void m23479p2() {
        int i = C13865f.imageViewBackground;
        ((ImageView) mo45939N0(i)).setScaleType(ImageView.ScaleType.FIT_CENTER);
        ViewGroup.LayoutParams layoutParams = ((ImageView) mo45939N0(i)).getLayoutParams();
        C12775o.m28637g(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((RelativeLayout.LayoutParams) layoutParams).removeRule(10);
        ViewGroup.LayoutParams layoutParams2 = ((TextView) mo45939N0(C13865f.textViewTitle)).getLayoutParams();
        C12775o.m28637g(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((RelativeLayout.LayoutParams) layoutParams2).topMargin = C12136d.m26463e(mo50355M0(), 24);
    }

    /* renamed from: q2 */
    private final void m23480q2() {
        Bundle arguments = getArguments();
        boolean z = false;
        if (arguments != null && f16834d.m23493l(arguments) == 1) {
            z = true;
        }
        if (z) {
            ((ImageView) mo45939N0(C13865f.imageViewForeground)).setVisibility(8);
            m23479p2();
        }
    }

    /* renamed from: N0 */
    public View mo45939N0(int i) {
        View findViewById;
        Map<Integer, View> map = this.f16841c;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12775o.m28639i(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_onboarding, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12775o.m28639i(view, "view");
        Bundle arguments = getArguments();
        if (arguments != null) {
            C10920a aVar = f16834d;
            ((TextView) mo45939N0(C13865f.textViewTitle)).setText(aVar.m23495n(arguments));
            ((TextView) mo45939N0(C13865f.textViewDescription)).setText(aVar.m23489h(arguments));
            ((ImageView) mo45939N0(C13865f.imageViewBackground)).setImageResource(aVar.m23491j(arguments));
            ((ImageView) mo45939N0(C13865f.imageViewForeground)).setImageResource(aVar.m23492k(arguments));
        }
        view.setTag(this);
        m23480q2();
        super.onViewCreated(view, bundle);
    }
}
