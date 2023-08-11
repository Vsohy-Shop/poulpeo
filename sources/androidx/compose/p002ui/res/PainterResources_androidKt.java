package androidx.compose.p002ui.res;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import androidx.compose.p002ui.graphics.ImageBitmap;
import androidx.compose.p002ui.graphics.vector.ImageVector;
import androidx.compose.p002ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p002ui.res.ImageVectorCache;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nPainterResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PainterResources.android.kt\nandroidx/compose/ui/res/PainterResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,116:1\n76#2:117\n76#2:135\n25#3:118\n67#3,3:125\n66#3:128\n1114#4,6:119\n1114#4,6:129\n*S KotlinDebug\n*F\n+ 1 PainterResources.android.kt\nandroidx/compose/ui/res/PainterResources_androidKt\n*L\n58#1:117\n88#1:135\n60#1:118\n69#1:125,3\n69#1:128\n60#1:119,6\n69#1:129,6\n*E\n"})
/* renamed from: androidx.compose.ui.res.PainterResources_androidKt */
/* compiled from: PainterResources.android.kt */
public final class PainterResources_androidKt {
    private static final String errorMessage = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG";

    /* access modifiers changed from: private */
    public static final ImageBitmap loadImageBitmapResource(Resources resources, int i) {
        try {
            return ImageResources_androidKt.imageResource(ImageBitmap.Companion, resources, i);
        } catch (Throwable unused) {
            throw new IllegalArgumentException(errorMessage);
        }
    }

    @Composable
    private static final ImageVector loadVectorResource(Resources.Theme theme, Resources resources, int i, int i2, Composer composer, int i3) {
        composer.startReplaceableGroup(21855625);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(21855625, i3, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:81)");
        }
        ImageVectorCache imageVectorCache = (ImageVectorCache) composer.consume(AndroidCompositionLocals_androidKt.getLocalImageVectorCache());
        ImageVectorCache.Key key = new ImageVectorCache.Key(theme, i);
        ImageVectorCache.ImageVectorEntry imageVectorEntry = imageVectorCache.get(key);
        if (imageVectorEntry == null) {
            XmlResourceParser xml = resources.getXml(i);
            C12775o.m28638h(xml, "res.getXml(id)");
            if (C12775o.m28634d(XmlVectorParser_androidKt.seekToStartTag(xml).getName(), "vector")) {
                imageVectorEntry = VectorResources_androidKt.loadVectorResourceInner(theme, resources, xml, i2);
                imageVectorCache.set(key, imageVectorEntry);
            } else {
                throw new IllegalArgumentException(errorMessage);
            }
        }
        ImageVector imageVector = imageVectorEntry.getImageVector();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return imageVector;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: androidx.compose.ui.graphics.ImageBitmap} */
    /* JADX WARNING: type inference failed for: r10v4, types: [androidx.compose.ui.graphics.vector.VectorPainter] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    @androidx.compose.runtime.Composable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final androidx.compose.p002ui.graphics.painter.Painter painterResource(@androidx.annotation.DrawableRes int r10, androidx.compose.runtime.Composer r11, int r12) {
        /*
            r0 = 473971343(0x1c403a8f, float:6.3603156E-22)
            r11.startReplaceableGroup(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r12, r1, r2)
        L_0x0012:
            androidx.compose.runtime.ProvidableCompositionLocal r0 = androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()
            java.lang.Object r0 = r11.consume(r0)
            android.content.Context r0 = (android.content.Context) r0
            r1 = 0
            android.content.res.Resources r3 = androidx.compose.p002ui.res.Resources_androidKt.resources(r11, r1)
            r2 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            r11.startReplaceableGroup(r2)
            java.lang.Object r2 = r11.rememberedValue()
            androidx.compose.runtime.Composer$Companion r4 = androidx.compose.runtime.Composer.Companion
            java.lang.Object r5 = r4.getEmpty()
            if (r2 != r5) goto L_0x003b
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r11.updateRememberedValue(r2)
        L_0x003b:
            r11.endReplaceableGroup()
            android.util.TypedValue r2 = (android.util.TypedValue) r2
            r5 = 1
            r3.getValue(r10, r2, r5)
            java.lang.CharSequence r6 = r2.string
            if (r6 == 0) goto L_0x0053
            r7 = 2
            r8 = 0
            java.lang.String r9 = ".xml"
            boolean r7 = p454wf.C13755w.m31560N(r6, r9, r1, r7, r8)
            if (r7 != r5) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r5 = r1
        L_0x0054:
            if (r5 == 0) goto L_0x007c
            r4 = -738265327(0xffffffffd3fef711, float:-2.19013356E12)
            r11.startReplaceableGroup(r4)
            android.content.res.Resources$Theme r0 = r0.getTheme()
            java.lang.String r4 = "context.theme"
            kotlin.jvm.internal.C12775o.m28638h(r0, r4)
            int r5 = r2.changingConfigurations
            int r12 = r12 << 6
            r12 = r12 & 896(0x380, float:1.256E-42)
            r7 = r12 | 72
            r2 = r0
            r4 = r10
            r6 = r11
            androidx.compose.ui.graphics.vector.ImageVector r10 = loadVectorResource(r2, r3, r4, r5, r6, r7)
            androidx.compose.ui.graphics.vector.VectorPainter r10 = androidx.compose.p002ui.graphics.vector.VectorPainterKt.rememberVectorPainter(r10, r11, r1)
            r11.endReplaceableGroup()
            goto L_0x00c6
        L_0x007c:
            r12 = -738265172(0xffffffffd3fef7ac, float:-2.19015388E12)
            r11.startReplaceableGroup(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            android.content.res.Resources$Theme r0 = r0.getTheme()
            r1 = 1618982084(0x607fb4c4, float:7.370227E19)
            r11.startReplaceableGroup(r1)
            boolean r1 = r11.changed((java.lang.Object) r6)
            boolean r12 = r11.changed((java.lang.Object) r12)
            r12 = r12 | r1
            boolean r0 = r11.changed((java.lang.Object) r0)
            r12 = r12 | r0
            java.lang.Object r0 = r11.rememberedValue()
            if (r12 != 0) goto L_0x00aa
            java.lang.Object r12 = r4.getEmpty()
            if (r0 != r12) goto L_0x00b1
        L_0x00aa:
            androidx.compose.ui.graphics.ImageBitmap r0 = loadImageBitmapResource(r3, r10)
            r11.updateRememberedValue(r0)
        L_0x00b1:
            r11.endReplaceableGroup()
            r2 = r0
            androidx.compose.ui.graphics.ImageBitmap r2 = (androidx.compose.p002ui.graphics.ImageBitmap) r2
            androidx.compose.ui.graphics.painter.BitmapPainter r10 = new androidx.compose.ui.graphics.painter.BitmapPainter
            r3 = 0
            r5 = 0
            r7 = 6
            r8 = 0
            r1 = r10
            r1.<init>(r2, r3, r5, r7, r8)
            r11.endReplaceableGroup()
        L_0x00c6:
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto L_0x00cf
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x00cf:
            r11.endReplaceableGroup()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.res.PainterResources_androidKt.painterResource(int, androidx.compose.runtime.Composer, int):androidx.compose.ui.graphics.painter.Painter");
    }
}
