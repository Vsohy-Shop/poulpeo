package p011l9;

import android.content.Context;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p009j9.C2037b;
import p336ef.C11915r;
import p360id.C12139g;
import p404of.C13074a;
import p450wb.C13690b;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: l9.g */
/* compiled from: SponsorshipHeaderViewHolder.kt */
public final class C2047g extends C14080a {

    /* renamed from: g */
    private final boolean f632g;

    /* renamed from: h */
    private final Lazy f633h;

    /* renamed from: i */
    private final Lazy f634i;

    /* renamed from: j */
    private final Lazy f635j;

    /* renamed from: k */
    private final Lazy f636k;

    /* renamed from: l */
    private final Lazy f637l;

    /* renamed from: m */
    private final Lazy f638m;

    /* renamed from: n */
    private final Lazy f639n;

    /* renamed from: l9.g$a */
    /* compiled from: SponsorshipHeaderViewHolder.kt */
    static final class C2048a extends C12777p implements C13074a<Button> {

        /* renamed from: g */
        final /* synthetic */ View f640g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2048a(View view) {
            super(0);
            this.f640g = view;
        }

        /* renamed from: b */
        public final Button invoke() {
            return (Button) this.f640g.findViewById(R.id.buttonSponsorCodeShare);
        }
    }

    /* renamed from: l9.g$b */
    /* compiled from: SponsorshipHeaderViewHolder.kt */
    static final class C2049b extends C12777p implements C13074a<TextView> {

        /* renamed from: g */
        final /* synthetic */ View f641g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2049b(View view) {
            super(0);
            this.f641g = view;
        }

        /* renamed from: b */
        public final TextView invoke() {
            return (TextView) this.f641g.findViewById(R.id.textViewAdvantages);
        }
    }

    /* renamed from: l9.g$c */
    /* compiled from: SponsorshipHeaderViewHolder.kt */
    static final class C2050c extends C12777p implements C13074a<TextView> {

        /* renamed from: g */
        final /* synthetic */ View f642g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2050c(View view) {
            super(0);
            this.f642g = view;
        }

        /* renamed from: b */
        public final TextView invoke() {
            return (TextView) this.f642g.findViewById(R.id.textViewMember);
        }
    }

    /* renamed from: l9.g$d */
    /* compiled from: SponsorshipHeaderViewHolder.kt */
    static final class C2051d extends C12777p implements C13074a<TextView> {

        /* renamed from: g */
        final /* synthetic */ View f643g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2051d(View view) {
            super(0);
            this.f643g = view;
        }

        /* renamed from: b */
        public final TextView invoke() {
            return (TextView) this.f643g.findViewById(R.id.textViewSponsorCode);
        }
    }

    /* renamed from: l9.g$e */
    /* compiled from: SponsorshipHeaderViewHolder.kt */
    static final class C2052e extends C12777p implements C13074a<TextView> {

        /* renamed from: g */
        final /* synthetic */ View f644g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2052e(View view) {
            super(0);
            this.f644g = view;
        }

        /* renamed from: b */
        public final TextView invoke() {
            return (TextView) this.f644g.findViewById(R.id.textViewSponsoredBonus);
        }
    }

    /* renamed from: l9.g$f */
    /* compiled from: SponsorshipHeaderViewHolder.kt */
    static final class C2053f extends C12777p implements C13074a<View> {

        /* renamed from: g */
        final /* synthetic */ View f645g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2053f(View view) {
            super(0);
            this.f645g = view;
        }

        public final View invoke() {
            return this.f645g.findViewById(R.id.textViewSponsoredUsersTitle);
        }
    }

    /* renamed from: l9.g$g */
    /* compiled from: SponsorshipHeaderViewHolder.kt */
    static final class C2054g extends C12777p implements C13074a<TextView> {

        /* renamed from: g */
        final /* synthetic */ View f646g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2054g(View view) {
            super(0);
            this.f646g = view;
        }

        /* renamed from: b */
        public final TextView invoke() {
            return (TextView) this.f646g.findViewById(R.id.textViewWelcome);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2047g(View view, C13867a.C13868a aVar, boolean z) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        this.f632g = z;
        this.f633h = C11901h.m25690b(new C2050c(view));
        this.f634i = C11901h.m25690b(new C2049b(view));
        this.f635j = C11901h.m25690b(new C2052e(view));
        this.f636k = C11901h.m25690b(new C2054g(view));
        this.f637l = C11901h.m25690b(new C2051d(view));
        this.f638m = C11901h.m25690b(new C2053f(view));
        this.f639n = C11901h.m25690b(new C2048a(view));
        m1366n2().setOnClickListener(this);
    }

    /* renamed from: n2 */
    private final Button m1366n2() {
        return (Button) this.f639n.getValue();
    }

    /* renamed from: o2 */
    private final TextView m1367o2() {
        return (TextView) this.f634i.getValue();
    }

    /* renamed from: p2 */
    private final TextView m1368p2() {
        return (TextView) this.f633h.getValue();
    }

    /* renamed from: q2 */
    private final TextView m1369q2() {
        return (TextView) this.f637l.getValue();
    }

    /* renamed from: r2 */
    private final TextView m1370r2() {
        return (TextView) this.f635j.getValue();
    }

    /* renamed from: s2 */
    private final View m1371s2() {
        return (View) this.f638m.getValue();
    }

    /* renamed from: t2 */
    private final TextView m1372t2() {
        return (TextView) this.f636k.getValue();
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        C12775o.m28637g(obj, "null cannot be cast to non-null type com.poulpeo.ui.adapters.model_common.SponsorshipHeader");
        C2037b bVar = (C2037b) obj;
        Context context = this.itemView.getContext();
        if (context != null) {
            TextView p2 = m1368p2();
            C12775o.m28638h(p2, "textViewMember");
            boolean z = false;
            C12139g.m26475d(p2, this.f632g, 0, 2, (Object) null);
            TextView r2 = m1370r2();
            C12775o.m28638h(r2, "textViewSponsoredBonus");
            C12139g.m26475d(r2, !this.f632g, 0, 2, (Object) null);
            if (!this.f632g) {
                String string = context.getString(R.string.sponsorship_percentage_all_members);
                C12775o.m28638h(string, "context.getString(R.stri…p_percentage_all_members)");
                String string2 = context.getString(R.string.sponsorship_percentage_poulpeo_plus);
                C12775o.m28638h(string2, "context.getString(R.stri…_percentage_poulpeo_plus)");
                String string3 = context.getString(R.string.poulpeo_plus);
                C12775o.m28638h(string3, "context.getString(R.string.poulpeo_plus)");
                C13690b bVar2 = C13690b.f22034a;
                TextView o2 = m1367o2();
                C12775o.m28638h(o2, "textViewAdvantages");
                C12770k0 k0Var = C12770k0.f20423a;
                String string4 = context.getString(R.string.sponsorship_description_advantages);
                C12775o.m28638h(string4, "context.getString(R.stri…p_description_advantages)");
                String format = String.format(string4, Arrays.copyOf(new Object[]{string, string2, string3}, 3));
                C12775o.m28638h(format, "format(format, *args)");
                bVar2.mo53353k(o2, format, C12686e0.m28236o0(C12726w.m28527n(C11915r.m25707a(string, new StyleSpan(1)), C11915r.m25707a(string2, new StyleSpan(1))), bVar2.mo53348f(context, string3, 17, Integer.valueOf(R.color.poulpeo_plus))));
            } else {
                String string5 = context.getString(R.string.poulpeo_plus);
                C12775o.m28638h(string5, "context.getString(R.string.poulpeo_plus)");
                C13690b bVar3 = C13690b.f22034a;
                TextView p22 = m1368p2();
                C12775o.m28638h(p22, "textViewMember");
                String string6 = context.getString(R.string.sponsorship_description_member, new Object[]{string5});
                C12775o.m28638h(string6, "context.getString(R.stri…n_member, strPoulpeoPlus)");
                bVar3.mo53353k(p22, string6, bVar3.mo53348f(context, string5, 22, Integer.valueOf(R.color.poulpeo_plus)));
                String string7 = context.getString(R.string.sponsorship_percentage_poulpeo_plus);
                C12775o.m28638h(string7, "context.getString(R.stri…_percentage_poulpeo_plus)");
                TextView o22 = m1367o2();
                C12775o.m28638h(o22, "textViewAdvantages");
                C12770k0 k0Var2 = C12770k0.f20423a;
                String string8 = context.getString(R.string.sponsorship_description_member_advantages);
                C12775o.m28638h(string8, "context.getString(R.stri…iption_member_advantages)");
                String format2 = String.format(string8, Arrays.copyOf(new Object[]{string7}, 1));
                C12775o.m28638h(format2, "format(format, *args)");
                bVar3.mo53352j(o22, format2, string7, new StyleSpan(1));
            }
            String string9 = context.getString(R.string.sponsorship_description_welcome_bonus);
            C12775o.m28638h(string9, "context.getString(R.stri…escription_welcome_bonus)");
            C13690b bVar4 = C13690b.f22034a;
            TextView t2 = m1372t2();
            C12775o.m28638h(t2, "textViewWelcome");
            String string10 = context.getString(R.string.sponsorship_description_welcome, new Object[]{string9});
            C12775o.m28638h(string10, "context.getString(R.stri…welcome, strWelcomeBonus)");
            bVar4.mo53352j(t2, string10, string9, new StyleSpan(1));
            TextView q2 = m1369q2();
            String b = bVar.mo23231b();
            if (b == null) {
                b = "";
            }
            q2.setText(b);
            View s2 = m1371s2();
            C12775o.m28638h(s2, "textViewSponsoredUsersTitle");
            C12139g.m26474c(s2, bVar.mo23230a(), 4);
            Button n2 = m1366n2();
            String b2 = bVar.mo23231b();
            C12775o.m28638h(b2, "header.sponsorCode");
            if (b2.length() > 0) {
                z = true;
            }
            n2.setEnabled(z);
        }
    }
}
