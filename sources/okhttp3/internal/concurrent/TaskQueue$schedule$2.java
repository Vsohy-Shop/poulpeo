package okhttp3.internal.concurrent;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p404of.C13074a;

/* compiled from: TaskQueue.kt */
public final class TaskQueue$schedule$2 extends Task {
    final /* synthetic */ C13074a<Long> $block;
    final /* synthetic */ String $name;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TaskQueue$schedule$2(String str, C13074a<Long> aVar) {
        super(str, false, 2, (DefaultConstructorMarker) null);
        this.$name = str;
        this.$block = aVar;
    }

    public long runOnce() {
        return this.$block.invoke().longValue();
    }
}
