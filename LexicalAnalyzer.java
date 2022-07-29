import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.IOException;

interface lexinterface {
  void addChar();
  void getChar();
  void getNonBlank();
  int lex();
}
enum Tokens { 
  LETTER(0), DIGIT(1), UNKNOWN(99),
    INT_LIT(10), IDENT(11), ASSIGN_OP(20),
    ADD_OP(21), SUB_OP(22), MULT_OP(23),
    DIV_OP(24), LEFT_PAREN(25), RIGHT_PAREN(26), EOF(-1);
  int code;
  Tokens(int c) {
    this.code = c;
  }
}
public class LexicalAnalyzer { 
  int charClass;
  String lexeme;
  char nextChar;
  int lexLen;
  int token;
  int nexttoken;
  File file;
  public static void main (String[] a) throws/*Keyword for Exception*/ IOException {
    LexicalAnalyzer lexicalAnalyzer = new LexicalAnalyzer();
    File file = new File("C:/Users/Bao Ton/file.txt");
    if (file.exists()) {
      try {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        int ch;
        Tokens token = Tokens.UNKNOWN;
        while ((ch = br.read()) != -1) {
          lexicalAnalyzer.nextChar = (char) ch;
          if (ch == 32) { 
            continue;
          } else if (Character.isDigit(ch)) {
            token = Tokens.DIGIT;
          } else if (Character.isAlphabetic(ch)) {
            token = Tokens.LETTER;
          } else {
            token = Tokens.UNKNOWN;
          }
          lexicalAnalyzer.lex(ch, token);
        }
        lexicalAnalyzer.lex(ch, Tokens.EOF);
      } finally {}
    } else {
      System.out.println("File doesn't exist");
    }
  }
  void addChar() { 
    if (lexLen <= 98) {
      lexeme += nextChar;
      lexLen++;
    } else {
      System.out.println("Error - Lexeme is too long");
    }
  }

  private void lookup(int ch) { 
    switch ((char) ch) {
    case '(':
      addChar();
      nexttoken = (char) Tokens.LEFT_PAREN.code;
      break;
    case ')':
      addChar();
      nexttoken = (char) Tokens.RIGHT_PAREN.code;
      break;
    case '+':
      addChar();
      nexttoken = (char) Tokens.ADD_OP.code;
      break;
    case '-':
      addChar();
      nexttoken = (char) Tokens.SUB_OP.code;
      break;
    case '*':
      addChar();
      nexttoken = (char) Tokens.MULT_OP.code;
      break;
    case '/':
      addChar();
      nexttoken = (char) Tokens.DIV_OP.code;
      break;
    default:
      addChar();
      nexttoken = (char) Tokens.EOF.code;
    }
  }

  private void lex(int ch, Tokens token) { 
    switch (token) {
    case LETTER:
      addChar();
      nexttoken = Tokens.IDENT.code;
      break;
    case DIGIT:
      addChar();
      nexttoken = Tokens.INT_LIT.code;
      break;
    case UNKNOWN:
      lookup(ch);
      break;
    case EOF:
      nexttoken = Tokens.EOF.code;
      lexeme = "EOF";
    }
    System.out.println("Next Token is " + String.valueOf(nexttoken) + ";Next lexeme is " + new String(lexeme));
  }
  
}