package p115i;

import android.graphics.Paint;
import androidx.exifinterface.media.ExifInterface;
import java.io.InputStream;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.C13130e;

@SourceDebugExtension({"SMAP\nExifUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExifUtils.kt\ncoil/decode/ExifUtils\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n*L\n1#1,132:1\n95#2:133\n95#2:134\n43#2,3:135\n*S KotlinDebug\n*F\n+ 1 ExifUtils.kt\ncoil/decode/ExifUtils\n*L\n65#1:133\n67#1:134\n70#1:135,3\n*E\n"})
/* renamed from: i.m */
/* compiled from: ExifUtils.kt */
public final class C8052m {

    /* renamed from: a */
    public static final C8052m f11300a = new C8052m();

    /* renamed from: b */
    private static final Paint f11301b = new Paint(3);

    private C8052m() {
    }

    /* renamed from: a */
    public final C8048j mo41881a(String str, C13130e eVar, C8051l lVar) {
        if (!C8053n.m15830c(lVar, str)) {
            return C8048j.f11291d;
        }
        ExifInterface exifInterface = new ExifInterface((InputStream) new C8050k(eVar.peek().mo52540r0()));
        return new C8048j(exifInterface.isFlipped(), exifInterface.getRotationDegrees());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0063, code lost:
        if (r5 == false) goto L_0x0065;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Bitmap mo41882b(android.graphics.Bitmap r8, p115i.C8048j r9) {
        /*
            r7 = this;
            boolean r0 = r9.mo41874b()
            if (r0 != 0) goto L_0x000d
            boolean r0 = p115i.C8053n.m15828a(r9)
            if (r0 != 0) goto L_0x000d
            return r8
        L_0x000d:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            int r1 = r8.getWidth()
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            int r3 = r8.getHeight()
            float r3 = (float) r3
            float r3 = r3 / r2
            boolean r2 = r9.mo41874b()
            if (r2 == 0) goto L_0x002d
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.postScale(r2, r4, r1, r3)
        L_0x002d:
            boolean r2 = p115i.C8053n.m15828a(r9)
            if (r2 == 0) goto L_0x003b
            int r2 = r9.mo41873a()
            float r2 = (float) r2
            r0.postRotate(r2, r1, r3)
        L_0x003b:
            android.graphics.RectF r1 = new android.graphics.RectF
            int r2 = r8.getWidth()
            float r2 = (float) r2
            int r3 = r8.getHeight()
            float r3 = (float) r3
            r4 = 0
            r1.<init>(r4, r4, r2, r3)
            r0.mapRect(r1)
            float r2 = r1.left
            int r3 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r3 != 0) goto L_0x0058
            r3 = r5
            goto L_0x0059
        L_0x0058:
            r3 = r6
        L_0x0059:
            if (r3 == 0) goto L_0x0065
            float r3 = r1.top
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r5 = r6
        L_0x0063:
            if (r5 != 0) goto L_0x006c
        L_0x0065:
            float r2 = -r2
            float r1 = r1.top
            float r1 = -r1
            r0.postTranslate(r2, r1)
        L_0x006c:
            boolean r9 = p115i.C8053n.m15829b(r9)
            java.lang.String r1 = "createBitmap(width, height, config)"
            if (r9 == 0) goto L_0x0088
            int r9 = r8.getHeight()
            int r2 = r8.getWidth()
            android.graphics.Bitmap$Config r3 = p259w.C10061a.m21122c(r8)
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r9, r2, r3)
            kotlin.jvm.internal.C12775o.m28638h(r9, r1)
            goto L_0x009b
        L_0x0088:
            int r9 = r8.getWidth()
            int r2 = r8.getHeight()
            android.graphics.Bitmap$Config r3 = p259w.C10061a.m21122c(r8)
            android.graphics.Bitmap r9 = android.graphics.Bitmap.createBitmap(r9, r2, r3)
            kotlin.jvm.internal.C12775o.m28638h(r9, r1)
        L_0x009b:
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r9)
            android.graphics.Paint r2 = f11301b
            r1.drawBitmap(r8, r0, r2)
            r8.recycle()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p115i.C8052m.mo41882b(android.graphics.Bitmap, i.j):android.graphics.Bitmap");
    }
}
