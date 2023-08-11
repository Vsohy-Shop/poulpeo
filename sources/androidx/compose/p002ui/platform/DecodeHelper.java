package androidx.compose.p002ui.platform;

import android.os.Parcel;
import android.util.Base64;
import androidx.compose.p002ui.geometry.OffsetKt;
import androidx.compose.p002ui.graphics.Color;
import androidx.compose.p002ui.graphics.Shadow;
import androidx.compose.p002ui.text.font.FontStyle;
import androidx.compose.p002ui.text.font.FontSynthesis;
import androidx.compose.p002ui.text.font.FontWeight;
import androidx.compose.p002ui.text.style.BaselineShift;
import androidx.compose.p002ui.text.style.TextDecoration;
import androidx.compose.p002ui.text.style.TextGeometricTransform;
import androidx.compose.p002ui.unit.TextUnit;
import androidx.compose.p002ui.unit.TextUnitKt;
import androidx.compose.p002ui.unit.TextUnitType;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p336ef.C11916s;

/* renamed from: androidx.compose.ui.platform.DecodeHelper */
/* compiled from: AndroidClipboardManager.android.kt */
public final class DecodeHelper {
    private final Parcel parcel;

    public DecodeHelper(String str) {
        C12775o.m28639i(str, TypedValues.Custom.S_STRING);
        Parcel obtain = Parcel.obtain();
        C12775o.m28638h(obtain, "obtain()");
        this.parcel = obtain;
        byte[] decode = Base64.decode(str, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    private final int dataAvailable() {
        return this.parcel.dataAvail();
    }

    /* renamed from: decodeBaselineShift-y9eOQZs  reason: not valid java name */
    private final float m37720decodeBaselineShifty9eOQZs() {
        return BaselineShift.m38237constructorimpl(decodeFloat());
    }

    private final byte decodeByte() {
        return this.parcel.readByte();
    }

    private final float decodeFloat() {
        return this.parcel.readFloat();
    }

    private final int decodeInt() {
        return this.parcel.readInt();
    }

    private final Shadow decodeShadow() {
        return new Shadow(m37722decodeColor0d7_KjU(), OffsetKt.Offset(decodeFloat(), decodeFloat()), decodeFloat(), (DefaultConstructorMarker) null);
    }

    private final String decodeString() {
        return this.parcel.readString();
    }

    private final TextDecoration decodeTextDecoration() {
        boolean z;
        boolean z2;
        int decodeInt = decodeInt();
        TextDecoration.Companion companion = TextDecoration.Companion;
        if ((companion.getLineThrough().getMask() & decodeInt) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((decodeInt & companion.getUnderline().getMask()) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            return companion.combine(C12726w.m28527n(companion.getLineThrough(), companion.getUnderline()));
        } else if (z) {
            return companion.getLineThrough();
        } else {
            if (z2) {
                return companion.getUnderline();
            }
            return companion.getNone();
        }
    }

    private final TextGeometricTransform decodeTextGeometricTransform() {
        return new TextGeometricTransform(decodeFloat(), decodeFloat());
    }

    /* renamed from: decodeULong-s-VKNKU  reason: not valid java name */
    private final long m37721decodeULongsVKNKU() {
        return C11916s.m25709b(this.parcel.readLong());
    }

    /* renamed from: decodeColor-0d7_KjU  reason: not valid java name */
    public final long m37722decodeColor0d7_KjU() {
        return Color.m35667constructorimpl(m37721decodeULongsVKNKU());
    }

    /* renamed from: decodeFontStyle-_-LCdwA  reason: not valid java name */
    public final int m37723decodeFontStyle_LCdwA() {
        byte decodeByte = decodeByte();
        if (decodeByte == 0) {
            return FontStyle.Companion.m38068getNormal_LCdwA();
        }
        if (decodeByte == 1) {
            return FontStyle.Companion.m38067getItalic_LCdwA();
        }
        return FontStyle.Companion.m38068getNormal_LCdwA();
    }

    /* renamed from: decodeFontSynthesis-GVVA2EU  reason: not valid java name */
    public final int m37724decodeFontSynthesisGVVA2EU() {
        byte decodeByte = decodeByte();
        if (decodeByte == 0) {
            return FontSynthesis.Companion.m38079getNoneGVVA2EU();
        }
        if (decodeByte == 1) {
            return FontSynthesis.Companion.m38078getAllGVVA2EU();
        }
        if (decodeByte == 3) {
            return FontSynthesis.Companion.m38080getStyleGVVA2EU();
        }
        if (decodeByte == 2) {
            return FontSynthesis.Companion.m38081getWeightGVVA2EU();
        }
        return FontSynthesis.Companion.m38079getNoneGVVA2EU();
    }

    public final FontWeight decodeFontWeight() {
        return new FontWeight(decodeInt());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0112, code lost:
        r4 = r21;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.p002ui.text.SpanStyle decodeSpanStyle() {
        /*
            r22 = this;
            androidx.compose.ui.platform.MutableSpanStyle r15 = new androidx.compose.ui.platform.MutableSpanStyle
            r0 = r15
            r1 = 0
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r21 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 16383(0x3fff, float:2.2957E-41)
            r20 = 0
            r0.<init>(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20)
            r0 = r22
        L_0x0024:
            android.os.Parcel r1 = r0.parcel
            int r1 = r1.dataAvail()
            r2 = 1
            if (r1 <= r2) goto L_0x0112
            byte r1 = r22.decodeByte()
            r3 = 8
            if (r1 != r2) goto L_0x0045
            int r1 = r22.dataAvailable()
            if (r1 < r3) goto L_0x0112
            long r1 = r22.m37722decodeColor0d7_KjU()
            r4 = r21
            r4.m37752setColor8_81llA(r1)
            goto L_0x0024
        L_0x0045:
            r4 = r21
            r5 = 2
            r6 = 5
            if (r1 != r5) goto L_0x005b
            int r1 = r22.dataAvailable()
            if (r1 < r6) goto L_0x0114
            long r1 = r22.m37725decodeTextUnitXSAIIZE()
            r4.m37753setFontSizeR2X_6o(r1)
        L_0x0058:
            r21 = r4
            goto L_0x0024
        L_0x005b:
            r5 = 3
            r7 = 4
            if (r1 != r5) goto L_0x006d
            int r1 = r22.dataAvailable()
            if (r1 < r7) goto L_0x0114
            androidx.compose.ui.text.font.FontWeight r1 = r22.decodeFontWeight()
            r4.setFontWeight(r1)
            goto L_0x0058
        L_0x006d:
            if (r1 != r7) goto L_0x0081
            int r1 = r22.dataAvailable()
            if (r1 < r2) goto L_0x0114
            int r1 = r22.m37723decodeFontStyle_LCdwA()
            androidx.compose.ui.text.font.FontStyle r1 = androidx.compose.p002ui.text.font.FontStyle.m38060boximpl(r1)
            r4.m37754setFontStylemLjRB2g(r1)
            goto L_0x0058
        L_0x0081:
            if (r1 != r6) goto L_0x0095
            int r1 = r22.dataAvailable()
            if (r1 < r2) goto L_0x0114
            int r1 = r22.m37724decodeFontSynthesisGVVA2EU()
            androidx.compose.ui.text.font.FontSynthesis r1 = androidx.compose.p002ui.text.font.FontSynthesis.m38069boximpl(r1)
            r4.m37755setFontSynthesistDdu0R4(r1)
            goto L_0x0058
        L_0x0095:
            r2 = 6
            if (r1 != r2) goto L_0x00a0
            java.lang.String r1 = r22.decodeString()
            r4.setFontFeatureSettings(r1)
            goto L_0x0058
        L_0x00a0:
            r2 = 7
            if (r1 != r2) goto L_0x00b1
            int r1 = r22.dataAvailable()
            if (r1 < r6) goto L_0x0114
            long r1 = r22.m37725decodeTextUnitXSAIIZE()
            r4.m37756setLetterSpacingR2X_6o(r1)
            goto L_0x0058
        L_0x00b1:
            if (r1 != r3) goto L_0x00c5
            int r1 = r22.dataAvailable()
            if (r1 < r7) goto L_0x0114
            float r1 = r22.m37720decodeBaselineShifty9eOQZs()
            androidx.compose.ui.text.style.BaselineShift r1 = androidx.compose.p002ui.text.style.BaselineShift.m38236boximpl(r1)
            r4.m37751setBaselineShift_isdbwI(r1)
            goto L_0x0058
        L_0x00c5:
            r2 = 9
            if (r1 != r2) goto L_0x00d7
            int r1 = r22.dataAvailable()
            if (r1 < r3) goto L_0x0114
            androidx.compose.ui.text.style.TextGeometricTransform r1 = r22.decodeTextGeometricTransform()
            r4.setTextGeometricTransform(r1)
            goto L_0x0058
        L_0x00d7:
            r2 = 10
            if (r1 != r2) goto L_0x00ea
            int r1 = r22.dataAvailable()
            if (r1 < r3) goto L_0x0114
            long r1 = r22.m37722decodeColor0d7_KjU()
            r4.m37750setBackground8_81llA(r1)
            goto L_0x0058
        L_0x00ea:
            r2 = 11
            if (r1 != r2) goto L_0x00fd
            int r1 = r22.dataAvailable()
            if (r1 < r7) goto L_0x0114
            androidx.compose.ui.text.style.TextDecoration r1 = r22.decodeTextDecoration()
            r4.setTextDecoration(r1)
            goto L_0x0058
        L_0x00fd:
            r2 = 12
            if (r1 != r2) goto L_0x0058
            int r1 = r22.dataAvailable()
            r2 = 20
            if (r1 < r2) goto L_0x0114
            androidx.compose.ui.graphics.Shadow r1 = r22.decodeShadow()
            r4.setShadow(r1)
            goto L_0x0058
        L_0x0112:
            r4 = r21
        L_0x0114:
            androidx.compose.ui.text.SpanStyle r1 = r4.toSpanStyle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.DecodeHelper.decodeSpanStyle():androidx.compose.ui.text.SpanStyle");
    }

    /* renamed from: decodeTextUnit-XSAIIZE  reason: not valid java name */
    public final long m37725decodeTextUnitXSAIIZE() {
        long j;
        byte decodeByte = decodeByte();
        if (decodeByte == 1) {
            j = TextUnitType.Companion.m38682getSpUIouoOA();
        } else if (decodeByte == 2) {
            j = TextUnitType.Companion.m38681getEmUIouoOA();
        } else {
            j = TextUnitType.Companion.m38683getUnspecifiedUIouoOA();
        }
        if (TextUnitType.m38677equalsimpl0(j, TextUnitType.Companion.m38683getUnspecifiedUIouoOA())) {
            return TextUnit.Companion.m38660getUnspecifiedXSAIIZE();
        }
        return TextUnitKt.m38661TextUnitanM5pPY(decodeFloat(), j);
    }
}
