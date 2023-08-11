package androidx.compose.material;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.material.Strings;
import androidx.compose.p002ui.C0954R;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nStrings.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material/Strings_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,38:1\n76#2:39\n76#2:40\n*S KotlinDebug\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material/Strings_androidKt\n*L\n26#1:39\n27#1:40\n*E\n"})
/* compiled from: Strings.android.kt */
public final class Strings_androidKt {
    @Composable
    /* renamed from: getString-4foXLRw  reason: not valid java name */
    public static final String m34125getString4foXLRw(int i, Composer composer, int i2) {
        String str;
        composer.startReplaceableGroup(-726638443);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-726638443, i2, -1, "androidx.compose.material.getString (Strings.android.kt:24)");
        }
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        Strings.Companion companion = Strings.Companion;
        if (Strings.m34114equalsimpl0(i, companion.m34122getNavigationMenuUdPEhr4())) {
            str = resources.getString(C0954R.string.navigation_menu);
            C12775o.m28638h(str, "resources.getString(R.string.navigation_menu)");
        } else if (Strings.m34114equalsimpl0(i, companion.m34118getCloseDrawerUdPEhr4())) {
            str = resources.getString(C0954R.string.close_drawer);
            C12775o.m28638h(str, "resources.getString(R.string.close_drawer)");
        } else if (Strings.m34114equalsimpl0(i, companion.m34119getCloseSheetUdPEhr4())) {
            str = resources.getString(C0954R.string.close_sheet);
            C12775o.m28638h(str, "resources.getString(R.string.close_sheet)");
        } else if (Strings.m34114equalsimpl0(i, companion.m34120getDefaultErrorMessageUdPEhr4())) {
            str = resources.getString(C0954R.string.default_error_message);
            C12775o.m28638h(str, "resources.getString(R.st…ng.default_error_message)");
        } else if (Strings.m34114equalsimpl0(i, companion.m34121getExposedDropdownMenuUdPEhr4())) {
            str = resources.getString(C0954R.string.dropdown_menu);
            C12775o.m28638h(str, "resources.getString(R.string.dropdown_menu)");
        } else if (Strings.m34114equalsimpl0(i, companion.m34124getSliderRangeStartUdPEhr4())) {
            str = resources.getString(C0954R.string.range_start);
            C12775o.m28638h(str, "resources.getString(R.string.range_start)");
        } else if (Strings.m34114equalsimpl0(i, companion.m34123getSliderRangeEndUdPEhr4())) {
            str = resources.getString(C0954R.string.range_end);
            C12775o.m28638h(str, "resources.getString(R.string.range_end)");
        } else {
            str = "";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return str;
    }
}
