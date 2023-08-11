package androidx.compose.p002ui.platform.actionmodecallback;

import kotlin.NoWhenBranchMatchedException;

/* renamed from: androidx.compose.ui.platform.actionmodecallback.MenuItemOption */
/* compiled from: TextActionModeCallback.android.kt */
public enum MenuItemOption {
    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3);
    

    /* renamed from: id */
    private final int f368id;
    private final int order;

    /* renamed from: androidx.compose.ui.platform.actionmodecallback.MenuItemOption$WhenMappings */
    /* compiled from: TextActionModeCallback.android.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                androidx.compose.ui.platform.actionmodecallback.MenuItemOption[] r0 = androidx.compose.p002ui.platform.actionmodecallback.MenuItemOption.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.platform.actionmodecallback.MenuItemOption r1 = androidx.compose.p002ui.platform.actionmodecallback.MenuItemOption.Copy     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.platform.actionmodecallback.MenuItemOption r1 = androidx.compose.p002ui.platform.actionmodecallback.MenuItemOption.Paste     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.compose.ui.platform.actionmodecallback.MenuItemOption r1 = androidx.compose.p002ui.platform.actionmodecallback.MenuItemOption.Cut     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.compose.ui.platform.actionmodecallback.MenuItemOption r1 = androidx.compose.p002ui.platform.actionmodecallback.MenuItemOption.SelectAll     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.actionmodecallback.MenuItemOption.WhenMappings.<clinit>():void");
        }
    }

    private MenuItemOption(int i) {
        this.f368id = i;
        this.order = i;
    }

    public final int getId() {
        return this.f368id;
    }

    public final int getOrder() {
        return this.order;
    }

    public final int getTitleResource() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return 17039361;
        }
        if (i == 2) {
            return 17039371;
        }
        if (i == 3) {
            return 17039363;
        }
        if (i == 4) {
            return 17039373;
        }
        throw new NoWhenBranchMatchedException();
    }
}
