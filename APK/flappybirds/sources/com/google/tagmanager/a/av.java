package com.google.tagmanager.a;

class av implements i {
    int a;
    final /* synthetic */ ar b;
    private final au c;
    private i d;

    private av(ar arVar) {
        this.b = arVar;
        this.c = new au(arVar);
        this.d = this.c.next().iterator();
        this.a = arVar.a();
    }

    /* renamed from: a */
    public Byte next() {
        return Byte.valueOf(b());
    }

    public byte b() {
        if (!this.d.hasNext()) {
            this.d = this.c.next().iterator();
        }
        this.a--;
        return this.d.b();
    }

    public boolean hasNext() {
        return this.a > 0;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
