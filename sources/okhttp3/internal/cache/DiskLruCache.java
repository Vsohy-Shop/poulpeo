package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.C12775o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.p405io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.C13127d;
import okio.C13145j0;
import okio.C13179y0;
import p336ef.C11921v;
import p454wf.C13735j;

/* compiled from: DiskLruCache.kt */
public final class DiskLruCache implements Closeable, Flushable {
    public static final long ANY_SEQUENCE_NUMBER = -1;
    public static final String CLEAN = "CLEAN";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String DIRTY = "DIRTY";
    public static final String JOURNAL_FILE = "journal";
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    public static final String JOURNAL_FILE_TEMP = "journal.tmp";
    public static final C13735j LEGAL_KEY_PATTERN = new C13735j("[a-z0-9_-]{1,120}");
    public static final String MAGIC = "libcore.io.DiskLruCache";
    public static final String READ = "READ";
    public static final String REMOVE = "REMOVE";
    public static final String VERSION_1 = "1";
    private final int appVersion;
    /* access modifiers changed from: private */
    public boolean civilizedFileSystem;
    private final TaskQueue cleanupQueue;
    private final DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;
    private final File directory;
    private final FileSystem fileSystem;
    /* access modifiers changed from: private */
    public boolean hasJournalErrors;
    /* access modifiers changed from: private */
    public boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    /* access modifiers changed from: private */
    public C13127d journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap<>(0, 0.75f, true);
    private long maxSize;
    /* access modifiers changed from: private */
    public boolean mostRecentRebuildFailed;
    /* access modifiers changed from: private */
    public boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    /* access modifiers changed from: private */
    public int redundantOpCount;
    private long size;
    private final int valueCount;

    /* compiled from: DiskLruCache.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: DiskLruCache.kt */
    public final class Editor {
        private boolean done;
        private final Entry entry;
        final /* synthetic */ DiskLruCache this$0;
        private final boolean[] written;

        public Editor(DiskLruCache diskLruCache, Entry entry2) {
            boolean[] zArr;
            C12775o.m28639i(diskLruCache, "this$0");
            C12775o.m28639i(entry2, "entry");
            this.this$0 = diskLruCache;
            this.entry = entry2;
            if (entry2.getReadable$okhttp()) {
                zArr = null;
            } else {
                zArr = new boolean[diskLruCache.getValueCount$okhttp()];
            }
            this.written = zArr;
        }

        public final void abort() {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (!this.done) {
                    if (C12775o.m28634d(getEntry$okhttp().getCurrentEditor$okhttp(), this)) {
                        diskLruCache.completeEdit$okhttp(this, false);
                    }
                    this.done = true;
                    C11921v vVar = C11921v.f18618a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void commit() {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (!this.done) {
                    if (C12775o.m28634d(getEntry$okhttp().getCurrentEditor$okhttp(), this)) {
                        diskLruCache.completeEdit$okhttp(this, true);
                    }
                    this.done = true;
                    C11921v vVar = C11921v.f18618a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void detach$okhttp() {
            if (!C12775o.m28634d(this.entry.getCurrentEditor$okhttp(), this)) {
                return;
            }
            if (this.this$0.civilizedFileSystem) {
                this.this$0.completeEdit$okhttp(this, false);
            } else {
                this.entry.setZombie$okhttp(true);
            }
        }

        public final Entry getEntry$okhttp() {
            return this.entry;
        }

        public final boolean[] getWritten$okhttp() {
            return this.written;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:21|22|23|24) */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r4 = okio.C13145j0.m29737b();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
            return r4;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0052 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okio.C13175w0 newSink(int r4) {
            /*
                r3 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r3.this$0
                monitor-enter(r0)
                boolean r1 = r3.done     // Catch:{ all -> 0x0064 }
                r2 = 1
                r1 = r1 ^ r2
                if (r1 == 0) goto L_0x0058
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r3.getEntry$okhttp()     // Catch:{ all -> 0x0064 }
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.getCurrentEditor$okhttp()     // Catch:{ all -> 0x0064 }
                boolean r1 = kotlin.jvm.internal.C12775o.m28634d(r1, r3)     // Catch:{ all -> 0x0064 }
                if (r1 != 0) goto L_0x001d
                okio.w0 r4 = okio.C13145j0.m29737b()     // Catch:{ all -> 0x0064 }
                monitor-exit(r0)
                return r4
            L_0x001d:
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r3.getEntry$okhttp()     // Catch:{ all -> 0x0064 }
                boolean r1 = r1.getReadable$okhttp()     // Catch:{ all -> 0x0064 }
                if (r1 != 0) goto L_0x0030
                boolean[] r1 = r3.getWritten$okhttp()     // Catch:{ all -> 0x0064 }
                kotlin.jvm.internal.C12775o.m28636f(r1)     // Catch:{ all -> 0x0064 }
                r1[r4] = r2     // Catch:{ all -> 0x0064 }
            L_0x0030:
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r3.getEntry$okhttp()     // Catch:{ all -> 0x0064 }
                java.util.List r1 = r1.getDirtyFiles$okhttp()     // Catch:{ all -> 0x0064 }
                java.lang.Object r4 = r1.get(r4)     // Catch:{ all -> 0x0064 }
                java.io.File r4 = (java.io.File) r4     // Catch:{ all -> 0x0064 }
                okhttp3.internal.io.FileSystem r1 = r0.getFileSystem$okhttp()     // Catch:{ FileNotFoundException -> 0x0052 }
                okio.w0 r4 = r1.sink(r4)     // Catch:{ FileNotFoundException -> 0x0052 }
                okhttp3.internal.cache.FaultHidingSink r1 = new okhttp3.internal.cache.FaultHidingSink     // Catch:{ all -> 0x0064 }
                okhttp3.internal.cache.DiskLruCache$Editor$newSink$1$1 r2 = new okhttp3.internal.cache.DiskLruCache$Editor$newSink$1$1     // Catch:{ all -> 0x0064 }
                r2.<init>(r0, r3)     // Catch:{ all -> 0x0064 }
                r1.<init>(r4, r2)     // Catch:{ all -> 0x0064 }
                monitor-exit(r0)
                return r1
            L_0x0052:
                okio.w0 r4 = okio.C13145j0.m29737b()     // Catch:{ all -> 0x0064 }
                monitor-exit(r0)
                return r4
            L_0x0058:
                java.lang.String r4 = "Check failed."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0064 }
                java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0064 }
                r1.<init>(r4)     // Catch:{ all -> 0x0064 }
                throw r1     // Catch:{ all -> 0x0064 }
            L_0x0064:
                r4 = move-exception
                monitor-exit(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.Editor.newSink(int):okio.w0");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okio.C13179y0 newSource(int r5) {
            /*
                r4 = this;
                okhttp3.internal.cache.DiskLruCache r0 = r4.this$0
                monitor-enter(r0)
                boolean r1 = r4.done     // Catch:{ all -> 0x0053 }
                r1 = r1 ^ 1
                if (r1 == 0) goto L_0x0047
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.getEntry$okhttp()     // Catch:{ all -> 0x0053 }
                boolean r1 = r1.getReadable$okhttp()     // Catch:{ all -> 0x0053 }
                r2 = 0
                if (r1 == 0) goto L_0x0045
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.getEntry$okhttp()     // Catch:{ all -> 0x0053 }
                okhttp3.internal.cache.DiskLruCache$Editor r1 = r1.getCurrentEditor$okhttp()     // Catch:{ all -> 0x0053 }
                boolean r1 = kotlin.jvm.internal.C12775o.m28634d(r1, r4)     // Catch:{ all -> 0x0053 }
                if (r1 == 0) goto L_0x0045
                okhttp3.internal.cache.DiskLruCache$Entry r1 = r4.getEntry$okhttp()     // Catch:{ all -> 0x0053 }
                boolean r1 = r1.getZombie$okhttp()     // Catch:{ all -> 0x0053 }
                if (r1 == 0) goto L_0x002d
                goto L_0x0045
            L_0x002d:
                okhttp3.internal.io.FileSystem r1 = r0.getFileSystem$okhttp()     // Catch:{ FileNotFoundException -> 0x0043 }
                okhttp3.internal.cache.DiskLruCache$Entry r3 = r4.getEntry$okhttp()     // Catch:{ FileNotFoundException -> 0x0043 }
                java.util.List r3 = r3.getCleanFiles$okhttp()     // Catch:{ FileNotFoundException -> 0x0043 }
                java.lang.Object r5 = r3.get(r5)     // Catch:{ FileNotFoundException -> 0x0043 }
                java.io.File r5 = (java.io.File) r5     // Catch:{ FileNotFoundException -> 0x0043 }
                okio.y0 r2 = r1.source(r5)     // Catch:{ FileNotFoundException -> 0x0043 }
            L_0x0043:
                monitor-exit(r0)
                return r2
            L_0x0045:
                monitor-exit(r0)
                return r2
            L_0x0047:
                java.lang.String r5 = "Check failed."
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0053 }
                java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0053 }
                r1.<init>(r5)     // Catch:{ all -> 0x0053 }
                throw r1     // Catch:{ all -> 0x0053 }
            L_0x0053:
                r5 = move-exception
                monitor-exit(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.Editor.newSource(int):okio.y0");
        }
    }

    /* compiled from: DiskLruCache.kt */
    public final class Entry {
        private final List<File> cleanFiles = new ArrayList();
        private Editor currentEditor;
        private final List<File> dirtyFiles = new ArrayList();
        private final String key;
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ DiskLruCache this$0;
        private boolean zombie;

        public Entry(DiskLruCache diskLruCache, String str) {
            C12775o.m28639i(diskLruCache, "this$0");
            C12775o.m28639i(str, "key");
            this.this$0 = diskLruCache;
            this.key = str;
            this.lengths = new long[diskLruCache.getValueCount$okhttp()];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int valueCount$okhttp = diskLruCache.getValueCount$okhttp();
            for (int i = 0; i < valueCount$okhttp; i++) {
                sb.append(i);
                this.cleanFiles.add(new File(this.this$0.getDirectory(), sb.toString()));
                sb.append(".tmp");
                this.dirtyFiles.add(new File(this.this$0.getDirectory(), sb.toString()));
                sb.setLength(length);
            }
        }

        private final Void invalidLengths(List<String> list) {
            throw new IOException(C12775o.m28647q("unexpected journal line: ", list));
        }

        private final C13179y0 newSource(int i) {
            C13179y0 source = this.this$0.getFileSystem$okhttp().source(this.cleanFiles.get(i));
            if (this.this$0.civilizedFileSystem) {
                return source;
            }
            this.lockingSourceCount++;
            return new DiskLruCache$Entry$newSource$1(source, this.this$0, this);
        }

        public final List<File> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        public final Editor getCurrentEditor$okhttp() {
            return this.currentEditor;
        }

        public final List<File> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        public final String getKey$okhttp() {
            return this.key;
        }

        public final long[] getLengths$okhttp() {
            return this.lengths;
        }

        public final int getLockingSourceCount$okhttp() {
            return this.lockingSourceCount;
        }

        public final boolean getReadable$okhttp() {
            return this.readable;
        }

        public final long getSequenceNumber$okhttp() {
            return this.sequenceNumber;
        }

        public final boolean getZombie$okhttp() {
            return this.zombie;
        }

        public final void setCurrentEditor$okhttp(Editor editor) {
            this.currentEditor = editor;
        }

        public final void setLengths$okhttp(List<String> list) {
            C12775o.m28639i(list, "strings");
            if (list.size() == this.this$0.getValueCount$okhttp()) {
                try {
                    int size = list.size();
                    int i = 0;
                    while (i < size) {
                        int i2 = i + 1;
                        this.lengths[i] = Long.parseLong(list.get(i));
                        i = i2;
                    }
                } catch (NumberFormatException unused) {
                    invalidLengths(list);
                    throw new KotlinNothingValueException();
                }
            } else {
                invalidLengths(list);
                throw new KotlinNothingValueException();
            }
        }

        public final void setLockingSourceCount$okhttp(int i) {
            this.lockingSourceCount = i;
        }

        public final void setReadable$okhttp(boolean z) {
            this.readable = z;
        }

        public final void setSequenceNumber$okhttp(long j) {
            this.sequenceNumber = j;
        }

        public final void setZombie$okhttp(boolean z) {
            this.zombie = z;
        }

        public final Snapshot snapshot$okhttp() {
            DiskLruCache diskLruCache = this.this$0;
            if (Util.assertionsEnabled && !Thread.holdsLock(diskLruCache)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache);
            } else if (!this.readable) {
                return null;
            } else {
                if (!this.this$0.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                    return null;
                }
                ArrayList<C13179y0> arrayList = new ArrayList<>();
                long[] jArr = (long[]) this.lengths.clone();
                try {
                    int valueCount$okhttp = this.this$0.getValueCount$okhttp();
                    for (int i = 0; i < valueCount$okhttp; i++) {
                        arrayList.add(newSource(i));
                    }
                    return new Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
                } catch (FileNotFoundException unused) {
                    for (C13179y0 closeQuietly : arrayList) {
                        Util.closeQuietly((Closeable) closeQuietly);
                    }
                    try {
                        this.this$0.removeEntry$okhttp(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
        }

        public final void writeLengths$okhttp(C13127d dVar) {
            C12775o.m28639i(dVar, "writer");
            long[] jArr = this.lengths;
            int length = jArr.length;
            int i = 0;
            while (i < length) {
                long j = jArr[i];
                i++;
                dVar.writeByte(32).mo52535o0(j);
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    public final class Snapshot implements Closeable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final List<C13179y0> sources;
        final /* synthetic */ DiskLruCache this$0;

        public Snapshot(DiskLruCache diskLruCache, String str, long j, List<? extends C13179y0> list, long[] jArr) {
            C12775o.m28639i(diskLruCache, "this$0");
            C12775o.m28639i(str, "key");
            C12775o.m28639i(list, "sources");
            C12775o.m28639i(jArr, "lengths");
            this.this$0 = diskLruCache;
            this.key = str;
            this.sequenceNumber = j;
            this.sources = list;
            this.lengths = jArr;
        }

        public void close() {
            for (C13179y0 closeQuietly : this.sources) {
                Util.closeQuietly((Closeable) closeQuietly);
            }
        }

        public final Editor edit() {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        public final long getLength(int i) {
            return this.lengths[i];
        }

        public final C13179y0 getSource(int i) {
            return this.sources.get(i);
        }

        public final String key() {
            return this.key;
        }
    }

    public DiskLruCache(FileSystem fileSystem2, File file, int i, int i2, long j, TaskRunner taskRunner) {
        boolean z;
        C12775o.m28639i(fileSystem2, "fileSystem");
        C12775o.m28639i(file, "directory");
        C12775o.m28639i(taskRunner, "taskRunner");
        this.fileSystem = fileSystem2;
        this.directory = file;
        this.appVersion = i;
        this.valueCount = i2;
        this.maxSize = j;
        boolean z2 = false;
        this.cleanupQueue = taskRunner.newQueue();
        this.cleanupTask = new DiskLruCache$cleanupTask$1(this, C12775o.m28647q(Util.okHttpName, " Cache"));
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 > 0 ? true : z2) {
                this.journalFile = new File(file, JOURNAL_FILE);
                this.journalFileTmp = new File(file, JOURNAL_FILE_TEMP);
                this.journalFileBackup = new File(file, JOURNAL_FILE_BACKUP);
                return;
            }
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    private final synchronized void checkNotClosed() {
        if (!(!this.closed)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j);
    }

    /* access modifiers changed from: private */
    public final boolean journalRebuildRequired() {
        int i = this.redundantOpCount;
        if (i < 2000 || i < this.lruEntries.size()) {
            return false;
        }
        return true;
    }

    private final C13127d newJournalWriter() {
        return C13145j0.m29738c(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    private final void processJournal() {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            C12775o.m28638h(next, "i.next()");
            Entry entry = next;
            int i = 0;
            if (entry.getCurrentEditor$okhttp() == null) {
                int i2 = this.valueCount;
                while (i < i2) {
                    this.size += entry.getLengths$okhttp()[i];
                    i++;
                }
            } else {
                entry.setCurrentEditor$okhttp((Editor) null);
                int i3 = this.valueCount;
                while (i < i3) {
                    this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i));
                    this.fileSystem.delete(entry.getDirtyFiles$okhttp().get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:19|20|(1:22)(1:23)|24|25|26) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r9.redundantOpCount = r7 - getLruEntries$okhttp().size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0071, code lost:
        if (r1.mo52552t() == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0073, code lost:
        rebuildJournal$okhttp();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0077, code lost:
        r9.journalWriter = newJournalWriter();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        r0 = p336ef.C11921v.f18618a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        p392mf.C12941b.m29245a(r1, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0083, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b4, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b5, code lost:
        p392mf.C12941b.m29245a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b8, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0062 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0062=Splitter:B:19:0x0062, B:27:0x0084=Splitter:B:27:0x0084} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void readJournal() {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            okhttp3.internal.io.FileSystem r1 = r9.fileSystem
            java.io.File r2 = r9.journalFile
            okio.y0 r1 = r1.source(r2)
            okio.e r1 = okio.C13145j0.m29739d(r1)
            java.lang.String r2 = r1.mo52507U()     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = r1.mo52507U()     // Catch:{ all -> 0x00b2 }
            java.lang.String r4 = r1.mo52507U()     // Catch:{ all -> 0x00b2 }
            java.lang.String r5 = r1.mo52507U()     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = r1.mo52507U()     // Catch:{ all -> 0x00b2 }
            java.lang.String r7 = MAGIC     // Catch:{ all -> 0x00b2 }
            boolean r7 = kotlin.jvm.internal.C12775o.m28634d(r7, r2)     // Catch:{ all -> 0x00b2 }
            if (r7 == 0) goto L_0x0084
            java.lang.String r7 = VERSION_1     // Catch:{ all -> 0x00b2 }
            boolean r7 = kotlin.jvm.internal.C12775o.m28634d(r7, r3)     // Catch:{ all -> 0x00b2 }
            if (r7 == 0) goto L_0x0084
            int r7 = r9.appVersion     // Catch:{ all -> 0x00b2 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x00b2 }
            boolean r4 = kotlin.jvm.internal.C12775o.m28634d(r7, r4)     // Catch:{ all -> 0x00b2 }
            if (r4 == 0) goto L_0x0084
            int r4 = r9.getValueCount$okhttp()     // Catch:{ all -> 0x00b2 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00b2 }
            boolean r4 = kotlin.jvm.internal.C12775o.m28634d(r4, r5)     // Catch:{ all -> 0x00b2 }
            if (r4 == 0) goto L_0x0084
            int r4 = r6.length()     // Catch:{ all -> 0x00b2 }
            r7 = 0
            if (r4 <= 0) goto L_0x0055
            r4 = 1
            goto L_0x0056
        L_0x0055:
            r4 = r7
        L_0x0056:
            if (r4 != 0) goto L_0x0084
        L_0x0058:
            java.lang.String r0 = r1.mo52507U()     // Catch:{ EOFException -> 0x0062 }
            r9.readJournalLine(r0)     // Catch:{ EOFException -> 0x0062 }
            int r7 = r7 + 1
            goto L_0x0058
        L_0x0062:
            java.util.LinkedHashMap r0 = r9.getLruEntries$okhttp()     // Catch:{ all -> 0x00b2 }
            int r0 = r0.size()     // Catch:{ all -> 0x00b2 }
            int r7 = r7 - r0
            r9.redundantOpCount = r7     // Catch:{ all -> 0x00b2 }
            boolean r0 = r1.mo52552t()     // Catch:{ all -> 0x00b2 }
            if (r0 != 0) goto L_0x0077
            r9.rebuildJournal$okhttp()     // Catch:{ all -> 0x00b2 }
            goto L_0x007d
        L_0x0077:
            okio.d r0 = r9.newJournalWriter()     // Catch:{ all -> 0x00b2 }
            r9.journalWriter = r0     // Catch:{ all -> 0x00b2 }
        L_0x007d:
            ef.v r0 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x00b2 }
            r0 = 0
            p392mf.C12941b.m29245a(r1, r0)
            return
        L_0x0084:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b2 }
            r7.<init>()     // Catch:{ all -> 0x00b2 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00b2 }
            r7.append(r2)     // Catch:{ all -> 0x00b2 }
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            r7.append(r3)     // Catch:{ all -> 0x00b2 }
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            r7.append(r5)     // Catch:{ all -> 0x00b2 }
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            r7.append(r6)     // Catch:{ all -> 0x00b2 }
            r0 = 93
            r7.append(r0)     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00b2 }
            r4.<init>(r0)     // Catch:{ all -> 0x00b2 }
            throw r4     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r2 = move-exception
            p392mf.C12941b.m29245a(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.readJournal():void");
    }

    private final void readJournalLine(String str) {
        String str2;
        String str3 = str;
        int V = C13755w.m31570V(str, ' ', 0, false, 6, (Object) null);
        if (V != -1) {
            int i = V + 1;
            int V2 = C13755w.m31570V(str, ' ', i, false, 4, (Object) null);
            if (V2 == -1) {
                str2 = str3.substring(i);
                C12775o.m28638h(str2, "this as java.lang.String).substring(startIndex)");
                String str4 = REMOVE;
                if (V == str4.length() && C13754v.m31525E(str3, str4, false, 2, (Object) null)) {
                    this.lruEntries.remove(str2);
                    return;
                }
            } else {
                str2 = str3.substring(i, V2);
                C12775o.m28638h(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Entry entry = this.lruEntries.get(str2);
            if (entry == null) {
                entry = new Entry(this, str2);
                this.lruEntries.put(str2, entry);
            }
            if (V2 != -1) {
                String str5 = CLEAN;
                if (V == str5.length() && C13754v.m31525E(str3, str5, false, 2, (Object) null)) {
                    String substring = str3.substring(V2 + 1);
                    C12775o.m28638h(substring, "this as java.lang.String).substring(startIndex)");
                    List s0 = C13755w.m31593s0(substring, new char[]{' '}, false, 0, 6, (Object) null);
                    entry.setReadable$okhttp(true);
                    entry.setCurrentEditor$okhttp((Editor) null);
                    entry.setLengths$okhttp(s0);
                    return;
                }
            }
            if (V2 == -1) {
                String str6 = DIRTY;
                if (V == str6.length() && C13754v.m31525E(str3, str6, false, 2, (Object) null)) {
                    entry.setCurrentEditor$okhttp(new Editor(this, entry));
                    return;
                }
            }
            if (V2 == -1) {
                String str7 = READ;
                if (V == str7.length() && C13754v.m31525E(str3, str7, false, 2, (Object) null)) {
                    return;
                }
            }
            throw new IOException(C12775o.m28647q("unexpected journal line: ", str3));
        }
        throw new IOException(C12775o.m28647q("unexpected journal line: ", str3));
    }

    private final boolean removeOldestEntry() {
        for (Entry next : this.lruEntries.values()) {
            if (!next.getZombie$okhttp()) {
                C12775o.m28638h(next, "toEvict");
                removeEntry$okhttp(next);
                return true;
            }
        }
        return false;
    }

    private final void validateKey(String str) {
        if (!LEGAL_KEY_PATTERN.mo53412e(str)) {
            throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
        }
    }

    public synchronized void close() {
        if (this.initialized) {
            if (!this.closed) {
                Collection<Entry> values = this.lruEntries.values();
                C12775o.m28638h(values, "lruEntries.values");
                int i = 0;
                Object[] array = values.toArray(new Entry[0]);
                if (array != null) {
                    Entry[] entryArr = (Entry[]) array;
                    int length = entryArr.length;
                    while (i < length) {
                        Entry entry = entryArr[i];
                        i++;
                        if (entry.getCurrentEditor$okhttp() != null) {
                            Editor currentEditor$okhttp = entry.getCurrentEditor$okhttp();
                            if (currentEditor$okhttp != null) {
                                currentEditor$okhttp.detach$okhttp();
                            }
                        }
                    }
                    trimToSize();
                    C13127d dVar = this.journalWriter;
                    C12775o.m28636f(dVar);
                    dVar.close();
                    this.journalWriter = null;
                    this.closed = true;
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
        }
        this.closed = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0132, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void completeEdit$okhttp(okhttp3.internal.cache.DiskLruCache.Editor r10, boolean r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "editor"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)     // Catch:{ all -> 0x013f }
            okhttp3.internal.cache.DiskLruCache$Entry r0 = r10.getEntry$okhttp()     // Catch:{ all -> 0x013f }
            okhttp3.internal.cache.DiskLruCache$Editor r1 = r0.getCurrentEditor$okhttp()     // Catch:{ all -> 0x013f }
            boolean r1 = kotlin.jvm.internal.C12775o.m28634d(r1, r10)     // Catch:{ all -> 0x013f }
            if (r1 == 0) goto L_0x0133
            r1 = 0
            if (r11 == 0) goto L_0x005b
            boolean r2 = r0.getReadable$okhttp()     // Catch:{ all -> 0x013f }
            if (r2 != 0) goto L_0x005b
            int r2 = r9.valueCount     // Catch:{ all -> 0x013f }
            r3 = r1
        L_0x0020:
            if (r3 >= r2) goto L_0x005b
            int r4 = r3 + 1
            boolean[] r5 = r10.getWritten$okhttp()     // Catch:{ all -> 0x013f }
            kotlin.jvm.internal.C12775o.m28636f(r5)     // Catch:{ all -> 0x013f }
            boolean r5 = r5[r3]     // Catch:{ all -> 0x013f }
            if (r5 == 0) goto L_0x0048
            okhttp3.internal.io.FileSystem r5 = r9.fileSystem     // Catch:{ all -> 0x013f }
            java.util.List r6 = r0.getDirtyFiles$okhttp()     // Catch:{ all -> 0x013f }
            java.lang.Object r3 = r6.get(r3)     // Catch:{ all -> 0x013f }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x013f }
            boolean r3 = r5.exists(r3)     // Catch:{ all -> 0x013f }
            if (r3 != 0) goto L_0x0046
            r10.abort()     // Catch:{ all -> 0x013f }
            monitor-exit(r9)
            return
        L_0x0046:
            r3 = r4
            goto L_0x0020
        L_0x0048:
            r10.abort()     // Catch:{ all -> 0x013f }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x013f }
            java.lang.String r11 = "Newly created entry didn't create value for index "
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x013f }
            java.lang.String r11 = kotlin.jvm.internal.C12775o.m28647q(r11, r0)     // Catch:{ all -> 0x013f }
            r10.<init>(r11)     // Catch:{ all -> 0x013f }
            throw r10     // Catch:{ all -> 0x013f }
        L_0x005b:
            int r10 = r9.valueCount     // Catch:{ all -> 0x013f }
        L_0x005d:
            if (r1 >= r10) goto L_0x00aa
            int r2 = r1 + 1
            java.util.List r3 = r0.getDirtyFiles$okhttp()     // Catch:{ all -> 0x013f }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x013f }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x013f }
            if (r11 == 0) goto L_0x00a3
            boolean r4 = r0.getZombie$okhttp()     // Catch:{ all -> 0x013f }
            if (r4 != 0) goto L_0x00a3
            okhttp3.internal.io.FileSystem r4 = r9.fileSystem     // Catch:{ all -> 0x013f }
            boolean r4 = r4.exists(r3)     // Catch:{ all -> 0x013f }
            if (r4 == 0) goto L_0x00a8
            java.util.List r4 = r0.getCleanFiles$okhttp()     // Catch:{ all -> 0x013f }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x013f }
            java.io.File r4 = (java.io.File) r4     // Catch:{ all -> 0x013f }
            okhttp3.internal.io.FileSystem r5 = r9.fileSystem     // Catch:{ all -> 0x013f }
            r5.rename(r3, r4)     // Catch:{ all -> 0x013f }
            long[] r3 = r0.getLengths$okhttp()     // Catch:{ all -> 0x013f }
            r5 = r3[r1]     // Catch:{ all -> 0x013f }
            okhttp3.internal.io.FileSystem r3 = r9.fileSystem     // Catch:{ all -> 0x013f }
            long r3 = r3.size(r4)     // Catch:{ all -> 0x013f }
            long[] r7 = r0.getLengths$okhttp()     // Catch:{ all -> 0x013f }
            r7[r1] = r3     // Catch:{ all -> 0x013f }
            long r7 = r9.size     // Catch:{ all -> 0x013f }
            long r7 = r7 - r5
            long r7 = r7 + r3
            r9.size = r7     // Catch:{ all -> 0x013f }
            goto L_0x00a8
        L_0x00a3:
            okhttp3.internal.io.FileSystem r1 = r9.fileSystem     // Catch:{ all -> 0x013f }
            r1.delete(r3)     // Catch:{ all -> 0x013f }
        L_0x00a8:
            r1 = r2
            goto L_0x005d
        L_0x00aa:
            r10 = 0
            r0.setCurrentEditor$okhttp(r10)     // Catch:{ all -> 0x013f }
            boolean r10 = r0.getZombie$okhttp()     // Catch:{ all -> 0x013f }
            if (r10 == 0) goto L_0x00b9
            r9.removeEntry$okhttp(r0)     // Catch:{ all -> 0x013f }
            monitor-exit(r9)
            return
        L_0x00b9:
            int r10 = r9.redundantOpCount     // Catch:{ all -> 0x013f }
            r1 = 1
            int r10 = r10 + r1
            r9.redundantOpCount = r10     // Catch:{ all -> 0x013f }
            okio.d r10 = r9.journalWriter     // Catch:{ all -> 0x013f }
            kotlin.jvm.internal.C12775o.m28636f(r10)     // Catch:{ all -> 0x013f }
            boolean r2 = r0.getReadable$okhttp()     // Catch:{ all -> 0x013f }
            r3 = 10
            r4 = 32
            if (r2 != 0) goto L_0x00f0
            if (r11 == 0) goto L_0x00d1
            goto L_0x00f0
        L_0x00d1:
            java.util.LinkedHashMap r11 = r9.getLruEntries$okhttp()     // Catch:{ all -> 0x013f }
            java.lang.String r1 = r0.getKey$okhttp()     // Catch:{ all -> 0x013f }
            r11.remove(r1)     // Catch:{ all -> 0x013f }
            java.lang.String r11 = REMOVE     // Catch:{ all -> 0x013f }
            okio.d r11 = r10.mo52486F(r11)     // Catch:{ all -> 0x013f }
            r11.writeByte(r4)     // Catch:{ all -> 0x013f }
            java.lang.String r11 = r0.getKey$okhttp()     // Catch:{ all -> 0x013f }
            r10.mo52486F(r11)     // Catch:{ all -> 0x013f }
            r10.writeByte(r3)     // Catch:{ all -> 0x013f }
            goto L_0x0115
        L_0x00f0:
            r0.setReadable$okhttp(r1)     // Catch:{ all -> 0x013f }
            java.lang.String r1 = CLEAN     // Catch:{ all -> 0x013f }
            okio.d r1 = r10.mo52486F(r1)     // Catch:{ all -> 0x013f }
            r1.writeByte(r4)     // Catch:{ all -> 0x013f }
            java.lang.String r1 = r0.getKey$okhttp()     // Catch:{ all -> 0x013f }
            r10.mo52486F(r1)     // Catch:{ all -> 0x013f }
            r0.writeLengths$okhttp(r10)     // Catch:{ all -> 0x013f }
            r10.writeByte(r3)     // Catch:{ all -> 0x013f }
            if (r11 == 0) goto L_0x0115
            long r1 = r9.nextSequenceNumber     // Catch:{ all -> 0x013f }
            r3 = 1
            long r3 = r3 + r1
            r9.nextSequenceNumber = r3     // Catch:{ all -> 0x013f }
            r0.setSequenceNumber$okhttp(r1)     // Catch:{ all -> 0x013f }
        L_0x0115:
            r10.flush()     // Catch:{ all -> 0x013f }
            long r10 = r9.size     // Catch:{ all -> 0x013f }
            long r0 = r9.maxSize     // Catch:{ all -> 0x013f }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x0126
            boolean r10 = r9.journalRebuildRequired()     // Catch:{ all -> 0x013f }
            if (r10 == 0) goto L_0x0131
        L_0x0126:
            okhttp3.internal.concurrent.TaskQueue r0 = r9.cleanupQueue     // Catch:{ all -> 0x013f }
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r1 = r9.cleanupTask     // Catch:{ all -> 0x013f }
            r2 = 0
            r4 = 2
            r5 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r0, r1, r2, r4, r5)     // Catch:{ all -> 0x013f }
        L_0x0131:
            monitor-exit(r9)
            return
        L_0x0133:
            java.lang.String r10 = "Check failed."
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x013f }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x013f }
            r11.<init>(r10)     // Catch:{ all -> 0x013f }
            throw r11     // Catch:{ all -> 0x013f }
        L_0x013f:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.completeEdit$okhttp(okhttp3.internal.cache.DiskLruCache$Editor, boolean):void");
    }

    public final void delete() {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    public final Editor edit(String str) {
        C12775o.m28639i(str, "key");
        return edit$default(this, str, 0, 2, (Object) null);
    }

    public final synchronized void evictAll() {
        initialize();
        Collection<Entry> values = this.lruEntries.values();
        C12775o.m28638h(values, "lruEntries.values");
        Object[] array = values.toArray(new Entry[0]);
        if (array != null) {
            Entry[] entryArr = (Entry[]) array;
            int length = entryArr.length;
            int i = 0;
            while (i < length) {
                Entry entry = entryArr[i];
                i++;
                C12775o.m28638h(entry, "entry");
                removeEntry$okhttp(entry);
            }
            this.mostRecentTrimFailed = false;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }

    public synchronized void flush() {
        if (this.initialized) {
            checkNotClosed();
            trimToSize();
            C13127d dVar = this.journalWriter;
            C12775o.m28636f(dVar);
            dVar.flush();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.internal.cache.DiskLruCache.Snapshot get(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C12775o.m28639i(r8, r0)     // Catch:{ all -> 0x0057 }
            r7.initialize()     // Catch:{ all -> 0x0057 }
            r7.checkNotClosed()     // Catch:{ all -> 0x0057 }
            r7.validateKey(r8)     // Catch:{ all -> 0x0057 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r7.lruEntries     // Catch:{ all -> 0x0057 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0057 }
            okhttp3.internal.cache.DiskLruCache$Entry r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0     // Catch:{ all -> 0x0057 }
            r1 = 0
            if (r0 != 0) goto L_0x001c
            monitor-exit(r7)
            return r1
        L_0x001c:
            okhttp3.internal.cache.DiskLruCache$Snapshot r0 = r0.snapshot$okhttp()     // Catch:{ all -> 0x0057 }
            if (r0 != 0) goto L_0x0024
            monitor-exit(r7)
            return r1
        L_0x0024:
            int r1 = r7.redundantOpCount     // Catch:{ all -> 0x0057 }
            int r1 = r1 + 1
            r7.redundantOpCount = r1     // Catch:{ all -> 0x0057 }
            okio.d r1 = r7.journalWriter     // Catch:{ all -> 0x0057 }
            kotlin.jvm.internal.C12775o.m28636f(r1)     // Catch:{ all -> 0x0057 }
            java.lang.String r2 = READ     // Catch:{ all -> 0x0057 }
            okio.d r1 = r1.mo52486F(r2)     // Catch:{ all -> 0x0057 }
            r2 = 32
            okio.d r1 = r1.writeByte(r2)     // Catch:{ all -> 0x0057 }
            okio.d r8 = r1.mo52486F(r8)     // Catch:{ all -> 0x0057 }
            r1 = 10
            r8.writeByte(r1)     // Catch:{ all -> 0x0057 }
            boolean r8 = r7.journalRebuildRequired()     // Catch:{ all -> 0x0057 }
            if (r8 == 0) goto L_0x0055
            okhttp3.internal.concurrent.TaskQueue r1 = r7.cleanupQueue     // Catch:{ all -> 0x0057 }
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r2 = r7.cleanupTask     // Catch:{ all -> 0x0057 }
            r3 = 0
            r5 = 2
            r6 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r1, r2, r3, r5, r6)     // Catch:{ all -> 0x0057 }
        L_0x0055:
            monitor-exit(r7)
            return r0
        L_0x0057:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.get(java.lang.String):okhttp3.internal.cache.DiskLruCache$Snapshot");
    }

    public final boolean getClosed$okhttp() {
        return this.closed;
    }

    public final File getDirectory() {
        return this.directory;
    }

    public final FileSystem getFileSystem$okhttp() {
        return this.fileSystem;
    }

    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    public final int getValueCount$okhttp() {
        return this.valueCount;
    }

    public final synchronized void initialize() {
        if (Util.assertionsEnabled) {
            if (!Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
        }
        if (!this.initialized) {
            if (this.fileSystem.exists(this.journalFileBackup)) {
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.delete(this.journalFileBackup);
                } else {
                    this.fileSystem.rename(this.journalFileBackup, this.journalFile);
                }
            }
            this.civilizedFileSystem = Util.isCivilized(this.fileSystem, this.journalFileBackup);
            if (this.fileSystem.exists(this.journalFile)) {
                try {
                    readJournal();
                    processJournal();
                    this.initialized = true;
                    return;
                } catch (IOException e) {
                    Platform platform = Platform.Companion.get();
                    platform.log("DiskLruCache " + this.directory + " is corrupt: " + e.getMessage() + ", removing", 5, e);
                    delete();
                    this.closed = false;
                } catch (Throwable th) {
                    this.closed = false;
                    throw th;
                }
            }
            rebuildJournal$okhttp();
            this.initialized = true;
        }
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c5, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        p392mf.C12941b.m29245a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c9, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void rebuildJournal$okhttp() {
        /*
            r6 = this;
            monitor-enter(r6)
            okio.d r0 = r6.journalWriter     // Catch:{ all -> 0x00ca }
            if (r0 != 0) goto L_0x0006
            goto L_0x0009
        L_0x0006:
            r0.close()     // Catch:{ all -> 0x00ca }
        L_0x0009:
            okhttp3.internal.io.FileSystem r0 = r6.fileSystem     // Catch:{ all -> 0x00ca }
            java.io.File r1 = r6.journalFileTmp     // Catch:{ all -> 0x00ca }
            okio.w0 r0 = r0.sink(r1)     // Catch:{ all -> 0x00ca }
            okio.d r0 = okio.C13145j0.m29738c(r0)     // Catch:{ all -> 0x00ca }
            java.lang.String r1 = MAGIC     // Catch:{ all -> 0x00c3 }
            okio.d r1 = r0.mo52486F(r1)     // Catch:{ all -> 0x00c3 }
            r2 = 10
            r1.writeByte(r2)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = VERSION_1     // Catch:{ all -> 0x00c3 }
            okio.d r1 = r0.mo52486F(r1)     // Catch:{ all -> 0x00c3 }
            r1.writeByte(r2)     // Catch:{ all -> 0x00c3 }
            int r1 = r6.appVersion     // Catch:{ all -> 0x00c3 }
            long r3 = (long) r1     // Catch:{ all -> 0x00c3 }
            okio.d r1 = r0.mo52535o0(r3)     // Catch:{ all -> 0x00c3 }
            r1.writeByte(r2)     // Catch:{ all -> 0x00c3 }
            int r1 = r6.getValueCount$okhttp()     // Catch:{ all -> 0x00c3 }
            long r3 = (long) r1     // Catch:{ all -> 0x00c3 }
            okio.d r1 = r0.mo52535o0(r3)     // Catch:{ all -> 0x00c3 }
            r1.writeByte(r2)     // Catch:{ all -> 0x00c3 }
            r0.writeByte(r2)     // Catch:{ all -> 0x00c3 }
            java.util.LinkedHashMap r1 = r6.getLruEntries$okhttp()     // Catch:{ all -> 0x00c3 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x00c3 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00c3 }
        L_0x004e:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x00c3 }
            if (r3 == 0) goto L_0x008d
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x00c3 }
            okhttp3.internal.cache.DiskLruCache$Entry r3 = (okhttp3.internal.cache.DiskLruCache.Entry) r3     // Catch:{ all -> 0x00c3 }
            okhttp3.internal.cache.DiskLruCache$Editor r4 = r3.getCurrentEditor$okhttp()     // Catch:{ all -> 0x00c3 }
            r5 = 32
            if (r4 == 0) goto L_0x0076
            java.lang.String r4 = DIRTY     // Catch:{ all -> 0x00c3 }
            okio.d r4 = r0.mo52486F(r4)     // Catch:{ all -> 0x00c3 }
            r4.writeByte(r5)     // Catch:{ all -> 0x00c3 }
            java.lang.String r3 = r3.getKey$okhttp()     // Catch:{ all -> 0x00c3 }
            r0.mo52486F(r3)     // Catch:{ all -> 0x00c3 }
            r0.writeByte(r2)     // Catch:{ all -> 0x00c3 }
            goto L_0x004e
        L_0x0076:
            java.lang.String r4 = CLEAN     // Catch:{ all -> 0x00c3 }
            okio.d r4 = r0.mo52486F(r4)     // Catch:{ all -> 0x00c3 }
            r4.writeByte(r5)     // Catch:{ all -> 0x00c3 }
            java.lang.String r4 = r3.getKey$okhttp()     // Catch:{ all -> 0x00c3 }
            r0.mo52486F(r4)     // Catch:{ all -> 0x00c3 }
            r3.writeLengths$okhttp(r0)     // Catch:{ all -> 0x00c3 }
            r0.writeByte(r2)     // Catch:{ all -> 0x00c3 }
            goto L_0x004e
        L_0x008d:
            ef.v r1 = p336ef.C11921v.f18618a     // Catch:{ all -> 0x00c3 }
            r1 = 0
            p392mf.C12941b.m29245a(r0, r1)     // Catch:{ all -> 0x00ca }
            okhttp3.internal.io.FileSystem r0 = r6.fileSystem     // Catch:{ all -> 0x00ca }
            java.io.File r1 = r6.journalFile     // Catch:{ all -> 0x00ca }
            boolean r0 = r0.exists(r1)     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x00a6
            okhttp3.internal.io.FileSystem r0 = r6.fileSystem     // Catch:{ all -> 0x00ca }
            java.io.File r1 = r6.journalFile     // Catch:{ all -> 0x00ca }
            java.io.File r2 = r6.journalFileBackup     // Catch:{ all -> 0x00ca }
            r0.rename(r1, r2)     // Catch:{ all -> 0x00ca }
        L_0x00a6:
            okhttp3.internal.io.FileSystem r0 = r6.fileSystem     // Catch:{ all -> 0x00ca }
            java.io.File r1 = r6.journalFileTmp     // Catch:{ all -> 0x00ca }
            java.io.File r2 = r6.journalFile     // Catch:{ all -> 0x00ca }
            r0.rename(r1, r2)     // Catch:{ all -> 0x00ca }
            okhttp3.internal.io.FileSystem r0 = r6.fileSystem     // Catch:{ all -> 0x00ca }
            java.io.File r1 = r6.journalFileBackup     // Catch:{ all -> 0x00ca }
            r0.delete(r1)     // Catch:{ all -> 0x00ca }
            okio.d r0 = r6.newJournalWriter()     // Catch:{ all -> 0x00ca }
            r6.journalWriter = r0     // Catch:{ all -> 0x00ca }
            r0 = 0
            r6.hasJournalErrors = r0     // Catch:{ all -> 0x00ca }
            r6.mostRecentRebuildFailed = r0     // Catch:{ all -> 0x00ca }
            monitor-exit(r6)
            return
        L_0x00c3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r2 = move-exception
            p392mf.C12941b.m29245a(r0, r1)     // Catch:{ all -> 0x00ca }
            throw r2     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.rebuildJournal$okhttp():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean remove(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C12775o.m28639i(r6, r0)     // Catch:{ all -> 0x002e }
            r5.initialize()     // Catch:{ all -> 0x002e }
            r5.checkNotClosed()     // Catch:{ all -> 0x002e }
            r5.validateKey(r6)     // Catch:{ all -> 0x002e }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r5.lruEntries     // Catch:{ all -> 0x002e }
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x002e }
            okhttp3.internal.cache.DiskLruCache$Entry r6 = (okhttp3.internal.cache.DiskLruCache.Entry) r6     // Catch:{ all -> 0x002e }
            r0 = 0
            if (r6 != 0) goto L_0x001c
            monitor-exit(r5)
            return r0
        L_0x001c:
            boolean r6 = r5.removeEntry$okhttp(r6)     // Catch:{ all -> 0x002e }
            if (r6 == 0) goto L_0x002c
            long r1 = r5.size     // Catch:{ all -> 0x002e }
            long r3 = r5.maxSize     // Catch:{ all -> 0x002e }
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x002c
            r5.mostRecentTrimFailed = r0     // Catch:{ all -> 0x002e }
        L_0x002c:
            monitor-exit(r5)
            return r6
        L_0x002e:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.remove(java.lang.String):boolean");
    }

    public final boolean removeEntry$okhttp(Entry entry) {
        C13127d dVar;
        C12775o.m28639i(entry, "entry");
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount$okhttp() > 0 && (dVar = this.journalWriter) != null) {
                dVar.mo52486F(DIRTY);
                dVar.writeByte(32);
                dVar.mo52486F(entry.getKey$okhttp());
                dVar.writeByte(10);
                dVar.flush();
            }
            if (entry.getLockingSourceCount$okhttp() > 0 || entry.getCurrentEditor$okhttp() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        Editor currentEditor$okhttp = entry.getCurrentEditor$okhttp();
        if (currentEditor$okhttp != null) {
            currentEditor$okhttp.detach$okhttp();
        }
        int i = this.valueCount;
        for (int i2 = 0; i2 < i; i2++) {
            this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i2));
            this.size -= entry.getLengths$okhttp()[i2];
            entry.getLengths$okhttp()[i2] = 0;
        }
        this.redundantOpCount++;
        C13127d dVar2 = this.journalWriter;
        if (dVar2 != null) {
            dVar2.mo52486F(REMOVE);
            dVar2.writeByte(32);
            dVar2.mo52486F(entry.getKey$okhttp());
            dVar2.writeByte(10);
        }
        this.lruEntries.remove(entry.getKey$okhttp());
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0, 2, (Object) null);
        }
        return true;
    }

    public final void setClosed$okhttp(boolean z) {
        this.closed = z;
    }

    public final synchronized void setMaxSize(long j) {
        this.maxSize = j;
        if (this.initialized) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0, 2, (Object) null);
        }
    }

    public final synchronized long size() {
        initialize();
        return this.size;
    }

    public final synchronized Iterator<Snapshot> snapshots() {
        initialize();
        return new DiskLruCache$snapshots$1(this);
    }

    public final void trimToSize() {
        while (this.size > this.maxSize) {
            if (!removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized okhttp3.internal.cache.DiskLruCache.Editor edit(java.lang.String r10, long r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C12775o.m28639i(r10, r0)     // Catch:{ all -> 0x008f }
            r9.initialize()     // Catch:{ all -> 0x008f }
            r9.checkNotClosed()     // Catch:{ all -> 0x008f }
            r9.validateKey(r10)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r0 = r9.lruEntries     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x008f }
            okhttp3.internal.cache.DiskLruCache$Entry r0 = (okhttp3.internal.cache.DiskLruCache.Entry) r0     // Catch:{ all -> 0x008f }
            long r1 = ANY_SEQUENCE_NUMBER     // Catch:{ all -> 0x008f }
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x002a
            if (r0 == 0) goto L_0x0028
            long r3 = r0.getSequenceNumber$okhttp()     // Catch:{ all -> 0x008f }
            int r11 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x002a
        L_0x0028:
            monitor-exit(r9)
            return r2
        L_0x002a:
            if (r0 != 0) goto L_0x002e
            r11 = r2
            goto L_0x0032
        L_0x002e:
            okhttp3.internal.cache.DiskLruCache$Editor r11 = r0.getCurrentEditor$okhttp()     // Catch:{ all -> 0x008f }
        L_0x0032:
            if (r11 == 0) goto L_0x0036
            monitor-exit(r9)
            return r2
        L_0x0036:
            if (r0 == 0) goto L_0x0040
            int r11 = r0.getLockingSourceCount$okhttp()     // Catch:{ all -> 0x008f }
            if (r11 == 0) goto L_0x0040
            monitor-exit(r9)
            return r2
        L_0x0040:
            boolean r11 = r9.mostRecentTrimFailed     // Catch:{ all -> 0x008f }
            if (r11 != 0) goto L_0x0082
            boolean r11 = r9.mostRecentRebuildFailed     // Catch:{ all -> 0x008f }
            if (r11 == 0) goto L_0x0049
            goto L_0x0082
        L_0x0049:
            okio.d r11 = r9.journalWriter     // Catch:{ all -> 0x008f }
            kotlin.jvm.internal.C12775o.m28636f(r11)     // Catch:{ all -> 0x008f }
            java.lang.String r12 = DIRTY     // Catch:{ all -> 0x008f }
            okio.d r12 = r11.mo52486F(r12)     // Catch:{ all -> 0x008f }
            r1 = 32
            okio.d r12 = r12.writeByte(r1)     // Catch:{ all -> 0x008f }
            okio.d r12 = r12.mo52486F(r10)     // Catch:{ all -> 0x008f }
            r1 = 10
            r12.writeByte(r1)     // Catch:{ all -> 0x008f }
            r11.flush()     // Catch:{ all -> 0x008f }
            boolean r11 = r9.hasJournalErrors     // Catch:{ all -> 0x008f }
            if (r11 == 0) goto L_0x006c
            monitor-exit(r9)
            return r2
        L_0x006c:
            if (r0 != 0) goto L_0x0078
            okhttp3.internal.cache.DiskLruCache$Entry r0 = new okhttp3.internal.cache.DiskLruCache$Entry     // Catch:{ all -> 0x008f }
            r0.<init>(r9, r10)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.DiskLruCache$Entry> r11 = r9.lruEntries     // Catch:{ all -> 0x008f }
            r11.put(r10, r0)     // Catch:{ all -> 0x008f }
        L_0x0078:
            okhttp3.internal.cache.DiskLruCache$Editor r10 = new okhttp3.internal.cache.DiskLruCache$Editor     // Catch:{ all -> 0x008f }
            r10.<init>(r9, r0)     // Catch:{ all -> 0x008f }
            r0.setCurrentEditor$okhttp(r10)     // Catch:{ all -> 0x008f }
            monitor-exit(r9)
            return r10
        L_0x0082:
            okhttp3.internal.concurrent.TaskQueue r3 = r9.cleanupQueue     // Catch:{ all -> 0x008f }
            okhttp3.internal.cache.DiskLruCache$cleanupTask$1 r4 = r9.cleanupTask     // Catch:{ all -> 0x008f }
            r5 = 0
            r7 = 2
            r8 = 0
            okhttp3.internal.concurrent.TaskQueue.schedule$default(r3, r4, r5, r7, r8)     // Catch:{ all -> 0x008f }
            monitor-exit(r9)
            return r2
        L_0x008f:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.edit(java.lang.String, long):okhttp3.internal.cache.DiskLruCache$Editor");
    }
}
