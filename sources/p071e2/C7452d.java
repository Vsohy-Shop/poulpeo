package p071e2;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import p251v2.C9925a;
import p454wf.C13735j;

/* renamed from: e2.d */
/* compiled from: SensitiveUserDataUtils.kt */
public final class C7452d {

    /* renamed from: a */
    public static final C7452d f10328a = new C7452d();

    private C7452d() {
    }

    /* renamed from: a */
    private final boolean m14587a(TextView textView) {
        if (C9925a.m20734d(this)) {
            return false;
        }
        try {
            String f = new C13735j("\\s").mo53413f(C7454f.m14608k(textView), "");
            int length = f.length();
            if (length < 12) {
                return false;
            }
            if (length > 19) {
                return false;
            }
            int i = 0;
            boolean z = false;
            for (int i2 = length - 1; i2 >= 0; i2--) {
                char charAt = f.charAt(i2);
                if (!Character.isDigit(charAt)) {
                    return false;
                }
                int g = C13725c.m31421g(charAt);
                if (z && (g = g * 2) > 9) {
                    g = (g % 10) + 1;
                }
                i += g;
                z = !z;
            }
            if (i % 10 == 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return false;
        }
    }

    /* renamed from: b */
    private final boolean m14588b(TextView textView) {
        if (C9925a.m20734d(this)) {
            return false;
        }
        try {
            boolean z = true;
            if (textView.getInputType() == 32) {
                return true;
            }
            String k = C7454f.m14608k(textView);
            if (k == null) {
                return false;
            }
            if (k.length() != 0) {
                z = false;
            }
            if (z) {
                return false;
            }
            return Patterns.EMAIL_ADDRESS.matcher(k).matches();
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return false;
        }
    }

    /* renamed from: c */
    private final boolean m14589c(TextView textView) {
        if (C9925a.m20734d(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return false;
        }
    }

    /* renamed from: d */
    private final boolean m14590d(TextView textView) {
        if (C9925a.m20734d(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 96) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return false;
        }
    }

    /* renamed from: e */
    private final boolean m14591e(TextView textView) {
        if (C9925a.m20734d(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 3) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return false;
        }
    }

    /* renamed from: f */
    private final boolean m14592f(TextView textView) {
        if (C9925a.m20734d(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 112) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C9925a.m20732b(th, this);
            return false;
        }
    }

    /* renamed from: g */
    public static final boolean m14593g(View view) {
        Class<C7452d> cls = C7452d.class;
        if (C9925a.m20734d(cls)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            C7452d dVar = f10328a;
            if (dVar.m14589c((TextView) view) || dVar.m14587a((TextView) view) || dVar.m14590d((TextView) view) || dVar.m14592f((TextView) view) || dVar.m14591e((TextView) view) || dVar.m14588b((TextView) view)) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C9925a.m20732b(th, cls);
            return false;
        }
    }
}
