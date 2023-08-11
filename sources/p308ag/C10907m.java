package p308ag;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12764h0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.UndeliveredElementException;
import p308ag.C10899h;
import p331dg.C11828g0;
import p331dg.C11862y;
import p336ef.C11921v;
import p355hf.C12074d;
import p466yf.C13945d3;

@SourceDebugExtension({"SMAP\nConflatedBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 4 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannelKt\n+ 5 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n*L\n1#1,119:1\n548#2,5:120\n514#2,6:125\n514#2,6:212\n548#2,5:218\n244#3:131\n269#3,10:132\n280#3,68:143\n3038#4:142\n269#5:211\n*S KotlinDebug\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n*L\n41#1:120,5\n53#1:125,6\n106#1:212,6\n109#1:218,5\n80#1:131\n80#1:132,10\n80#1:143,68\n80#1:142\n80#1:211\n*E\n"})
/* renamed from: ag.m */
/* compiled from: ConflatedBufferedChannel.kt */
public class C10907m<E> extends C10887b<E> {

    /* renamed from: n */
    private final int f16824n;

    /* renamed from: o */
    private final C10886a f16825o;

    public C10907m(int i, C10886a aVar, Function1<? super E, C11921v> function1) {
        super(i, function1);
        boolean z;
        this.f16824n = i;
        this.f16825o = aVar;
        boolean z2 = false;
        if (aVar != C10886a.SUSPEND) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!(i >= 1 ? true : z2)) {
                throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i + " was specified").toString());
            }
            return;
        }
        throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + C12764h0.m28586b(C10887b.class).mo50651a() + " instead").toString());
    }

    /* renamed from: G0 */
    static /* synthetic */ <E> Object m23450G0(C10907m<E> mVar, E e, C12074d<? super C11921v> dVar) {
        UndeliveredElementException d;
        Object J0 = mVar.m23453J0(e, true);
        if (!(J0 instanceof C10899h.C10900a)) {
            return C11921v.f18618a;
        }
        C10899h.m23424e(J0);
        Function1<E, C11921v> function1 = mVar.f16783c;
        if (function1 == null || (d = C11862y.m25588d(function1, e, (UndeliveredElementException) null, 2, (Object) null)) == null) {
            throw mVar.mo45878M();
        }
        C11894b.m25683a(d, mVar.mo45878M());
        throw d;
    }

    /* renamed from: H0 */
    private final Object m23451H0(E e, boolean z) {
        Function1<E, C11921v> function1;
        UndeliveredElementException d;
        Object m = super.mo45894m(e);
        if (C10899h.m23428i(m) || C10899h.m23427h(m)) {
            return m;
        }
        if (!z || (function1 = this.f16783c) == null || (d = C11862y.m25588d(function1, e, (UndeliveredElementException) null, 2, (Object) null)) == null) {
            return C10899h.f16818b.mo45920c(C11921v.f18618a);
        }
        throw d;
    }

    /* renamed from: I0 */
    private final Object m23452I0(E e) {
        C10904j jVar;
        C13945d3 d3Var;
        C11828g0 g0Var = C10892c.f16797d;
        C10904j jVar2 = (C10904j) C10887b.f16777i.get(this);
        while (true) {
            long andIncrement = C10887b.f16773e.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean o = m23300W(andIncrement);
            int i = C10892c.f16795b;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (jVar2.f18467d != j2) {
                C10904j c = m23291H(j2, jVar2);
                if (c != null) {
                    jVar = c;
                } else if (o) {
                    return C10899h.f16818b.mo45918a(mo45878M());
                }
            } else {
                jVar = jVar2;
            }
            int u = m23283B0(jVar, i2, e, j, g0Var, o);
            if (u == 0) {
                jVar.mo48987b();
                return C10899h.f16818b.mo45920c(C11921v.f18618a);
            } else if (u == 1) {
                return C10899h.f16818b.mo45920c(C11921v.f18618a);
            } else {
                if (u != 2) {
                    if (u == 3) {
                        throw new IllegalStateException("unexpected".toString());
                    } else if (u != 4) {
                        if (u == 5) {
                            jVar.mo48987b();
                        }
                        jVar2 = jVar;
                    } else {
                        if (j < mo45877L()) {
                            jVar.mo48987b();
                        }
                        return C10899h.f16818b.mo45918a(mo45878M());
                    }
                } else if (o) {
                    jVar.mo48985p();
                    return C10899h.f16818b.mo45918a(mo45878M());
                } else {
                    if (g0Var instanceof C13945d3) {
                        d3Var = (C13945d3) g0Var;
                    } else {
                        d3Var = null;
                    }
                    if (d3Var != null) {
                        m23318l0(d3Var, jVar, i2);
                    }
                    mo45874D((jVar.f18467d * ((long) i)) + ((long) i2));
                    return C10899h.f16818b.mo45920c(C11921v.f18618a);
                }
            }
        }
    }

    /* renamed from: J0 */
    private final Object m23453J0(E e, boolean z) {
        if (this.f16825o == C10886a.DROP_LATEST) {
            return m23451H0(e, z);
        }
        return m23452I0(e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public boolean mo45882X() {
        if (this.f16825o == C10886a.DROP_OLDEST) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public Object mo45893l(E e, C12074d<? super C11921v> dVar) {
        return m23450G0(this, e, dVar);
    }

    /* renamed from: m */
    public Object mo45894m(E e) {
        return m23453J0(e, false);
    }
}
