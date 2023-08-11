package com.appboy.p054ui.feed;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageSwitcher;
import androidx.annotation.VisibleForTesting;
import com.appboy.p054ui.C4193R;
import p126j0.C8266c;

/* renamed from: com.appboy.ui.feed.AppboyImageSwitcher */
public class AppboyImageSwitcher extends ImageSwitcher {
    private static final String TAG = C8266c.m16405n(AppboyImageSwitcher.class);
    private Drawable mReadIcon;
    private Drawable mUnReadIcon;

    public AppboyImageSwitcher(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable drawable;
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4193R.styleable.com_appboy_ui_feed_AppboyImageSwitcher);
            for (int i = 0; i < obtainStyledAttributes.getIndexCount(); i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C4193R.styleable.com_appboy_ui_feed_AppboyImageSwitcher_appboyFeedCustomReadIcon) {
                    Drawable drawable2 = obtainStyledAttributes.getDrawable(index);
                    if (drawable2 != null) {
                        this.mReadIcon = drawable2;
                    }
                } else if (obtainStyledAttributes.getIndex(i) == C4193R.styleable.f3319x3c8566bc && (drawable = obtainStyledAttributes.getDrawable(index)) != null) {
                    this.mUnReadIcon = drawable;
                }
            }
            obtainStyledAttributes.recycle();
        } catch (Exception e) {
            C8266c.m16391A(TAG, "Error while checking for custom drawable.", e);
        }
    }

    public Drawable getReadIcon() {
        return this.mReadIcon;
    }

    public Drawable getUnReadIcon() {
        return this.mUnReadIcon;
    }

    @VisibleForTesting
    public void setReadIcon(Drawable drawable) {
        this.mReadIcon = drawable;
    }

    @VisibleForTesting
    public void setUnReadIcon(Drawable drawable) {
        this.mUnReadIcon = drawable;
    }
}
