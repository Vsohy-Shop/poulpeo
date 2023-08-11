package p392mf;

import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.jvm.internal.C12775o;

/* renamed from: mf.k */
/* compiled from: ReadWrite.kt */
public final class C12957k {
    /* renamed from: a */
    public static final long m29274a(Reader reader, Writer writer, int i) {
        C12775o.m28639i(reader, "<this>");
        C12775o.m28639i(writer, "out");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j += (long) read;
            read = reader.read(cArr);
        }
        return j;
    }

    /* renamed from: b */
    public static /* synthetic */ long m29275b(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m29274a(reader, writer, i);
    }

    /* renamed from: c */
    public static final String m29276c(Reader reader) {
        C12775o.m28639i(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        m29275b(reader, stringWriter, 0, 2, (Object) null);
        String stringWriter2 = stringWriter.toString();
        C12775o.m28638h(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }
}
