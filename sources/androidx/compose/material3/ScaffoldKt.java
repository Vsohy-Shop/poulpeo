package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.p002ui.Modifier;
import androidx.compose.p002ui.layout.SubcomposeLayoutKt;
import androidx.compose.p002ui.unit.C1232Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ScopeUpdateScope;
import p336ef.C11921v;
import p404of.C13088o;
import p404of.C13089p;

/* compiled from: Scaffold.kt */
public final class ScaffoldKt {
    /* access modifiers changed from: private */
    public static final float FabSpacing = C1232Dp.m38468constructorimpl((float) 16);
    private static final ProvidableCompositionLocal<FabPlacement> LocalFabPlacement = CompositionLocalKt.staticCompositionLocalOf(ScaffoldKt$LocalFabPlacement$1.INSTANCE);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: of.o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: of.o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: of.o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: of.o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: of.o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: of.o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: of.o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: of.o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: of.o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: of.o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: of.o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: of.o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: of.o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: of.o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: of.o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: of.o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: of.o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: of.o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ef.v>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0121  */
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    @androidx.compose.runtime.Composable
    /* renamed from: Scaffold-TvnljyQ  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m34555ScaffoldTvnljyQ(androidx.compose.p002ui.Modifier r29, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r30, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r31, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r32, p404of.C13088o<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r33, int r34, long r35, long r37, androidx.compose.foundation.layout.WindowInsets r39, p404of.C13089p<? super androidx.compose.foundation.layout.PaddingValues, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, p336ef.C11921v> r40, androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            r12 = r40
            r13 = r42
            r14 = r43
            java.lang.String r0 = "content"
            kotlin.jvm.internal.C12775o.m28639i(r12, r0)
            r0 = -1219521777(0xffffffffb74f930f, float:-1.2372401E-5)
            r1 = r41
            androidx.compose.runtime.Composer r1 = r1.startRestartGroup(r0)
            r2 = r14 & 1
            if (r2 == 0) goto L_0x001e
            r3 = r13 | 6
            r4 = r3
            r3 = r29
            goto L_0x0032
        L_0x001e:
            r3 = r13 & 14
            if (r3 != 0) goto L_0x002f
            r3 = r29
            boolean r4 = r1.changed((java.lang.Object) r3)
            if (r4 == 0) goto L_0x002c
            r4 = 4
            goto L_0x002d
        L_0x002c:
            r4 = 2
        L_0x002d:
            r4 = r4 | r13
            goto L_0x0032
        L_0x002f:
            r3 = r29
            r4 = r13
        L_0x0032:
            r5 = r14 & 2
            if (r5 == 0) goto L_0x0039
            r4 = r4 | 48
            goto L_0x004c
        L_0x0039:
            r6 = r13 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L_0x004c
            r6 = r30
            boolean r7 = r1.changed((java.lang.Object) r6)
            if (r7 == 0) goto L_0x0048
            r7 = 32
            goto L_0x004a
        L_0x0048:
            r7 = 16
        L_0x004a:
            r4 = r4 | r7
            goto L_0x004e
        L_0x004c:
            r6 = r30
        L_0x004e:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0055
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0068
        L_0x0055:
            r8 = r13 & 896(0x380, float:1.256E-42)
            if (r8 != 0) goto L_0x0068
            r8 = r31
            boolean r9 = r1.changed((java.lang.Object) r8)
            if (r9 == 0) goto L_0x0064
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r4 = r4 | r9
            goto L_0x006a
        L_0x0068:
            r8 = r31
        L_0x006a:
            r9 = r14 & 8
            if (r9 == 0) goto L_0x0071
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x0084
        L_0x0071:
            r10 = r13 & 7168(0x1c00, float:1.0045E-41)
            if (r10 != 0) goto L_0x0084
            r10 = r32
            boolean r11 = r1.changed((java.lang.Object) r10)
            if (r11 == 0) goto L_0x0080
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0082
        L_0x0080:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0082:
            r4 = r4 | r11
            goto L_0x0086
        L_0x0084:
            r10 = r32
        L_0x0086:
            r11 = r14 & 16
            if (r11 == 0) goto L_0x008d
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a3
        L_0x008d:
            r15 = 57344(0xe000, float:8.0356E-41)
            r15 = r15 & r13
            if (r15 != 0) goto L_0x00a3
            r15 = r33
            boolean r16 = r1.changed((java.lang.Object) r15)
            if (r16 == 0) goto L_0x009e
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a0
        L_0x009e:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x00a0:
            r4 = r4 | r16
            goto L_0x00a5
        L_0x00a3:
            r15 = r33
        L_0x00a5:
            r16 = r14 & 32
            if (r16 == 0) goto L_0x00b0
            r17 = 196608(0x30000, float:2.75506E-40)
            r4 = r4 | r17
            r0 = r34
            goto L_0x00c5
        L_0x00b0:
            r17 = 458752(0x70000, float:6.42848E-40)
            r17 = r13 & r17
            r0 = r34
            if (r17 != 0) goto L_0x00c5
            boolean r18 = r1.changed((int) r0)
            if (r18 == 0) goto L_0x00c1
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c3
        L_0x00c1:
            r18 = 65536(0x10000, float:9.18355E-41)
        L_0x00c3:
            r4 = r4 | r18
        L_0x00c5:
            r18 = 3670016(0x380000, float:5.142788E-39)
            r18 = r13 & r18
            if (r18 != 0) goto L_0x00e1
            r18 = r14 & 64
            r41 = r11
            r10 = r35
            if (r18 != 0) goto L_0x00dc
            boolean r18 = r1.changed((long) r10)
            if (r18 == 0) goto L_0x00dc
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00de
        L_0x00dc:
            r18 = 524288(0x80000, float:7.34684E-40)
        L_0x00de:
            r4 = r4 | r18
            goto L_0x00e5
        L_0x00e1:
            r41 = r11
            r10 = r35
        L_0x00e5:
            r18 = 29360128(0x1c00000, float:7.052966E-38)
            r18 = r13 & r18
            if (r18 != 0) goto L_0x00fe
            r0 = r14 & 128(0x80, float:1.794E-43)
            r10 = r37
            if (r0 != 0) goto L_0x00fa
            boolean r0 = r1.changed((long) r10)
            if (r0 == 0) goto L_0x00fa
            r0 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fc
        L_0x00fa:
            r0 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fc:
            r4 = r4 | r0
            goto L_0x0100
        L_0x00fe:
            r10 = r37
        L_0x0100:
            r0 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r13
            if (r0 != 0) goto L_0x011b
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 != 0) goto L_0x0114
            r0 = r39
            boolean r18 = r1.changed((java.lang.Object) r0)
            if (r18 == 0) goto L_0x0116
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0118
        L_0x0114:
            r0 = r39
        L_0x0116:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0118:
            r4 = r4 | r18
            goto L_0x011d
        L_0x011b:
            r0 = r39
        L_0x011d:
            r0 = r14 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0125
            r0 = 805306368(0x30000000, float:4.656613E-10)
        L_0x0123:
            r4 = r4 | r0
            goto L_0x0136
        L_0x0125:
            r0 = 1879048192(0x70000000, float:1.58456325E29)
            r0 = r0 & r13
            if (r0 != 0) goto L_0x0136
            boolean r0 = r1.changed((java.lang.Object) r12)
            if (r0 == 0) goto L_0x0133
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0123
        L_0x0133:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0123
        L_0x0136:
            r0 = 1533916891(0x5b6db6db, float:6.6910621E16)
            r0 = r0 & r4
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r3) goto L_0x0158
            boolean r0 = r1.getSkipping()
            if (r0 != 0) goto L_0x0146
            goto L_0x0158
        L_0x0146:
            r1.skipToGroupEnd()
            r2 = r29
            r4 = r32
            r13 = r39
            r3 = r8
            r11 = r10
            r5 = r15
            r8 = r34
            r9 = r35
            goto L_0x0273
        L_0x0158:
            r1.startDefaults()
            r0 = r13 & 1
            r3 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r18 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            r19 = -3670017(0xffffffffffc7ffff, float:NaN)
            if (r0 == 0) goto L_0x0193
            boolean r0 = r1.getDefaultsInvalid()
            if (r0 == 0) goto L_0x016f
            goto L_0x0193
        L_0x016f:
            r1.skipToGroupEnd()
            r0 = r14 & 64
            if (r0 == 0) goto L_0x0178
            r4 = r4 & r19
        L_0x0178:
            r0 = r14 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x017e
            r4 = r4 & r18
        L_0x017e:
            r0 = r14 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0183
            r4 = r4 & r3
        L_0x0183:
            r0 = r29
            r9 = r39
            r2 = r6
            r5 = r8
            r7 = r15
            r6 = r32
            r8 = r34
            r15 = r4
            r3 = r35
            goto L_0x020f
        L_0x0193:
            if (r2 == 0) goto L_0x0198
            androidx.compose.ui.Modifier$Companion r0 = androidx.compose.p002ui.Modifier.Companion
            goto L_0x019a
        L_0x0198:
            r0 = r29
        L_0x019a:
            if (r5 == 0) goto L_0x01a3
            androidx.compose.material3.ComposableSingletons$ScaffoldKt r2 = androidx.compose.material3.ComposableSingletons$ScaffoldKt.INSTANCE
            of.o r2 = r2.m34377getLambda1$material3_release()
            goto L_0x01a4
        L_0x01a3:
            r2 = r6
        L_0x01a4:
            if (r7 == 0) goto L_0x01ad
            androidx.compose.material3.ComposableSingletons$ScaffoldKt r5 = androidx.compose.material3.ComposableSingletons$ScaffoldKt.INSTANCE
            of.o r5 = r5.m34378getLambda2$material3_release()
            goto L_0x01ae
        L_0x01ad:
            r5 = r8
        L_0x01ae:
            if (r9 == 0) goto L_0x01b7
            androidx.compose.material3.ComposableSingletons$ScaffoldKt r6 = androidx.compose.material3.ComposableSingletons$ScaffoldKt.INSTANCE
            of.o r6 = r6.m34379getLambda3$material3_release()
            goto L_0x01b9
        L_0x01b7:
            r6 = r32
        L_0x01b9:
            if (r41 == 0) goto L_0x01c2
            androidx.compose.material3.ComposableSingletons$ScaffoldKt r7 = androidx.compose.material3.ComposableSingletons$ScaffoldKt.INSTANCE
            of.o r7 = r7.m34380getLambda4$material3_release()
            goto L_0x01c3
        L_0x01c2:
            r7 = r15
        L_0x01c3:
            if (r16 == 0) goto L_0x01cc
            androidx.compose.material3.FabPosition$Companion r8 = androidx.compose.material3.FabPosition.Companion
            int r8 = r8.m34435getEndERTFSPs()
            goto L_0x01ce
        L_0x01cc:
            r8 = r34
        L_0x01ce:
            r9 = r14 & 64
            r15 = 6
            if (r9 == 0) goto L_0x01e3
            androidx.compose.material3.MaterialTheme r9 = androidx.compose.material3.MaterialTheme.INSTANCE
            androidx.compose.material3.ColorScheme r9 = r9.getColorScheme(r1, r15)
            long r20 = r9.m34299getBackground0d7_KjU()
            r4 = r4 & r19
            r9 = r4
            r3 = r20
            goto L_0x01e6
        L_0x01e3:
            r9 = r4
            r3 = r35
        L_0x01e6:
            r15 = r14 & 128(0x80, float:1.794E-43)
            if (r15 == 0) goto L_0x01f4
            int r10 = r9 >> 18
            r10 = r10 & 14
            long r10 = androidx.compose.material3.ColorSchemeKt.m34359contentColorForek8zF_U(r3, r1, r10)
            r9 = r9 & r18
        L_0x01f4:
            r15 = r14 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L_0x020a
            androidx.compose.material3.ScaffoldDefaults r15 = androidx.compose.material3.ScaffoldDefaults.INSTANCE
            r16 = r0
            r0 = 6
            androidx.compose.foundation.layout.WindowInsets r0 = r15.getContentWindowInsets(r1, r0)
            r15 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r9 = r9 & r15
            r15 = r9
            r9 = r0
            r0 = r16
            goto L_0x020f
        L_0x020a:
            r16 = r0
            r15 = r9
            r9 = r39
        L_0x020f:
            r1.endDefaults()
            boolean r16 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r16 == 0) goto L_0x0221
            r12 = -1
            java.lang.String r13 = "androidx.compose.material3.Scaffold (Scaffold.kt:74)"
            r14 = -1219521777(0xffffffffb74f930f, float:-1.2372401E-5)
            androidx.compose.runtime.ComposerKt.traceEventStart(r14, r15, r12, r13)
        L_0x0221:
            r16 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            androidx.compose.material3.ScaffoldKt$Scaffold$1 r12 = new androidx.compose.material3.ScaffoldKt$Scaffold$1
            r29 = r12
            r30 = r8
            r31 = r2
            r32 = r40
            r33 = r6
            r34 = r7
            r35 = r9
            r36 = r5
            r37 = r15
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37)
            r13 = -1979205334(0xffffffff8a07b92a, float:-6.534839E-33)
            r14 = 1
            androidx.compose.runtime.internal.ComposableLambda r24 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambda(r1, r13, r14, r12)
            r12 = r15 & 14
            r13 = 12582912(0xc00000, float:1.7632415E-38)
            r12 = r12 | r13
            int r13 = r15 >> 12
            r14 = r13 & 896(0x380, float:1.256E-42)
            r12 = r12 | r14
            r13 = r13 & 7168(0x1c00, float:1.0045E-41)
            r26 = r12 | r13
            r27 = 114(0x72, float:1.6E-43)
            r15 = r0
            r17 = r3
            r19 = r10
            r25 = r1
            androidx.compose.material3.SurfaceKt.m34602SurfaceT9BRK9s(r15, r16, r17, r19, r21, r22, r23, r24, r25, r26, r27)
            boolean r12 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r12 == 0) goto L_0x026b
            androidx.compose.runtime.ComposerKt.traceEventEnd()
        L_0x026b:
            r13 = r9
            r11 = r10
            r9 = r3
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r2
            r2 = r0
        L_0x0273:
            androidx.compose.runtime.ScopeUpdateScope r15 = r1.endRestartGroup()
            if (r15 != 0) goto L_0x027a
            goto L_0x0293
        L_0x027a:
            androidx.compose.material3.ScaffoldKt$Scaffold$2 r14 = new androidx.compose.material3.ScaffoldKt$Scaffold$2
            r0 = r14
            r1 = r2
            r2 = r6
            r6 = r8
            r7 = r9
            r9 = r11
            r11 = r13
            r12 = r40
            r13 = r42
            r28 = r14
            r14 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12, r13, r14)
            r0 = r28
            r15.updateScope(r0)
        L_0x0293:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ScaffoldKt.m34555ScaffoldTvnljyQ(androidx.compose.ui.Modifier, of.o, of.o, of.o, of.o, int, long, long, androidx.compose.foundation.layout.WindowInsets, of.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* access modifiers changed from: private */
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    @Composable
    /* renamed from: ScaffoldLayout-FMILGgc  reason: not valid java name */
    public static final void m34556ScaffoldLayoutFMILGgc(int i, C13088o<? super Composer, ? super Integer, C11921v> oVar, C13089p<? super PaddingValues, ? super Composer, ? super Integer, C11921v> pVar, C13088o<? super Composer, ? super Integer, C11921v> oVar2, C13088o<? super Composer, ? super Integer, C11921v> oVar3, WindowInsets windowInsets, C13088o<? super Composer, ? super Integer, C11921v> oVar4, Composer composer, int i2) {
        int i3;
        Composer composer2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C13088o<? super Composer, ? super Integer, C11921v> oVar5 = oVar;
        C13089p<? super PaddingValues, ? super Composer, ? super Integer, C11921v> pVar2 = pVar;
        C13088o<? super Composer, ? super Integer, C11921v> oVar6 = oVar2;
        C13088o<? super Composer, ? super Integer, C11921v> oVar7 = oVar3;
        WindowInsets windowInsets2 = windowInsets;
        C13088o<? super Composer, ? super Integer, C11921v> oVar8 = oVar4;
        int i12 = i2;
        Composer startRestartGroup = composer.startRestartGroup(-975511942);
        int i13 = i;
        if ((i12 & 14) == 0) {
            if (startRestartGroup.changed(i13)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i3 = i11 | i12;
        } else {
            i3 = i12;
        }
        if ((i12 & 112) == 0) {
            if (startRestartGroup.changed((Object) oVar5)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i3 |= i10;
        }
        if ((i12 & MediaRouterJellybean.DEVICE_OUT_BLUETOOTH) == 0) {
            if (startRestartGroup.changed((Object) pVar2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i3 |= i9;
        }
        if ((i12 & 7168) == 0) {
            if (startRestartGroup.changed((Object) oVar6)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i3 |= i8;
        }
        if ((57344 & i12) == 0) {
            if (startRestartGroup.changed((Object) oVar7)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i3 |= i7;
        }
        if ((458752 & i12) == 0) {
            if (startRestartGroup.changed((Object) windowInsets2)) {
                i6 = 131072;
            } else {
                i6 = 65536;
            }
            i3 |= i6;
        }
        if ((3670016 & i12) == 0) {
            if (startRestartGroup.changed((Object) oVar8)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i3 |= i5;
        }
        int i14 = i3;
        if ((2995931 & i14) != 599186 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-975511942, i14, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:113)");
            }
            Object[] objArr = {oVar5, oVar6, windowInsets2, oVar7, FabPosition.m34427boximpl(i), oVar8, pVar2};
            startRestartGroup.startReplaceableGroup(-568225417);
            int i15 = 0;
            boolean z = false;
            for (int i16 = 7; i15 < i16; i16 = 7) {
                z |= startRestartGroup.changed(objArr[i15]);
                i15++;
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.Companion.getEmpty()) {
                ScaffoldKt$ScaffoldLayout$1$1 scaffoldKt$ScaffoldLayout$1$1 = r0;
                i4 = 0;
                composer2 = startRestartGroup;
                ScaffoldKt$ScaffoldLayout$1$1 scaffoldKt$ScaffoldLayout$1$12 = new ScaffoldKt$ScaffoldLayout$1$1(oVar, oVar2, oVar3, i, windowInsets, oVar4, i14, pVar);
                composer2.updateRememberedValue(scaffoldKt$ScaffoldLayout$1$1);
                rememberedValue = scaffoldKt$ScaffoldLayout$1$1;
            } else {
                i4 = 0;
                composer2 = startRestartGroup;
            }
            composer2.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout((Modifier) null, (C13088o) rememberedValue, composer2, i4, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ScaffoldKt$ScaffoldLayout$2(i, oVar, pVar, oVar2, oVar3, windowInsets, oVar4, i2));
        }
    }

    public static final ProvidableCompositionLocal<FabPlacement> getLocalFabPlacement() {
        return LocalFabPlacement;
    }
}
