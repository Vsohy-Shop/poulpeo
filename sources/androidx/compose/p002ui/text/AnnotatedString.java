package androidx.compose.p002ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.rmn.apiclient.impl.api.descriptors.APIResourceDescriptors;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n*L\n1#1,1126:1\n1045#2:1127\n33#3,6:1128\n33#3,4:1138\n38#3:1144\n101#3,2:1146\n33#3,6:1148\n103#3:1154\n33#3,4:1158\n38#3:1164\n33#3,4:1169\n38#3:1175\n33#3,4:1180\n38#3:1186\n1#4:1134\n35#5,3:1135\n38#5,2:1142\n40#5:1145\n35#5,3:1155\n38#5,2:1162\n40#5:1165\n35#5,3:1166\n38#5,2:1173\n40#5:1176\n35#5,3:1177\n38#5,2:1184\n40#5:1187\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n*L\n86#1:1127\n86#1:1128,6\n159#1:1138,4\n159#1:1144\n167#1:1146,2\n167#1:1148,6\n167#1:1154\n182#1:1158,4\n182#1:1164\n197#1:1169,4\n197#1:1175\n213#1:1180,4\n213#1:1186\n159#1:1135,3\n159#1:1142,2\n159#1:1145\n182#1:1155,3\n182#1:1162,2\n182#1:1165\n197#1:1166,3\n197#1:1173,2\n197#1:1176\n213#1:1177,3\n213#1:1184,2\n213#1:1187\n*E\n"})
/* renamed from: androidx.compose.ui.text.AnnotatedString */
/* compiled from: AnnotatedString.kt */
public final class AnnotatedString implements CharSequence {
    public static final int $stable = 0;
    private final List<Range<? extends Object>> annotations;
    private final List<Range<ParagraphStyle>> paragraphStylesOrNull;
    private final List<Range<SpanStyle>> spanStylesOrNull;
    private final String text;

    @StabilityInferred(parameters = 0)
    @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1126:1\n33#2,6:1127\n33#2,6:1133\n33#2,6:1139\n33#2,6:1145\n33#2,6:1151\n33#2,6:1157\n151#2,3:1164\n33#2,4:1167\n154#2,2:1171\n38#2:1173\n156#2:1174\n151#2,3:1175\n33#2,4:1178\n154#2,2:1182\n38#2:1184\n156#2:1185\n151#2,3:1186\n33#2,4:1189\n154#2,2:1193\n38#2:1195\n156#2:1196\n1#3:1163\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n*L\n396#1:1127,6\n399#1:1133,6\n403#1:1139,6\n423#1:1145,6\n426#1:1151,6\n430#1:1157,6\n640#1:1164,3\n640#1:1167,4\n640#1:1171,2\n640#1:1173\n640#1:1174\n643#1:1175,3\n643#1:1178,4\n643#1:1182,2\n643#1:1184\n643#1:1185\n646#1:1186,3\n646#1:1189,4\n646#1:1193,2\n646#1:1195\n646#1:1196\n*E\n"})
    /* renamed from: androidx.compose.ui.text.AnnotatedString$Builder */
    /* compiled from: AnnotatedString.kt */
    public static final class Builder implements Appendable {
        public static final int $stable = 8;
        private final List<MutableRange<? extends Object>> annotations;
        private final List<MutableRange<ParagraphStyle>> paragraphStyles;
        private final List<MutableRange<SpanStyle>> spanStyles;
        private final List<MutableRange<? extends Object>> styleStack;
        private final StringBuilder text;

        public Builder() {
            this(0, 1, (DefaultConstructorMarker) null);
        }

        public final void addStringAnnotation(String str, String str2, int i, int i2) {
            C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
            C12775o.m28639i(str2, "annotation");
            this.annotations.add(new MutableRange(str2, i, i2, str));
        }

        public final void addStyle(SpanStyle spanStyle, int i, int i2) {
            C12775o.m28639i(spanStyle, "style");
            this.spanStyles.add(new MutableRange(spanStyle, i, i2, (String) null, 8, (DefaultConstructorMarker) null));
        }

        @ExperimentalTextApi
        public final void addTtsAnnotation(TtsAnnotation ttsAnnotation, int i, int i2) {
            C12775o.m28639i(ttsAnnotation, "ttsAnnotation");
            this.annotations.add(new MutableRange(ttsAnnotation, i, i2, (String) null, 8, (DefaultConstructorMarker) null));
        }

        @ExperimentalTextApi
        public final void addUrlAnnotation(UrlAnnotation urlAnnotation, int i, int i2) {
            C12775o.m28639i(urlAnnotation, "urlAnnotation");
            this.annotations.add(new MutableRange(urlAnnotation, i, i2, (String) null, 8, (DefaultConstructorMarker) null));
        }

        public final int getLength() {
            return this.text.length();
        }

        public final void pop() {
            if (!this.styleStack.isEmpty()) {
                List<MutableRange<? extends Object>> list = this.styleStack;
                list.remove(list.size() - 1).setEnd(this.text.length());
                return;
            }
            throw new IllegalStateException("Nothing to pop.".toString());
        }

        public final int pushStringAnnotation(String str, String str2) {
            C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
            C12775o.m28639i(str2, "annotation");
            MutableRange mutableRange = new MutableRange(str2, this.text.length(), 0, str, 4, (DefaultConstructorMarker) null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushStyle(SpanStyle spanStyle) {
            C12775o.m28639i(spanStyle, "style");
            MutableRange mutableRange = new MutableRange(spanStyle, this.text.length(), 0, (String) null, 12, (DefaultConstructorMarker) null);
            this.styleStack.add(mutableRange);
            this.spanStyles.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushTtsAnnotation(TtsAnnotation ttsAnnotation) {
            C12775o.m28639i(ttsAnnotation, "ttsAnnotation");
            MutableRange mutableRange = new MutableRange(ttsAnnotation, this.text.length(), 0, (String) null, 12, (DefaultConstructorMarker) null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        @ExperimentalTextApi
        public final int pushUrlAnnotation(UrlAnnotation urlAnnotation) {
            C12775o.m28639i(urlAnnotation, "urlAnnotation");
            MutableRange mutableRange = new MutableRange(urlAnnotation, this.text.length(), 0, (String) null, 12, (DefaultConstructorMarker) null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final AnnotatedString toAnnotatedString() {
            String sb = this.text.toString();
            C12775o.m28638h(sb, "text.toString()");
            List<MutableRange<SpanStyle>> list = this.spanStyles;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(list.get(i).toRange(this.text.length()));
            }
            ArrayList arrayList2 = null;
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            List<MutableRange<ParagraphStyle>> list2 = this.paragraphStyles;
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList3.add(list2.get(i2).toRange(this.text.length()));
            }
            if (arrayList3.isEmpty()) {
                arrayList3 = null;
            }
            List<MutableRange<? extends Object>> list3 = this.annotations;
            ArrayList arrayList4 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                arrayList4.add(list3.get(i3).toRange(this.text.length()));
            }
            if (!arrayList4.isEmpty()) {
                arrayList2 = arrayList4;
            }
            return new AnnotatedString(sb, arrayList, arrayList3, arrayList2);
        }

        public Builder(int i) {
            this.text = new StringBuilder(i);
            this.spanStyles = new ArrayList();
            this.paragraphStyles = new ArrayList();
            this.annotations = new ArrayList();
            this.styleStack = new ArrayList();
        }

        public final void addStyle(ParagraphStyle paragraphStyle, int i, int i2) {
            C12775o.m28639i(paragraphStyle, "style");
            this.paragraphStyles.add(new MutableRange(paragraphStyle, i, i2, (String) null, 8, (DefaultConstructorMarker) null));
        }

        public final void append(String str) {
            C12775o.m28639i(str, "text");
            this.text.append(str);
        }

        @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder$MutableRange\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1126:1\n1#2:1127\n*E\n"})
        /* renamed from: androidx.compose.ui.text.AnnotatedString$Builder$MutableRange */
        /* compiled from: AnnotatedString.kt */
        private static final class MutableRange<T> {
            private int end;
            private final T item;
            private final int start;
            private final String tag;

            public MutableRange(T t, int i, int i2, String str) {
                C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
                this.item = t;
                this.start = i;
                this.end = i2;
                this.tag = str;
            }

            public static /* synthetic */ MutableRange copy$default(MutableRange mutableRange, T t, int i, int i2, String str, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    t = mutableRange.item;
                }
                if ((i3 & 2) != 0) {
                    i = mutableRange.start;
                }
                if ((i3 & 4) != 0) {
                    i2 = mutableRange.end;
                }
                if ((i3 & 8) != 0) {
                    str = mutableRange.tag;
                }
                return mutableRange.copy(t, i, i2, str);
            }

            public static /* synthetic */ Range toRange$default(MutableRange mutableRange, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = Integer.MIN_VALUE;
                }
                return mutableRange.toRange(i);
            }

            public final T component1() {
                return this.item;
            }

            public final int component2() {
                return this.start;
            }

            public final int component3() {
                return this.end;
            }

            public final String component4() {
                return this.tag;
            }

            public final MutableRange<T> copy(T t, int i, int i2, String str) {
                C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
                return new MutableRange<>(t, i, i2, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MutableRange)) {
                    return false;
                }
                MutableRange mutableRange = (MutableRange) obj;
                if (C12775o.m28634d(this.item, mutableRange.item) && this.start == mutableRange.start && this.end == mutableRange.end && C12775o.m28634d(this.tag, mutableRange.tag)) {
                    return true;
                }
                return false;
            }

            public final int getEnd() {
                return this.end;
            }

            public final T getItem() {
                return this.item;
            }

            public final int getStart() {
                return this.start;
            }

            public final String getTag() {
                return this.tag;
            }

            public int hashCode() {
                int i;
                T t = this.item;
                if (t == null) {
                    i = 0;
                } else {
                    i = t.hashCode();
                }
                return (((((i * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
            }

            public final void setEnd(int i) {
                this.end = i;
            }

            public final Range<T> toRange(int i) {
                boolean z;
                int i2 = this.end;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (i != Integer.MIN_VALUE) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return new Range<>(this.item, this.start, i, this.tag);
                }
                throw new IllegalStateException("Item.end should be set first".toString());
            }

            public String toString() {
                return "MutableRange(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ MutableRange(Object obj, int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(obj, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, (i3 & 8) != 0 ? "" : str);
            }
        }

        public final void pop(int i) {
            if (i < this.styleStack.size()) {
                while (this.styleStack.size() - 1 >= i) {
                    pop();
                }
                return;
            }
            throw new IllegalStateException((i + " should be less than " + this.styleStack.size()).toString());
        }

        public final int pushStyle(ParagraphStyle paragraphStyle) {
            C12775o.m28639i(paragraphStyle, "style");
            MutableRange mutableRange = new MutableRange(paragraphStyle, this.text.length(), 0, (String) null, 12, (DefaultConstructorMarker) null);
            this.styleStack.add(mutableRange);
            this.paragraphStyles.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public Builder append(CharSequence charSequence) {
            if (charSequence instanceof AnnotatedString) {
                append((AnnotatedString) charSequence);
            } else {
                this.text.append(charSequence);
            }
            return this;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Builder(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 16 : i);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Builder(String str) {
            this(0, 1, (DefaultConstructorMarker) null);
            C12775o.m28639i(str, "text");
            append(str);
        }

        public Builder append(CharSequence charSequence, int i, int i2) {
            if (charSequence instanceof AnnotatedString) {
                append((AnnotatedString) charSequence, i, i2);
            } else {
                this.text.append(charSequence, i, i2);
            }
            return this;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Builder(AnnotatedString annotatedString) {
            this(0, 1, (DefaultConstructorMarker) null);
            C12775o.m28639i(annotatedString, "text");
            append(annotatedString);
        }

        public Builder append(char c) {
            this.text.append(c);
            return this;
        }

        public final void append(AnnotatedString annotatedString) {
            C12775o.m28639i(annotatedString, "text");
            int length = this.text.length();
            this.text.append(annotatedString.getText());
            List<Range<SpanStyle>> spanStylesOrNull$ui_text_release = annotatedString.getSpanStylesOrNull$ui_text_release();
            if (spanStylesOrNull$ui_text_release != null) {
                int size = spanStylesOrNull$ui_text_release.size();
                for (int i = 0; i < size; i++) {
                    Range range = spanStylesOrNull$ui_text_release.get(i);
                    addStyle((SpanStyle) range.getItem(), range.getStart() + length, range.getEnd() + length);
                }
            }
            List<Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release();
            if (paragraphStylesOrNull$ui_text_release != null) {
                int size2 = paragraphStylesOrNull$ui_text_release.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Range range2 = paragraphStylesOrNull$ui_text_release.get(i2);
                    addStyle((ParagraphStyle) range2.getItem(), range2.getStart() + length, range2.getEnd() + length);
                }
            }
            List<Range<? extends Object>> annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release();
            if (annotations$ui_text_release != null) {
                int size3 = annotations$ui_text_release.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    Range range3 = annotations$ui_text_release.get(i3);
                    this.annotations.add(new MutableRange(range3.getItem(), range3.getStart() + length, range3.getEnd() + length, range3.getTag()));
                }
            }
        }

        public final void append(AnnotatedString annotatedString, int i, int i2) {
            C12775o.m28639i(annotatedString, "text");
            int length = this.text.length();
            this.text.append(annotatedString.getText(), i, i2);
            List access$getLocalSpanStyles = AnnotatedStringKt.getLocalSpanStyles(annotatedString, i, i2);
            if (access$getLocalSpanStyles != null) {
                int size = access$getLocalSpanStyles.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Range range = (Range) access$getLocalSpanStyles.get(i3);
                    addStyle((SpanStyle) range.getItem(), range.getStart() + length, range.getEnd() + length);
                }
            }
            List access$getLocalParagraphStyles = AnnotatedStringKt.getLocalParagraphStyles(annotatedString, i, i2);
            if (access$getLocalParagraphStyles != null) {
                int size2 = access$getLocalParagraphStyles.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Range range2 = (Range) access$getLocalParagraphStyles.get(i4);
                    addStyle((ParagraphStyle) range2.getItem(), range2.getStart() + length, range2.getEnd() + length);
                }
            }
            List access$getLocalAnnotations = AnnotatedStringKt.getLocalAnnotations(annotatedString, i, i2);
            if (access$getLocalAnnotations != null) {
                int size3 = access$getLocalAnnotations.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    Range range3 = (Range) access$getLocalAnnotations.get(i5);
                    this.annotations.add(new MutableRange(range3.getItem(), range3.getStart() + length, range3.getEnd() + length, range3.getTag()));
                }
            }
        }
    }

    public AnnotatedString(String str, List<Range<SpanStyle>> list, List<Range<ParagraphStyle>> list2, List<? extends Range<? extends Object>> list3) {
        List v0;
        C12775o.m28639i(str, "text");
        this.text = str;
        this.spanStylesOrNull = list;
        this.paragraphStylesOrNull = list2;
        this.annotations = list3;
        if (list2 != null && (v0 = C12686e0.m28243v0(list2, new AnnotatedString$special$$inlined$sortedBy$1())) != null) {
            int size = v0.size();
            int i = -1;
            int i2 = 0;
            while (i2 < size) {
                Range range = (Range) v0.get(i2);
                boolean z = true;
                if (range.getStart() >= i) {
                    if (range.getEnd() > this.text.length() ? false : z) {
                        i = range.getEnd();
                        i2++;
                    } else {
                        throw new IllegalArgumentException(("ParagraphStyle range [" + range.getStart() + ", " + range.getEnd() + ") is out of boundary").toString());
                    }
                } else {
                    throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
                }
            }
        }
    }

    public final /* bridge */ char charAt(int i) {
        return get(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnotatedString)) {
            return false;
        }
        AnnotatedString annotatedString = (AnnotatedString) obj;
        if (C12775o.m28634d(this.text, annotatedString.text) && C12775o.m28634d(this.spanStylesOrNull, annotatedString.spanStylesOrNull) && C12775o.m28634d(this.paragraphStylesOrNull, annotatedString.paragraphStylesOrNull) && C12775o.m28634d(this.annotations, annotatedString.annotations)) {
            return true;
        }
        return false;
    }

    public char get(int i) {
        return this.text.charAt(i);
    }

    public final List<Range<? extends Object>> getAnnotations$ui_text_release() {
        return this.annotations;
    }

    public int getLength() {
        return this.text.length();
    }

    public final List<Range<ParagraphStyle>> getParagraphStyles() {
        List<Range<ParagraphStyle>> list = this.paragraphStylesOrNull;
        if (list == null) {
            return C12726w.m28524k();
        }
        return list;
    }

    public final List<Range<ParagraphStyle>> getParagraphStylesOrNull$ui_text_release() {
        return this.paragraphStylesOrNull;
    }

    public final List<Range<SpanStyle>> getSpanStyles() {
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        if (list == null) {
            return C12726w.m28524k();
        }
        return list;
    }

    public final List<Range<SpanStyle>> getSpanStylesOrNull$ui_text_release() {
        return this.spanStylesOrNull;
    }

    public final List<Range<String>> getStringAnnotations(String str, int i, int i2) {
        List<Range<String>> list;
        C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
        List<Range<? extends Object>> list2 = this.annotations;
        if (list2 != null) {
            list = new ArrayList<>(list2.size());
            int size = list2.size();
            for (int i3 = 0; i3 < size; i3++) {
                Range<? extends Object> range = list2.get(i3);
                Range range2 = range;
                if ((range2.getItem() instanceof String) && C12775o.m28634d(str, range2.getTag()) && AnnotatedStringKt.intersect(i, i2, range2.getStart(), range2.getEnd())) {
                    list.add(range);
                }
            }
        } else {
            list = C12726w.m28524k();
        }
        C12775o.m28637g(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return list;
    }

    public final String getText() {
        return this.text;
    }

    public final List<Range<TtsAnnotation>> getTtsAnnotations(int i, int i2) {
        List<Range<TtsAnnotation>> list;
        boolean z;
        List<Range<? extends Object>> list2 = this.annotations;
        if (list2 != null) {
            list = new ArrayList<>(list2.size());
            int size = list2.size();
            for (int i3 = 0; i3 < size; i3++) {
                Range<? extends Object> range = list2.get(i3);
                Range range2 = range;
                if (!(range2.getItem() instanceof TtsAnnotation) || !AnnotatedStringKt.intersect(i, i2, range2.getStart(), range2.getEnd())) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    list.add(range);
                }
            }
        } else {
            list = C12726w.m28524k();
        }
        C12775o.m28637g(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return list;
    }

    @ExperimentalTextApi
    public final List<Range<UrlAnnotation>> getUrlAnnotations(int i, int i2) {
        List<Range<UrlAnnotation>> list;
        boolean z;
        List<Range<? extends Object>> list2 = this.annotations;
        if (list2 != null) {
            list = new ArrayList<>(list2.size());
            int size = list2.size();
            for (int i3 = 0; i3 < size; i3++) {
                Range<? extends Object> range = list2.get(i3);
                Range range2 = range;
                if (!(range2.getItem() instanceof UrlAnnotation) || !AnnotatedStringKt.intersect(i, i2, range2.getStart(), range2.getEnd())) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    list.add(range);
                }
            }
        } else {
            list = C12726w.m28524k();
        }
        C12775o.m28637g(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return list;
    }

    public final boolean hasStringAnnotations(String str, int i, int i2) {
        boolean z;
        C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
        List<Range<? extends Object>> list = this.annotations;
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Range range = list.get(i3);
            if (!(range.getItem() instanceof String) || !C12775o.m28634d(str, range.getTag()) || !AnnotatedStringKt.intersect(i, i2, range.getStart(), range.getEnd())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = this.text.hashCode() * 31;
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        int i3 = 0;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        List<Range<ParagraphStyle>> list2 = this.paragraphStylesOrNull;
        if (list2 != null) {
            i2 = list2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        List<Range<? extends Object>> list3 = this.annotations;
        if (list3 != null) {
            i3 = list3.hashCode();
        }
        return i5 + i3;
    }

    public final /* bridge */ int length() {
        return getLength();
    }

    @Stable
    public final AnnotatedString plus(AnnotatedString annotatedString) {
        C12775o.m28639i(annotatedString, "other");
        Builder builder = new Builder(this);
        builder.append(annotatedString);
        return builder.toAnnotatedString();
    }

    /* renamed from: subSequence-5zc-tL8  reason: not valid java name */
    public final AnnotatedString m37847subSequence5zctL8(long j) {
        return subSequence(TextRange.m37973getMinimpl(j), TextRange.m37972getMaximpl(j));
    }

    public String toString() {
        return this.text;
    }

    public AnnotatedString subSequence(int i, int i2) {
        if (!(i <= i2)) {
            throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + ')').toString());
        } else if (i == 0 && i2 == this.text.length()) {
            return this;
        } else {
            String substring = this.text.substring(i, i2);
            C12775o.m28638h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new AnnotatedString(substring, AnnotatedStringKt.filterRanges(this.spanStylesOrNull, i, i2), AnnotatedStringKt.filterRanges(this.paragraphStylesOrNull, i, i2), AnnotatedStringKt.filterRanges(this.annotations, i, i2));
        }
    }

    @Immutable
    @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Range\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1126:1\n1#2:1127\n*E\n"})
    /* renamed from: androidx.compose.ui.text.AnnotatedString$Range */
    /* compiled from: AnnotatedString.kt */
    public static final class Range<T> {
        public static final int $stable = 0;
        private final int end;
        private final T item;
        private final int start;
        private final String tag;

        public Range(T t, int i, int i2, String str) {
            C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
            this.item = t;
            this.start = i;
            this.end = i2;
            this.tag = str;
            if (!(i <= i2)) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        public static /* synthetic */ Range copy$default(Range range, T t, int i, int i2, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                t = range.item;
            }
            if ((i3 & 2) != 0) {
                i = range.start;
            }
            if ((i3 & 4) != 0) {
                i2 = range.end;
            }
            if ((i3 & 8) != 0) {
                str = range.tag;
            }
            return range.copy(t, i, i2, str);
        }

        public final T component1() {
            return this.item;
        }

        public final int component2() {
            return this.start;
        }

        public final int component3() {
            return this.end;
        }

        public final String component4() {
            return this.tag;
        }

        public final Range<T> copy(T t, int i, int i2, String str) {
            C12775o.m28639i(str, APIResourceDescriptors.RESOURCE_TYPE_TAG);
            return new Range<>(t, i, i2, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Range)) {
                return false;
            }
            Range range = (Range) obj;
            if (C12775o.m28634d(this.item, range.item) && this.start == range.start && this.end == range.end && C12775o.m28634d(this.tag, range.tag)) {
                return true;
            }
            return false;
        }

        public final int getEnd() {
            return this.end;
        }

        public final T getItem() {
            return this.item;
        }

        public final int getStart() {
            return this.start;
        }

        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            int i;
            T t = this.item;
            if (t == null) {
                i = 0;
            } else {
                i = t.hashCode();
            }
            return (((((i * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
        }

        public String toString() {
            return "Range(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
        }

        public Range(T t, int i, int i2) {
            this(t, i, i2, "");
        }
    }

    public final List<Range<String>> getStringAnnotations(int i, int i2) {
        List<Range<String>> list;
        List<Range<? extends Object>> list2 = this.annotations;
        if (list2 != null) {
            list = new ArrayList<>(list2.size());
            int size = list2.size();
            for (int i3 = 0; i3 < size; i3++) {
                Range<? extends Object> range = list2.get(i3);
                Range range2 = range;
                if ((range2.getItem() instanceof String) && AnnotatedStringKt.intersect(i, i2, range2.getStart(), range2.getEnd())) {
                    list.add(range);
                }
            }
        } else {
            list = C12726w.m28524k();
        }
        C12775o.m28637g(list, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnnotatedString(String str, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnnotatedString(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? C12726w.m28524k() : list, (i & 4) != 0 ? C12726w.m28524k() : list2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnnotatedString(java.lang.String r3, java.util.List<androidx.compose.p002ui.text.AnnotatedString.Range<androidx.compose.p002ui.text.SpanStyle>> r4, java.util.List<androidx.compose.p002ui.text.AnnotatedString.Range<androidx.compose.p002ui.text.ParagraphStyle>> r5) {
        /*
            r2 = this;
            java.lang.String r0 = "text"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            java.lang.String r0 = "spanStyles"
            kotlin.jvm.internal.C12775o.m28639i(r4, r0)
            java.lang.String r0 = "paragraphStyles"
            kotlin.jvm.internal.C12775o.m28639i(r5, r0)
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0019
            r4 = r1
        L_0x0019:
            java.util.List r4 = (java.util.List) r4
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0024
            r5 = r1
        L_0x0024:
            java.util.List r5 = (java.util.List) r5
            r2.<init>(r3, r4, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.text.AnnotatedString.<init>(java.lang.String, java.util.List, java.util.List):void");
    }
}
