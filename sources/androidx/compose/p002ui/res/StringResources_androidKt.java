package androidx.compose.p002ui.res;

import androidx.annotation.ArrayRes;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import java.util.Arrays;
import kotlin.jvm.internal.C12775o;

/* renamed from: androidx.compose.ui.res.StringResources_androidKt */
/* compiled from: StringResources.android.kt */
public final class StringResources_androidKt {
    @ReadOnlyComposable
    @Composable
    public static final String pluralStringResource(@PluralsRes int i, int i2, Composer composer, int i3) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1784741530, i3, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:73)");
        }
        String quantityString = Resources_androidKt.resources(composer, 0).getQuantityString(i, i2);
        C12775o.m28638h(quantityString, "resources.getQuantityString(id, count)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return quantityString;
    }

    @ReadOnlyComposable
    @Composable
    public static final String[] stringArrayResource(@ArrayRes int i, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1562162650, i2, -1, "androidx.compose.ui.res.stringArrayResource (StringResources.android.kt:59)");
        }
        String[] stringArray = Resources_androidKt.resources(composer, 0).getStringArray(i);
        C12775o.m28638h(stringArray, "resources.getStringArray(id)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stringArray;
    }

    @ReadOnlyComposable
    @Composable
    public static final String stringResource(@StringRes int i, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1223887937, i2, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:32)");
        }
        String string = Resources_androidKt.resources(composer, 0).getString(i);
        C12775o.m28638h(string, "resources.getString(id)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return string;
    }

    @ReadOnlyComposable
    @Composable
    public static final String pluralStringResource(@PluralsRes int i, int i2, Object[] objArr, Composer composer, int i3) {
        C12775o.m28639i(objArr, "formatArgs");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(523207213, i3, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:88)");
        }
        String quantityString = Resources_androidKt.resources(composer, 0).getQuantityString(i, i2, Arrays.copyOf(objArr, objArr.length));
        C12775o.m28638h(quantityString, "resources.getQuantityStr…g(id, count, *formatArgs)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return quantityString;
    }

    @ReadOnlyComposable
    @Composable
    public static final String stringResource(@StringRes int i, Object[] objArr, Composer composer, int i2) {
        C12775o.m28639i(objArr, "formatArgs");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2071230100, i2, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String string = Resources_androidKt.resources(composer, 0).getString(i, Arrays.copyOf(objArr, objArr.length));
        C12775o.m28638h(string, "resources.getString(id, *formatArgs)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return string;
    }
}
