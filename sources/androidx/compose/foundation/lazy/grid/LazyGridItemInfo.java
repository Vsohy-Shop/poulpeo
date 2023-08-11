package androidx.compose.foundation.lazy.grid;

/* compiled from: LazyGridItemInfo.kt */
public interface LazyGridItemInfo {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int UnknownColumn = -1;
    public static final int UnknownRow = -1;

    /* compiled from: LazyGridItemInfo.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int UnknownColumn = -1;
        public static final int UnknownRow = -1;

        private Companion() {
        }
    }

    int getColumn();

    int getIndex();

    Object getKey();

    /* renamed from: getOffset-nOcc-ac  reason: not valid java name */
    long m33461getOffsetnOccac();

    int getRow();

    /* renamed from: getSize-YbymL2g  reason: not valid java name */
    long m33462getSizeYbymL2g();
}
