package p259w;

import android.os.SystemClock;
import androidx.annotation.WorkerThread;
import java.io.File;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nHardwareBitmaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardwareBitmaps.kt\ncoil/util/FileDescriptorCounter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 4 Logs.kt\ncoil/util/-Logs\n*L\n1#1,214:1\n18#2:215\n26#3:216\n21#4,4:217\n*S KotlinDebug\n*F\n+ 1 HardwareBitmaps.kt\ncoil/util/FileDescriptorCounter\n*L\n87#1:215\n87#1:216\n90#1:217,4\n*E\n"})
/* renamed from: w.l */
/* compiled from: HardwareBitmaps.kt */
final class C10074l {

    /* renamed from: a */
    public static final C10074l f15223a = new C10074l();

    /* renamed from: b */
    private static final File f15224b = new File("/proc/self/fd");

    /* renamed from: c */
    private static int f15225c = 30;

    /* renamed from: d */
    private static long f15226d = SystemClock.uptimeMillis();

    /* renamed from: e */
    private static boolean f15227e = true;

    private C10074l() {
    }

    /* renamed from: a */
    private final boolean m21171a() {
        int i = f15225c;
        f15225c = i + 1;
        if (i >= 30 || SystemClock.uptimeMillis() > f15226d + ((long) 30000)) {
            return true;
        }
        return false;
    }

    @WorkerThread
    /* renamed from: b */
    public final synchronized boolean mo44648b(C10080q qVar) {
        if (m21171a()) {
            boolean z = false;
            f15225c = 0;
            f15226d = SystemClock.uptimeMillis();
            String[] list = f15224b.list();
            if (list == null) {
                list = new String[0];
            }
            int length = list.length;
            if (length < 800) {
                z = true;
            }
            f15227e = z;
            if (!z && qVar != null && qVar.mo44656a() <= 5) {
                qVar.mo44657b("FileDescriptorCounter", 5, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, (Throwable) null);
            }
        }
        return f15227e;
    }
}
