public class WortImpl implements Wort {
      private String wort;

      public WortImpl(String s) {
            this.wort = s;
      }

      @Override
      public char position(int k) {
            return wort.charAt(k);
      }

      @Override
      public int laenge() {
            return wort.length();
      }

      @Override
      public Wort concat(Wort w) {
            return new WortImpl(wort.concat(w.toString()));
      }

      @Override
      public int anzahl(char c) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'anzahl'");
      }

      @Override
      public Wort tausche(char c1, char c2) {
            return null;
      }

      @Override
      public int istTeilwortVon(Wort w) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'istTeilwortVon'");
      }

      @Override
      public Wort teilwort(int start, int laenge) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'teilwort'");
      }

      @Override
      public Wort ersetze(Wort w1, Wort w2) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'ersetze'");
      }
}