package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.C1989R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: FragmentContainerView.kt */
public final class FragmentContainerView extends FrameLayout {
    private View.OnApplyWindowInsetsListener applyWindowInsetsListener;
    private final List<View> disappearingFragmentChildren;
    private boolean drawDisappearingViewsFirst;
    private final List<View> transitioningFragmentViews;

    @RequiresApi(20)
    /* compiled from: FragmentContainerView.kt */
    public static final class Api20Impl {
        public static final Api20Impl INSTANCE = new Api20Impl();

        private Api20Impl() {
        }

        public final WindowInsets onApplyWindowInsets(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
            C12775o.m28639i(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            C12775o.m28639i(view, "v");
            C12775o.m28639i(windowInsets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            C12775o.m28638h(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C12775o.m28639i(context, "context");
    }

    private final void addDisappearingFragmentView(View view) {
        if (this.transitioningFragmentViews.contains(view)) {
            this.disappearingFragmentChildren.add(view);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C12775o.m28639i(view, "child");
        if (FragmentManager.getViewFragment(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @RequiresApi(20)
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsetsCompat windowInsetsCompat;
        int childCount;
        C12775o.m28639i(windowInsets, "insets");
        WindowInsetsCompat windowInsetsCompat2 = WindowInsetsCompat.toWindowInsetsCompat(windowInsets);
        C12775o.m28638h(windowInsetsCompat2, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.applyWindowInsetsListener;
        if (onApplyWindowInsetsListener != null) {
            Api20Impl api20Impl = Api20Impl.INSTANCE;
            C12775o.m28636f(onApplyWindowInsetsListener);
            windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(api20Impl.onApplyWindowInsets(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            windowInsetsCompat = ViewCompat.onApplyWindowInsets(this, windowInsetsCompat2);
        }
        if (!windowInsetsCompat.isConsumed() && (childCount = getChildCount()) > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                ViewCompat.dispatchApplyWindowInsets(getChildAt(i), windowInsetsCompat);
                if (i2 >= childCount) {
                    break;
                }
                i = i2;
            }
        }
        return windowInsets;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        C12775o.m28639i(canvas, "canvas");
        if (this.drawDisappearingViewsFirst) {
            for (View drawChild : this.disappearingFragmentChildren) {
                super.drawChild(canvas, drawChild, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        C12775o.m28639i(canvas, "canvas");
        C12775o.m28639i(view, "child");
        if (!this.drawDisappearingViewsFirst || !(!this.disappearingFragmentChildren.isEmpty()) || !this.disappearingFragmentChildren.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public void endViewTransition(View view) {
        C12775o.m28639i(view, "view");
        this.transitioningFragmentViews.remove(view);
        if (this.disappearingFragmentChildren.remove(view)) {
            this.drawDisappearingViewsFirst = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return FragmentManager.findFragmentManager(this).findFragmentById(getId());
    }

    @RequiresApi(20)
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        C12775o.m28639i(windowInsets, "insets");
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        int childCount = getChildCount() - 1;
        if (childCount >= 0) {
            while (true) {
                int i = childCount - 1;
                View childAt = getChildAt(childCount);
                C12775o.m28638h(childAt, "view");
                addDisappearingFragmentView(childAt);
                if (i < 0) {
                    break;
                }
                childCount = i;
            }
        }
        super.removeAllViewsInLayout();
    }

    public void removeView(View view) {
        C12775o.m28639i(view, "view");
        addDisappearingFragmentView(view);
        super.removeView(view);
    }

    public void removeViewAt(int i) {
        View childAt = getChildAt(i);
        C12775o.m28638h(childAt, "view");
        addDisappearingFragmentView(childAt);
        super.removeViewAt(i);
    }

    public void removeViewInLayout(View view) {
        C12775o.m28639i(view, "view");
        addDisappearingFragmentView(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i, int i2) {
        int i3 = i + i2;
        if (i < i3) {
            int i4 = i;
            while (true) {
                int i5 = i4 + 1;
                View childAt = getChildAt(i4);
                C12775o.m28638h(childAt, "view");
                addDisappearingFragmentView(childAt);
                if (i5 >= i3) {
                    break;
                }
                i4 = i5;
            }
        }
        super.removeViews(i, i2);
    }

    public void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        if (i < i3) {
            int i4 = i;
            while (true) {
                int i5 = i4 + 1;
                View childAt = getChildAt(i4);
                C12775o.m28638h(childAt, "view");
                addDisappearingFragmentView(childAt);
                if (i5 >= i3) {
                    break;
                }
                i4 = i5;
            }
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.drawDisappearingViewsFirst = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        C12775o.m28639i(onApplyWindowInsetsListener, "listener");
        this.applyWindowInsetsListener = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        C12775o.m28639i(view, "view");
        if (view.getParent() == this) {
            this.transitioningFragmentViews.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        C12775o.m28639i(context, "context");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        C12775o.m28639i(context, "context");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = C1989R.styleable.FragmentContainerView;
            C12775o.m28638h(iArr, "FragmentContainerView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(C1989R.styleable.FragmentContainerView_android_name);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, FragmentManager fragmentManager) {
        super(context, attributeSet);
        C12775o.m28639i(context, "context");
        C12775o.m28639i(attributeSet, "attrs");
        C12775o.m28639i(fragmentManager, "fm");
        this.disappearingFragmentChildren = new ArrayList();
        this.transitioningFragmentViews = new ArrayList();
        this.drawDisappearingViewsFirst = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = C1989R.styleable.FragmentContainerView;
        C12775o.m28638h(iArr, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(C1989R.styleable.FragmentContainerView_android_name) : classAttribute;
        String string = obtainStyledAttributes.getString(C1989R.styleable.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment findFragmentById = fragmentManager.findFragmentById(id);
        if (classAttribute != null && findFragmentById == null) {
            if (id == -1) {
                String q = string != null ? C12775o.m28647q(" with tag ", string) : "";
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + q);
            }
            Fragment instantiate = fragmentManager.getFragmentFactory().instantiate(context.getClassLoader(), classAttribute);
            C12775o.m28638h(instantiate, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            instantiate.onInflate(context, attributeSet, (Bundle) null);
            fragmentManager.beginTransaction().setReorderingAllowed(true).add((ViewGroup) this, instantiate, string).commitNowAllowingStateLoss();
        }
        fragmentManager.onContainerAvailable(this);
    }
}
