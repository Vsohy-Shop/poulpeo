package p444vb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import com.poulpeo.R;
import kotlin.Lazy;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import p404of.C13074a;

@StabilityInferred(parameters = 0)
/* renamed from: vb.a */
/* compiled from: PLPPasswordTextWatcher.kt */
public final class C13608a implements TextWatcher {

    /* renamed from: b */
    private final TextView f21863b;

    /* renamed from: c */
    private final TextView f21864c;

    /* renamed from: d */
    private final TextView f21865d;

    /* renamed from: e */
    private final Lazy f21866e;

    /* renamed from: f */
    private final Lazy f21867f;

    /* renamed from: vb.a$a */
    /* compiled from: PLPPasswordTextWatcher.kt */
    static final class C13609a extends C12777p implements C13074a<Drawable> {

        /* renamed from: g */
        final /* synthetic */ Context f21868g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13609a(Context context) {
            super(0);
            this.f21868g = context;
        }

        /* renamed from: b */
        public final Drawable invoke() {
            Drawable drawable = ContextCompat.getDrawable(this.f21868g, R.drawable.checkmark_grey);
            C12775o.m28636f(drawable);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            return drawable;
        }
    }

    /* renamed from: vb.a$b */
    /* compiled from: PLPPasswordTextWatcher.kt */
    static final class C13610b extends C12777p implements C13074a<Drawable> {

        /* renamed from: g */
        final /* synthetic */ Context f21869g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13610b(Context context) {
            super(0);
            this.f21869g = context;
        }

        /* renamed from: b */
        public final Drawable invoke() {
            Drawable drawable = ContextCompat.getDrawable(this.f21869g, R.drawable.checkmark);
            C12775o.m28636f(drawable);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            return drawable;
        }
    }

    public C13608a(Context context, TextView textView, TextView textView2, TextView textView3) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(textView, "textViewUppercase");
        C12775o.m28639i(textView2, "textViewNumeric");
        C12775o.m28639i(textView3, "textViewLength");
        this.f21863b = textView;
        this.f21864c = textView2;
        this.f21865d = textView3;
        this.f21866e = C11901h.m25690b(new C13610b(context));
        this.f21867f = C11901h.m25690b(new C13609a(context));
    }

    /* renamed from: a */
    private final Drawable m31060a() {
        return (Drawable) this.f21867f.getValue();
    }

    /* renamed from: b */
    private final Drawable m31061b() {
        return (Drawable) this.f21866e.getValue();
    }

    /* renamed from: c */
    private final void m31062c(TextView textView, boolean z) {
        if (textView != null) {
            Context context = textView.getContext();
            if (z) {
                textView.setTextColor(ContextCompat.getColor(context, R.color.text_condition_validated));
                textView.setCompoundDrawables(m31061b(), (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
            textView.setTextColor(ContextCompat.getColor(context, R.color.text_condition_not_validated));
            textView.setCompoundDrawables(m31060a(), (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    public void afterTextChanged(Editable editable) {
        C13611b bVar = new C13611b(String.valueOf(editable));
        m31062c(this.f21863b, bVar.f21871b);
        m31062c(this.f21864c, bVar.f21872c);
        m31062c(this.f21865d, bVar.f21873d);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
