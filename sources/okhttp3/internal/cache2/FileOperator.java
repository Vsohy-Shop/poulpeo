package okhttp3.internal.cache2;

import com.rmn.apiclient.impl.api.call.APIParams;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.C12775o;
import okio.C13121c;

/* compiled from: FileOperator.kt */
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel2) {
        C12775o.m28639i(fileChannel2, "fileChannel");
        this.fileChannel = fileChannel2;
    }

    public final void read(long j, C13121c cVar, long j2) {
        C12775o.m28639i(cVar, "sink");
        if (j2 >= 0) {
            while (j2 > 0) {
                long transferTo = this.fileChannel.transferTo(j, j2, cVar);
                j += transferTo;
                j2 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public final void write(long j, C13121c cVar, long j2) {
        C12775o.m28639i(cVar, APIParams.SOURCE);
        if (j2 < 0 || j2 > cVar.size()) {
            throw new IndexOutOfBoundsException();
        }
        while (j2 > 0) {
            long transferFrom = this.fileChannel.transferFrom(cVar, j, j2);
            j += transferFrom;
            j2 -= transferFrom;
        }
    }
}
