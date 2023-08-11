package p293z0;

import android.animation.StateListAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.Button;
import com.appboy.p054ui.C4193R;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import p069e0.C7416r;

/* renamed from: z0.b */
/* compiled from: InAppMessageButtonViewUtils.kt */
public final class C10761b {

    /* renamed from: a */
    public static final C10761b f16460a = new C10761b();

    private C10761b() {
    }

    /* renamed from: a */
    public static final Drawable m22896a(Context context, C7416r rVar, int i, int i2, boolean z) {
        C12775o.m28639i(context, "context");
        C12775o.m28639i(rVar, "messageButton");
        Drawable b = m22897b(context, C4193R.C4195drawable.com_braze_inappmessage_button_background);
        b.mutate();
        Drawable findDrawableByLayerId = ((RippleDrawable) b).findDrawableByLayerId(C4193R.C4196id.f3315xf483b01a);
        if (findDrawableByLayerId != null) {
            GradientDrawable gradientDrawable = (GradientDrawable) findDrawableByLayerId;
            if (z) {
                i = i2;
            }
            gradientDrawable.setStroke(i, rVar.mo41064w());
            gradientDrawable.setColor(rVar.mo41062e0());
            return b;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
    }

    /* renamed from: b */
    public static final Drawable m22897b(Context context, int i) {
        C12775o.m28639i(context, "context");
        Drawable drawable = context.getResources().getDrawable(i);
        C12775o.m28638h(drawable, "context.resources.getDrawable(drawableId)");
        return drawable;
    }

    /* renamed from: c */
    public static final void m22898c(Button button, C7416r rVar, int i, int i2) {
        C12775o.m28639i(button, "button");
        C12775o.m28639i(rVar, "messageButton");
        button.setText(rVar.mo41067z());
        button.setContentDescription(rVar.mo41067z());
        C10762c.m22908i(button, rVar.mo41056A());
        StateListDrawable stateListDrawable = new StateListDrawable();
        button.setStateListAnimator((StateListAnimator) null);
        Context context = button.getContext();
        C12775o.m28638h(context, "button.context");
        Drawable a = m22896a(context, rVar, i, i2, false);
        Context context2 = button.getContext();
        C12775o.m28638h(context2, "button.context");
        Drawable a2 = m22896a(context2, rVar, i, i2, true);
        stateListDrawable.addState(new int[]{16842908}, a2);
        stateListDrawable.addState(new int[]{16842910}, a);
        button.setBackground(stateListDrawable);
    }

    /* renamed from: d */
    public static final void m22899d(List<? extends View> list, List<? extends C7416r> list2) {
        C12775o.m28639i(list, "buttonViews");
        C12775o.m28639i(list2, "messageButtons");
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            View view = (View) list.get(i);
            C7416r rVar = (C7416r) list2.get(i);
            int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(C4193R.dimen.com_braze_inappmessage_button_border_stroke);
            int dimensionPixelSize2 = view.getContext().getResources().getDimensionPixelSize(C4193R.dimen.com_braze_inappmessage_button_border_stroke_focused);
            if (list2.size() <= i) {
                view.setVisibility(8);
            } else if (view instanceof Button) {
                m22898c((Button) view, rVar, dimensionPixelSize, dimensionPixelSize2);
            }
            i = i2;
        }
    }
}
