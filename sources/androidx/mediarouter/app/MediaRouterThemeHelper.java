package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ProgressBar;
import androidx.appcompat.C0129R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.mediarouter.C2410R;

final class MediaRouterThemeHelper {
    static final int COLOR_DARK_ON_LIGHT_BACKGROUND = -570425344;
    private static final int COLOR_DARK_ON_LIGHT_BACKGROUND_RES_ID = C2410R.C2411color.mr_dynamic_dialog_icon_light;
    static final int COLOR_WHITE_ON_DARK_BACKGROUND = -1;
    private static final float MIN_CONTRAST = 3.0f;

    private MediaRouterThemeHelper() {
    }

    static Context createThemedButtonContext(Context context) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, getRouterThemeId(context));
        int themeResource = getThemeResource(contextThemeWrapper, C2410R.attr.mediaRouteTheme);
        if (themeResource != 0) {
            return new ContextThemeWrapper(contextThemeWrapper, themeResource);
        }
        return contextThemeWrapper;
    }

    static Context createThemedDialogContext(Context context, int i, boolean z) {
        int i2;
        if (i == 0) {
            if (!z) {
                i2 = C0129R.attr.dialogTheme;
            } else {
                i2 = C0129R.attr.alertDialogTheme;
            }
            i = getThemeResource(context, i2);
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (getThemeResource(contextThemeWrapper, C2410R.attr.mediaRouteTheme) != 0) {
            return new ContextThemeWrapper(contextThemeWrapper, getRouterThemeId(contextThemeWrapper));
        }
        return contextThemeWrapper;
    }

    static int createThemedDialogStyle(Context context) {
        int themeResource = getThemeResource(context, C2410R.attr.mediaRouteTheme);
        if (themeResource == 0) {
            return getRouterThemeId(context);
        }
        return themeResource;
    }

    static int getButtonTextColor(Context context) {
        int themeColor = getThemeColor(context, 0, C0129R.attr.colorPrimary);
        if (ColorUtils.calculateContrast(themeColor, getThemeColor(context, 0, 16842801)) < 3.0d) {
            return getThemeColor(context, 0, C0129R.attr.colorAccent);
        }
        return themeColor;
    }

    static Drawable getCheckBoxDrawableIcon(Context context) {
        return getIconByDrawableId(context, C2410R.C2412drawable.mr_cast_checkbox);
    }

    static int getControllerColor(Context context, int i) {
        if (ColorUtils.calculateContrast(-1, getThemeColor(context, i, C0129R.attr.colorPrimary)) >= 3.0d) {
            return -1;
        }
        return COLOR_DARK_ON_LIGHT_BACKGROUND;
    }

    static Drawable getDefaultDrawableIcon(Context context) {
        return getIconByAttrId(context, C2410R.attr.mediaRouteDefaultIconDrawable);
    }

    static float getDisabledAlpha(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842803, typedValue, true)) {
            return typedValue.getFloat();
        }
        return 0.5f;
    }

    private static Drawable getIconByAttrId(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Drawable wrap = DrawableCompat.wrap(AppCompatResources.getDrawable(context, obtainStyledAttributes.getResourceId(0, 0)));
        if (isLightTheme(context)) {
            DrawableCompat.setTint(wrap, ContextCompat.getColor(context, COLOR_DARK_ON_LIGHT_BACKGROUND_RES_ID));
        }
        obtainStyledAttributes.recycle();
        return wrap;
    }

    private static Drawable getIconByDrawableId(Context context, int i) {
        Drawable wrap = DrawableCompat.wrap(AppCompatResources.getDrawable(context, i));
        if (isLightTheme(context)) {
            DrawableCompat.setTint(wrap, ContextCompat.getColor(context, COLOR_DARK_ON_LIGHT_BACKGROUND_RES_ID));
        }
        return wrap;
    }

    static Drawable getMuteButtonDrawableIcon(Context context) {
        return getIconByDrawableId(context, C2410R.C2412drawable.mr_cast_mute_button);
    }

    private static int getRouterThemeId(Context context) {
        if (isLightTheme(context)) {
            if (getControllerColor(context, 0) == COLOR_DARK_ON_LIGHT_BACKGROUND) {
                return C2410R.C2416style.Theme_MediaRouter_Light;
            }
            return C2410R.C2416style.Theme_MediaRouter_Light_DarkControlPanel;
        } else if (getControllerColor(context, 0) == COLOR_DARK_ON_LIGHT_BACKGROUND) {
            return C2410R.C2416style.Theme_MediaRouter_LightControlPanel;
        } else {
            return C2410R.C2416style.Theme_MediaRouter;
        }
    }

    static Drawable getSpeakerDrawableIcon(Context context) {
        return getIconByAttrId(context, C2410R.attr.mediaRouteSpeakerIconDrawable);
    }

    static Drawable getSpeakerGroupDrawableIcon(Context context) {
        return getIconByAttrId(context, C2410R.attr.mediaRouteSpeakerGroupIconDrawable);
    }

    static TypedArray getStyledAttributes(Context context) {
        return context.obtainStyledAttributes(new int[]{C2410R.attr.mediaRouteDefaultIconDrawable, C2410R.attr.mediaRouteTvIconDrawable, C2410R.attr.mediaRouteSpeakerIconDrawable, C2410R.attr.mediaRouteSpeakerGroupIconDrawable});
    }

    private static int getThemeColor(Context context, int i, int i2) {
        if (i != 0) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{i2});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            if (color != 0) {
                return color;
            }
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        if (typedValue.resourceId != 0) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        return typedValue.data;
    }

    static int getThemeResource(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue.resourceId;
        }
        return 0;
    }

    static Drawable getTvDrawableIcon(Context context) {
        return getIconByAttrId(context, C2410R.attr.mediaRouteTvIconDrawable);
    }

    private static boolean isLightTheme(Context context) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0129R.attr.isLightTheme, typedValue, true) || typedValue.data == 0) {
            return false;
        }
        return true;
    }

    static void setDialogBackgroundColor(Context context, Dialog dialog) {
        int i;
        View decorView = dialog.getWindow().getDecorView();
        if (isLightTheme(context)) {
            i = C2410R.C2411color.mr_dynamic_dialog_background_light;
        } else {
            i = C2410R.C2411color.mr_dynamic_dialog_background_dark;
        }
        decorView.setBackgroundColor(ContextCompat.getColor(context, i));
    }

    static void setIndeterminateProgressBarColor(Context context, ProgressBar progressBar) {
        int i;
        if (progressBar.isIndeterminate()) {
            if (isLightTheme(context)) {
                i = C2410R.C2411color.mr_cast_progressbar_progress_and_thumb_light;
            } else {
                i = C2410R.C2411color.mr_cast_progressbar_progress_and_thumb_dark;
            }
            progressBar.getIndeterminateDrawable().setColorFilter(ContextCompat.getColor(context, i), PorterDuff.Mode.SRC_IN);
        }
    }

    static void setMediaControlsBackgroundColor(Context context, View view, View view2, boolean z) {
        int themeColor = getThemeColor(context, 0, C0129R.attr.colorPrimary);
        int themeColor2 = getThemeColor(context, 0, C0129R.attr.colorPrimaryDark);
        if (z && getControllerColor(context, 0) == COLOR_DARK_ON_LIGHT_BACKGROUND) {
            themeColor2 = themeColor;
            themeColor = -1;
        }
        view.setBackgroundColor(themeColor);
        view2.setBackgroundColor(themeColor2);
        view.setTag(Integer.valueOf(themeColor));
        view2.setTag(Integer.valueOf(themeColor2));
    }

    static void setVolumeSliderColor(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider, View view) {
        int controllerColor = getControllerColor(context, 0);
        if (Color.alpha(controllerColor) != 255) {
            controllerColor = ColorUtils.compositeColors(controllerColor, ((Integer) view.getTag()).intValue());
        }
        mediaRouteVolumeSlider.setColor(controllerColor);
    }

    static void setVolumeSliderColor(Context context, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        int i;
        int i2;
        if (isLightTheme(context)) {
            i2 = ContextCompat.getColor(context, C2410R.C2411color.mr_cast_progressbar_progress_and_thumb_light);
            i = ContextCompat.getColor(context, C2410R.C2411color.mr_cast_progressbar_background_light);
        } else {
            i2 = ContextCompat.getColor(context, C2410R.C2411color.mr_cast_progressbar_progress_and_thumb_dark);
            i = ContextCompat.getColor(context, C2410R.C2411color.mr_cast_progressbar_background_dark);
        }
        mediaRouteVolumeSlider.setColor(i2, i);
    }
}
