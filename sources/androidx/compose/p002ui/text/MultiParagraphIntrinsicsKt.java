package androidx.compose.p002ui.text;

import androidx.compose.p002ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nMultiParagraphIntrinsics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsicsKt\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,152:1\n35#2,3:153\n38#2,2:160\n40#2:163\n33#3,4:156\n38#3:162\n151#3,5:164\n38#3:169\n156#3:170\n*S KotlinDebug\n*F\n+ 1 MultiParagraphIntrinsics.kt\nandroidx/compose/ui/text/MultiParagraphIntrinsicsKt\n*L\n141#1:153,3\n141#1:160,2\n141#1:163\n141#1:156,4\n141#1:162\n141#1:164,5\n141#1:169\n141#1:170\n*E\n"})
/* renamed from: androidx.compose.ui.text.MultiParagraphIntrinsicsKt */
/* compiled from: MultiParagraphIntrinsics.kt */
public final class MultiParagraphIntrinsicsKt {
    /* access modifiers changed from: private */
    public static final List<AnnotatedString.Range<Placeholder>> getLocalPlaceholders(List<AnnotatedString.Range<Placeholder>> list, int i, int i2) {
        boolean z;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnnotatedString.Range<Placeholder> range = list.get(i3);
            AnnotatedString.Range range2 = range;
            if (AnnotatedStringKt.intersect(i, i2, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i4);
            if (i > range3.getStart() || range3.getEnd() > i2) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList2.add(new AnnotatedString.Range(range3.getItem(), range3.getStart() - i, range3.getEnd() - i));
                i4++;
            } else {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
            }
        }
        return arrayList2;
    }
}
