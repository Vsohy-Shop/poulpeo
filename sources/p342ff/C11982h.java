package p342ff;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ff.h */
/* compiled from: ListBuilder.kt */
public final class C11982h implements Externalizable {

    /* renamed from: d */
    public static final C11983a f18707d = new C11983a((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 0;

    /* renamed from: b */
    private Collection<?> f18708b;

    /* renamed from: c */
    private final int f18709c;

    /* renamed from: ff.h$a */
    /* compiled from: ListBuilder.kt */
    public static final class C11983a {
        private C11983a() {
        }

        public /* synthetic */ C11983a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C11982h(Collection<?> collection, int i) {
        C12775o.m28639i(collection, "collection");
        this.f18708b = collection;
        this.f18709c = i;
    }

    private final Object readResolve() {
        return this.f18708b;
    }

    public void readExternal(ObjectInput objectInput) {
        Collection<?> collection;
        C12775o.m28639i(objectInput, "input");
        byte readByte = objectInput.readByte();
        byte b = readByte & 1;
        if ((readByte & -2) == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                int i = 0;
                if (b == 0) {
                    List c = C12723v.m28508c(readInt);
                    while (i < readInt) {
                        c.add(objectInput.readObject());
                        i++;
                    }
                    collection = C12723v.m28506a(c);
                } else if (b == 1) {
                    Set b2 = C12729x0.m28548b(readInt);
                    while (i < readInt) {
                        b2.add(objectInput.readObject());
                        i++;
                    }
                    collection = C12729x0.m28547a(b2);
                } else {
                    throw new InvalidObjectException("Unsupported collection type tag: " + b + '.');
                }
                this.f18708b = collection;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException("Unsupported flags value: " + readByte + '.');
    }

    public void writeExternal(ObjectOutput objectOutput) {
        C12775o.m28639i(objectOutput, "output");
        objectOutput.writeByte(this.f18709c);
        objectOutput.writeInt(this.f18708b.size());
        for (Object writeObject : this.f18708b) {
            objectOutput.writeObject(writeObject);
        }
    }

    public C11982h() {
        this(C12726w.m28524k(), 0);
    }
}
