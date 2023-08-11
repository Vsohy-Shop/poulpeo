package com.rmn.utils.shortcut;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import com.poulpeo.R;
import com.poulpeo.p321ui.screens.account.AccountActivity;
import com.poulpeo.p321ui.screens.main_menu.MainMenuActivity;
import com.poulpeo.p321ui.screens.merchant_search_old.MerchantSearchActivityOld;
import com.poulpeo.p321ui.screens.sponsorship.SponsorshipActivity;
import kotlin.jvm.internal.C12775o;

@RequiresApi(25)
@StabilityInferred(parameters = 0)
/* compiled from: ShortcutUtil.kt */
public final class ShortcutUtil {
    public static final int $stable = 0;
    public static final ShortcutUtil INSTANCE = new ShortcutUtil();

    private ShortcutUtil() {
    }

    private final ShortcutInfo newShortcut(Context context, ShortcutItem shortcutItem, int i, int i2, Intent... intentArr) {
        int length = intentArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            Intent intent = intentArr[i3];
            int i5 = i4 + 1;
            intent.setAction(shortcutItem.getId());
            if (i4 == 0) {
                intent.setFlags(268468224);
            }
            i3++;
            i4 = i5;
        }
        ShortcutInfo a = new ShortcutInfo.Builder(context, shortcutItem.getId()).setShortLabel(context.getString(i)).setIcon(Icon.createWithResource(context, i2)).setIntents(intentArr).build();
        C12775o.m28638h(a, "Builder(context, item.id…nts)\n            .build()");
        return a;
    }

    public final void initShortcuts(Context context) {
        C12775o.m28639i(context, "context");
        ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
        if (shortcutManager.getDynamicShortcuts().size() <= 0) {
            ShortcutItem shortcutItem = ShortcutItem.SHARE;
            MainMenuActivity.C11152a aVar = MainMenuActivity.f17407w;
            Context context2 = context;
            boolean unused = shortcutManager.setDynamicShortcuts(C12726w.m28527n(newShortcut(context2, shortcutItem, R.string.shortcut_share, R.drawable.shortcut_share, aVar.mo46323f(context), AccountActivity.f17242p.mo46185a(context), SponsorshipActivity.f17717p.mo46494a(context)), newShortcut(context2, ShortcutItem.EARNINGS, R.string.shortcut_earnings, R.drawable.shortcut_earnings, aVar.mo46324g(context)), newShortcut(context2, ShortcutItem.FAVORITES, R.string.shortcut_favorites, R.drawable.shortcut_favorites, aVar.mo46325h(context)), newShortcut(context2, ShortcutItem.SEARCH, R.string.shortcut_search, R.drawable.shortcut_search, aVar.mo46323f(context), MerchantSearchActivityOld.f17564A.mo46411a(context))));
        }
    }

    public final void resetShortcuts(Context context) {
        C12775o.m28639i(context, "context");
        ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
    }
}
