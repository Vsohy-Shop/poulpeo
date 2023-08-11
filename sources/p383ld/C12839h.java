package p383ld;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.rmn.utils.IntentDelegate;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.C12783v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import p336ef.C11921v;
import p368jd.C12616b;
import p404of.C13074a;

@StabilityInferred(parameters = 0)
/* renamed from: ld.h */
/* compiled from: BaseSignUpConsentActivity.kt */
public abstract class C12839h extends C12616b implements View.OnClickListener {

    /* renamed from: A */
    public static final int f20536A = 8;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public static final IntentDelegate.Boolean f20537B = new IntentDelegate.Boolean("isFacebookSignUp");
    /* access modifiers changed from: private */

    /* renamed from: C */
    public static final IntentDelegate.Boolean f20538C = new IntentDelegate.Boolean("isGoogleSignUp");
    /* access modifiers changed from: private */

    /* renamed from: D */
    public static final IntentDelegate.Boolean f20539D = new IntentDelegate.Boolean("isAppleSignUp");

    /* renamed from: z */
    public static final C12840a f20540z = new C12840a((DefaultConstructorMarker) null);

    /* renamed from: m */
    private final Lazy f20541m = C11901h.m25690b(new C12842c(this));

    /* renamed from: n */
    private final Lazy f20542n = C11901h.m25690b(new C12843d(this));

    /* renamed from: o */
    private final Lazy f20543o = C11901h.m25690b(new C12841b(this));

    /* renamed from: p */
    private final Lazy f20544p = C11901h.m25690b(new C12849j(this));

    /* renamed from: q */
    private boolean f20545q;

    /* renamed from: r */
    private final Lazy f20546r = C11901h.m25690b(new C12845f(this));

    /* renamed from: s */
    private final Lazy f20547s = C11901h.m25690b(new C12846g(this));

    /* renamed from: t */
    private final Lazy f20548t = C11901h.m25690b(new C12844e(this));

    /* renamed from: u */
    private final CharSequence f20549u = "";

    /* renamed from: v */
    private final CharSequence f20550v = "";

    /* renamed from: w */
    private final CharSequence f20551w = "";

    /* renamed from: x */
    private final Function1<Boolean, C11921v> f20552x;

    /* renamed from: y */
    public Map<Integer, View> f20553y = new LinkedHashMap();

    /* renamed from: ld.h$a */
    /* compiled from: BaseSignUpConsentActivity.kt */
    public static final class C12840a {

        /* renamed from: a */
        static final /* synthetic */ KProperty<Object>[] f20554a;

        static {
            Class<C12840a> cls = C12840a.class;
            f20554a = new KProperty[]{C12764h0.m28590f(new C12783v(cls, "isFacebookSignUp", "isFacebookSignUp(Landroid/content/Intent;)Z", 0)), C12764h0.m28590f(new C12783v(cls, "isGoogleSignUp", "isGoogleSignUp(Landroid/content/Intent;)Z", 0)), C12764h0.m28590f(new C12783v(cls, "isAppleSignUp", "isAppleSignUp(Landroid/content/Intent;)Z", 0))};
        }

        private C12840a() {
        }

        public /* synthetic */ C12840a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public final boolean m28871e(Intent intent) {
            return C12839h.f20539D.getValue(intent, (KProperty<?>) f20554a[2]).booleanValue();
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public final boolean m28872f(Intent intent) {
            return C12839h.f20537B.getValue(intent, (KProperty<?>) f20554a[0]).booleanValue();
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public final boolean m28873g(Intent intent) {
            return C12839h.f20538C.getValue(intent, (KProperty<?>) f20554a[1]).booleanValue();
        }

        /* renamed from: h */
        private final void m28874h(Intent intent, boolean z) {
            C12839h.f20539D.setValue(intent, (KProperty<?>) f20554a[2], z);
        }

        /* renamed from: i */
        private final void m28875i(Intent intent, boolean z) {
            C12839h.f20537B.setValue(intent, (KProperty<?>) f20554a[0], z);
        }

        /* renamed from: j */
        private final void m28876j(Intent intent, boolean z) {
            C12839h.f20538C.setValue(intent, (KProperty<?>) f20554a[1], z);
        }

        /* renamed from: d */
        public final Intent mo50764d(Intent intent, boolean z, boolean z2, boolean z3) {
            C12775o.m28639i(intent, "intent");
            m28875i(intent, z);
            m28876j(intent, z2);
            m28874h(intent, z3);
            return intent;
        }
    }

    /* renamed from: ld.h$b */
    /* compiled from: BaseSignUpConsentActivity.kt */
    static final class C12841b extends C12777p implements C13074a<Button> {

        /* renamed from: g */
        final /* synthetic */ C12839h f20555g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12841b(C12839h hVar) {
            super(0);
            this.f20555g = hVar;
        }

        /* renamed from: b */
        public final Button invoke() {
            return (Button) this.f20555g.findViewById(R.id.buttonValidate);
        }
    }

    /* renamed from: ld.h$c */
    /* compiled from: BaseSignUpConsentActivity.kt */
    static final class C12842c extends C12777p implements C13074a<CheckBox> {

        /* renamed from: g */
        final /* synthetic */ C12839h f20556g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12842c(C12839h hVar) {
            super(0);
            this.f20556g = hVar;
        }

        /* renamed from: b */
        public final CheckBox invoke() {
            return (CheckBox) this.f20556g.findViewById(R.id.checkboxConditions);
        }
    }

    /* renamed from: ld.h$d */
    /* compiled from: BaseSignUpConsentActivity.kt */
    static final class C12843d extends C12777p implements C13074a<CheckBox> {

        /* renamed from: g */
        final /* synthetic */ C12839h f20557g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12843d(C12839h hVar) {
            super(0);
            this.f20557g = hVar;
        }

        /* renamed from: b */
        public final CheckBox invoke() {
            return (CheckBox) this.f20557g.findViewById(R.id.checkboxNewsletter);
        }
    }

    /* renamed from: ld.h$e */
    /* compiled from: BaseSignUpConsentActivity.kt */
    static final class C12844e extends C12777p implements C13074a<Boolean> {

        /* renamed from: g */
        final /* synthetic */ C12839h f20558g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12844e(C12839h hVar) {
            super(0);
            this.f20558g = hVar;
        }

        public final Boolean invoke() {
            C12840a aVar = C12839h.f20540z;
            Intent intent = this.f20558g.getIntent();
            C12775o.m28638h(intent, "intent");
            return Boolean.valueOf(aVar.m28871e(intent));
        }
    }

    /* renamed from: ld.h$f */
    /* compiled from: BaseSignUpConsentActivity.kt */
    static final class C12845f extends C12777p implements C13074a<Boolean> {

        /* renamed from: g */
        final /* synthetic */ C12839h f20559g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12845f(C12839h hVar) {
            super(0);
            this.f20559g = hVar;
        }

        public final Boolean invoke() {
            C12840a aVar = C12839h.f20540z;
            Intent intent = this.f20559g.getIntent();
            C12775o.m28638h(intent, "intent");
            return Boolean.valueOf(aVar.m28872f(intent));
        }
    }

    /* renamed from: ld.h$g */
    /* compiled from: BaseSignUpConsentActivity.kt */
    static final class C12846g extends C12777p implements C13074a<Boolean> {

        /* renamed from: g */
        final /* synthetic */ C12839h f20560g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12846g(C12839h hVar) {
            super(0);
            this.f20560g = hVar;
        }

        public final Boolean invoke() {
            C12840a aVar = C12839h.f20540z;
            Intent intent = this.f20560g.getIntent();
            C12775o.m28638h(intent, "intent");
            return Boolean.valueOf(aVar.m28873g(intent));
        }
    }

    /* renamed from: ld.h$h */
    /* compiled from: BaseSignUpConsentActivity.kt */
    public static final class C12847h extends ClickableSpan {

        /* renamed from: b */
        final /* synthetic */ C12839h f20561b;

        C12847h(C12839h hVar) {
            this.f20561b = hVar;
        }

        public void onClick(View view) {
            C12775o.m28639i(view, "widget");
            C12839h hVar = this.f20561b;
            hVar.mo46298U2(hVar);
        }
    }

    /* renamed from: ld.h$i */
    /* compiled from: BaseSignUpConsentActivity.kt */
    public static final class C12848i extends ClickableSpan {

        /* renamed from: b */
        final /* synthetic */ C12839h f20562b;

        C12848i(C12839h hVar) {
            this.f20562b = hVar;
        }

        public void onClick(View view) {
            C12775o.m28639i(view, "widget");
            C12839h hVar = this.f20562b;
            hVar.mo46297T2(hVar);
        }

        public void updateDrawState(TextPaint textPaint) {
            C12775o.m28639i(textPaint, "ds");
            super.updateDrawState(textPaint);
            textPaint.setColor(this.f20562b.m28855N2().getCurrentTextColor());
        }
    }

    /* renamed from: ld.h$j */
    /* compiled from: BaseSignUpConsentActivity.kt */
    static final class C12849j extends C12777p implements C13074a<TextView> {

        /* renamed from: g */
        final /* synthetic */ C12839h f20563g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12849j(C12839h hVar) {
            super(0);
            this.f20563g = hVar;
        }

        /* renamed from: b */
        public final TextView invoke() {
            return (TextView) this.f20563g.findViewById(R.id.textViewPrivacy);
        }
    }

    /* renamed from: H2 */
    private final Button m28852H2() {
        return (Button) this.f20543o.getValue();
    }

    /* renamed from: I2 */
    private final CheckBox m28853I2() {
        return (CheckBox) this.f20541m.getValue();
    }

    /* renamed from: J2 */
    private final CheckBox m28854J2() {
        return (CheckBox) this.f20542n.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public final TextView m28855N2() {
        return (TextView) this.f20544p.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public static final void m28856R2(C12839h hVar, CompoundButton compoundButton, boolean z) {
        C12775o.m28639i(hVar, "this$0");
        hVar.m28852H2().setEnabled(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public static final void m28857S2(C12839h hVar, CompoundButton compoundButton, boolean z) {
        C12775o.m28639i(hVar, "this$0");
        hVar.f20545q = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G2 */
    public CharSequence mo46293G2() {
        return this.f20551w;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K2 */
    public Function1<Boolean, C11921v> mo46294K2() {
        return this.f20552x;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L2 */
    public CharSequence mo46295L2() {
        return this.f20549u;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M2 */
    public CharSequence mo46296M2() {
        return this.f20550v;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O2 */
    public final boolean mo50760O2() {
        return ((Boolean) this.f20548t.getValue()).booleanValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: P2 */
    public final boolean mo50761P2() {
        return ((Boolean) this.f20546r.getValue()).booleanValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q2 */
    public final boolean mo50762Q2() {
        return ((Boolean) this.f20547s.getValue()).booleanValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: T2 */
    public abstract void mo46297T2(Context context);

    /* access modifiers changed from: protected */
    /* renamed from: U2 */
    public abstract void mo46298U2(Context context);

    public void onClick(View view) {
        mo46299V2(this.f20545q);
        if (mo46294K2() == null || mo50761P2() || mo50762Q2() || mo50760O2()) {
            boolean P2 = mo50761P2();
            boolean Q2 = mo50762Q2();
            boolean O2 = mo50760O2();
            Intent intent = new Intent();
            intent.putExtra("newsletter_is_checked", this.f20545q);
            intent.putExtra("is_facebook_signup", P2);
            intent.putExtra("is_google_signup", Q2);
            intent.putExtra("is_apple_signup", O2);
            setResult(-1, intent);
            finish();
            return;
        }
        Function1<Boolean, C11921v> K2 = mo46294K2();
        C12775o.m28636f(K2);
        K2.invoke(Boolean.valueOf(this.f20545q));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_signup_consent);
        m28853I2().setOnCheckedChangeListener(new C12837f(this));
        m28854J2().setOnCheckedChangeListener(new C12838g(this));
        m28852H2().setOnClickListener(this);
        String string = getString(R.string.signup_consent_conditions_label_start);
        C12775o.m28638h(string, "getString(R.string.signu…t_conditions_label_start)");
        String string2 = getString(R.string.signup_consent_conditions_label_end);
        C12775o.m28638h(string2, "getString(R.string.signu…ent_conditions_label_end)");
        StringBuilder sb = new StringBuilder(string);
        sb.append(string2);
        int length = string.length();
        int length2 = string2.length() + length;
        SpannableString spannableString = new SpannableString(sb);
        spannableString.setSpan(new UnderlineSpan(), length, length2, 33);
        spannableString.setSpan(new C12847h(this), length, length2, 33);
        m28853I2().setText(spannableString);
        m28853I2().setMovementMethod(LinkMovementMethod.getInstance());
        String string3 = getString(R.string.signup_consent_privacy);
        C12775o.m28638h(string3, "getString(R.string.signup_consent_privacy)");
        StringBuilder sb2 = new StringBuilder(string3);
        if (mo50761P2()) {
            sb2.append(mo46295L2());
        } else if (mo50762Q2()) {
            sb2.append(mo46296M2());
        } else if (mo50760O2()) {
            sb2.append(mo46293G2());
        }
        int length3 = string3.length();
        SpannableString spannableString2 = new SpannableString(sb2);
        spannableString2.setSpan(new UnderlineSpan(), 0, length3, 33);
        spannableString2.setSpan(new C12848i(this), 0, length3, 33);
        m28855N2().setText(spannableString2);
        m28855N2().setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* access modifiers changed from: protected */
    /* renamed from: V2 */
    public void mo46299V2(boolean z) {
    }
}
