package androidx.compose.p002ui.platform;

import android.content.res.Configuration;
import androidx.annotation.RestrictTo;
import androidx.compose.p002ui.InternalComposeUiApi;
import androidx.compose.p002ui.text.input.PlatformTextInputService;
import androidx.compose.p002ui.text.input.TextInputService;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,1941:1\n42#2,2:1942\n42#2,2:1944\n42#2,2:1946\n42#2,2:1948\n42#2,2:1950\n42#2,2:1952\n42#2,2:1954\n42#2,2:1956\n42#2,2:1958\n42#2,2:1960\n42#2,2:1962\n42#2,2:1964\n42#2,2:1966\n42#2,2:1968\n42#2,2:1970\n42#2,2:1972\n39#2:1974\n39#2:1975\n39#2:1976\n39#2:1977\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n*L\n1838#1:1942,2\n1839#1:1944,2\n1840#1:1946,2\n1841#1:1948,2\n1842#1:1950,2\n1843#1:1952,2\n1844#1:1954,2\n1845#1:1956,2\n1846#1:1958,2\n1847#1:1960,2\n1848#1:1962,2\n1849#1:1964,2\n1850#1:1966,2\n1851#1:1968,2\n1852#1:1970,2\n1853#1:1972,2\n1858#1:1974\n1859#1:1975\n1860#1:1976\n1861#1:1977\n*E\n"})
/* renamed from: androidx.compose.ui.platform.AndroidComposeView_androidKt */
/* compiled from: AndroidComposeView.android.kt */
public final class AndroidComposeView_androidKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private static Function1<? super PlatformTextInputService, ? extends TextInputService> textInputServiceFactory = AndroidComposeView_androidKt$textInputServiceFactory$1.INSTANCE;

    /* renamed from: dot-p89u6pk  reason: not valid java name */
    private static final float m37711dotp89u6pk(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 0] * fArr2[0 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 3] * fArr2[12 + i2]);
    }

    public static final LayoutDirection getLocaleLayoutDirection(Configuration configuration) {
        C12775o.m28639i(configuration, "<this>");
        return layoutDirectionFromInt(configuration.getLayoutDirection());
    }

    public static final Function1<PlatformTextInputService, TextInputService> getTextInputServiceFactory() {
        return textInputServiceFactory;
    }

    /* access modifiers changed from: private */
    public static final LayoutDirection layoutDirectionFromInt(int i) {
        if (i == 0) {
            return LayoutDirection.Ltr;
        }
        if (i != 1) {
            return LayoutDirection.Ltr;
        }
        return LayoutDirection.Rtl;
    }

    /* access modifiers changed from: private */
    /* renamed from: preTransform-JiSxe2E  reason: not valid java name */
    public static final void m37712preTransformJiSxe2E(float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float r3 = m37711dotp89u6pk(fArr4, 0, fArr3, 0);
        float r5 = m37711dotp89u6pk(fArr4, 0, fArr3, 1);
        float r7 = m37711dotp89u6pk(fArr4, 0, fArr3, 2);
        float r9 = m37711dotp89u6pk(fArr4, 0, fArr3, 3);
        float r10 = m37711dotp89u6pk(fArr4, 1, fArr3, 0);
        float r11 = m37711dotp89u6pk(fArr4, 1, fArr3, 1);
        float r12 = m37711dotp89u6pk(fArr4, 1, fArr3, 2);
        float r13 = m37711dotp89u6pk(fArr4, 1, fArr3, 3);
        float r14 = m37711dotp89u6pk(fArr4, 2, fArr3, 0);
        float r15 = m37711dotp89u6pk(fArr4, 2, fArr3, 1);
        float r16 = m37711dotp89u6pk(fArr4, 2, fArr3, 2);
        float r17 = m37711dotp89u6pk(fArr4, 2, fArr3, 3);
        float r18 = m37711dotp89u6pk(fArr4, 3, fArr3, 0);
        float r19 = m37711dotp89u6pk(fArr4, 3, fArr3, 1);
        float r20 = m37711dotp89u6pk(fArr4, 3, fArr3, 2);
        float r1 = m37711dotp89u6pk(fArr4, 3, fArr3, 3);
        fArr3[0] = r3;
        fArr3[1] = r5;
        fArr3[2] = r7;
        fArr3[3] = r9;
        fArr3[4] = r10;
        fArr3[5] = r11;
        fArr3[6] = r12;
        fArr3[7] = r13;
        fArr3[8] = r14;
        fArr3[9] = r15;
        fArr3[10] = r16;
        fArr3[11] = r17;
        fArr3[12] = r18;
        fArr3[13] = r19;
        fArr3[14] = r20;
        fArr3[15] = r1;
    }

    public static final void setTextInputServiceFactory(Function1<? super PlatformTextInputService, ? extends TextInputService> function1) {
        C12775o.m28639i(function1, "<set-?>");
        textInputServiceFactory = function1;
    }

    @InternalComposeUiApi
    public static /* synthetic */ void getTextInputServiceFactory$annotations() {
    }
}
