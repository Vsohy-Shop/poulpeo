package androidx.compose.p002ui.text.style;

import androidx.compose.p002ui.text.TempListUtilsKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
/* renamed from: androidx.compose.ui.text.style.TextDecoration */
/* compiled from: TextDecoration.kt */
public final class TextDecoration {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final TextDecoration LineThrough = new TextDecoration(2);
    /* access modifiers changed from: private */
    public static final TextDecoration None = new TextDecoration(0);
    /* access modifiers changed from: private */
    public static final TextDecoration Underline = new TextDecoration(1);
    private final int mask;

    public TextDecoration(int i) {
        this.mask = i;
    }

    public final boolean contains(TextDecoration textDecoration) {
        C12775o.m28639i(textDecoration, "other");
        int i = this.mask;
        if ((textDecoration.mask | i) == i) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof TextDecoration) && this.mask == ((TextDecoration) obj).mask) {
            return true;
        }
        return false;
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return this.mask;
    }

    public final TextDecoration plus(TextDecoration textDecoration) {
        C12775o.m28639i(textDecoration, "decoration");
        return new TextDecoration(textDecoration.mask | this.mask);
    }

    public String toString() {
        if (this.mask == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.mask & Underline.mask) != 0) {
            arrayList.add("Underline");
        }
        if ((this.mask & LineThrough.mask) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + TempListUtilsKt.fastJoinToString$default(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) + ']';
    }

    @SourceDebugExtension({"SMAP\nTextDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDecoration.kt\nandroidx/compose/ui/text/style/TextDecoration$Companion\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,111:1\n108#2,3:112\n111#2,2:119\n113#2:122\n33#3,4:115\n38#3:121\n*S KotlinDebug\n*F\n+ 1 TextDecoration.kt\nandroidx/compose/ui/text/style/TextDecoration$Companion\n*L\n57#1:112,3\n57#1:119,2\n57#1:122\n57#1:115,4\n57#1:121\n*E\n"})
    /* renamed from: androidx.compose.ui.text.style.TextDecoration$Companion */
    /* compiled from: TextDecoration.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TextDecoration combine(List<TextDecoration> list) {
            C12775o.m28639i(list, "decorations");
            Integer num = 0;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                num = Integer.valueOf(num.intValue() | list.get(i).getMask());
            }
            return new TextDecoration(num.intValue());
        }

        public final TextDecoration getLineThrough() {
            return TextDecoration.LineThrough;
        }

        public final TextDecoration getNone() {
            return TextDecoration.None;
        }

        public final TextDecoration getUnderline() {
            return TextDecoration.Underline;
        }

        @Stable
        public static /* synthetic */ void getLineThrough$annotations() {
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }

        @Stable
        public static /* synthetic */ void getUnderline$annotations() {
        }
    }
}
