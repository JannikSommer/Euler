// DO NOT EDIT
// Generated by JFlex 1.8.1 http://jflex.de/
// source: Token_specefication_JFlex.flex




// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Yylex {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
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
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\3\3\22\0\1\1\1\4\1\5"+
    "\1\0\1\6\1\7\2\0\1\10\1\11\1\7\1\12"+
    "\1\13\1\14\1\15\1\7\12\16\1\0\1\17\1\20"+
    "\1\21\1\22\2\0\32\23\1\24\1\0\1\25\3\0"+
    "\1\26\1\23\1\27\1\30\1\31\1\32\1\23\1\33"+
    "\1\34\2\23\1\35\1\36\1\37\1\40\1\41\1\23"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\50\2\23"+
    "\1\51\1\0\1\52\7\0\1\3\u01a2\0\2\3\326\0"+
    "\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\2\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\15\1\17\1\20\1\21\11\17\1\1\1\15\1\0"+
    "\1\22\4\0\1\23\2\17\1\24\6\17\3\0\1\13"+
    "\3\0\1\25\1\17\1\26\1\0\1\17\1\27\4\17"+
    "\6\0\1\30\1\0\2\17\1\31\2\17\6\0\1\17"+
    "\1\32\1\17\1\33\5\0\1\34\1\35\3\0\1\36"+
    "\10\0\1\37\1\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[109];
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
    "\0\0\0\53\0\126\0\126\0\201\0\254\0\53\0\53"+
    "\0\53\0\53\0\53\0\53\0\53\0\327\0\53\0\u0102"+
    "\0\201\0\201\0\u012d\0\53\0\53\0\u0158\0\u0183\0\u01ae"+
    "\0\u01d9\0\u0204\0\u022f\0\u025a\0\u0285\0\u02b0\0\u02db\0\53"+
    "\0\254\0\254\0\u0306\0\u0331\0\u035c\0\u0387\0\u012d\0\u03b2"+
    "\0\u03dd\0\u0408\0\u0433\0\u045e\0\u0489\0\u04b4\0\u04df\0\u050a"+
    "\0\u02db\0\u0535\0\u0560\0\u0306\0\u058b\0\u05b6\0\u05e1\0\53"+
    "\0\u060c\0\u012d\0\u0637\0\u0662\0\u012d\0\u068d\0\u06b8\0\u06e3"+
    "\0\u070e\0\u0739\0\u0764\0\u078f\0\u07ba\0\u07e5\0\u0810\0\u012d"+
    "\0\u083b\0\u0866\0\u0891\0\u012d\0\u08bc\0\u08e7\0\u0912\0\u093d"+
    "\0\u0968\0\u0993\0\u09be\0\u09e9\0\u0a14\0\u012d\0\u0a3f\0\u012d"+
    "\0\u0a6a\0\u0a95\0\u0ac0\0\u0aeb\0\u0b16\0\u012d\0\u012d\0\u0b41"+
    "\0\u0b6c\0\u0b97\0\53\0\u0bc2\0\u0bed\0\u0c18\0\u0c43\0\u0c6e"+
    "\0\u0c99\0\u0cc4\0\u0cef\0\53\0\u0d1a";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[109];
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
    "\1\2\1\3\1\4\1\2\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\2\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\2\23\1\26"+
    "\1\27\2\23\1\30\1\23\1\31\1\32\1\23\1\33"+
    "\2\23\1\34\1\23\1\35\1\36\1\23\1\37\1\2"+
    "\54\0\2\3\71\0\1\40\31\0\2\41\2\0\1\41"+
    "\1\42\45\41\15\0\1\43\1\16\4\0\1\23\2\0"+
    "\23\23\3\0\2\44\13\0\1\45\2\0\1\40\1\0"+
    "\1\46\2\0\23\46\20\0\1\23\4\0\1\23\2\0"+
    "\23\23\20\0\1\23\4\0\1\23\2\0\12\23\1\47"+
    "\10\23\20\0\1\23\4\0\1\23\2\0\7\23\1\50"+
    "\1\23\1\51\11\23\20\0\1\23\4\0\1\23\2\0"+
    "\4\23\1\52\16\23\20\0\1\23\4\0\1\23\2\0"+
    "\1\53\22\23\20\0\1\23\4\0\1\23\2\0\17\23"+
    "\1\54\3\23\20\0\1\23\4\0\1\23\2\0\14\23"+
    "\1\55\6\23\20\0\1\23\4\0\1\23\2\0\5\23"+
    "\1\56\15\23\20\0\1\23\4\0\1\23\2\0\3\23"+
    "\1\57\17\23\20\0\1\23\4\0\1\23\2\0\5\23"+
    "\1\60\15\23\3\0\2\61\13\0\1\62\4\0\1\63"+
    "\2\0\23\63\20\0\1\64\35\0\2\44\13\0\1\45"+
    "\4\0\1\46\2\0\23\46\3\0\2\65\10\0\1\66"+
    "\1\0\1\67\1\45\3\0\1\70\1\46\2\0\23\46"+
    "\3\0\2\65\10\0\1\66\2\0\1\46\3\0\1\70"+
    "\1\46\2\0\23\46\20\0\1\23\4\0\1\23\2\0"+
    "\15\23\1\71\5\23\20\0\1\23\4\0\1\23\2\0"+
    "\2\23\1\72\20\23\3\0\2\73\13\0\1\23\4\0"+
    "\1\23\2\0\23\23\20\0\1\23\4\0\1\23\2\0"+
    "\16\23\1\74\4\23\20\0\1\23\4\0\1\23\2\0"+
    "\10\23\1\75\12\23\20\0\1\23\4\0\1\23\2\0"+
    "\6\23\1\76\14\23\20\0\1\23\4\0\1\23\2\0"+
    "\3\23\1\77\17\23\20\0\1\23\4\0\1\23\2\0"+
    "\1\23\1\100\21\23\20\0\1\23\4\0\1\23\2\0"+
    "\6\23\1\101\14\23\3\0\2\102\10\0\1\103\1\0"+
    "\1\104\1\62\4\0\1\63\2\0\23\63\3\0\2\102"+
    "\10\0\1\103\2\0\1\63\4\0\1\63\2\0\23\63"+
    "\3\0\2\65\10\0\1\66\6\0\1\70\31\0\2\66"+
    "\13\0\1\105\4\0\1\106\2\0\23\106\20\0\1\107"+
    "\52\0\1\23\4\0\1\23\2\0\3\23\1\110\17\23"+
    "\3\0\2\73\26\0\1\111\37\0\1\23\4\0\1\23"+
    "\2\0\14\23\1\112\6\23\20\0\1\23\4\0\1\23"+
    "\2\0\11\23\1\113\11\23\20\0\1\23\4\0\1\23"+
    "\2\0\11\23\1\114\11\23\20\0\1\23\4\0\1\23"+
    "\2\0\16\23\1\115\4\23\20\0\1\23\4\0\1\23"+
    "\2\0\7\23\1\116\13\23\3\0\2\102\10\0\1\103"+
    "\40\0\2\103\13\0\1\117\4\0\1\120\2\0\23\120"+
    "\20\0\1\121\35\0\2\122\10\0\1\66\1\0\1\123"+
    "\1\105\3\0\1\70\1\106\2\0\23\106\3\0\2\122"+
    "\10\0\1\66\2\0\1\106\3\0\1\70\1\106\2\0"+
    "\23\106\3\0\2\65\10\0\1\66\2\0\1\107\3\0"+
    "\1\70\65\0\1\124\33\0\1\23\4\0\1\23\2\0"+
    "\6\23\1\125\14\23\20\0\1\23\4\0\1\23\2\0"+
    "\16\23\1\126\4\23\20\0\1\23\4\0\1\23\2\0"+
    "\12\23\1\127\10\23\20\0\1\23\4\0\1\23\2\0"+
    "\3\23\1\130\17\23\3\0\2\131\10\0\1\103\1\0"+
    "\1\132\1\117\1\133\3\0\1\120\2\0\23\120\3\0"+
    "\2\131\10\0\1\103\2\0\1\120\1\133\3\0\1\120"+
    "\2\0\23\120\3\0\2\102\10\0\1\103\2\0\1\121"+
    "\35\0\2\122\17\0\1\70\46\0\1\134\77\0\1\135"+
    "\25\0\1\23\4\0\1\23\2\0\22\23\1\136\20\0"+
    "\1\23\4\0\1\23\2\0\14\23\1\137\6\23\3\0"+
    "\2\131\10\0\1\103\3\0\1\133\51\0\1\140\35\0"+
    "\2\133\13\0\1\141\4\0\1\142\2\0\23\142\3\0"+
    "\2\122\10\0\1\66\2\0\1\134\3\0\1\70\61\0"+
    "\1\143\22\0\2\131\10\0\1\103\2\0\1\140\1\133"+
    "\34\0\2\144\10\0\1\145\1\0\1\146\1\141\4\0"+
    "\1\142\2\0\23\142\3\0\2\144\10\0\1\145\2\0"+
    "\1\142\4\0\1\142\2\0\23\142\3\0\2\144\10\0"+
    "\1\145\40\0\2\145\13\0\1\147\4\0\1\150\2\0"+
    "\23\150\20\0\1\151\35\0\2\152\10\0\1\145\1\0"+
    "\1\153\1\147\1\133\3\0\1\150\2\0\23\150\1\0"+
    "\1\154\1\0\2\152\10\0\1\145\2\0\1\150\1\133"+
    "\3\0\1\150\2\0\23\150\1\0\1\154\1\0\2\144"+
    "\10\0\1\145\2\0\1\151\35\0\2\152\10\0\1\145"+
    "\3\0\1\133\32\0\1\154\16\0\1\155\35\0\2\152"+
    "\10\0\1\145\2\0\1\155\1\133\32\0\1\154";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3397];
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\7\11\1\1\1\11\4\1\2\11"+
    "\12\1\1\11\1\0\1\1\4\0\12\1\3\0\1\1"+
    "\3\0\1\11\2\1\1\0\6\1\6\0\1\1\1\0"+
    "\5\1\6\0\4\1\5\0\2\1\3\0\1\11\10\0"+
    "\1\11\1\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[109];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  @SuppressWarnings("unused")
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
   /*  Call me to say what you found */
   public void found(String str) {
      System.out.println();  System.out.flush();  /* flush std out */
      System.err.println("Found |" + str + "| from text -->" + yytext() + "<--");
   }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.out.print(yytext());
            }
            // fall through
          case 32: break;
          case 2:
            { /* ignore */
            }
            // fall through
          case 33: break;
          case 3:
            { found("symbol.NewLine");
            }
            // fall through
          case 34: break;
          case 4:
            { found("symbol.EOF");
            }
            // fall through
          case 35: break;
          case 5:
            { found("symbol.MultOp");
            }
            // fall through
          case 36: break;
          case 6:
            { found("symbol.ParenthesesStart");
            }
            // fall through
          case 37: break;
          case 7:
            { found("symbol.ParenthesesEnd");
            }
            // fall through
          case 38: break;
          case 8:
            { found("symbol.plus");
            }
            // fall through
          case 39: break;
          case 9:
            { found("symbol.Seperator");
            }
            // fall through
          case 40: break;
          case 10:
            { found("symbol.minus");
            }
            // fall through
          case 41: break;
          case 11:
            { found("symbol.Number");
            }
            // fall through
          case 42: break;
          case 12:
            { found("symbol.LineTerminator");
            }
            // fall through
          case 43: break;
          case 13:
            { found("symbol.LogOP");
            }
            // fall through
          case 44: break;
          case 14:
            { found("symbol.EqualSign");
            }
            // fall through
          case 45: break;
          case 15:
            { found("symbol.ID");
            }
            // fall through
          case 46: break;
          case 16:
            { found("symbol.SquarebracketStart");
            }
            // fall through
          case 47: break;
          case 17:
            { found("symbol.SquarebracketEnd");
            }
            // fall through
          case 48: break;
          case 18:
            { found("symbol.String");
            }
            // fall through
          case 49: break;
          case 19:
            { found("symbol.do");
            }
            // fall through
          case 50: break;
          case 20:
            { found("symbol.if");
            }
            // fall through
          case 51: break;
          case 21:
            { found("symbol.Vector");
            }
            // fall through
          case 52: break;
          case 22:
            { found("symbol.end");
            }
            // fall through
          case 53: break;
          case 23:
            { found("symbol.numDLC");
            }
            // fall through
          case 54: break;
          case 24:
            { found("symbol.else");
            }
            // fall through
          case 55: break;
          case 25:
            { found("symbol.then");
            }
            // fall through
          case 56: break;
          case 26:
            { found("symbol.print");
            }
            // fall through
          case 57: break;
          case 27:
            { found("symbol.while");
            }
            // fall through
          case 58: break;
          case 28:
            { found("symbol.matrixDLC");
            }
            // fall through
          case 59: break;
          case 29:
            { found("symbol.vectorDLC");
            }
            // fall through
          case 60: break;
          case 30:
            { found("symbol.ifelse");
            }
            // fall through
          case 61: break;
          case 31:
            { found("symbol.Matrix");
            }
            // fall through
          case 62: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java Yylex [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          // Side-effect: is encodingName valid?
          java.nio.charset.Charset.forName(encodingName);
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Yylex scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Yylex(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
