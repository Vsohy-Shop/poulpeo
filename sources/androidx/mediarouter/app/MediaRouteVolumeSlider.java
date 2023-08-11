package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import androidx.appcompat.C0129R;
import androidx.appcompat.widget.AppCompatSeekBar;

class MediaRouteVolumeSlider extends AppCompatSeekBar {
    private static final String TAG = "MediaRouteVolumeSlider";
    private int mBackgroundColor;
    private final float mDisabledAlpha;
    private boolean mHideThumb;
    private int mProgressAndThumbColor;
    private Drawable mThumb;

    public MediaRouteVolumeSlider(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        if (isEnabled()) {
            i = 255;
        } else {
            i = (int) (this.mDisabledAlpha * 255.0f);
        }
        this.mThumb.setColorFilter(this.mProgressAndThumbColor, PorterDuff.Mode.SRC_IN);
        this.mThumb.setAlpha(i);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
            layerDrawable.findDrawableByLayerId(16908288).setColorFilter(this.mBackgroundColor, PorterDuff.Mode.SRC_IN);
            progressDrawable = findDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.mProgressAndThumbColor, PorterDuff.Mode.SRC_IN);
        progressDrawable.setAlpha(i);
    }

    public void setColor(int i) {
        setColor(i, i);
    }

    public void setHideThumb(boolean z) {
        Drawable drawable;
        if (this.mHideThumb != z) {
            this.mHideThumb = z;
            if (z) {
                drawable = null;
            } else {
                drawable = this.mThumb;
            }
            super.setThumb(drawable);
        }
    }

    public void setThumb(Drawable drawable) {
        this.mThumb = drawable;
        if (this.mHideThumb) {
            drawable = null;
        }
        super.setThumb(drawable);
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0129R.attr.seekBarStyle);
    }

    public void setColor(int i, int i2) {
        if (this.mProgressAndThumbColor != i) {
            if (Color.alpha(i) != 255) {
                Log.e(TAG, "Volume slider progress and thumb color cannot be translucent: #" + Integer.toHexString(i));
            }
            this.mProgressAndThumbColor = i;
        }
        if (this.mBackgroundColor != i2) {
            if (Color.alpha(i2) != 255) {
                Log.e(TAG, "Volume slider background color cannot be translucent: #" + Integer.toHexString(i2));
            }
            this.mBackgroundColor = i2;
        }
    }

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDisabledAlpha = MediaRouterThemeHelper.getDisabledAlpha(context);
    }
}
