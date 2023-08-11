package okhttp3;

import com.rmn.apiclient.impl.api.call.APIParams;
import java.io.Closeable;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.http1.HeadersReader;
import okio.C13121c;
import okio.C13130e;
import okio.C13133f;
import okio.C13145j0;
import okio.C13151m0;
import okio.C13179y0;
import okio.C13181z0;

/* compiled from: MultipartReader.kt */
public final class MultipartReader implements Closeable {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final C13151m0 afterBoundaryOptions;
    private final String boundary;
    private boolean closed;
    private final C13133f crlfDashDashBoundary;
    /* access modifiers changed from: private */
    public PartSource currentPart;
    private final C13133f dashDashBoundary;
    private boolean noMoreParts;
    private int partCount;
    /* access modifiers changed from: private */
    public final C13130e source;

    /* compiled from: MultipartReader.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C13151m0 getAfterBoundaryOptions() {
            return MultipartReader.afterBoundaryOptions;
        }
    }

    /* compiled from: MultipartReader.kt */
    public static final class Part implements Closeable {
        private final C13130e body;
        private final Headers headers;

        public Part(Headers headers2, C13130e eVar) {
            C12775o.m28639i(headers2, "headers");
            C12775o.m28639i(eVar, "body");
            this.headers = headers2;
            this.body = eVar;
        }

        public final C13130e body() {
            return this.body;
        }

        public void close() {
            this.body.close();
        }

        public final Headers headers() {
            return this.headers;
        }
    }

    /* compiled from: MultipartReader.kt */
    private final class PartSource implements C13179y0 {
        final /* synthetic */ MultipartReader this$0;
        private final C13181z0 timeout = new C13181z0();

        public PartSource(MultipartReader multipartReader) {
            C12775o.m28639i(multipartReader, "this$0");
            this.this$0 = multipartReader;
        }

        public void close() {
            if (C12775o.m28634d(this.this$0.currentPart, this)) {
                this.this$0.currentPart = null;
            }
        }

        public long read(C13121c cVar, long j) {
            boolean z;
            long j2;
            long j3;
            C13121c cVar2 = cVar;
            long j4 = j;
            C12775o.m28639i(cVar2, "sink");
            if (j4 >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(C12775o.m28647q("byteCount < 0: ", Long.valueOf(j)).toString());
            } else if (C12775o.m28634d(this.this$0.currentPart, this)) {
                C13181z0 timeout2 = this.this$0.source.timeout();
                C13181z0 z0Var = this.timeout;
                MultipartReader multipartReader = this.this$0;
                long timeoutNanos = timeout2.timeoutNanos();
                long a = C13181z0.Companion.mo52729a(z0Var.timeoutNanos(), timeout2.timeoutNanos());
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                timeout2.timeout(a, timeUnit);
                if (timeout2.hasDeadline()) {
                    long deadlineNanoTime = timeout2.deadlineNanoTime();
                    if (z0Var.hasDeadline()) {
                        timeout2.deadlineNanoTime(Math.min(timeout2.deadlineNanoTime(), z0Var.deadlineNanoTime()));
                    }
                    try {
                        long access$currentPartBytesRemaining = multipartReader.currentPartBytesRemaining(j4);
                        if (access$currentPartBytesRemaining == 0) {
                            j3 = -1;
                        } else {
                            j3 = multipartReader.source.read(cVar2, access$currentPartBytesRemaining);
                        }
                        timeout2.timeout(timeoutNanos, timeUnit);
                        if (z0Var.hasDeadline()) {
                            timeout2.deadlineNanoTime(deadlineNanoTime);
                        }
                        return j3;
                    } catch (Throwable th) {
                        timeout2.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (z0Var.hasDeadline()) {
                            timeout2.deadlineNanoTime(deadlineNanoTime);
                        }
                        throw th;
                    }
                } else {
                    if (z0Var.hasDeadline()) {
                        timeout2.deadlineNanoTime(z0Var.deadlineNanoTime());
                    }
                    try {
                        long access$currentPartBytesRemaining2 = multipartReader.currentPartBytesRemaining(j4);
                        if (access$currentPartBytesRemaining2 == 0) {
                            j2 = -1;
                        } else {
                            j2 = multipartReader.source.read(cVar2, access$currentPartBytesRemaining2);
                        }
                        timeout2.timeout(timeoutNanos, timeUnit);
                        if (z0Var.hasDeadline()) {
                            timeout2.clearDeadline();
                        }
                        return j2;
                    } catch (Throwable th2) {
                        timeout2.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (z0Var.hasDeadline()) {
                            timeout2.clearDeadline();
                        }
                        throw th2;
                    }
                }
            } else {
                throw new IllegalStateException("closed".toString());
            }
        }

        public C13181z0 timeout() {
            return this.timeout;
        }
    }

    static {
        C13151m0.C13152a aVar = C13151m0.f20932d;
        C13133f.C13134a aVar2 = C13133f.f20903e;
        afterBoundaryOptions = aVar.mo52666d(aVar2.mo52622d("\r\n"), aVar2.mo52622d("--"), aVar2.mo52622d(" "), aVar2.mo52622d("\t"));
    }

    public MultipartReader(C13130e eVar, String str) {
        C12775o.m28639i(eVar, APIParams.SOURCE);
        C12775o.m28639i(str, "boundary");
        this.source = eVar;
        this.boundary = str;
        this.dashDashBoundary = new C13121c().mo52486F("--").mo52486F(str).mo52498M();
        this.crlfDashDashBoundary = new C13121c().mo52486F("\r\n--").mo52486F(str).mo52498M();
    }

    /* access modifiers changed from: private */
    public final long currentPartBytesRemaining(long j) {
        this.source.mo52533m0((long) this.crlfDashDashBoundary.mo52590H());
        long p0 = this.source.mo52524f().mo52537p0(this.crlfDashDashBoundary);
        if (p0 == -1) {
            return Math.min(j, (this.source.mo52524f().size() - ((long) this.crlfDashDashBoundary.mo52590H())) + 1);
        }
        return Math.min(j, p0);
    }

    public final String boundary() {
        return this.boundary;
    }

    public void close() {
        if (!this.closed) {
            this.closed = true;
            this.currentPart = null;
            this.source.close();
        }
    }

    public final Part nextPart() {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        } else if (this.noMoreParts) {
            return null;
        } else {
            if (this.partCount != 0 || !this.source.mo52489H(0, this.dashDashBoundary)) {
                while (true) {
                    long currentPartBytesRemaining = currentPartBytesRemaining(8192);
                    if (currentPartBytesRemaining == 0) {
                        break;
                    }
                    this.source.skip(currentPartBytesRemaining);
                }
                this.source.skip((long) this.crlfDashDashBoundary.mo52590H());
            } else {
                this.source.skip((long) this.dashDashBoundary.mo52590H());
            }
            boolean z = false;
            while (true) {
                int s0 = this.source.mo52549s0(afterBoundaryOptions);
                if (s0 == -1) {
                    throw new ProtocolException("unexpected characters after boundary");
                } else if (s0 == 0) {
                    this.partCount++;
                    Headers readHeaders = new HeadersReader(this.source).readHeaders();
                    PartSource partSource = new PartSource(this);
                    this.currentPart = partSource;
                    return new Part(readHeaders, C13145j0.m29739d(partSource));
                } else if (s0 != 1) {
                    if (s0 == 2 || s0 == 3) {
                        z = true;
                    }
                } else if (z) {
                    throw new ProtocolException("unexpected characters after boundary");
                } else if (this.partCount != 0) {
                    this.noMoreParts = true;
                    return null;
                } else {
                    throw new ProtocolException("expected at least 1 part");
                }
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultipartReader(okhttp3.ResponseBody r3) {
        /*
            r2 = this;
            java.lang.String r0 = "response"
            kotlin.jvm.internal.C12775o.m28639i(r3, r0)
            okio.e r0 = r3.source()
            okhttp3.MediaType r3 = r3.contentType()
            if (r3 != 0) goto L_0x0011
            r3 = 0
            goto L_0x0017
        L_0x0011:
            java.lang.String r1 = "boundary"
            java.lang.String r3 = r3.parameter(r1)
        L_0x0017:
            if (r3 == 0) goto L_0x001d
            r2.<init>(r0, r3)
            return
        L_0x001d:
            java.net.ProtocolException r3 = new java.net.ProtocolException
            java.lang.String r0 = "expected the Content-Type to have a boundary parameter"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartReader.<init>(okhttp3.ResponseBody):void");
    }
}
