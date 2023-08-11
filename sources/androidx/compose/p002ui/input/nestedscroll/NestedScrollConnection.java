package androidx.compose.p002ui.input.nestedscroll;

import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.unit.Velocity;
import p355hf.C12074d;

/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollConnection */
/* compiled from: NestedScrollModifier.kt */
public interface NestedScrollConnection {

    /* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollConnection$DefaultImpls */
    /* compiled from: NestedScrollModifier.kt */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: onPostFling-RZ2iAVY  reason: not valid java name */
        public static Object m37048onPostFlingRZ2iAVY(NestedScrollConnection nestedScrollConnection, long j, long j2, C12074d<? super Velocity> dVar) {
            return NestedScrollConnection.super.m37044onPostFlingRZ2iAVY(j, j2, dVar);
        }

        @Deprecated
        /* renamed from: onPostScroll-DzOQY0M  reason: not valid java name */
        public static long m37049onPostScrollDzOQY0M(NestedScrollConnection nestedScrollConnection, long j, long j2, int i) {
            return NestedScrollConnection.super.m37045onPostScrollDzOQY0M(j, j2, i);
        }

        @Deprecated
        /* renamed from: onPreFling-QWom1Mo  reason: not valid java name */
        public static Object m37050onPreFlingQWom1Mo(NestedScrollConnection nestedScrollConnection, long j, C12074d<? super Velocity> dVar) {
            return NestedScrollConnection.super.m37046onPreFlingQWom1Mo(j, dVar);
        }

        @Deprecated
        /* renamed from: onPreScroll-OzD1aCk  reason: not valid java name */
        public static long m37051onPreScrollOzD1aCk(NestedScrollConnection nestedScrollConnection, long j, int i) {
            return NestedScrollConnection.super.m37047onPreScrollOzD1aCk(j, i);
        }
    }

    /* renamed from: onPostFling-RZ2iAVY  reason: not valid java name */
    Object m37044onPostFlingRZ2iAVY(long j, long j2, C12074d<? super Velocity> dVar) {
        return Velocity.m38684boximpl(Velocity.Companion.m38704getZero9UxMQ8M());
    }

    /* renamed from: onPostScroll-DzOQY0M  reason: not valid java name */
    long m37045onPostScrollDzOQY0M(long j, long j2, int i) {
        return Offset.Companion.m35438getZeroF1C5BW0();
    }

    /* renamed from: onPreFling-QWom1Mo  reason: not valid java name */
    Object m37046onPreFlingQWom1Mo(long j, C12074d<? super Velocity> dVar) {
        return Velocity.m38684boximpl(Velocity.Companion.m38704getZero9UxMQ8M());
    }

    /* renamed from: onPreScroll-OzD1aCk  reason: not valid java name */
    long m37047onPreScrollOzD1aCk(long j, int i) {
        return Offset.Companion.m35438getZeroF1C5BW0();
    }
}
