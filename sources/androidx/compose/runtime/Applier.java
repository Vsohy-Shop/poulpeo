package androidx.compose.runtime;

/* compiled from: Applier.kt */
public interface Applier<N> {

    /* compiled from: Applier.kt */
    public static final class DefaultImpls {
        @Deprecated
        public static <N> void onBeginChanges(Applier<N> applier) {
            Applier.super.onBeginChanges();
        }

        @Deprecated
        public static <N> void onEndChanges(Applier<N> applier) {
            Applier.super.onEndChanges();
        }
    }

    void clear();

    void down(N n);

    N getCurrent();

    void insertBottomUp(int i, N n);

    void insertTopDown(int i, N n);

    void move(int i, int i2, int i3);

    void remove(int i, int i2);

    /* renamed from: up */
    void mo10550up();

    void onBeginChanges() {
    }

    void onEndChanges() {
    }
}
