package p369je;

import p471ze.C14112g;

/* renamed from: je.a */
/* compiled from: Exceptions */
public final class C12620a {
    /* renamed from: a */
    public static RuntimeException m28006a(Throwable th) {
        throw C14112g.m32759d(th);
    }

    /* renamed from: b */
    public static void m28007b(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
