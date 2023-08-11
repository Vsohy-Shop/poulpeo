package androidx.compose.p002ui.graphics;

/* renamed from: androidx.compose.ui.graphics.Float16Kt */
/* compiled from: Float16.kt */
public final class Float16Kt {
    /* renamed from: max-AoSsdG0  reason: not valid java name */
    public static final short m35812maxAoSsdG0(short s, short s2) {
        if (Float16.m35785isNaNimpl(s) || Float16.m35785isNaNimpl(s2)) {
            return Float16.Companion.m35807getNaNslo4al4();
        }
        if (Float16.m35772compareTo41bOqos(s, s2) >= 0) {
            return s;
        }
        return s2;
    }

    /* renamed from: min-AoSsdG0  reason: not valid java name */
    public static final short m35813minAoSsdG0(short s, short s2) {
        if (Float16.m35785isNaNimpl(s) || Float16.m35785isNaNimpl(s2)) {
            return Float16.Companion.m35807getNaNslo4al4();
        }
        if (Float16.m35772compareTo41bOqos(s, s2) <= 0) {
            return s;
        }
        return s2;
    }
}
