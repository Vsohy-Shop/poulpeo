package androidx.compose.foundation.layout;

import android.os.Build;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import kotlin.jvm.internal.C12775o;

/* compiled from: WindowInsets.android.kt */
final class InsetsListener extends WindowInsetsAnimationCompat.Callback implements Runnable, OnApplyWindowInsetsListener, View.OnAttachStateChangeListener {
    private final WindowInsetsHolder composeInsets;
    private boolean prepared;
    private boolean runningAnimation;
    private WindowInsetsCompat savedInsets;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsetsListener(WindowInsetsHolder windowInsetsHolder) {
        super(windowInsetsHolder.getConsumes() ^ true ? 1 : 0);
        C12775o.m28639i(windowInsetsHolder, "composeInsets");
        this.composeInsets = windowInsetsHolder;
    }

    public final WindowInsetsHolder getComposeInsets() {
        return this.composeInsets;
    }

    public final boolean getPrepared() {
        return this.prepared;
    }

    public final boolean getRunningAnimation() {
        return this.runningAnimation;
    }

    public final WindowInsetsCompat getSavedInsets() {
        return this.savedInsets;
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        C12775o.m28639i(view, "view");
        C12775o.m28639i(windowInsetsCompat, "insets");
        this.savedInsets = windowInsetsCompat;
        this.composeInsets.updateImeAnimationTarget(windowInsetsCompat);
        if (this.prepared) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.runningAnimation) {
            this.composeInsets.updateImeAnimationSource(windowInsetsCompat);
            WindowInsetsHolder.update$default(this.composeInsets, windowInsetsCompat, 0, 2, (Object) null);
        }
        if (!this.composeInsets.getConsumes()) {
            return windowInsetsCompat;
        }
        WindowInsetsCompat windowInsetsCompat2 = WindowInsetsCompat.CONSUMED;
        C12775o.m28638h(windowInsetsCompat2, "CONSUMED");
        return windowInsetsCompat2;
    }

    public void onEnd(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        C12775o.m28639i(windowInsetsAnimationCompat, "animation");
        this.prepared = false;
        this.runningAnimation = false;
        WindowInsetsCompat windowInsetsCompat = this.savedInsets;
        if (!(windowInsetsAnimationCompat.getDurationMillis() == 0 || windowInsetsCompat == null)) {
            this.composeInsets.updateImeAnimationSource(windowInsetsCompat);
            this.composeInsets.updateImeAnimationTarget(windowInsetsCompat);
            WindowInsetsHolder.update$default(this.composeInsets, windowInsetsCompat, 0, 2, (Object) null);
        }
        this.savedInsets = null;
        super.onEnd(windowInsetsAnimationCompat);
    }

    public void onPrepare(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        C12775o.m28639i(windowInsetsAnimationCompat, "animation");
        this.prepared = true;
        this.runningAnimation = true;
        super.onPrepare(windowInsetsAnimationCompat);
    }

    public WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List<WindowInsetsAnimationCompat> list) {
        C12775o.m28639i(windowInsetsCompat, "insets");
        C12775o.m28639i(list, "runningAnimations");
        WindowInsetsHolder.update$default(this.composeInsets, windowInsetsCompat, 0, 2, (Object) null);
        if (!this.composeInsets.getConsumes()) {
            return windowInsetsCompat;
        }
        WindowInsetsCompat windowInsetsCompat2 = WindowInsetsCompat.CONSUMED;
        C12775o.m28638h(windowInsetsCompat2, "CONSUMED");
        return windowInsetsCompat2;
    }

    public WindowInsetsAnimationCompat.BoundsCompat onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        C12775o.m28639i(windowInsetsAnimationCompat, "animation");
        C12775o.m28639i(boundsCompat, "bounds");
        this.prepared = false;
        WindowInsetsAnimationCompat.BoundsCompat onStart = super.onStart(windowInsetsAnimationCompat, boundsCompat);
        C12775o.m28638h(onStart, "super.onStart(animation, bounds)");
        return onStart;
    }

    public void onViewAttachedToWindow(View view) {
        C12775o.m28639i(view, "view");
        view.requestApplyInsets();
    }

    public void onViewDetachedFromWindow(View view) {
        C12775o.m28639i(view, "v");
    }

    public void run() {
        if (this.prepared) {
            this.prepared = false;
            this.runningAnimation = false;
            WindowInsetsCompat windowInsetsCompat = this.savedInsets;
            if (windowInsetsCompat != null) {
                this.composeInsets.updateImeAnimationSource(windowInsetsCompat);
                WindowInsetsHolder.update$default(this.composeInsets, windowInsetsCompat, 0, 2, (Object) null);
                this.savedInsets = null;
            }
        }
    }

    public final void setPrepared(boolean z) {
        this.prepared = z;
    }

    public final void setRunningAnimation(boolean z) {
        this.runningAnimation = z;
    }

    public final void setSavedInsets(WindowInsetsCompat windowInsetsCompat) {
        this.savedInsets = windowInsetsCompat;
    }
}
