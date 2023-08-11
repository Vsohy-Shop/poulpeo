package androidx.compose.p002ui.graphics;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.p002ui.graphics.colorspace.ColorSpace;
import androidx.compose.p002ui.graphics.colorspace.ColorSpaces;
import kotlin.jvm.internal.C12775o;

@RequiresApi(26)
/* renamed from: androidx.compose.ui.graphics.Api26Bitmap */
/* compiled from: AndroidImageBitmap.android.kt */
final class Api26Bitmap {
    public static final Api26Bitmap INSTANCE = new Api26Bitmap();

    private Api26Bitmap() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000b, code lost:
        r1 = composeColorSpace$ui_graphics_release(r1);
     */
    @androidx.annotation.DoNotInline
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p002ui.graphics.colorspace.ColorSpace composeColorSpace$ui_graphics_release(android.graphics.Bitmap r1) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C12775o.m28639i(r1, r0)
            android.graphics.ColorSpace r1 = r1.getColorSpace()
            if (r1 == 0) goto L_0x0012
            androidx.compose.ui.graphics.colorspace.ColorSpace r1 = composeColorSpace$ui_graphics_release((android.graphics.ColorSpace) r1)
            if (r1 == 0) goto L_0x0012
            goto L_0x0018
        L_0x0012:
            androidx.compose.ui.graphics.colorspace.ColorSpaces r1 = androidx.compose.p002ui.graphics.colorspace.ColorSpaces.INSTANCE
            androidx.compose.ui.graphics.colorspace.Rgb r1 = r1.getSrgb()
        L_0x0018:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.graphics.Api26Bitmap.composeColorSpace$ui_graphics_release(android.graphics.Bitmap):androidx.compose.ui.graphics.colorspace.ColorSpace");
    }

    @DoNotInline
    /* renamed from: createBitmap-x__-hDU$ui_graphics_release  reason: not valid java name */
    public static final Bitmap m35569createBitmapx__hDU$ui_graphics_release(int i, int i2, int i3, boolean z, ColorSpace colorSpace) {
        C12775o.m28639i(colorSpace, "colorSpace");
        Bitmap a = Bitmap.createBitmap((DisplayMetrics) null, i, i2, AndroidImageBitmap_androidKt.m35532toBitmapConfig1JJdX4A(i3), z, toFrameworkColorSpace$ui_graphics_release(colorSpace));
        C12775o.m28638h(a, "createBitmap(\n          …orkColorSpace()\n        )");
        return a;
    }

    @DoNotInline
    public static final android.graphics.ColorSpace toFrameworkColorSpace$ui_graphics_release(ColorSpace colorSpace) {
        ColorSpace.Named named;
        C12775o.m28639i(colorSpace, "<this>");
        ColorSpaces colorSpaces = ColorSpaces.INSTANCE;
        if (C12775o.m28634d(colorSpace, colorSpaces.getSrgb())) {
            named = ColorSpace.Named.SRGB;
        } else if (C12775o.m28634d(colorSpace, colorSpaces.getAces())) {
            named = ColorSpace.Named.ACES;
        } else if (C12775o.m28634d(colorSpace, colorSpaces.getAcescg())) {
            named = ColorSpace.Named.ACESCG;
        } else if (C12775o.m28634d(colorSpace, colorSpaces.getAdobeRgb())) {
            named = ColorSpace.Named.ADOBE_RGB;
        } else if (C12775o.m28634d(colorSpace, colorSpaces.getBt2020())) {
            named = ColorSpace.Named.BT2020;
        } else if (C12775o.m28634d(colorSpace, colorSpaces.getBt709())) {
            named = ColorSpace.Named.BT709;
        } else if (C12775o.m28634d(colorSpace, colorSpaces.getCieLab())) {
            named = ColorSpace.Named.CIE_LAB;
        } else if (C12775o.m28634d(colorSpace, colorSpaces.getCieXyz())) {
            named = ColorSpace.Named.CIE_XYZ;
        } else if (C12775o.m28634d(colorSpace, colorSpaces.getDciP3())) {
            named = ColorSpace.Named.DCI_P3;
        } else if (C12775o.m28634d(colorSpace, colorSpaces.getDisplayP3())) {
            named = ColorSpace.Named.DISPLAY_P3;
        } else if (C12775o.m28634d(colorSpace, colorSpaces.getExtendedSrgb())) {
            named = ColorSpace.Named.EXTENDED_SRGB;
        } else if (C12775o.m28634d(colorSpace, colorSpaces.getLinearExtendedSrgb())) {
            named = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        } else if (C12775o.m28634d(colorSpace, colorSpaces.getLinearSrgb())) {
            named = ColorSpace.Named.LINEAR_SRGB;
        } else if (C12775o.m28634d(colorSpace, colorSpaces.getNtsc1953())) {
            named = ColorSpace.Named.NTSC_1953;
        } else if (C12775o.m28634d(colorSpace, colorSpaces.getProPhotoRgb())) {
            named = ColorSpace.Named.PRO_PHOTO_RGB;
        } else if (C12775o.m28634d(colorSpace, colorSpaces.getSmpteC())) {
            named = ColorSpace.Named.SMPTE_C;
        } else {
            named = ColorSpace.Named.SRGB;
        }
        android.graphics.ColorSpace a = android.graphics.ColorSpace.get(named);
        C12775o.m28638h(a, "get(frameworkNamedSpace)");
        return a;
    }

    @DoNotInline
    public static final androidx.compose.p002ui.graphics.colorspace.ColorSpace composeColorSpace$ui_graphics_release(android.graphics.ColorSpace colorSpace) {
        C12775o.m28639i(colorSpace, "<this>");
        if (C12775o.m28634d(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.SRGB))) {
            return ColorSpaces.INSTANCE.getSrgb();
        }
        if (C12775o.m28634d(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.ACES))) {
            return ColorSpaces.INSTANCE.getAces();
        }
        if (C12775o.m28634d(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.ACESCG))) {
            return ColorSpaces.INSTANCE.getAcescg();
        }
        if (C12775o.m28634d(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.ADOBE_RGB))) {
            return ColorSpaces.INSTANCE.getAdobeRgb();
        }
        if (C12775o.m28634d(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.BT2020))) {
            return ColorSpaces.INSTANCE.getBt2020();
        }
        if (C12775o.m28634d(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.BT709))) {
            return ColorSpaces.INSTANCE.getBt709();
        }
        if (C12775o.m28634d(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.CIE_LAB))) {
            return ColorSpaces.INSTANCE.getCieLab();
        }
        if (C12775o.m28634d(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.CIE_XYZ))) {
            return ColorSpaces.INSTANCE.getCieXyz();
        }
        if (C12775o.m28634d(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.DCI_P3))) {
            return ColorSpaces.INSTANCE.getDciP3();
        }
        if (C12775o.m28634d(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.DISPLAY_P3))) {
            return ColorSpaces.INSTANCE.getDisplayP3();
        }
        if (C12775o.m28634d(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB))) {
            return ColorSpaces.INSTANCE.getExtendedSrgb();
        }
        if (C12775o.m28634d(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB))) {
            return ColorSpaces.INSTANCE.getLinearExtendedSrgb();
        }
        if (C12775o.m28634d(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.LINEAR_SRGB))) {
            return ColorSpaces.INSTANCE.getLinearSrgb();
        }
        if (C12775o.m28634d(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.NTSC_1953))) {
            return ColorSpaces.INSTANCE.getNtsc1953();
        }
        if (C12775o.m28634d(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB))) {
            return ColorSpaces.INSTANCE.getProPhotoRgb();
        }
        if (C12775o.m28634d(colorSpace, android.graphics.ColorSpace.get(ColorSpace.Named.SMPTE_C))) {
            return ColorSpaces.INSTANCE.getSmpteC();
        }
        return ColorSpaces.INSTANCE.getSrgb();
    }
}
