package androidx.compose.p002ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.DoNotInline;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.text.android.StaticLayoutFactoryDefault */
/* compiled from: StaticLayoutFactory.kt */
final class StaticLayoutFactoryDefault implements StaticLayoutFactoryImpl {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static boolean isInitialized;
    /* access modifiers changed from: private */
    public static Constructor<StaticLayout> staticLayoutConstructor;

    /* renamed from: androidx.compose.ui.text.android.StaticLayoutFactoryDefault$Companion */
    /* compiled from: StaticLayoutFactory.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final Constructor<StaticLayout> getStaticLayoutConstructor() {
            if (StaticLayoutFactoryDefault.isInitialized) {
                return StaticLayoutFactoryDefault.staticLayoutConstructor;
            }
            StaticLayoutFactoryDefault.isInitialized = true;
            Class<StaticLayout> cls = StaticLayout.class;
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                StaticLayoutFactoryDefault.staticLayoutConstructor = cls.getConstructor(new Class[]{CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, TextDirectionHeuristic.class, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2});
            } catch (NoSuchMethodException unused) {
                StaticLayoutFactoryDefault.staticLayoutConstructor = null;
                Log.e("StaticLayoutFactory", "unable to collect necessary constructor.");
            }
            return StaticLayoutFactoryDefault.staticLayoutConstructor;
        }
    }

    @DoNotInline
    public StaticLayout create(StaticLayoutParams staticLayoutParams) {
        C12775o.m28639i(staticLayoutParams, "params");
        Constructor access$getStaticLayoutConstructor = Companion.getStaticLayoutConstructor();
        StaticLayout staticLayout = null;
        if (access$getStaticLayoutConstructor != null) {
            try {
                staticLayout = (StaticLayout) access$getStaticLayoutConstructor.newInstance(new Object[]{staticLayoutParams.getText(), Integer.valueOf(staticLayoutParams.getStart()), Integer.valueOf(staticLayoutParams.getEnd()), staticLayoutParams.getPaint(), Integer.valueOf(staticLayoutParams.getWidth()), staticLayoutParams.getAlignment(), staticLayoutParams.getTextDir(), Float.valueOf(staticLayoutParams.getLineSpacingMultiplier()), Float.valueOf(staticLayoutParams.getLineSpacingExtra()), Boolean.valueOf(staticLayoutParams.getIncludePadding()), staticLayoutParams.getEllipsize(), Integer.valueOf(staticLayoutParams.getEllipsizedWidth()), Integer.valueOf(staticLayoutParams.getMaxLines())});
            } catch (IllegalAccessException unused) {
                staticLayoutConstructor = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InstantiationException unused2) {
                staticLayoutConstructor = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InvocationTargetException unused3) {
                staticLayoutConstructor = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            }
        }
        if (staticLayout != null) {
            return staticLayout;
        }
        return new StaticLayout(staticLayoutParams.getText(), staticLayoutParams.getStart(), staticLayoutParams.getEnd(), staticLayoutParams.getPaint(), staticLayoutParams.getWidth(), staticLayoutParams.getAlignment(), staticLayoutParams.getLineSpacingMultiplier(), staticLayoutParams.getLineSpacingExtra(), staticLayoutParams.getIncludePadding(), staticLayoutParams.getEllipsize(), staticLayoutParams.getEllipsizedWidth());
    }

    public boolean isFallbackLineSpacingEnabled(StaticLayout staticLayout, boolean z) {
        C12775o.m28639i(staticLayout, "layout");
        return false;
    }
}
