package p203q7;

import androidx.annotation.NonNull;

/* renamed from: q7.f */
/* compiled from: HeartBeatInfo */
public interface C9322f {

    /* renamed from: q7.f$a */
    /* compiled from: HeartBeatInfo */
    public enum C9323a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        

        /* renamed from: b */
        private final int f13695b;

        private C9323a(int i) {
            this.f13695b = i;
        }

        /* renamed from: a */
        public int mo43612a() {
            return this.f13695b;
        }
    }

    @NonNull
    /* renamed from: a */
    C9323a mo43611a(@NonNull String str);
}
