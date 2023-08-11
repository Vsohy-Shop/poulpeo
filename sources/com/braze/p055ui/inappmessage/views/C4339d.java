package com.braze.p055ui.inappmessage.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.WindowInsetsCompat;
import java.io.File;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.C12777p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p018a0.C2111i;
import p019a1.C2117c;
import p069e0.C7362e;
import p126j0.C8266c;
import p293z0.C10762c;
import p404of.C13074a;

/* renamed from: com.braze.ui.inappmessage.views.d */
/* compiled from: InAppMessageBaseView.kt */
public abstract class C4339d extends RelativeLayout implements C4338c {
    public static final C4340a Companion = new C4340a((DefaultConstructorMarker) null);
    private boolean hasAppliedWindowInsets;

    /* renamed from: com.braze.ui.inappmessage.views.d$a */
    /* compiled from: InAppMessageBaseView.kt */
    public static final class C4340a {

        /* renamed from: com.braze.ui.inappmessage.views.d$a$a */
        /* compiled from: InAppMessageBaseView.kt */
        static final class C4341a extends C12777p implements C13074a<String> {

            /* renamed from: g */
            final /* synthetic */ String f3628g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4341a(String str) {
                super(0);
                this.f3628g = str;
            }

            public final String invoke() {
                return C12775o.m28647q("Local bitmap file does not exist. Using remote url instead. Local path: ", this.f3628g);
            }
        }

        private C4340a() {
        }

        public /* synthetic */ C4340a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo31129a(C7362e eVar) {
            boolean z;
            C12775o.m28639i(eVar, "inAppMessage");
            String z2 = eVar.mo40983z();
            if (z2 == null || C13754v.m31532t(z2)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (new File(z2).exists()) {
                    return z2;
                }
                C8266c.m16396e(C8266c.f11641a, this, C8266c.C8267a.D, (Throwable) null, false, new C4341a(z2), 6, (Object) null);
            }
            return eVar.mo40979v();
        }
    }

    public C4339d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static final String getAppropriateImageUrl(C7362e eVar) {
        return Companion.mo31129a(eVar);
    }

    public void applyWindowInsets(WindowInsetsCompat windowInsetsCompat) {
        C12775o.m28639i(windowInsetsCompat, "insets");
        setHasAppliedWindowInsets(true);
    }

    public boolean getHasAppliedWindowInsets() {
        return this.hasAppliedWindowInsets;
    }

    public abstract Object getMessageBackgroundObject();

    public abstract TextView getMessageIconView();

    public abstract ImageView getMessageImageView();

    public abstract TextView getMessageTextView();

    public void resetMessageMargins(boolean z) {
        CharSequence text;
        String obj;
        ImageView messageImageView = getMessageImageView();
        if (messageImageView != null) {
            if (!z) {
                C2117c.m1471j(messageImageView);
            } else {
                C2117c.m1471j(getMessageIconView());
            }
        }
        TextView messageIconView = getMessageIconView();
        boolean z2 = false;
        if (!(messageIconView == null || (text = messageIconView.getText()) == null || (obj = text.toString()) == null || !C13754v.m31532t(obj))) {
            z2 = true;
        }
        if (z2) {
            C2117c.m1471j(getMessageIconView());
        }
    }

    public void setHasAppliedWindowInsets(boolean z) {
        this.hasAppliedWindowInsets = z;
    }

    public void setMessage(String str) {
        C12775o.m28639i(str, "text");
        TextView messageTextView = getMessageTextView();
        if (messageTextView != null) {
            messageTextView.setText(str);
        }
    }

    public void setMessageBackgroundColor(int i) {
        Object messageBackgroundObject = getMessageBackgroundObject();
        if (messageBackgroundObject != null) {
            C10762c.m22909j((View) messageBackgroundObject, i);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
    }

    public void setMessageIcon(String str, int i, int i2) {
        C12775o.m28639i(str, "icon");
        TextView messageIconView = getMessageIconView();
        if (messageIconView != null) {
            Context context = getContext();
            C12775o.m28638h(context, "context");
            C10762c.m22905f(context, str, i, i2, messageIconView);
        }
    }

    public void setMessageImageView(Bitmap bitmap) {
        C12775o.m28639i(bitmap, "bitmap");
        ImageView messageImageView = getMessageImageView();
        if (messageImageView != null) {
            C10762c.m22906g(bitmap, messageImageView);
        }
    }

    public void setMessageTextAlign(C2111i iVar) {
        C12775o.m28639i(iVar, "textAlign");
        TextView messageTextView = getMessageTextView();
        if (messageTextView != null) {
            C10762c.m22907h(messageTextView, iVar);
        }
    }

    public void setMessageTextColor(int i) {
        TextView messageTextView = getMessageTextView();
        if (messageTextView != null) {
            C10762c.m22908i(messageTextView, i);
        }
    }

    public View getMessageClickableView() {
        return this;
    }
}
