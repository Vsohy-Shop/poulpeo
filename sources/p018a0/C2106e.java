package p018a0;

import kotlin.NoWhenBranchMatchedException;
import p057d0.C7213c;

/* renamed from: a0.e */
public enum C2106e implements C7213c<String> {
    IMAGE_DOWNLOAD,
    TEMPLATE_REQUEST,
    ZIP_ASSET_DOWNLOAD,
    DISPLAY_VIEW_GENERATION,
    INTERNAL_TIMEOUT_EXCEEDED,
    UNKNOWN_MESSAGE_TYPE;

    /* renamed from: a0.e$a */
    public /* synthetic */ class C2107a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f777a = null;

        static {
            int[] iArr = new int[C2106e.values().length];
            iArr[C2106e.IMAGE_DOWNLOAD.ordinal()] = 1;
            iArr[C2106e.TEMPLATE_REQUEST.ordinal()] = 2;
            iArr[C2106e.ZIP_ASSET_DOWNLOAD.ordinal()] = 3;
            iArr[C2106e.DISPLAY_VIEW_GENERATION.ordinal()] = 4;
            iArr[C2106e.INTERNAL_TIMEOUT_EXCEEDED.ordinal()] = 5;
            iArr[C2106e.UNKNOWN_MESSAGE_TYPE.ordinal()] = 6;
            f777a = iArr;
        }
    }

    /* renamed from: v */
    public String forJsonPut() {
        switch (C2107a.f777a[ordinal()]) {
            case 1:
                return "if";
            case 2:
                return "tf";
            case 3:
                return "zf";
            case 4:
                return "vf";
            case 5:
                return "te";
            case 6:
                return "umt";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
