package p012m9;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.text.style.SuperscriptSpan;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.poulpeo.R;
import com.rmn.api.p322v2.poulpeo.model.Earning;
import com.rmn.api.p322v2.poulpeo.model.EarningStatus;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;
import p393na.C12968g;
import p432tb.C13477a;
import p446vd.C13629j;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: m9.g */
/* compiled from: EarningsGroupViewHolder.kt */
public final class C2062g extends C14080a {

    /* renamed from: g */
    private final C13477a f670g;

    /* renamed from: h */
    private Earning f671h;

    /* renamed from: i */
    private final View f672i;

    /* renamed from: j */
    private final TextView f673j;

    /* renamed from: k */
    private final TextView f674k;

    /* renamed from: l */
    private final TextView f675l;

    /* renamed from: m */
    private final ImageView f676m;

    /* renamed from: n */
    private final ImageButton f677n;

    /* renamed from: o */
    private final SimpleDateFormat f678o = C13629j.m31131a("dd MMM yyyy");

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2062g(View view, C13867a.C13868a aVar, C13477a aVar2) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        C12775o.m28639i(aVar2, "controller");
        this.f670g = aVar2;
        View findViewById = view.findViewById(R.id.statusColorView);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.statusColorView)");
        this.f672i = findViewById;
        View findViewById2 = view.findViewById(R.id.dateTextView);
        C12775o.m28638h(findViewById2, "itemView.findViewById(R.id.dateTextView)");
        this.f673j = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.labelTextView);
        C12775o.m28638h(findViewById3, "itemView.findViewById(R.id.labelTextView)");
        this.f674k = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.amountTextView);
        C12775o.m28638h(findViewById4, "itemView.findViewById(R.id.amountTextView)");
        this.f675l = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.statusImageView);
        C12775o.m28638h(findViewById5, "itemView.findViewById(R.id.statusImageView)");
        this.f676m = (ImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.groupStateImageButton);
        C12775o.m28638h(findViewById6, "itemView.findViewById(R.id.groupStateImageButton)");
        this.f677n = (ImageButton) findViewById6;
    }

    /* renamed from: n2 */
    private final void m1392n2() {
        Drawable drawable;
        C13477a aVar = this.f670g;
        Earning earning = this.f671h;
        if (earning == null) {
            C12775o.m28656z("currentItem");
            earning = null;
        }
        if (aVar.mo53072Z2(earning.getGroupId())) {
            drawable = ContextCompat.getDrawable(mo53843t0(), R.drawable.action_collapse_black);
            C12775o.m28636f(drawable);
        } else {
            drawable = ContextCompat.getDrawable(mo53843t0(), R.drawable.action_expand_black);
            C12775o.m28636f(drawable);
        }
        this.f677n.setImageDrawable(drawable);
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        String str;
        C12775o.m28637g(obj, "null cannot be cast to non-null type com.rmn.api.v2.poulpeo.model.Earning");
        Earning earning = (Earning) obj;
        this.f671h = earning;
        Earning earning2 = null;
        if (earning == null) {
            C12775o.m28656z("currentItem");
            earning = null;
        }
        EarningStatus status = earning.getStatus();
        this.f672i.setBackgroundColor(C12968g.m29292a(status, mo53840J0()).f21807a);
        Earning earning3 = this.f671h;
        if (earning3 == null) {
            C12775o.m28656z("currentItem");
            earning3 = null;
        }
        Date date = earning3.getDate();
        if (date != null) {
            str = this.f678o.format(date);
            C12775o.m28638h(str, "dateFormatter.format(it)");
        } else {
            str = "";
        }
        this.f673j.setText(str);
        TextView textView = this.f674k;
        Earning earning4 = this.f671h;
        if (earning4 == null) {
            C12775o.m28656z("currentItem");
            earning4 = null;
        }
        textView.setText(earning4.getTitle());
        C12770k0 k0Var = C12770k0.f20423a;
        Locale c = C13629j.m31133c();
        Object[] objArr = new Object[1];
        Earning earning5 = this.f671h;
        if (earning5 == null) {
            C12775o.m28656z("currentItem");
        } else {
            earning2 = earning5;
        }
        objArr[0] = Double.valueOf(earning2.getAmount());
        String format = String.format(c, "%.2f€", Arrays.copyOf(objArr, 1));
        C12775o.m28638h(format, "format(locale, format, *args)");
        SpannableString spannableString = new SpannableString(format);
        int length = spannableString.length();
        int i = length - 1;
        spannableString.setSpan(new SuperscriptSpan(), i, length, 0);
        spannableString.setSpan(new RelativeSizeSpan(0.7f), i, length, 0);
        this.f675l.setText(spannableString);
        this.f676m.setImageDrawable(ContextCompat.getDrawable(mo53843t0(), C12968g.m29296e(status).f21820a));
        m1392n2();
        this.itemView.setOnClickListener(this);
        if (status == EarningStatus.REFUSED) {
            int i2 = C12968g.m29292a(status, mo53840J0()).f21807a;
            this.f673j.setTextColor(i2);
            this.f674k.setTextColor(i2);
            this.f675l.setTextColor(i2);
            return;
        }
        int color = ContextCompat.getColor(mo53843t0(), R.color.text_subtitle_default);
        int color2 = ContextCompat.getColor(mo53843t0(), R.color.text_title_default);
        this.f673j.setTextColor(color);
        this.f674k.setTextColor(color2);
        this.f675l.setTextColor(color2);
    }

    public void onClick(View view) {
        C12775o.m28639i(view, "v");
        if (view == this.itemView) {
            C13867a.C13868a M0 = mo53841M0();
            C12775o.m28636f(M0);
            Earning earning = this.f671h;
            if (earning == null) {
                C12775o.m28656z("currentItem");
                earning = null;
            }
            M0.mo46342E(earning);
            m1392n2();
        }
    }
}
