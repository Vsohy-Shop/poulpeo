package p103ga;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.web.WebActivity;
import com.rmn.api.p322v2.common.model.NewFeature;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p334ed.C11884a;

@StabilityInferred(parameters = 0)
/* renamed from: ga.c */
/* compiled from: NewFeatureDialogFragment.kt */
public final class C7837c extends C11884a {

    /* renamed from: i */
    public static final C7838a f10911i = new C7838a((DefaultConstructorMarker) null);

    /* renamed from: j */
    public static final int f10912j = 8;

    /* renamed from: g */
    private List<? extends NewFeature> f10913g;

    /* renamed from: h */
    public Map<Integer, View> f10914h = new LinkedHashMap();

    /* renamed from: ga.c$a */
    /* compiled from: NewFeatureDialogFragment.kt */
    public static final class C7838a {
        private C7838a() {
        }

        public /* synthetic */ C7838a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7837c mo41546a(List<? extends NewFeature> list) {
            C12775o.m28639i(list, "newFeatures");
            C7837c cVar = new C7837c();
            cVar.mo41545n2(list);
            return cVar;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final void m15325l2(FragmentActivity fragmentActivity, C7837c cVar, View view) {
        C12775o.m28639i(fragmentActivity, "$currentActivity");
        C12775o.m28639i(cVar, "this$0");
        fragmentActivity.startActivity(WebActivity.f17745z.mo46527f(fragmentActivity));
        cVar.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public static final void m15326m2(C7837c cVar, View view) {
        C12775o.m28639i(cVar, "this$0");
        cVar.dismiss();
    }

    /* renamed from: n2 */
    public final void mo41545n2(List<? extends NewFeature> list) {
        C12775o.m28639i(list, "newFeatures");
        this.f10913g = list;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        NewFeature newFeature;
        C12775o.m28639i(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_new_feature, viewGroup, false);
        List<? extends NewFeature> list = this.f10913g;
        if (list == null || (newFeature = (NewFeature) list.get(0)) == null) {
            throw new IllegalStateException();
        }
        View findViewById = inflate.findViewById(R.id.imageViewLogo);
        C12775o.m28638h(findViewById, "v.findViewById(R.id.imageViewLogo)");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.textViewTitle);
        C12775o.m28638h(findViewById2, "v.findViewById(R.id.textViewTitle)");
        TextView textView = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.textViewDescription);
        C12775o.m28638h(findViewById3, "v.findViewById(R.id.textViewDescription)");
        TextView textView2 = (TextView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.textViewKnowMore);
        C12775o.m28638h(findViewById4, "v.findViewById(R.id.textViewKnowMore)");
        TextView textView3 = (TextView) findViewById4;
        View findViewById5 = inflate.findViewById(R.id.textViewOk);
        C12775o.m28638h(findViewById5, "v.findViewById(R.id.textViewOk)");
        TextView textView4 = (TextView) findViewById5;
        FragmentActivity activity = getActivity();
        C12775o.m28636f(activity);
        int identifier = activity.getResources().getIdentifier(newFeature.getImageName(), "drawable", activity.getPackageName());
        if (identifier > 0) {
            imageView.setImageDrawable(ContextCompat.getDrawable(activity, identifier));
        }
        textView.setText(newFeature.getTitle());
        textView2.setText(newFeature.getDescription());
        textView3.setOnClickListener(new C7835a(activity, this));
        textView4.setOnClickListener(new C7836b(this));
        return inflate;
    }
}
