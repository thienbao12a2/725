import java.util.*;
import Java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class TestTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    }
}
public lexicalAnalyzer {
    char ch;
    BufferedReader scanner;
    List<Token> token = new ArrayList<>();
    String keyword[] = {"double", "byte", "int", "else", "while" "char", "continue", "import", "for", "long", "short", "static", "switch", "void", "case", "break", "const", "default", "do", "*"}
}

public lexicalFile(File file) {
    try {
        reader = new BufferReader;
    }
}

public Token() {
    int state = 1;
    while (true) {
        switch() {
            case 1: {
                if(ch == '' || ch == '\f' || ch == '\b' || ch == '\t' || ch == '\n' || ch == '\r' ||) {
                    ch = readNextchar();
                    continue;
                }
                else if (ch == '+') {
                    ch = nextChar();
                    return new Token("+");
                }
                else if (ch == '-') {
                    ch = nextChar();
                    return new Token("-");
                }
                else if (ch == '*') {
                    ch = nextChar();
                    return new Token("*");
                }
                else if (ch == '/') {
                    ch = nextChar();
                    return new Token("/");
                }
                else if (ch == ';') {
                    ch = nextChar();
                    return new Token(";");
                }
                else if (ch == '%') {
                    ch = nextChar();
                    return new Token("%");
                }
                else if (ch == '{') {
                    ch = nextChar();
                    return new Token("{");
                }
                else if (ch == '}') {
                    ch = nextChar();
                    return new Token("}");
                }
                else if (ch == ',') {
                    ch = nextChar();
                    return new Token(",");
                }
                else if (ch == '(') {
                    ch = nextChar();
                    return new Token("(");
                }
                else if (ch == ')') {
                    ch = nextChar();
                    return new Token(")");
                }
                else if (ch == '(') {
                    ch = nextChar();
                    return new Token("(");
                }
                else if (ch == '!') {
                    ch = nextChar();
                    return new Token("!");
                }
                else if (ch == '&') {
                    ch = nextChar();
                    return new Token("&");
                }
            }
        }
    }
}