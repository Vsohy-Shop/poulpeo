package androidx.compose.material3;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.material3.Strings;
import androidx.compose.p002ui.C0954R;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12775o;

/* compiled from: Strings.android.kt */
public final class Strings_androidKt {
    @Composable
    /* renamed from: getString-NWtq2-8  reason: not valid java name */
    public static final String m34594getStringNWtq28(int i, Composer composer, int i2) {
        String str;
        composer.startReplaceableGroup(-176762646);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-176762646, i2, -1, "androidx.compose.material3.getString (Strings.android.kt:24)");
        }
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        Strings.Companion companion = Strings.Companion;
        if (Strings.m34580equalsimpl0(i, companion.m34591getNavigationMenuadMyvUU())) {
            str = resources.getString(C0954R.string.navigation_menu);
            C12775o.m28638h(str, "resources.getString(R.string.navigation_menu)");
        } else if (Strings.m34580equalsimpl0(i, companion.m34584getCloseDraweradMyvUU())) {
            str = resources.getString(C0954R.string.close_drawer);
            C12775o.m28638h(str, "resources.getString(R.string.close_drawer)");
        } else if (Strings.m34580equalsimpl0(i, companion.m34585getCloseSheetadMyvUU())) {
            str = resources.getString(C0954R.string.close_sheet);
            C12775o.m28638h(str, "resources.getString(R.string.close_sheet)");
        } else if (Strings.m34580equalsimpl0(i, companion.m34586getDefaultErrorMessageadMyvUU())) {
            str = resources.getString(C0954R.string.default_error_message);
            C12775o.m28638h(str, "resources.getString(R.st…ng.default_error_message)");
        } else if (Strings.m34580equalsimpl0(i, companion.m34588getExposedDropdownMenuadMyvUU())) {
            str = resources.getString(C0954R.string.dropdown_menu);
            C12775o.m28638h(str, "resources.getString(R.string.dropdown_menu)");
        } else if (Strings.m34580equalsimpl0(i, companion.m34593getSliderRangeStartadMyvUU())) {
            str = resources.getString(C0954R.string.range_start);
            C12775o.m28638h(str, "resources.getString(R.string.range_start)");
        } else if (Strings.m34580equalsimpl0(i, companion.m34592getSliderRangeEndadMyvUU())) {
            str = resources.getString(C0954R.string.range_end);
            C12775o.m28638h(str, "resources.getString(R.string.range_end)");
        } else if (Strings.m34580equalsimpl0(i, companion.m34587getDialogadMyvUU())) {
            str = resources.getString(C0892R.string.dialog);
            C12775o.m28638h(str, "resources.getString(andr…aterial3.R.string.dialog)");
        } else if (Strings.m34580equalsimpl0(i, companion.m34590getMenuExpandedadMyvUU())) {
            str = resources.getString(C0892R.string.expanded);
            C12775o.m28638h(str, "resources.getString(andr…erial3.R.string.expanded)");
        } else if (Strings.m34580equalsimpl0(i, companion.m34589getMenuCollapsedadMyvUU())) {
            str = resources.getString(C0892R.string.collapsed);
            C12775o.m28638h(str, "resources.getString(andr…rial3.R.string.collapsed)");
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
