 public class OOPSBannerAppUC7  {
    static class CharacterPatternMap {
        char character;
        String[] pattern;

        CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }
    }

    public static void main(String[] args) {

        String[] oPattern = {
            "   *   ",
            " *   * ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " *   * ",
            "   *   "
        };

        String[] pPattern = {
            "**   ",
            "*    * ",
            "*     *",
            "*    * ",
            "**   ",
            "**       ",
            "**       ",
            "**       ",
            "**       "
        };

        String[] sPattern = {
            "   *** ",
            " **      ",
            "**       ",
            " **      ",
            "   *   ",
            "      ** ",
            "       **",
            "      ** ",
            " ***   "
        };

        CharacterPatternMap o = new CharacterPatternMap('O', oPattern);
        CharacterPatternMap p = new CharacterPatternMap('P', pPattern);
        CharacterPatternMap s = new CharacterPatternMap('S', sPattern);

        for (int i = 0; i < o.pattern.length; i++) {
            System.out.println(o.pattern[i] + " " + o.pattern[i] + " " + p.pattern[i] + " " + s.pattern[i]);
        }
    }
}

