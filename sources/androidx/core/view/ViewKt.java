package androidx.core.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.C0127Px;
import androidx.annotation.RequiresApi;
import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import p336ef.C11921v;
import p355hf.C12074d;
import p404of.C13074a;
import p448vf.C13650g;

/* compiled from: View.kt */
public final class ViewKt {
    public static final void doOnAttach(View view, Function1<? super View, C11921v> function1) {
        C12775o.m28639i(view, "<this>");
        C12775o.m28639i(function1, "action");
        if (ViewCompat.isAttachedToWindow(view)) {
            function1.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new ViewKt$doOnAttach$1(view, function1));
        }
    }

    public static final void doOnDetach(View view, Function1<? super View, C11921v> function1) {
        C12775o.m28639i(view, "<this>");
        C12775o.m28639i(function1, "action");
        if (!ViewCompat.isAttachedToWindow(view)) {
            function1.invoke(view);
        } else {
            view.addOnAttachStateChangeListener(new ViewKt$doOnDetach$1(view, function1));
        }
    }

    public static final void doOnLayout(View view, Function1<? super View, C11921v> function1) {
        C12775o.m28639i(view, "<this>");
        C12775o.m28639i(function1, "action");
        if (!ViewCompat.isLaidOut(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new ViewKt$doOnLayout$$inlined$doOnNextLayout$1(function1));
        } else {
            function1.invoke(view);
        }
    }

    public static final void doOnNextLayout(View view, Function1<? super View, C11921v> function1) {
        C12775o.m28639i(view, "<this>");
        C12775o.m28639i(function1, "action");
        view.addOnLayoutChangeListener(new ViewKt$doOnNextLayout$1(function1));
    }

    public static final OneShotPreDrawListener doOnPreDraw(View view, Function1<? super View, C11921v> function1) {
        C12775o.m28639i(view, "<this>");
        C12775o.m28639i(function1, "action");
        OneShotPreDrawListener add = OneShotPreDrawListener.add(view, new ViewKt$doOnPreDraw$1(function1, view));
        C12775o.m28638h(add, "View.doOnPreDraw(\n    cr…dd(this) { action(this) }");
        return add;
    }

    public static final Bitmap drawToBitmap(View view, Bitmap.Config config) {
        C12775o.m28639i(view, "<this>");
        C12775o.m28639i(config, "config");
        if (ViewCompat.isLaidOut(view)) {
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
            C12775o.m28638h(createBitmap, "createBitmap(width, height, config)");
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(-((float) view.getScrollX()), -((float) view.getScrollY()));
            view.draw(canvas);
            return createBitmap;
        }
        throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
    }

    public static /* synthetic */ Bitmap drawToBitmap$default(View view, Bitmap.Config config, int i, Object obj) {
        if ((i & 1) != 0) {
            config = Bitmap.Config.ARGB_8888;
        }
        return drawToBitmap(view, config);
    }

    public static final C13650g<View> getAllViews(View view) {
        C12775o.m28639i(view, "<this>");
        return C13654k.m31268b(new ViewKt$allViews$1(view, (C12074d<? super ViewKt$allViews$1>) null));
    }

    public static final C13650g<ViewParent> getAncestors(View view) {
        C12775o.m28639i(view, "<this>");
        return C13657m.m31272f(view.getParent(), ViewKt$ancestors$1.INSTANCE);
    }

    public static final int getMarginBottom(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C12775o.m28639i(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            return marginLayoutParams.bottomMargin;
        }
        return 0;
    }

    public static final int getMarginEnd(View view) {
        C12775o.m28639i(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final int getMarginLeft(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C12775o.m28639i(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            return marginLayoutParams.leftMargin;
        }
        return 0;
    }

    public static final int getMarginRight(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C12775o.m28639i(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            return marginLayoutParams.rightMargin;
        }
        return 0;
    }

    public static final int getMarginStart(View view) {
        C12775o.m28639i(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return 0;
    }

    public static final int getMarginTop(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C12775o.m28639i(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public static final boolean isGone(View view) {
        C12775o.m28639i(view, "<this>");
        if (view.getVisibility() == 8) {
            return true;
        }
        return false;
    }

    public static final boolean isInvisible(View view) {
        C12775o.m28639i(view, "<this>");
        if (view.getVisibility() == 4) {
            return true;
        }
        return false;
    }

    public static final boolean isVisible(View view) {
        C12775o.m28639i(view, "<this>");
        if (view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public static final Runnable postDelayed(View view, long j, C13074a<C11921v> aVar) {
        C12775o.m28639i(view, "<this>");
        C12775o.m28639i(aVar, "action");
        ViewKt$postDelayed$runnable$1 viewKt$postDelayed$runnable$1 = new ViewKt$postDelayed$runnable$1(aVar);
        view.postDelayed(viewKt$postDelayed$runnable$1, j);
        return viewKt$postDelayed$runnable$1;
    }

    @RequiresApi(16)
    public static final Runnable postOnAnimationDelayed(View view, long j, C13074a<C11921v> aVar) {
        C12775o.m28639i(view, "<this>");
        C12775o.m28639i(aVar, "action");
        C1879u1 u1Var = new C1879u1(aVar);
        Api16Impl.postOnAnimationDelayed(view, u1Var, j);
        return u1Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: postOnAnimationDelayed$lambda-1  reason: not valid java name */
    public static final void m38719postOnAnimationDelayed$lambda1(C13074a aVar) {
        C12775o.m28639i(aVar, "$action");
        aVar.invoke();
    }

    public static final void setGone(View view, boolean z) {
        int i;
        C12775o.m28639i(view, "<this>");
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
    }

    public static final void setInvisible(View view, boolean z) {
        int i;
        C12775o.m28639i(view, "<this>");
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        view.setVisibility(i);
    }

    public static final void setPadding(View view, @C0127Px int i) {
        C12775o.m28639i(view, "<this>");
        view.setPadding(i, i, i, i);
    }

    public static final void setVisible(View view, boolean z) {
        int i;
        C12775o.m28639i(view, "<this>");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }

    public static final void updateLayoutParams(View view, Function1<? super ViewGroup.LayoutParams, C11921v> function1) {
        C12775o.m28639i(view, "<this>");
        C12775o.m28639i(function1, "block");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            function1.invoke(layoutParams);
            view.setLayoutParams(layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final /* synthetic */ <T extends ViewGroup.LayoutParams> void updateLayoutParamsTyped(View view, Function1<? super T, C11921v> function1) {
        C12775o.m28639i(view, "<this>");
        C12775o.m28639i(function1, "block");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C12775o.m28644n(1, ExifInterface.GPS_DIRECTION_TRUE);
        function1.invoke(layoutParams);
        view.setLayoutParams(layoutParams);
    }

    public static final void updatePadding(View view, @C0127Px int i, @C0127Px int i2, @C0127Px int i3, @C0127Px int i4) {
        C12775o.m28639i(view, "<this>");
        view.setPadding(i, i2, i3, i4);
    }

    public static /* synthetic */ void updatePadding$default(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingLeft();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingRight();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        C12775o.m28639i(view, "<this>");
        view.setPadding(i, i2, i3, i4);
    }

    @RequiresApi(17)
    public static final void updatePaddingRelative(View view, @C0127Px int i, @C0127Px int i2, @C0127Px int i3, @C0127Px int i4) {
        C12775o.m28639i(view, "<this>");
        view.setPaddingRelative(i, i2, i3, i4);
    }

    public static /* synthetic */ void updatePaddingRelative$default(View view, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = view.getPaddingStart();
        }
        if ((i5 & 2) != 0) {
            i2 = view.getPaddingTop();
        }
        if ((i5 & 4) != 0) {
            i3 = view.getPaddingEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = view.getPaddingBottom();
        }
        C12775o.m28639i(view, "<this>");
        view.setPaddingRelative(i, i2, i3, i4);
    }
}
