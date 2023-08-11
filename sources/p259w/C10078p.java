package p259w;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import p215s.C9406c;
import p215s.C9414i;

@SourceDebugExtension({"SMAP\nHardwareBitmaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardwareBitmaps.kt\ncoil/util/LimitedFileDescriptorHardwareBitmapService\n+ 2 Dimension.kt\ncoil/size/-Dimensions\n*L\n1#1,214:1\n57#2:215\n57#2:216\n*S KotlinDebug\n*F\n+ 1 HardwareBitmaps.kt\ncoil/util/LimitedFileDescriptorHardwareBitmapService\n*L\n45#1:215\n46#1:216\n*E\n"})
/* renamed from: w.p */
/* compiled from: HardwareBitmaps.kt */
final class C10078p implements C10075m {

    /* renamed from: a */
    public static final C10079a f15234a = new C10079a((DefaultConstructorMarker) null);

    /* renamed from: w.p$a */
    /* compiled from: HardwareBitmaps.kt */
    public static final class C10079a {
        private C10079a() {
        }

        public /* synthetic */ C10079a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C10078p(C10080q qVar) {
    }

    /* renamed from: a */
    public boolean mo44649a(C9414i iVar) {
        int i;
        C9406c b = iVar.mo43835b();
        int i2 = Integer.MAX_VALUE;
        if (b instanceof C9406c.C9407a) {
            i = ((C9406c.C9407a) b).f13981a;
        } else {
            i = Integer.MAX_VALUE;
        }
        if (i > 100) {
            C9406c a = iVar.mo43834a();
            if (a instanceof C9406c.C9407a) {
                i2 = ((C9406c.C9407a) a).f13981a;
            }
            if (i2 > 100) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo44650b() {
        return C10074l.f15223a.mo44648b((C10080q) null);
    }
}
