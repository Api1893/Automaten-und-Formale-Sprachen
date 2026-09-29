public class WortImpl implements Wort {
      private String wort;

      public WortImpl(String s) {
            this.wort = s;
      }

      @Override
      public char position(int s) {
            // -1 because we want position and not index
            return wort.charAt(s - 1);
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
            int characters = 0;
            for (int i = 0; i < wort.length(); i++) {
                  if (wort.charAt(i) == c) {
                        characters++;
                  }
            };
            return characters;
      }

      @Override
      public Wort tausche(char c1, char c2) {
            // Required new WortImpl(), cause new object 
            return new WortImpl(wort.replace(c1, c2));
      }

      @Override
      public int istTeilwortVon(Wort w) {
            return this.wort.indexOf(w.toString());
      }

      @Override
      public Wort teilwort(int start, int laenge) {
            String ausgeschnitten = wort.substring(start, start + laenge);
            return new WortImpl(ausgeschnitten);
      }

      @Override
      public Wort ersetze(Wort w1, Wort w2) {
            // Wort is an object, so change the object to String()
            return new WortImpl(wort.replace(w1.toString(), w2.toString()));
      }
}