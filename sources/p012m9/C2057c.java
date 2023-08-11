package p012m9;

import android.animation.ValueAnimator;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.text.style.SuperscriptSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.mikhaellopez.circularprogressbar.CircularProgressBar;
import com.poulpeo.R;
import com.rmn.api.p322v2.poulpeo.model.EarningAmount;
import java.util.Arrays;
import kotlin.jvm.internal.C12770k0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p446vd.C13629j;
import p463yc.C13867a;
import p469zc.C14080a;

@StabilityInferred(parameters = 0)
/* renamed from: m9.c */
/* compiled from: EarningsAmountViewHolder.kt */
public final class C2057c extends C14080a {

    /* renamed from: l */
    public static final C2058a f650l = new C2058a((DefaultConstructorMarker) null);

    /* renamed from: m */
    public static final int f651m = 8;

    /* renamed from: n */
    private static final int f652n = 800;

    /* renamed from: o */
    private static double f653o;

    /* renamed from: g */
    private final CircularProgressBar f654g;

    /* renamed from: h */
    private final TextView f655h;

    /* renamed from: i */
    private final TextView f656i;

    /* renamed from: j */
    private final TextView f657j;

    /* renamed from: k */
    private final Button f658k;

    /* renamed from: m9.c$a */
    /* compiled from: EarningsAmountViewHolder.kt */
    public static final class C2058a {
        private C2058a() {
        }

        public /* synthetic */ C2058a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m1386b(TextView textView, double d, RelativeSizeSpan relativeSizeSpan) {
            C12770k0 k0Var = C12770k0.f20423a;
            String format = String.format(C13629j.m31133c(), "%.2f€", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
            C12775o.m28638h(format, "format(locale, format, *args)");
            SpannableString spannableString = new SpannableString(format);
            int length = spannableString.length();
            int i = length - 1;
            spannableString.setSpan(new SuperscriptSpan(), i, length, 0);
            spannableString.setSpan(relativeSizeSpan, i, length, 0);
            textView.setText(spannableString);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2057c(View view, C13867a.C13868a aVar) {
        super(view, aVar);
        C12775o.m28639i(view, "itemView");
        C12775o.m28639i(aVar, "listener");
        View findViewById = view.findViewById(R.id.circleProgress);
        C12775o.m28638h(findViewById, "itemView.findViewById(R.id.circleProgress)");
        this.f654g = (CircularProgressBar) findViewById;
        View findViewById2 = view.findViewById(R.id.totalAmountTextView);
        C12775o.m28638h(findViewById2, "itemView.findViewById(R.id.totalAmountTextView)");
        this.f655h = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.pendingAmountTextView);
        C12775o.m28638h(findViewById3, "itemView.findViewById(R.id.pendingAmountTextView)");
        this.f656i = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.acceptedAmountTextView);
        C12775o.m28638h(findViewById4, "itemView.findViewById(R.id.acceptedAmountTextView)");
        this.f657j = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.requestPaymentButton);
        C12775o.m28638h(findViewById5, "itemView.findViewById(R.id.requestPaymentButton)");
        this.f658k = (Button) findViewById5;
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public static final void m1382p2(C2057c cVar, ValueAnimator valueAnimator) {
        C12775o.m28639i(cVar, "this$0");
        C12775o.m28639i(valueAnimator, "animation");
        C2058a aVar = f650l;
        TextView textView = cVar.f655h;
        Object animatedValue = valueAnimator.getAnimatedValue();
        C12775o.m28637g(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        aVar.m1386b(textView, (double) ((Float) animatedValue).floatValue(), new RelativeSizeSpan(0.5f));
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public static final void m1383q2(C2057c cVar, EarningAmount earningAmount, View view) {
        C12775o.m28639i(cVar, "this$0");
        C12775o.m28639i(earningAmount, "$earningAmount");
        C13867a.C13868a M0 = cVar.mo53841M0();
        C12775o.m28636f(M0);
        M0.mo46342E(earningAmount);
    }

    /* renamed from: m2 */
    public void mo23234m2(C13867a aVar, Object obj) {
        boolean z;
        boolean z2;
        C12775o.m28637g(obj, "null cannot be cast to non-null type com.rmn.api.v2.poulpeo.model.EarningAmount");
        EarningAmount earningAmount = (EarningAmount) obj;
        double total = earningAmount.getTotal();
        float accepted = (float) ((earningAmount.getAccepted() / total) * ((double) 100));
        if (accepted == this.f654g.getProgress()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f654g.mo40730b(accepted, f652n);
        }
        if (total > 0.0d) {
            if (f653o == total) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                f650l.m1386b(this.f655h, total, new RelativeSizeSpan(0.5f));
                f653o = total;
                C2058a aVar2 = f650l;
                aVar2.m1386b(this.f656i, earningAmount.getPending(), new RelativeSizeSpan(0.75f));
                aVar2.m1386b(this.f657j, earningAmount.getAccepted(), new RelativeSizeSpan(0.75f));
                this.f658k.setOnClickListener(new C2056b(this, earningAmount));
            }
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setFloatValues(new float[]{0.0f, (float) total});
        valueAnimator.setDuration((long) f652n);
        valueAnimator.addUpdateListener(new C2055a(this));
        valueAnimator.start();
        f653o = total;
        C2058a aVar22 = f650l;
        aVar22.m1386b(this.f656i, earningAmount.getPending(), new RelativeSizeSpan(0.75f));
        aVar22.m1386b(this.f657j, earningAmount.getAccepted(), new RelativeSizeSpan(0.75f));
        this.f658k.setOnClickListener(new C2056b(this, earningAmount));
    }
}
