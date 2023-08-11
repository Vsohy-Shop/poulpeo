package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: CacheControl.kt */
public final class CacheControl {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;

    /* compiled from: CacheControl.kt */
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j) {
            if (j > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            return (int) j;
        }

        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, (String) null, (DefaultConstructorMarker) null);
        }

        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        public final Builder maxAge(int i, TimeUnit timeUnit) {
            boolean z;
            C12775o.m28639i(timeUnit, "timeUnit");
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.maxAgeSeconds = clampToInt(timeUnit.toSeconds((long) i));
                return this;
            }
            throw new IllegalArgumentException(C12775o.m28647q("maxAge < 0: ", Integer.valueOf(i)).toString());
        }

        public final Builder maxStale(int i, TimeUnit timeUnit) {
            boolean z;
            C12775o.m28639i(timeUnit, "timeUnit");
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.maxStaleSeconds = clampToInt(timeUnit.toSeconds((long) i));
                return this;
            }
            throw new IllegalArgumentException(C12775o.m28647q("maxStale < 0: ", Integer.valueOf(i)).toString());
        }

        public final Builder minFresh(int i, TimeUnit timeUnit) {
            boolean z;
            C12775o.m28639i(timeUnit, "timeUnit");
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.minFreshSeconds = clampToInt(timeUnit.toSeconds((long) i));
                return this;
            }
            throw new IllegalArgumentException(C12775o.m28647q("minFresh < 0: ", Integer.valueOf(i)).toString());
        }

        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    /* compiled from: CacheControl.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int indexOfElement(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                int i2 = i + 1;
                if (C13755w.m31550I(str2, str.charAt(i), false, 2, (Object) null)) {
                    return i;
                }
                i = i2;
            }
            return str.length();
        }

        static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return companion.indexOfElement(str, str2, i);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okhttp3.CacheControl parse(okhttp3.Headers r31) {
            /*
                r30 = this;
                r0 = r30
                r1 = r31
                java.lang.String r2 = "headers"
                kotlin.jvm.internal.C12775o.m28639i(r1, r2)
                int r2 = r31.size()
                r5 = 1
                r8 = r5
                r7 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = -1
                r13 = -1
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = -1
                r18 = -1
                r19 = 0
                r20 = 0
                r21 = 0
            L_0x0023:
                if (r7 >= r2) goto L_0x0188
                int r22 = r7 + 1
                java.lang.String r3 = r1.name(r7)
                java.lang.String r7 = r1.value(r7)
                java.lang.String r6 = "Cache-Control"
                boolean r6 = p454wf.C13754v.m31530r(r3, r6, r5)
                if (r6 == 0) goto L_0x003c
                if (r9 == 0) goto L_0x003a
                goto L_0x0044
            L_0x003a:
                r9 = r7
                goto L_0x0045
            L_0x003c:
                java.lang.String r6 = "Pragma"
                boolean r3 = p454wf.C13754v.m31530r(r3, r6, r5)
                if (r3 == 0) goto L_0x0181
            L_0x0044:
                r8 = 0
            L_0x0045:
                r3 = 0
            L_0x0046:
                int r6 = r7.length()
                if (r3 >= r6) goto L_0x0181
                java.lang.String r6 = "=,;"
                int r6 = r0.indexOfElement(r7, r6, r3)
                java.lang.String r3 = r7.substring(r3, r6)
                java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.C12775o.m28638h(r3, r4)
                java.lang.CharSequence r3 = p454wf.C13755w.m31561N0(r3)
                java.lang.String r3 = r3.toString()
                int r5 = r7.length()
                if (r6 == r5) goto L_0x00c0
                char r5 = r7.charAt(r6)
                r1 = 44
                if (r5 == r1) goto L_0x00c0
                char r1 = r7.charAt(r6)
                r5 = 59
                if (r1 != r5) goto L_0x007a
                goto L_0x00c0
            L_0x007a:
                int r6 = r6 + 1
                int r1 = okhttp3.internal.Util.indexOfNonWhitespace(r7, r6)
                int r5 = r7.length()
                if (r1 >= r5) goto L_0x00aa
                char r5 = r7.charAt(r1)
                r6 = 34
                if (r5 != r6) goto L_0x00aa
                int r1 = r1 + 1
                r25 = 34
                r27 = 0
                r28 = 4
                r29 = 0
                r24 = r7
                r26 = r1
                int r5 = p454wf.C13755w.m31570V(r24, r25, r26, r27, r28, r29)
                java.lang.String r1 = r7.substring(r1, r5)
                kotlin.jvm.internal.C12775o.m28638h(r1, r4)
                r4 = 1
                int r5 = r5 + r4
                goto L_0x00c4
            L_0x00aa:
                java.lang.String r5 = ",;"
                int r5 = r0.indexOfElement(r7, r5, r1)
                java.lang.String r1 = r7.substring(r1, r5)
                kotlin.jvm.internal.C12775o.m28638h(r1, r4)
                java.lang.CharSequence r1 = p454wf.C13755w.m31561N0(r1)
                java.lang.String r1 = r1.toString()
                goto L_0x00c4
            L_0x00c0:
                int r6 = r6 + 1
                r5 = r6
                r1 = 0
            L_0x00c4:
                java.lang.String r4 = "no-cache"
                r6 = 1
                boolean r4 = p454wf.C13754v.m31530r(r4, r3, r6)
                if (r4 == 0) goto L_0x00d4
                r1 = r31
                r3 = r5
                r5 = r6
                r10 = r5
                goto L_0x0046
            L_0x00d4:
                java.lang.String r4 = "no-store"
                boolean r4 = p454wf.C13754v.m31530r(r4, r3, r6)
                if (r4 == 0) goto L_0x00e3
                r1 = r31
                r3 = r5
                r5 = r6
                r11 = r5
                goto L_0x0046
            L_0x00e3:
                java.lang.String r4 = "max-age"
                boolean r4 = p454wf.C13754v.m31530r(r4, r3, r6)
                if (r4 == 0) goto L_0x00f6
                r4 = -1
                int r12 = okhttp3.internal.Util.toNonNegativeInt(r1, r4)
            L_0x00f0:
                r1 = r31
                r3 = r5
                r5 = r6
                goto L_0x0046
            L_0x00f6:
                java.lang.String r4 = "s-maxage"
                boolean r4 = p454wf.C13754v.m31530r(r4, r3, r6)
                if (r4 == 0) goto L_0x0104
                r4 = -1
                int r13 = okhttp3.internal.Util.toNonNegativeInt(r1, r4)
                goto L_0x00f0
            L_0x0104:
                java.lang.String r4 = "private"
                boolean r4 = p454wf.C13754v.m31530r(r4, r3, r6)
                if (r4 == 0) goto L_0x0113
                r1 = r31
                r3 = r5
                r5 = r6
                r14 = r5
                goto L_0x0046
            L_0x0113:
                java.lang.String r4 = "public"
                boolean r4 = p454wf.C13754v.m31530r(r4, r3, r6)
                if (r4 == 0) goto L_0x0122
                r1 = r31
                r3 = r5
                r5 = r6
                r15 = r5
                goto L_0x0046
            L_0x0122:
                java.lang.String r4 = "must-revalidate"
                boolean r4 = p454wf.C13754v.m31530r(r4, r3, r6)
                if (r4 == 0) goto L_0x0132
                r1 = r31
                r3 = r5
                r5 = r6
                r16 = r5
                goto L_0x0046
            L_0x0132:
                java.lang.String r4 = "max-stale"
                boolean r4 = p454wf.C13754v.m31530r(r4, r3, r6)
                if (r4 == 0) goto L_0x0142
                r3 = 2147483647(0x7fffffff, float:NaN)
                int r17 = okhttp3.internal.Util.toNonNegativeInt(r1, r3)
                goto L_0x00f0
            L_0x0142:
                java.lang.String r4 = "min-fresh"
                boolean r4 = p454wf.C13754v.m31530r(r4, r3, r6)
                if (r4 == 0) goto L_0x0150
                r4 = -1
                int r18 = okhttp3.internal.Util.toNonNegativeInt(r1, r4)
                goto L_0x00f0
            L_0x0150:
                r4 = -1
                java.lang.String r1 = "only-if-cached"
                boolean r1 = p454wf.C13754v.m31530r(r1, r3, r6)
                if (r1 == 0) goto L_0x0161
                r1 = r31
                r3 = r5
                r5 = r6
                r19 = r5
                goto L_0x0046
            L_0x0161:
                java.lang.String r1 = "no-transform"
                boolean r1 = p454wf.C13754v.m31530r(r1, r3, r6)
                if (r1 == 0) goto L_0x0171
                r1 = r31
                r3 = r5
                r5 = r6
                r20 = r5
                goto L_0x0046
            L_0x0171:
                java.lang.String r1 = "immutable"
                boolean r1 = p454wf.C13754v.m31530r(r1, r3, r6)
                if (r1 == 0) goto L_0x00f0
                r1 = r31
                r3 = r5
                r5 = r6
                r21 = r5
                goto L_0x0046
            L_0x0181:
                r4 = -1
                r1 = r31
                r7 = r22
                goto L_0x0023
            L_0x0188:
                if (r8 != 0) goto L_0x018d
                r22 = 0
                goto L_0x018f
            L_0x018d:
                r22 = r9
            L_0x018f:
                okhttp3.CacheControl r1 = new okhttp3.CacheControl
                r23 = 0
                r9 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CacheControl.Companion.parse(okhttp3.Headers):okhttp3.CacheControl");
        }
    }

    public /* synthetic */ CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }

    public static final CacheControl parse(Headers headers) {
        return Companion.parse(headers);
    }

    /* renamed from: -deprecated_immutable  reason: not valid java name */
    public final boolean m38753deprecated_immutable() {
        return this.immutable;
    }

    /* renamed from: -deprecated_maxAgeSeconds  reason: not valid java name */
    public final int m38754deprecated_maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    /* renamed from: -deprecated_maxStaleSeconds  reason: not valid java name */
    public final int m38755deprecated_maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    /* renamed from: -deprecated_minFreshSeconds  reason: not valid java name */
    public final int m38756deprecated_minFreshSeconds() {
        return this.minFreshSeconds;
    }

    /* renamed from: -deprecated_mustRevalidate  reason: not valid java name */
    public final boolean m38757deprecated_mustRevalidate() {
        return this.mustRevalidate;
    }

    /* renamed from: -deprecated_noCache  reason: not valid java name */
    public final boolean m38758deprecated_noCache() {
        return this.noCache;
    }

    /* renamed from: -deprecated_noStore  reason: not valid java name */
    public final boolean m38759deprecated_noStore() {
        return this.noStore;
    }

    /* renamed from: -deprecated_noTransform  reason: not valid java name */
    public final boolean m38760deprecated_noTransform() {
        return this.noTransform;
    }

    /* renamed from: -deprecated_onlyIfCached  reason: not valid java name */
    public final boolean m38761deprecated_onlyIfCached() {
        return this.onlyIfCached;
    }

    /* renamed from: -deprecated_sMaxAgeSeconds  reason: not valid java name */
    public final int m38762deprecated_sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public final boolean immutable() {
        return this.immutable;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    public final boolean noCache() {
        return this.noCache;
    }

    public final boolean noStore() {
        return this.noStore;
    }

    public final boolean noTransform() {
        return this.noTransform;
    }

    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public String toString() {
        boolean z;
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (noCache()) {
            sb.append("no-cache, ");
        }
        if (noStore()) {
            sb.append("no-store, ");
        }
        if (maxAgeSeconds() != -1) {
            sb.append("max-age=");
            sb.append(maxAgeSeconds());
            sb.append(", ");
        }
        if (sMaxAgeSeconds() != -1) {
            sb.append("s-maxage=");
            sb.append(sMaxAgeSeconds());
            sb.append(", ");
        }
        if (isPrivate()) {
            sb.append("private, ");
        }
        if (isPublic()) {
            sb.append("public, ");
        }
        if (mustRevalidate()) {
            sb.append("must-revalidate, ");
        }
        if (maxStaleSeconds() != -1) {
            sb.append("max-stale=");
            sb.append(maxStaleSeconds());
            sb.append(", ");
        }
        if (minFreshSeconds() != -1) {
            sb.append("min-fresh=");
            sb.append(minFreshSeconds());
            sb.append(", ");
        }
        if (onlyIfCached()) {
            sb.append("only-if-cached, ");
        }
        if (noTransform()) {
            sb.append("no-transform, ");
        }
        if (immutable()) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        C12775o.m28638h(sb2, "StringBuilder().apply(builderAction).toString()");
        this.headerValue = sb2;
        return sb2;
    }

    private CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.noCache = z;
        this.noStore = z2;
        this.maxAgeSeconds = i;
        this.sMaxAgeSeconds = i2;
        this.isPrivate = z3;
        this.isPublic = z4;
        this.mustRevalidate = z5;
        this.maxStaleSeconds = i3;
        this.minFreshSeconds = i4;
        this.onlyIfCached = z6;
        this.noTransform = z7;
        this.immutable = z8;
        this.headerValue = str;
    }
}
