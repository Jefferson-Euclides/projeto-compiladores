/* The following code was generated by JFlex 1.4.3 on 27/11/19 16:43 */

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 27/11/19 16:43 from the specification file
 * <tt>C:/Users/AlltaxSamsung00/eclipse-workspace/CompiladorMiniPascal/src/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\4\2\0\1\3\22\0\1\3\1\0\1\6\5\0"+
    "\1\45\1\46\1\41\1\37\1\3\1\40\1\52\1\42\12\2\1\35"+
    "\1\51\1\44\1\36\1\43\2\0\1\34\1\22\2\1\1\23\3\1"+
    "\1\7\6\1\1\47\1\1\1\15\1\20\7\1\4\0\1\1\1\0"+
    "\1\16\2\1\1\24\1\12\1\25\1\13\1\27\1\21\2\1\1\17"+
    "\1\50\1\10\1\31\1\33\1\1\1\14\1\26\1\11\1\32\1\1"+
    "\1\30\3\1\1\0\1\0\1\5\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\4\1\6"+
    "\20\2\1\1\1\7\1\10\1\11\1\12\1\13\2\7"+
    "\1\14\1\15\1\2\1\16\1\17\1\0\10\2\1\20"+
    "\2\2\1\21\2\2\1\22\2\2\1\23\1\0\11\2"+
    "\1\24\3\2\1\25\1\0\2\2\1\26\1\27\1\30"+
    "\1\2\1\31\4\2\1\3\4\2\1\32\1\33\1\34"+
    "\2\2\1\35\1\2\1\36";

  private static int [] zzUnpackAction() {
    int [] result = new int[96];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\53\0\126\0\201\0\254\0\327\0\53\0\53"+
    "\0\u0102\0\u012d\0\u0158\0\u0183\0\u01ae\0\u01d9\0\u0204\0\u022f"+
    "\0\u025a\0\u0285\0\u02b0\0\u02db\0\u0306\0\u0331\0\u035c\0\u0387"+
    "\0\u03b2\0\53\0\53\0\53\0\53\0\53\0\u03dd\0\u0408"+
    "\0\u0433\0\53\0\u045e\0\53\0\53\0\53\0\u0489\0\u04b4"+
    "\0\u04df\0\u050a\0\u0535\0\u0560\0\u058b\0\u05b6\0\126\0\u05e1"+
    "\0\u060c\0\126\0\u0637\0\u0662\0\126\0\u068d\0\u06b8\0\53"+
    "\0\u06e3\0\u070e\0\u0739\0\u0764\0\u078f\0\u07ba\0\u07e5\0\u0810"+
    "\0\u083b\0\u0866\0\126\0\u0891\0\u08bc\0\u08e7\0\126\0\u0912"+
    "\0\u093d\0\u0968\0\126\0\126\0\126\0\u0993\0\126\0\u09be"+
    "\0\u09e9\0\u0a14\0\u0a3f\0\53\0\u0a6a\0\u0a95\0\u0ac0\0\u0aeb"+
    "\0\126\0\126\0\126\0\u0b16\0\u0b41\0\126\0\u0b6c\0\126";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[96];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\3\1\12\1\13\1\3\1\14\1\15\1\16\1\3"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\2\3\1\25"+
    "\1\26\1\27\1\3\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\3"+
    "\1\44\1\45\4\46\1\0\1\7\46\46\2\3\1\46"+
    "\1\0\1\7\1\46\26\3\12\46\2\3\4\46\1\4"+
    "\1\46\1\0\1\7\50\46\1\5\1\0\1\7\45\46"+
    "\53\0\1\46\2\3\1\46\1\0\1\7\1\46\1\3"+
    "\1\47\24\3\12\46\2\3\3\46\2\3\1\46\1\0"+
    "\1\7\1\46\5\3\1\50\12\3\1\51\5\3\12\46"+
    "\2\3\3\46\2\3\1\46\1\0\1\7\1\46\10\3"+
    "\1\52\15\3\12\46\2\3\3\46\2\3\1\46\1\0"+
    "\1\7\1\46\3\3\1\53\22\3\12\46\2\3\3\46"+
    "\2\3\1\46\1\0\1\7\1\46\3\3\1\54\22\3"+
    "\12\46\2\3\3\46\2\3\1\46\1\0\1\7\1\46"+
    "\1\3\1\55\24\3\12\46\2\3\3\46\2\3\1\46"+
    "\1\0\1\7\1\46\2\3\1\56\23\3\12\46\2\3"+
    "\3\46\2\3\1\46\1\0\1\7\1\46\16\3\1\57"+
    "\7\3\12\46\2\3\3\46\2\3\1\46\1\0\1\7"+
    "\1\46\3\3\1\60\22\3\12\46\2\3\3\46\2\3"+
    "\1\46\1\0\1\7\1\46\1\3\1\61\24\3\12\46"+
    "\2\3\3\46\2\3\1\46\1\0\1\7\1\46\22\3"+
    "\1\62\3\3\12\46\2\3\3\46\2\3\1\46\1\0"+
    "\1\7\1\46\7\3\1\63\16\3\12\46\2\3\3\46"+
    "\2\3\1\46\1\0\1\7\1\46\20\3\1\64\5\3"+
    "\12\46\2\3\3\46\2\3\1\46\1\0\1\7\1\46"+
    "\5\3\1\65\20\3\12\46\2\3\3\46\2\3\1\46"+
    "\1\0\1\7\1\46\1\3\1\66\24\3\12\46\2\3"+
    "\3\46\2\3\1\46\1\0\1\7\1\46\10\3\1\67"+
    "\15\3\12\46\2\3\6\46\1\0\1\7\30\46\1\70"+
    "\20\46\1\0\1\7\30\46\1\32\20\46\1\0\1\7"+
    "\30\46\1\32\4\46\1\32\13\46\1\0\1\7\32\46"+
    "\1\71\13\46\2\3\1\46\1\0\1\7\1\46\5\3"+
    "\1\72\20\3\12\46\2\3\3\46\2\3\1\46\1\0"+
    "\1\7\1\46\2\3\1\73\23\3\12\46\2\3\3\46"+
    "\2\3\1\46\1\0\1\7\1\46\23\3\1\74\2\3"+
    "\12\46\2\3\3\46\2\3\1\46\1\0\1\7\1\46"+
    "\3\3\1\75\22\3\12\46\2\3\3\46\2\3\1\46"+
    "\1\0\1\7\1\46\17\3\1\76\6\3\12\46\2\3"+
    "\3\46\2\3\1\46\1\0\1\7\1\46\24\3\1\77"+
    "\1\3\12\46\2\3\3\46\2\3\1\46\1\0\1\7"+
    "\1\46\7\3\1\100\16\3\12\46\2\3\3\46\2\3"+
    "\1\46\1\0\1\7\1\46\15\3\1\65\10\3\12\46"+
    "\2\3\3\46\2\3\1\46\1\0\1\7\1\46\5\3"+
    "\1\101\20\3\12\46\2\3\3\46\2\3\1\46\1\0"+
    "\1\7\1\46\4\3\1\102\21\3\12\46\2\3\3\46"+
    "\2\3\1\46\1\0\1\7\1\46\15\3\1\103\10\3"+
    "\12\46\2\3\3\46\2\3\1\46\1\0\1\7\1\46"+
    "\10\3\1\104\15\3\12\46\2\3\3\46\2\3\1\46"+
    "\1\0\1\7\1\46\12\3\1\105\13\3\12\46\2\3"+
    "\3\46\2\3\1\46\1\0\1\7\1\46\2\3\1\106"+
    "\23\3\12\46\2\3\3\46\2\3\1\46\1\0\1\7"+
    "\1\46\10\3\1\107\15\3\12\46\2\3\4\46\1\110"+
    "\1\46\1\0\1\7\46\46\2\3\1\46\1\0\1\7"+
    "\1\46\22\3\1\111\3\3\12\46\2\3\3\46\2\3"+
    "\1\46\1\0\1\7\1\46\3\3\1\112\22\3\12\46"+
    "\2\3\3\46\2\3\1\46\1\0\1\7\1\46\3\3"+
    "\1\113\22\3\12\46\2\3\3\46\2\3\1\46\1\0"+
    "\1\7\1\46\1\3\1\114\24\3\12\46\2\3\3\46"+
    "\2\3\1\46\1\0\1\7\1\46\3\3\1\115\22\3"+
    "\12\46\2\3\3\46\2\3\1\46\1\0\1\7\1\46"+
    "\3\3\1\116\22\3\12\46\2\3\3\46\2\3\1\46"+
    "\1\0\1\7\1\46\10\3\1\117\15\3\12\46\2\3"+
    "\3\46\2\3\1\46\1\0\1\7\1\46\12\3\1\120"+
    "\13\3\12\46\2\3\3\46\2\3\1\46\1\0\1\7"+
    "\1\46\12\3\1\121\13\3\12\46\2\3\3\46\2\3"+
    "\1\46\1\0\1\7\1\46\17\3\1\74\6\3\12\46"+
    "\2\3\3\46\2\3\1\46\1\0\1\7\1\46\10\3"+
    "\1\122\15\3\12\46\2\3\3\46\2\3\1\46\1\0"+
    "\1\7\1\46\12\3\1\123\13\3\12\46\2\3\4\46"+
    "\1\110\1\46\1\0\1\7\40\46\1\124\5\46\2\3"+
    "\1\46\1\0\1\7\1\46\4\3\1\125\21\3\12\46"+
    "\2\3\3\46\2\3\1\46\1\0\1\7\1\46\4\3"+
    "\1\126\21\3\12\46\2\3\3\46\2\3\1\46\1\0"+
    "\1\7\1\46\7\3\1\127\16\3\12\46\2\3\3\46"+
    "\2\3\1\46\1\0\1\7\1\46\1\3\1\130\24\3"+
    "\12\46\2\3\3\46\2\3\1\46\1\0\1\7\1\46"+
    "\1\3\1\131\24\3\12\46\2\3\3\46\2\3\1\46"+
    "\1\0\1\7\1\46\3\3\1\132\22\3\12\46\2\3"+
    "\3\46\2\3\1\46\1\0\1\7\1\46\10\3\1\133"+
    "\15\3\12\46\2\3\3\46\2\3\1\46\1\0\1\7"+
    "\1\46\5\3\1\134\20\3\12\46\2\3\3\46\2\3"+
    "\1\46\1\0\1\7\1\46\3\3\1\135\22\3\12\46"+
    "\2\3\3\46\2\3\1\46\1\0\1\7\1\46\2\3"+
    "\1\136\23\3\12\46\2\3\3\46\2\3\1\46\1\0"+
    "\1\7\1\46\4\3\1\117\21\3\12\46\2\3\3\46"+
    "\2\3\1\46\1\0\1\7\1\46\7\3\1\137\16\3"+
    "\12\46\2\3\3\46\2\3\1\46\1\0\1\7\1\46"+
    "\5\3\1\117\20\3\12\46\2\3\3\46\2\3\1\46"+
    "\1\0\1\7\1\46\26\3\12\46\1\3\1\140\2\46";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2967];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\4\1\1\11\37\1\1\0\22\1\1\0\16\1"+
    "\1\0\30\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[96];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 132) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 13: 
          { lexeme=yytext(); return Tokens.Parenteses_f;
          }
        case 31: break;
        case 29: 
          { lexeme=yytext(); return Tokens.Repeat;
          }
        case 32: break;
        case 7: 
          { lexeme = yytext(); return Tokens.Op_relacional;
          }
        case 33: break;
        case 5: 
          { return Tokens.Linha;
          }
        case 34: break;
        case 25: 
          { lexeme=yytext(); return Tokens.T_dado;
          }
        case 35: break;
        case 22: 
          { lexeme = yytext(); return Tokens.Op_booleano;
          }
        case 36: break;
        case 26: 
          { lexeme=yytext(); return Tokens.Begin;
          }
        case 37: break;
        case 3: 
          { lexeme=yytext(); return Tokens.Numero;
          }
        case 38: break;
        case 12: 
          { lexeme=yytext(); return Tokens.Parenteses_a;
          }
        case 39: break;
        case 19: 
          { lexeme=yytext(); return Tokens.Igual;
          }
        case 40: break;
        case 10: 
          { lexeme=yytext(); return Tokens.Multiplicacao;
          }
        case 41: break;
        case 9: 
          { lexeme=yytext(); return Tokens.Subtracao;
          }
        case 42: break;
        case 16: 
          { lexeme=yytext(); return Tokens.If;
          }
        case 43: break;
        case 28: 
          { lexeme=yytext(); return Tokens.Until;
          }
        case 44: break;
        case 23: 
          { lexeme=yytext(); return Tokens.Then;
          }
        case 45: break;
        case 24: 
          { lexeme=yytext(); return Tokens.Else;
          }
        case 46: break;
        case 20: 
          { lexeme=yytext(); return Tokens.End;
          }
        case 47: break;
        case 21: 
          { lexeme=yytext(); return Tokens.All;
          }
        case 48: break;
        case 2: 
          { lexeme=yytext(); return Tokens.Identificador;
          }
        case 49: break;
        case 27: 
          { lexeme=yytext(); return Tokens.While;
          }
        case 50: break;
        case 15: 
          { lexeme=yytext(); return Tokens.Ponto;
          }
        case 51: break;
        case 17: 
          { lexeme=yytext(); return Tokens.Do;
          }
        case 52: break;
        case 18: 
          { lexeme=yytext(); return Tokens.Op_logico;
          }
        case 53: break;
        case 4: 
          { /*Ignore*/
          }
        case 54: break;
        case 8: 
          { lexeme=yytext(); return Tokens.Soma;
          }
        case 55: break;
        case 30: 
          { lexeme=yytext(); return Tokens.Program;
          }
        case 56: break;
        case 14: 
          { lexeme=yytext(); return Tokens.PontoVirgula;
          }
        case 57: break;
        case 11: 
          { lexeme=yytext(); return Tokens.Divisao;
          }
        case 58: break;
        case 6: 
          { lexeme=yytext(); return Tokens.Barra;
          }
        case 59: break;
        case 1: 
          { return Tokens.ERROR;
          }
        case 60: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
