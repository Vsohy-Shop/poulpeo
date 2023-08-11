package androidx.compose.p002ui.text.style;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
/* renamed from: androidx.compose.ui.text.style.LineBreak */
/* compiled from: LineBreak.android.kt */
public final class LineBreak {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final int Heading;
    /* access modifiers changed from: private */
    public static final int Paragraph;
    /* access modifiers changed from: private */
    public static final int Simple;
    private final int mask;

    /* renamed from: androidx.compose.ui.text.style.LineBreak$Companion */
    /* compiled from: LineBreak.android.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getHeading-rAG3T2k  reason: not valid java name */
        public final int m38278getHeadingrAG3T2k() {
            return LineBreak.Heading;
        }

        /* renamed from: getParagraph-rAG3T2k  reason: not valid java name */
        public final int m38279getParagraphrAG3T2k() {
            return LineBreak.Paragraph;
        }

        /* renamed from: getSimple-rAG3T2k  reason: not valid java name */
        public final int m38280getSimplerAG3T2k() {
            return LineBreak.Simple;
        }
    }

    static {
        Strategy.Companion companion = Strategy.Companion;
        int r1 = companion.m38290getSimplefcGXIks();
        Strictness.Companion companion2 = Strictness.Companion;
        int r3 = companion2.m38300getNormalusljTpc();
        WordBreak.Companion companion3 = WordBreak.Companion;
        Simple = m38267constructorimpl(r1, r3, companion3.m38309getDefaultjp8hJ3c());
        Heading = m38267constructorimpl(companion.m38288getBalancedfcGXIks(), companion2.m38299getLooseusljTpc(), companion3.m38310getPhrasejp8hJ3c());
        Paragraph = m38267constructorimpl(companion.m38289getHighQualityfcGXIks(), companion2.m38301getStrictusljTpc(), companion3.m38309getDefaultjp8hJ3c());
    }

    private /* synthetic */ LineBreak(int i) {
        this.mask = i;
    }

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ LineBreak m38265boximpl(int i) {
        return new LineBreak(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m38266constructorimpl(int i) {
        return i;
    }

    /* renamed from: copy-gijOMQM  reason: not valid java name */
    public static final int m38268copygijOMQM(int i, int i2, int i3, int i4) {
        return m38267constructorimpl(i2, i3, i4);
    }

    /* renamed from: copy-gijOMQM$default  reason: not valid java name */
    public static /* synthetic */ int m38269copygijOMQM$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = m38272getStrategyfcGXIks(i);
        }
        if ((i5 & 2) != 0) {
            i3 = m38273getStrictnessusljTpc(i);
        }
        if ((i5 & 4) != 0) {
            i4 = m38274getWordBreakjp8hJ3c(i);
        }
        return m38268copygijOMQM(i, i2, i3, i4);
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m38270equalsimpl(int i, Object obj) {
        if ((obj instanceof LineBreak) && i == ((LineBreak) obj).m38277unboximpl()) {
            return true;
        }
        return false;
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m38271equalsimpl0(int i, int i2) {
        if (i == i2) {
            return true;
        }
        return false;
    }

    /* renamed from: getStrategy-fcGXIks  reason: not valid java name */
    public static final int m38272getStrategyfcGXIks(int i) {
        return Strategy.m38282constructorimpl(LineBreak_androidKt.unpackByte1(i));
    }

    /* renamed from: getStrictness-usljTpc  reason: not valid java name */
    public static final int m38273getStrictnessusljTpc(int i) {
        return Strictness.m38292constructorimpl(LineBreak_androidKt.unpackByte2(i));
    }

    /* renamed from: getWordBreak-jp8hJ3c  reason: not valid java name */
    public static final int m38274getWordBreakjp8hJ3c(int i) {
        return WordBreak.m38303constructorimpl(LineBreak_androidKt.unpackByte3(i));
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m38275hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m38276toStringimpl(int i) {
        return "LineBreak(strategy=" + Strategy.m38286toStringimpl(m38272getStrategyfcGXIks(i)) + ", strictness=" + Strictness.m38296toStringimpl(m38273getStrictnessusljTpc(i)) + ", wordBreak=" + WordBreak.m38307toStringimpl(m38274getWordBreakjp8hJ3c(i)) + ')';
    }

    public boolean equals(Object obj) {
        return m38270equalsimpl(this.mask, obj);
    }

    public int hashCode() {
        return m38275hashCodeimpl(this.mask);
    }

    public String toString() {
        return m38276toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m38277unboximpl() {
        return this.mask;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static int m38267constructorimpl(int i, int i2, int i3) {
        return m38266constructorimpl(LineBreak_androidKt.packBytes(i, i2, i3));
    }

    /* renamed from: androidx.compose.ui.text.style.LineBreak$Strategy */
    /* compiled from: LineBreak.android.kt */
    public static final class Strategy {
        /* access modifiers changed from: private */
        public static final int Balanced = m38282constructorimpl(3);
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final int HighQuality = m38282constructorimpl(2);
        /* access modifiers changed from: private */
        public static final int Simple = m38282constructorimpl(1);
        private final int value;

        /* renamed from: androidx.compose.ui.text.style.LineBreak$Strategy$Companion */
        /* compiled from: LineBreak.android.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getBalanced-fcGXIks  reason: not valid java name */
            public final int m38288getBalancedfcGXIks() {
                return Strategy.Balanced;
            }

            /* renamed from: getHighQuality-fcGXIks  reason: not valid java name */
            public final int m38289getHighQualityfcGXIks() {
                return Strategy.HighQuality;
            }

            /* renamed from: getSimple-fcGXIks  reason: not valid java name */
            public final int m38290getSimplefcGXIks() {
                return Strategy.Simple;
            }
        }

        private /* synthetic */ Strategy(int i) {
            this.value = i;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ Strategy m38281boximpl(int i) {
            return new Strategy(i);
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m38283equalsimpl(int i, Object obj) {
            if ((obj instanceof Strategy) && i == ((Strategy) obj).m38287unboximpl()) {
                return true;
            }
            return false;
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m38284equalsimpl0(int i, int i2) {
            if (i == i2) {
                return true;
            }
            return false;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m38285hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m38286toStringimpl(int i) {
            if (m38284equalsimpl0(i, Simple)) {
                return "Strategy.Simple";
            }
            if (m38284equalsimpl0(i, HighQuality)) {
                return "Strategy.HighQuality";
            }
            if (m38284equalsimpl0(i, Balanced)) {
                return "Strategy.Balanced";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m38283equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m38285hashCodeimpl(this.value);
        }

        public String toString() {
            return m38286toStringimpl(this.value);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m38287unboximpl() {
            return this.value;
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static int m38282constructorimpl(int i) {
            return i;
        }
    }

    /* renamed from: androidx.compose.ui.text.style.LineBreak$Strictness */
    /* compiled from: LineBreak.android.kt */
    public static final class Strictness {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final int Default = m38292constructorimpl(1);
        /* access modifiers changed from: private */
        public static final int Loose = m38292constructorimpl(2);
        /* access modifiers changed from: private */
        public static final int Normal = m38292constructorimpl(3);
        /* access modifiers changed from: private */
        public static final int Strict = m38292constructorimpl(4);
        private final int value;

        /* renamed from: androidx.compose.ui.text.style.LineBreak$Strictness$Companion */
        /* compiled from: LineBreak.android.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getDefault-usljTpc  reason: not valid java name */
            public final int m38298getDefaultusljTpc() {
                return Strictness.Default;
            }

            /* renamed from: getLoose-usljTpc  reason: not valid java name */
            public final int m38299getLooseusljTpc() {
                return Strictness.Loose;
            }

            /* renamed from: getNormal-usljTpc  reason: not valid java name */
            public final int m38300getNormalusljTpc() {
                return Strictness.Normal;
            }

            /* renamed from: getStrict-usljTpc  reason: not valid java name */
            public final int m38301getStrictusljTpc() {
                return Strictness.Strict;
            }
        }

        private /* synthetic */ Strictness(int i) {
            this.value = i;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ Strictness m38291boximpl(int i) {
            return new Strictness(i);
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m38293equalsimpl(int i, Object obj) {
            if ((obj instanceof Strictness) && i == ((Strictness) obj).m38297unboximpl()) {
                return true;
            }
            return false;
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m38294equalsimpl0(int i, int i2) {
            if (i == i2) {
                return true;
            }
            return false;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m38295hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m38296toStringimpl(int i) {
            if (m38294equalsimpl0(i, Default)) {
                return "Strictness.None";
            }
            if (m38294equalsimpl0(i, Loose)) {
                return "Strictness.Loose";
            }
            if (m38294equalsimpl0(i, Normal)) {
                return "Strictness.Normal";
            }
            if (m38294equalsimpl0(i, Strict)) {
                return "Strictness.Strict";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m38293equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m38295hashCodeimpl(this.value);
        }

        public String toString() {
            return m38296toStringimpl(this.value);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m38297unboximpl() {
            return this.value;
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static int m38292constructorimpl(int i) {
            return i;
        }
    }

    /* renamed from: androidx.compose.ui.text.style.LineBreak$WordBreak */
    /* compiled from: LineBreak.android.kt */
    public static final class WordBreak {
        public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */
        public static final int Default = m38303constructorimpl(1);
        /* access modifiers changed from: private */
        public static final int Phrase = m38303constructorimpl(2);
        private final int value;

        /* renamed from: androidx.compose.ui.text.style.LineBreak$WordBreak$Companion */
        /* compiled from: LineBreak.android.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getDefault-jp8hJ3c  reason: not valid java name */
            public final int m38309getDefaultjp8hJ3c() {
                return WordBreak.Default;
            }

            /* renamed from: getPhrase-jp8hJ3c  reason: not valid java name */
            public final int m38310getPhrasejp8hJ3c() {
                return WordBreak.Phrase;
            }
        }

        private /* synthetic */ WordBreak(int i) {
            this.value = i;
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ WordBreak m38302boximpl(int i) {
            return new WordBreak(i);
        }

        /* renamed from: equals-impl  reason: not valid java name */
        public static boolean m38304equalsimpl(int i, Object obj) {
            if ((obj instanceof WordBreak) && i == ((WordBreak) obj).m38308unboximpl()) {
                return true;
            }
            return false;
        }

        /* renamed from: equals-impl0  reason: not valid java name */
        public static final boolean m38305equalsimpl0(int i, int i2) {
            if (i == i2) {
                return true;
            }
            return false;
        }

        /* renamed from: hashCode-impl  reason: not valid java name */
        public static int m38306hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl  reason: not valid java name */
        public static String m38307toStringimpl(int i) {
            if (m38305equalsimpl0(i, Default)) {
                return "WordBreak.None";
            }
            if (m38305equalsimpl0(i, Phrase)) {
                return "WordBreak.Phrase";
            }
            return "Invalid";
        }

        public boolean equals(Object obj) {
            return m38304equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m38306hashCodeimpl(this.value);
        }

        public String toString() {
            return m38307toStringimpl(this.value);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ int m38308unboximpl() {
            return this.value;
        }

        /* renamed from: constructor-impl  reason: not valid java name */
        public static int m38303constructorimpl(int i) {
            return i;
        }
    }
}
