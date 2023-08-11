package p414qb;

import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.text.AnnotatedString;
import androidx.compose.p002ui.text.SpanStyle;
import androidx.compose.p002ui.text.font.FontFamily;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.intl.LocaleList;
import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import androidx.compose.p002ui.unit.TextUnitKt;
import java.util.ArrayList;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11921v;
import p367jc.C12612a;
import p408pb.C13196b;
import p420rb.C13277a;

/* renamed from: qb.a */
/* compiled from: HtmlTextTagExtensions.kt */
public final class C13234a {

    /* renamed from: qb.a$a */
    /* compiled from: HtmlTextTagExtensions.kt */
    public /* synthetic */ class C13235a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21058a;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|25) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                jc.b[] r0 = p367jc.C12614b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                jc.b r1 = p367jc.C12614b.H1     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                jc.b r1 = p367jc.C12614b.H2     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                jc.b r1 = p367jc.C12614b.H3     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                jc.b r1 = p367jc.C12614b.H4     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                jc.b r1 = p367jc.C12614b.H5     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                jc.b r1 = p367jc.C12614b.H6     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                jc.b r1 = p367jc.C12614b.Bold     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                jc.b r1 = p367jc.C12614b.Span     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                jc.b r1 = p367jc.C12614b.EmphasizedText     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                jc.b r1 = p367jc.C12614b.Link     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                jc.b r1 = p367jc.C12614b.PlainText     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                f21058a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p414qb.C13234a.C13235a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static final AnnotatedString m30065a(C12612a aVar) {
        TextDecoration textDecoration;
        C12775o.m28639i(aVar, "<this>");
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, (DefaultConstructorMarker) null);
        switch (C13235a.f21058a[aVar.mo50341c().ordinal()]) {
            case 1:
                int pushStyle = builder.pushStyle(new SpanStyle(0, TextUnitKt.getSp(26), FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, 16377, (DefaultConstructorMarker) null));
                try {
                    builder.append(aVar.mo50342d());
                    C11921v vVar = C11921v.f18618a;
                    break;
                } finally {
                    builder.pop(pushStyle);
                }
            case 2:
                int pushStyle2 = builder.pushStyle(new SpanStyle(0, TextUnitKt.getSp(22), FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, 16377, (DefaultConstructorMarker) null));
                try {
                    builder.append(aVar.mo50342d());
                    C11921v vVar2 = C11921v.f18618a;
                    break;
                } finally {
                    builder.pop(pushStyle2);
                }
            case 3:
                int pushStyle3 = builder.pushStyle(new SpanStyle(0, TextUnitKt.getSp(20), FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, 16377, (DefaultConstructorMarker) null));
                try {
                    builder.append(aVar.mo50342d());
                    C11921v vVar3 = C11921v.f18618a;
                    break;
                } finally {
                    builder.pop(pushStyle3);
                }
            case 4:
                int pushStyle4 = builder.pushStyle(new SpanStyle(0, TextUnitKt.getSp(18), FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, 16377, (DefaultConstructorMarker) null));
                try {
                    builder.append(aVar.mo50342d());
                    C11921v vVar4 = C11921v.f18618a;
                    break;
                } finally {
                    builder.pop(pushStyle4);
                }
            case 5:
                int pushStyle5 = builder.pushStyle(new SpanStyle(0, TextUnitKt.getSp(16), FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, 16377, (DefaultConstructorMarker) null));
                try {
                    builder.append(aVar.mo50342d());
                    C11921v vVar5 = C11921v.f18618a;
                    break;
                } finally {
                    builder.pop(pushStyle5);
                }
            case 6:
                int pushStyle6 = builder.pushStyle(new SpanStyle(0, TextUnitKt.getSp(16), FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, 16377, (DefaultConstructorMarker) null));
                try {
                    builder.append(aVar.mo50342d());
                    C11921v vVar6 = C11921v.f18618a;
                    break;
                } finally {
                    builder.pop(pushStyle6);
                }
            case 7:
                int pushStyle7 = builder.pushStyle(new SpanStyle(0, 0, FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, 16379, (DefaultConstructorMarker) null));
                try {
                    builder.append(aVar.mo50342d());
                    C11921v vVar7 = C11921v.f18618a;
                    break;
                } finally {
                    builder.pop(pushStyle7);
                }
            case 8:
                if (C13196b.m29948a(aVar)) {
                    textDecoration = TextDecoration.Companion.getUnderline();
                } else {
                    textDecoration = TextDecoration.Companion.getNone();
                }
                int pushStyle8 = builder.pushStyle(new SpanStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, textDecoration, (Shadow) null, 12287, (DefaultConstructorMarker) null));
                try {
                    builder.append(aVar.mo50342d());
                    C11921v vVar8 = C11921v.f18618a;
                    break;
                } finally {
                    builder.pop(pushStyle8);
                }
            case 9:
                int pushStyle9 = builder.pushStyle(new SpanStyle(0, 0, (FontWeight) null, FontStyle.m38060boximpl(FontStyle.Companion.m38067getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, 16375, (DefaultConstructorMarker) null));
                try {
                    builder.append(aVar.mo50342d());
                    C11921v vVar9 = C11921v.f18618a;
                    break;
                } finally {
                    builder.pop(pushStyle9);
                }
            case 10:
                builder.append(aVar.mo50342d());
                break;
            case 11:
                builder.append(aVar.mo50342d());
                break;
        }
        ArrayList<C12612a> arrayList = new ArrayList<>();
        for (Object next : aVar.mo50340b()) {
            if (C13277a.m30153b((C12612a) next)) {
                arrayList.add(next);
            }
        }
        for (C12612a a : arrayList) {
            builder.append(m30065a(a));
        }
        return builder.toAnnotatedString();
    }
}
