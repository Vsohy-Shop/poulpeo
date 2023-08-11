package okhttp3.internal.concurrent;

import p336ef.C11921v;
import p404of.C13074a;

/* compiled from: TaskQueue.kt */
public final class TaskQueue$execute$1 extends Task {
    final /* synthetic */ C13074a<C11921v> $block;
    final /* synthetic */ boolean $cancelable;
    final /* synthetic */ String $name;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TaskQueue$execute$1(String str, boolean z, C13074a<C11921v> aVar) {
        super(str, z);
        this.$name = str;
        this.$cancelable = z;
        this.$block = aVar;
    }

    public long runOnce() {
        this.$block.invoke();
        return -1;
    }
}
