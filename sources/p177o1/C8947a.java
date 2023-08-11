package p177o1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

/* renamed from: o1.a */
/* compiled from: DrawableDecoderCompat */
public final class C8947a {

    /* renamed from: a */
    private static volatile boolean f12985a = true;

    /* renamed from: a */
    public static Drawable m18149a(Context context, @DrawableRes int i, @Nullable Resources.Theme theme) {
        return m18151c(context, context, i, theme);
    }

    /* renamed from: b */
    public static Drawable m18150b(Context context, Context context2, @DrawableRes int i) {
        return m18151c(context, context2, i, (Resources.Theme) null);
    }

    /* renamed from: c */
    private static Drawable m18151c(Context context, Context context2, @DrawableRes int i, @Nullable Resources.Theme theme) {
        try {
            if (f12985a) {
                return m18153e(context2, i, theme);
            }
        } catch (NoClassDefFoundError unused) {
            f12985a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return ContextCompat.getDrawable(context2, i);
            }
            throw e;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m18152d(context2, i, theme);
    }

    /* renamed from: d */
    private static Drawable m18152d(Context context, @DrawableRes int i, @Nullable Resources.Theme theme) {
        return ResourcesCompat.getDrawable(context.getResources(), i, theme);
    }

    /* renamed from: e */
    private static Drawable m18153e(Context context, @DrawableRes int i, @Nullable Resources.Theme theme) {
        if (theme != null) {
            context = new ContextThemeWrapper(context, theme);
        }
        return AppCompatResources.getDrawable(context, i);
    }
}
