package com.squareup.picasso;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.annotation.VisibleForTesting;
import java.lang.ref.WeakReference;

/* renamed from: com.squareup.picasso.f */
/* compiled from: DeferredRequestCreator */
class C11732f implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    private final C11767t f18233b;
    @VisibleForTesting

    /* renamed from: c */
    final WeakReference<ImageView> f18234c;
    @VisibleForTesting

    /* renamed from: d */
    Callback f18235d;

    C11732f(C11767t tVar, ImageView imageView, Callback callback) {
        this.f18233b = tVar;
        this.f18234c = new WeakReference<>(imageView);
        this.f18235d = callback;
        imageView.addOnAttachStateChangeListener(this);
        if (imageView.getWindowToken() != null) {
            onViewAttachedToWindow(imageView);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo48688a() {
        this.f18233b.mo48773a();
        this.f18235d = null;
        ImageView imageView = this.f18234c.get();
        if (imageView != null) {
            this.f18234c.clear();
            imageView.removeOnAttachStateChangeListener(this);
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
    }

    public boolean onPreDraw() {
        ImageView imageView = this.f18234c.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            imageView.removeOnAttachStateChangeListener(this);
            viewTreeObserver.removeOnPreDrawListener(this);
            this.f18234c.clear();
            this.f18233b.mo48777g().mo48776f(width, height).mo48774d(imageView, this.f18235d);
        }
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(this);
    }

    public void onViewDetachedFromWindow(View view) {
        view.getViewTreeObserver().removeOnPreDrawListener(this);
    }
}
