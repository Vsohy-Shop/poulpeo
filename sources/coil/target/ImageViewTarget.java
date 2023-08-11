package coil.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.jvm.internal.C12775o;

/* compiled from: ImageViewTarget.kt */
public class ImageViewTarget extends GenericViewTarget<ImageView> {

    /* renamed from: c */
    private final ImageView f3264c;

    /* renamed from: e */
    public Drawable mo30074e() {
        return getView().getDrawable();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageViewTarget) || !C12775o.m28634d(getView(), ((ImageViewTarget) obj).getView())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void mo30075f(Drawable drawable) {
        getView().setImageDrawable(drawable);
    }

    public int hashCode() {
        return getView().hashCode();
    }

    /* renamed from: i */
    public ImageView getView() {
        return this.f3264c;
    }
}
