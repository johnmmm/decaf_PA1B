/* This is auto-generated source by LL1-Parser-Gen.
 * Specification file: /Users/mac/Desktop/programme/Java/decaf_PA1B/src/decaf/frontend/Parser.spec
 * Options: unstrict mode
 * Generated at: Mon Nov 06 11:49:03 CST 2017
 * Please do NOT modify it!
 *
 * Project repository: https://github.com/paulzfm/LL1-Parser-Gen
 * Version: special version for decaf-PA1-B
 * Author: Zhu Fengmin (Paul)
 */

package decaf.frontend;

import decaf.Location;
import decaf.tree.Tree;
import decaf.tree.Tree.*;
import java.util.*;
import javafx.util.Pair;

public class Table
 {
    public static final int eof = -1;
    public static final int eos = 0;
    
    /* tokens and symbols */
    public static final int VOID = 257; //# line 14
    public static final int BOOL = 258; //# line 14
    public static final int INT = 259; //# line 14
    public static final int STRING = 260; //# line 14
    public static final int CLASS = 261; //# line 14
    public static final int COMPLEX = 262; //# line 14
    public static final int NULL = 263; //# line 15
    public static final int EXTENDS = 264; //# line 15
    public static final int THIS = 265; //# line 15
    public static final int WHILE = 266; //# line 15
    public static final int FOR = 267; //# line 15
    public static final int IF = 268; //# line 16
    public static final int ELSE = 269; //# line 16
    public static final int RETURN = 270; //# line 16
    public static final int BREAK = 271; //# line 16
    public static final int NEW = 272; //# line 16
    public static final int PRINT = 273; //# line 17
    public static final int READ_INTEGER = 274; //# line 17
    public static final int READ_LINE = 275; //# line 17
    public static final int LITERAL = 276; //# line 18
    public static final int IDENTIFIER = 277; //# line 19
    public static final int AND = 278; //# line 19
    public static final int OR = 279; //# line 19
    public static final int STATIC = 280; //# line 19
    public static final int INSTANCEOF = 281; //# line 19
    public static final int LESS_EQUAL = 282; //# line 20
    public static final int GREATER_EQUAL = 283; //# line 20
    public static final int EQUAL = 284; //# line 20
    public static final int NOT_EQUAL = 285; //# line 20
    public static final int CASE = 286; //# line 24
    public static final int DEFAULT = 287; //# line 24
    public static final int SUPER = 288; //# line 25
    public static final int DCOPY = 289; //# line 26
    public static final int SCOPY = 290; //# line 26
    public static final int RE = 291; //# line 27
    public static final int IM = 292; //# line 27
    public static final int DO = 293; //# line 28
    public static final int OD = 294; //# line 28
    public static final int DOBLOCK = 295; //# line 29
    public static final int COMPCAST = 296; //# line 29
    public static final int PRINTCOMP = 297; //# line 29
    
    public static final int VariableDef = 298;
    public static final int ExprT5 = 299;
    public static final int CaseStmtList = 300;
    public static final int Oper3 = 301;
    public static final int Oper6 = 302;
    public static final int VariableList = 303;
    public static final int Formals = 304;
    public static final int Oper7 = 305;
    public static final int Expr8 = 306;
    public static final int AfterSimpleTypeExpr = 307;
    public static final int Expr2 = 308;
    public static final int Oper2 = 309;
    public static final int DefaultStmt = 310;
    public static final int Expr6 = 311;
    public static final int Cases = 312;
    public static final int BreakStmt = 313;
    public static final int ExprT2 = 314;
    public static final int StmtList = 315;
    public static final int Constant = 316;
    public static final int SubVariableList = 317;
    public static final int PrintStmt = 318;
    public static final int ForStmt = 319;
    public static final int Expr9 = 320;
    public static final int Expr1 = 321;
    public static final int Oper1 = 322;
    public static final int ElseClause = 323;
    public static final int FieldList = 324;
    public static final int SubExprList = 325;
    public static final int AfterParenExpr = 326;
    public static final int ClassDef = 327;
    public static final int ReturnStmt = 328;
    public static final int ExprList = 329;
    public static final int Do = 330;
    public static final int StmtBlock = 331;
    public static final int FunctionField = 332;
    public static final int AfterIdentExpr = 333;
    public static final int DoStmt = 334;
    public static final int Program = 335;
    public static final int Expr = 336;
    public static final int CaseStmt = 337;
    public static final int Type = 338;
    public static final int Expr5 = 339;
    public static final int AfterNewExpr = 340;
    public static final int Assignment = 341;
    public static final int ExtendsClause = 342;
    public static final int Oper5 = 343;
    public static final int ArrayType = 344;
    public static final int Expr3 = 345;
    public static final int Actuals = 346;
    public static final int Variable = 347;
    public static final int ExprT3 = 348;
    public static final int Stmt = 349;
    public static final int SimpleStmt = 350;
    public static final int SimpleType = 351;
    public static final int WhileStmt = 352;
    public static final int ExprT1 = 353;
    public static final int Expr4 = 354;
    public static final int ExprT4 = 355;
    public static final int ReturnExpr = 356;
    public static final int IfStmt = 357;
    public static final int ExprT6 = 358;
    public static final int ExprT8 = 359;
    public static final int Expr7 = 360;
    public static final int DoStmtList = 361;
    public static final int ClassList = 362;
    public static final int Oper4 = 363;
    public static final int Field = 364;
    
    /* start symbol */
    public final int start = Program;
    
    /**
      * Judge if a symbol (within valid range) is non-terminal.
      *
      * @param symbol the symbol to be judged.
      * @return true if and only if the symbol is non-terminal.
      */
        
    public boolean isNonTerminal(int symbol) {
        return symbol >= 298;
    }
    
    private final String[] allSymbols = {
        "VOID", "BOOL", "INT", "STRING", "CLASS",
        "COMPLEX", "NULL", "EXTENDS", "THIS", "WHILE",
        "FOR", "IF", "ELSE", "RETURN", "BREAK",
        "NEW", "PRINT", "READ_INTEGER", "READ_LINE", "LITERAL",
        "IDENTIFIER", "AND", "OR", "STATIC", "INSTANCEOF",
        "LESS_EQUAL", "GREATER_EQUAL", "EQUAL", "NOT_EQUAL", "CASE",
        "DEFAULT", "SUPER", "DCOPY", "SCOPY", "RE",
        "IM", "DO", "OD", "DOBLOCK", "COMPCAST",
        "PRINTCOMP", "VariableDef", "ExprT5", "CaseStmtList", "Oper3",
        "Oper6", "VariableList", "Formals", "Oper7", "Expr8",
        "AfterSimpleTypeExpr", "Expr2", "Oper2", "DefaultStmt", "Expr6",
        "Cases", "BreakStmt", "ExprT2", "StmtList", "Constant",
        "SubVariableList", "PrintStmt", "ForStmt", "Expr9", "Expr1",
        "Oper1", "ElseClause", "FieldList", "SubExprList", "AfterParenExpr",
        "ClassDef", "ReturnStmt", "ExprList", "Do", "StmtBlock",
        "FunctionField", "AfterIdentExpr", "DoStmt", "Program", "Expr",
        "CaseStmt", "Type", "Expr5", "AfterNewExpr", "Assignment",
        "ExtendsClause", "Oper5", "ArrayType", "Expr3", "Actuals",
        "Variable", "ExprT3", "Stmt", "SimpleStmt", "SimpleType",
        "WhileStmt", "ExprT1", "Expr4", "ExprT4", "ReturnExpr",
        "IfStmt", "ExprT6", "ExprT8", "Expr7", "DoStmtList",
        "ClassList", "Oper4", "Field",
    };
    
    /**
      * Debugging function (pretty print).
      * Get string presentation of some token or symbol.
      *
      * @param symbol either terminal or non-terminal.
      * @return its string presentation.
      */
        
    public String name(int symbol) {
        if (symbol == eof) return "<eof>";
        if (symbol == eos) return "<eos>";
        if (symbol > 0 && symbol <= 256) return "'" + (char) symbol + "'";
        return allSymbols[symbol - 257];
    }
    
    /* begin lookahead symbols */
    private ArrayList<Set<Integer>> begin = new ArrayList<Set<Integer>>();
    private final Integer[][] beginRaw = {
        {COMPLEX, VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('+'), Integer.valueOf('-'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {LITERAL, NULL, DEFAULT},
        {EQUAL, NOT_EQUAL},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%')},
        {COMPLEX, VOID, CLASS, INT, STRING, BOOL},
        {COMPLEX, VOID, CLASS, INT, STRING, BOOL, Integer.valueOf(')')},
        {Integer.valueOf('-'), Integer.valueOf('!')},
        {READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), SUPER, READ_INTEGER},
        {Integer.valueOf(']'), CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), SUPER, READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), SUPER, READ_INTEGER},
        {AND},
        {DEFAULT},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), SUPER, READ_INTEGER},
        {CASE},
        {BREAK},
        {AND, Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf(';')},
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, IDENTIFIER, NEW, IF, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), BOOL, SUPER, BREAK, READ_INTEGER, Integer.valueOf('{'), Integer.valueOf('}')},
        {LITERAL, NULL},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {PRINT},
        {FOR},
        {LITERAL, NULL, READ_INTEGER, READ_LINE, THIS, SUPER, NEW, INSTANCEOF, Integer.valueOf('('), IDENTIFIER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), SUPER, READ_INTEGER},
        {OR},
        {ELSE, PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), DOBLOCK, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), IDENTIFIER, NEW, IF, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), OD, BOOL, SUPER, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {COMPLEX, VOID, CLASS, INT, STRING, STATIC, BOOL, Integer.valueOf('}')},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), SUPER, READ_INTEGER, CLASS},
        {CLASS},
        {RETURN},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), SUPER, READ_INTEGER},
        {DO},
        {Integer.valueOf('{')},
        {Integer.valueOf('('), Integer.valueOf(';')},
        {Integer.valueOf('('), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), SUPER, READ_INTEGER},
        {CLASS},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), SUPER, READ_INTEGER, CASE},
        {LITERAL, NULL},
        {COMPLEX, VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), SUPER, READ_INTEGER},
        {IDENTIFIER, COMPLEX, VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('='), Integer.valueOf(';'), Integer.valueOf(')')},
        {EXTENDS, Integer.valueOf('{')},
        {Integer.valueOf('+'), Integer.valueOf('-')},
        {Integer.valueOf('['), IDENTIFIER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), SUPER, READ_INTEGER},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), SUPER, READ_INTEGER, Integer.valueOf(')')},
        {COMPLEX, VOID, CLASS, INT, STRING, BOOL},
        {EQUAL, NOT_EQUAL, Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {COMPLEX, VOID, CLASS, INT, STRING, BOOL, CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), SUPER, READ_INTEGER, IF, WHILE, FOR, RETURN, PRINT, BREAK, Integer.valueOf('{')},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), SUPER, READ_INTEGER, Integer.valueOf(';'), Integer.valueOf(')')},
        {INT, VOID, BOOL, STRING, CLASS, COMPLEX},
        {WHILE},
        {OR, Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), SUPER, READ_INTEGER},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf(']'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {CASE, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), SUPER, READ_INTEGER, Integer.valueOf(';')},
        {IF},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('['), Integer.valueOf('.'), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('-'), Integer.valueOf('!'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), SUPER, READ_INTEGER},
        {DOBLOCK, OD},
        {CLASS, eof, eos},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>')},
        {STATIC, COMPLEX, VOID, CLASS, INT, STRING, BOOL},
    };
    
    /**
      * Get begin lookahead tokens for `symbol`.
      *
      * @param symbol the non-terminal.
      * @return its begin lookahead tokens.
      */
        
    public Set<Integer> beginSet(int symbol) {
        return begin.get(symbol - 298);
    }
    
    /* follow set */
    private ArrayList<Set<Integer>> follow = new ArrayList<Set<Integer>>();
    private final Integer[][] followRaw = {
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), DOBLOCK, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), IDENTIFIER, NEW, IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), OD, BOOL, SUPER, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {LITERAL, NULL, DEFAULT},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), SUPER, READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), SUPER, READ_INTEGER},
        {Integer.valueOf(')')},
        {Integer.valueOf(')')},
        {READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), SUPER, READ_INTEGER},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), SUPER, READ_INTEGER},
        {Integer.valueOf('}')},
        {LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {Integer.valueOf(';')},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf(';')},
        {Integer.valueOf('}')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(')')},
        {Integer.valueOf(';')},
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), DOBLOCK, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), IDENTIFIER, NEW, IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), OD, BOOL, SUPER, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), SUPER, READ_INTEGER},
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), DOBLOCK, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), IDENTIFIER, NEW, IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), OD, BOOL, SUPER, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('}')},
        {Integer.valueOf(')')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {CLASS, eof, eos},
        {Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {},
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), DOBLOCK, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), IDENTIFIER, NEW, IF, THIS, INSTANCEOF, STRING, LITERAL, STATIC, ELSE, Integer.valueOf('('), Integer.valueOf(';'), OD, BOOL, SUPER, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {COMPLEX, VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, BOOL},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {OD, DOBLOCK},
        {eof, eos},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {LITERAL, NULL, DEFAULT},
        {IDENTIFIER},
        {LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('{')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), SUPER, READ_INTEGER},
        {IDENTIFIER},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {Integer.valueOf(';'), Integer.valueOf(','), Integer.valueOf(')')},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), DOBLOCK, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), IDENTIFIER, NEW, IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), OD, BOOL, SUPER, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('['), IDENTIFIER},
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), DOBLOCK, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), IDENTIFIER, NEW, IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), OD, BOOL, SUPER, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(']'), Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), Integer.valueOf('='), Integer.valueOf(';')},
        {Integer.valueOf(']'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {Integer.valueOf(']'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, AND, Integer.valueOf(';')},
        {Integer.valueOf(';')},
        {PRINT, CASE, COMPLEX, VOID, FOR, Integer.valueOf('!'), Integer.valueOf('-'), DOBLOCK, CLASS, READ_LINE, WHILE, RETURN, NULL, INT, Integer.valueOf('}'), IDENTIFIER, NEW, IF, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), OD, BOOL, SUPER, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), Integer.valueOf('='), OR, Integer.valueOf('+'), AND, Integer.valueOf('*'), Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {OD, DOBLOCK},
        {eof, eos},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), SUPER, READ_INTEGER},
        {COMPLEX, VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, BOOL},
    };
    
    /**
      * Get follow set for `symbol`.
      *
      * @param symbol the non-terminal.
      * @return its follow set.
      */
        
    public Set<Integer> followSet(int symbol) {
        return follow.get(symbol - 298);
    }
    
    public Table() {
        for (int i = 0; i < 67; i++) {
            begin.add(new HashSet(Arrays.asList(beginRaw[i])));
            follow.add(new HashSet(Arrays.asList(followRaw[i])));
        }
    }
    
    /**
      * Predictive table `M` query function.
      * `query(A, a)` will return the corresponding term `M(A, a)`, i.e., the target production
      * for non-terminal `A` when the lookahead token is `a`.
      *
      * @param nonTerminal   the non-terminal.
      * @param lookahead     the lookahead symbol.
      * @return a pair `<id, right>` where `right` is the right-hand side of the target
      * production `nonTerminal -> right`, and `id` is the corresponding action id. To execute
      * such action, call `act(id, params)`.
      * If the corresponding term is undefined in the table, `null` will be returned.
      */
        
    public Pair<Integer, List<Integer>> query(int nonTerminal, int lookahead) {
        switch (nonTerminal) {
            //# line 55
            case VariableDef: {
                switch (lookahead) {
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(0, Arrays.asList(Variable, Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 500
            case ExprT5: {
                switch (lookahead) {
                    case '+':
                    case '-':
                        return new Pair<>(1, Arrays.asList(Oper5, Expr6, ExprT5));
                    case LESS_EQUAL:
                    case ']':
                    case GREATER_EQUAL:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case AND:
                    case ';':
                    case '<':
                    case '>':
                        return new Pair<>(121, Arrays.asList());
                    default: return null;
                }
            }
            //# line 761
            case CaseStmtList: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                        return new Pair<>(3, Arrays.asList(CaseStmtList, CaseStmt));
                    case DEFAULT:
                        return new Pair<>(4, Arrays.asList());
                    default: return null;
                }
            }
            //# line 286
            case Oper3: {
                switch (lookahead) {
                    case EQUAL:
                        return new Pair<>(5, Arrays.asList(EQUAL));
                    case NOT_EQUAL:
                        return new Pair<>(6, Arrays.asList(NOT_EQUAL));
                    default: return null;
                }
            }
            //# line 332
            case Oper6: {
                switch (lookahead) {
                    case '*':
                        return new Pair<>(7, Arrays.asList(Integer.valueOf('*')));
                    case '/':
                        return new Pair<>(8, Arrays.asList(Integer.valueOf('/')));
                    case '%':
                        return new Pair<>(9, Arrays.asList(Integer.valueOf('%')));
                    default: return null;
                }
            }
            //# line 175
            case VariableList: {
                switch (lookahead) {
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(10, Arrays.asList(Variable, SubVariableList));
                    default: return null;
                }
            }
            //# line 165
            case Formals: {
                switch (lookahead) {
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(11, Arrays.asList(VariableList));
                    case ')':
                        return new Pair<>(12, Arrays.asList());
                    default: return null;
                }
            }
            //# line 349
            case Oper7: {
                switch (lookahead) {
                    case '-':
                        return new Pair<>(13, Arrays.asList(Integer.valueOf('-')));
                    case '!':
                        return new Pair<>(14, Arrays.asList(Integer.valueOf('!')));
                    default: return null;
                }
            }
            //# line 556
            case Expr8: {
                switch (lookahead) {
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(15, Arrays.asList(Expr9, ExprT8));
                    default: return null;
                }
            }
            //# line 670
            case AfterSimpleTypeExpr: {
                switch (lookahead) {
                    case ']':
                        return new Pair<>(16, Arrays.asList(Integer.valueOf(']'), Integer.valueOf('['), AfterSimpleTypeExpr));
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(17, Arrays.asList(Expr, Integer.valueOf(']')));
                    default: return null;
                }
            }
            //# line 401
            case Expr2: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(18, Arrays.asList(Expr3, ExprT2));
                    default: return null;
                }
            }
            //# line 279
            case Oper2: {
                switch (lookahead) {
                    case AND:
                        return new Pair<>(19, Arrays.asList(AND));
                    default: return null;
                }
            }
            //# line 778
            case DefaultStmt: {
                switch (lookahead) {
                    case DEFAULT:
                        return new Pair<>(20, Arrays.asList(DEFAULT, Integer.valueOf(':'), Expr, Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 517
            case Expr6: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(21, Arrays.asList(Expr7, ExprT6));
                    default: return null;
                }
            }
            //# line 755
            case Cases: {
                switch (lookahead) {
                    case CASE:
                        return new Pair<>(22, Arrays.asList(CASE, Integer.valueOf('('), Expr, Integer.valueOf(')'), Integer.valueOf('{'), CaseStmtList, DefaultStmt, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 749
            case BreakStmt: {
                switch (lookahead) {
                    case BREAK:
                        return new Pair<>(23, Arrays.asList(BREAK));
                    default: return null;
                }
            }
            //# line 413
            case ExprT2: {
                switch (lookahead) {
                    case AND:
                        return new Pair<>(24, Arrays.asList(Oper2, Expr3, ExprT2));
                    case ']':
                    case ':':
                    case ')':
                    case ',':
                    case '=':
                    case OR:
                    case ';':
                        return new Pair<>(121, Arrays.asList());
                    default: return null;
                }
            }
            //# line 202
            case StmtList: {
                switch (lookahead) {
                    case PRINT:
                    case CASE:
                    case COMPLEX:
                    case VOID:
                    case FOR:
                    case '!':
                    case '-':
                    case CLASS:
                    case READ_LINE:
                    case WHILE:
                    case RETURN:
                    case NULL:
                    case INT:
                    case IDENTIFIER:
                    case NEW:
                    case IF:
                    case THIS:
                    case INSTANCEOF:
                    case STRING:
                    case LITERAL:
                    case '(':
                    case ';':
                    case BOOL:
                    case SUPER:
                    case BREAK:
                    case READ_INTEGER:
                    case '{':
                        return new Pair<>(26, Arrays.asList(Stmt, StmtList));
                    case '}':
                        return new Pair<>(121, Arrays.asList());
                    default: return null;
                }
            }
            //# line 694
            case Constant: {
                switch (lookahead) {
                    case LITERAL:
                        return new Pair<>(28, Arrays.asList(LITERAL));
                    case NULL:
                        return new Pair<>(29, Arrays.asList(NULL));
                    default: return null;
                }
            }
            //# line 185
            case SubVariableList: {
                switch (lookahead) {
                    case ',':
                        return new Pair<>(30, Arrays.asList(Integer.valueOf(','), Variable, SubVariableList));
                    case ')':
                        return new Pair<>(121, Arrays.asList());
                    default: return null;
                }
            }
            //# line 832
            case PrintStmt: {
                switch (lookahead) {
                    case PRINT:
                        return new Pair<>(32, Arrays.asList(PRINT, Integer.valueOf('('), ExprList, Integer.valueOf(')')));
                    default: return null;
                }
            }
            //# line 743
            case ForStmt: {
                switch (lookahead) {
                    case FOR:
                        return new Pair<>(33, Arrays.asList(FOR, Integer.valueOf('('), SimpleStmt, Integer.valueOf(';'), Expr, Integer.valueOf(';'), SimpleStmt, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 608
            case Expr9: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                        return new Pair<>(34, Arrays.asList(Constant));
                    case READ_INTEGER:
                        return new Pair<>(35, Arrays.asList(READ_INTEGER, Integer.valueOf('('), Integer.valueOf(')')));
                    case READ_LINE:
                        return new Pair<>(36, Arrays.asList(READ_LINE, Integer.valueOf('('), Integer.valueOf(')')));
                    case THIS:
                        return new Pair<>(37, Arrays.asList(THIS));
                    case SUPER:
                        return new Pair<>(38, Arrays.asList(SUPER));
                    case NEW:
                        return new Pair<>(39, Arrays.asList(NEW, AfterNewExpr));
                    case INSTANCEOF:
                        return new Pair<>(40, Arrays.asList(INSTANCEOF, Integer.valueOf('('), Expr, Integer.valueOf(','), IDENTIFIER, Integer.valueOf(')')));
                    case '(':
                        return new Pair<>(41, Arrays.asList(Integer.valueOf('('), AfterParenExpr));
                    case IDENTIFIER:
                        return new Pair<>(42, Arrays.asList(IDENTIFIER, AfterIdentExpr));
                    default: return null;
                }
            }
            //# line 372
            case Expr1: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(43, Arrays.asList(Expr2, ExprT1));
                    default: return null;
                }
            }
            //# line 272
            case Oper1: {
                switch (lookahead) {
                    case OR:
                        return new Pair<>(44, Arrays.asList(OR));
                    default: return null;
                }
            }
            //# line 812
            case ElseClause: {
                switch (lookahead) {
                    case ELSE:
                        return new Pair<>(45, Arrays.asList(ELSE, Stmt));
                    case PRINT:
                    case CASE:
                    case COMPLEX:
                    case VOID:
                    case FOR:
                    case '!':
                    case '-':
                    case DOBLOCK:
                    case CLASS:
                    case READ_LINE:
                    case WHILE:
                    case RETURN:
                    case NULL:
                    case INT:
                    case '}':
                    case IDENTIFIER:
                    case NEW:
                    case IF:
                    case THIS:
                    case INSTANCEOF:
                    case STRING:
                    case LITERAL:
                    case '(':
                    case ';':
                    case OD:
                    case BOOL:
                    case SUPER:
                    case BREAK:
                    case READ_INTEGER:
                    case '{':
                        return new Pair<>(121, Arrays.asList());
                    default: return null;
                }
            }
            //# line 125
            case FieldList: {
                switch (lookahead) {
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case STATIC:
                    case BOOL:
                        return new Pair<>(47, Arrays.asList(Field, FieldList));
                    case '}':
                        return new Pair<>(48, Arrays.asList());
                    default: return null;
                }
            }
            //# line 724
            case SubExprList: {
                switch (lookahead) {
                    case ',':
                        return new Pair<>(49, Arrays.asList(Integer.valueOf(','), Expr, SubExprList));
                    case ')':
                        return new Pair<>(50, Arrays.asList());
                    default: return null;
                }
            }
            //# line 682
            case AfterParenExpr: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(51, Arrays.asList(Expr, Integer.valueOf(')')));
                    case CLASS:
                        return new Pair<>(52, Arrays.asList(CLASS, IDENTIFIER, Integer.valueOf(')'), Expr9));
                    default: return null;
                }
            }
            //# line 112
            case ClassDef: {
                switch (lookahead) {
                    case CLASS:
                        return new Pair<>(53, Arrays.asList(CLASS, IDENTIFIER, ExtendsClause, Integer.valueOf('{'), FieldList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 819
            case ReturnStmt: {
                switch (lookahead) {
                    case RETURN:
                        return new Pair<>(54, Arrays.asList(RETURN, ReturnExpr));
                    default: return null;
                }
            }
            //# line 716
            case ExprList: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(55, Arrays.asList(Expr, SubExprList));
                    default: return null;
                }
            }
            //# line 783
            case Do: {
                switch (lookahead) {
                    case DO:
                        return new Pair<>(56, Arrays.asList(DO, DoStmtList, OD));
                    default: return null;
                }
            }
            //# line 196
            case StmtBlock: {
                switch (lookahead) {
                    case '{':
                        return new Pair<>(57, Arrays.asList(Integer.valueOf('{'), StmtList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 157
            case FunctionField: {
                switch (lookahead) {
                    case '(':
                        return new Pair<>(58, Arrays.asList(Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case ';':
                        return new Pair<>(121, Arrays.asList(Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 601
            case AfterIdentExpr: {
                switch (lookahead) {
                    case '(':
                        return new Pair<>(60, Arrays.asList(Integer.valueOf('('), Actuals, Integer.valueOf(')')));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case GREATER_EQUAL:
                    case '.':
                    case '-':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case '+':
                    case AND:
                    case '*':
                    case ';':
                    case '<':
                    case '[':
                    case '>':
                    case '%':
                        return new Pair<>(121, Arrays.asList());
                    default: return null;
                }
            }
            //# line 800
            case DoStmt: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(62, Arrays.asList(Expr, Integer.valueOf(':'), Stmt));
                    default: return null;
                }
            }
            //# line 33
            case Program: {
                switch (lookahead) {
                    case CLASS:
                        return new Pair<>(63, Arrays.asList(ClassDef, ClassList));
                    default: return null;
                }
            }
            //# line 362
            case Expr: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(64, Arrays.asList(Expr1));
                    case CASE:
                        return new Pair<>(65, Arrays.asList(Cases));
                    default: return null;
                }
            }
            //# line 772
            case CaseStmt: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                        return new Pair<>(66, Arrays.asList(Constant, Integer.valueOf(':'), Expr, Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 93
            case Type: {
                switch (lookahead) {
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(67, Arrays.asList(SimpleType, ArrayType));
                    default: return null;
                }
            }
            //# line 488
            case Expr5: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(68, Arrays.asList(Expr6, ExprT5));
                    default: return null;
                }
            }
            //# line 656
            case AfterNewExpr: {
                switch (lookahead) {
                    case IDENTIFIER:
                        return new Pair<>(69, Arrays.asList(IDENTIFIER, Integer.valueOf('('), Integer.valueOf(')')));
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(70, Arrays.asList(SimpleType, Integer.valueOf('['), AfterSimpleTypeExpr));
                    default: return null;
                }
            }
            //# line 263
            case Assignment: {
                switch (lookahead) {
                    case '=':
                        return new Pair<>(71, Arrays.asList(Integer.valueOf('='), Expr));
                    case ';':
                    case ')':
                        return new Pair<>(121, Arrays.asList());
                    default: return null;
                }
            }
            //# line 118
            case ExtendsClause: {
                switch (lookahead) {
                    case EXTENDS:
                        return new Pair<>(73, Arrays.asList(EXTENDS, IDENTIFIER));
                    case '{':
                        return new Pair<>(121, Arrays.asList());
                    default: return null;
                }
            }
            //# line 320
            case Oper5: {
                switch (lookahead) {
                    case '+':
                        return new Pair<>(75, Arrays.asList(Integer.valueOf('+')));
                    case '-':
                        return new Pair<>(76, Arrays.asList(Integer.valueOf('-')));
                    default: return null;
                }
            }
            //# line 102
            case ArrayType: {
                switch (lookahead) {
                    case '[':
                        return new Pair<>(77, Arrays.asList(Integer.valueOf('['), Integer.valueOf(']'), ArrayType));
                    case IDENTIFIER:
                        return new Pair<>(78, Arrays.asList());
                    default: return null;
                }
            }
            //# line 430
            case Expr3: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(79, Arrays.asList(Expr4, ExprT3));
                    default: return null;
                }
            }
            //# line 706
            case Actuals: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(80, Arrays.asList(ExprList));
                    case ')':
                        return new Pair<>(81, Arrays.asList());
                    default: return null;
                }
            }
            //# line 61
            case Variable: {
                switch (lookahead) {
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(82, Arrays.asList(Type, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 442
            case ExprT3: {
                switch (lookahead) {
                    case EQUAL:
                    case NOT_EQUAL:
                        return new Pair<>(83, Arrays.asList(Oper3, Expr4, ExprT3));
                    case ']':
                    case ':':
                    case ')':
                    case ',':
                    case '=':
                    case OR:
                    case AND:
                    case ';':
                        return new Pair<>(121, Arrays.asList());
                    default: return null;
                }
            }
            //# line 210
            case Stmt: {
                switch (lookahead) {
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(85, Arrays.asList(VariableDef));
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case ';':
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(86, Arrays.asList(SimpleStmt, Integer.valueOf(';')));
                    case IF:
                        return new Pair<>(87, Arrays.asList(IfStmt));
                    case WHILE:
                        return new Pair<>(88, Arrays.asList(WhileStmt));
                    case FOR:
                        return new Pair<>(89, Arrays.asList(ForStmt));
                    case RETURN:
                        return new Pair<>(90, Arrays.asList(ReturnStmt, Integer.valueOf(';')));
                    case PRINT:
                        return new Pair<>(91, Arrays.asList(PrintStmt, Integer.valueOf(';')));
                    case BREAK:
                        return new Pair<>(92, Arrays.asList(BreakStmt, Integer.valueOf(';')));
                    case '{':
                        return new Pair<>(93, Arrays.asList(StmtBlock));
                    default: return null;
                }
            }
            //# line 252
            case SimpleStmt: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(94, Arrays.asList(Expr, Assignment));
                    case ';':
                    case ')':
                        return new Pair<>(121, Arrays.asList());
                    default: return null;
                }
            }
            //# line 67
            case SimpleType: {
                switch (lookahead) {
                    case INT:
                        return new Pair<>(96, Arrays.asList(INT));
                    case VOID:
                        return new Pair<>(97, Arrays.asList(VOID));
                    case BOOL:
                        return new Pair<>(98, Arrays.asList(BOOL));
                    case STRING:
                        return new Pair<>(99, Arrays.asList(STRING));
                    case CLASS:
                        return new Pair<>(100, Arrays.asList(CLASS, IDENTIFIER));
                    case COMPLEX:
                        return new Pair<>(101, Arrays.asList(COMPLEX));
                    default: return null;
                }
            }
            //# line 737
            case WhileStmt: {
                switch (lookahead) {
                    case WHILE:
                        return new Pair<>(102, Arrays.asList(WHILE, Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 384
            case ExprT1: {
                switch (lookahead) {
                    case OR:
                        return new Pair<>(103, Arrays.asList(Oper1, Expr2, ExprT1));
                    case ']':
                    case ':':
                    case ')':
                    case ',':
                    case '=':
                    case ';':
                        return new Pair<>(121, Arrays.asList());
                    default: return null;
                }
            }
            //# line 459
            case Expr4: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(105, Arrays.asList(Expr5, ExprT4));
                    default: return null;
                }
            }
            //# line 471
            case ExprT4: {
                switch (lookahead) {
                    case LESS_EQUAL:
                    case GREATER_EQUAL:
                    case '<':
                    case '>':
                        return new Pair<>(106, Arrays.asList(Oper4, Expr5, ExprT4));
                    case ']':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case AND:
                    case ';':
                        return new Pair<>(121, Arrays.asList());
                    default: return null;
                }
            }
            //# line 825
            case ReturnExpr: {
                switch (lookahead) {
                    case CASE:
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(108, Arrays.asList(Expr));
                    case ';':
                        return new Pair<>(121, Arrays.asList());
                    default: return null;
                }
            }
            //# line 806
            case IfStmt: {
                switch (lookahead) {
                    case IF:
                        return new Pair<>(110, Arrays.asList(IF, Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt, ElseClause));
                    default: return null;
                }
            }
            //# line 529
            case ExprT6: {
                switch (lookahead) {
                    case '*':
                    case '/':
                    case '%':
                        return new Pair<>(111, Arrays.asList(Oper6, Expr7, ExprT6));
                    case LESS_EQUAL:
                    case ']':
                    case GREATER_EQUAL:
                    case '-':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case '+':
                    case AND:
                    case ';':
                    case '<':
                    case '>':
                        return new Pair<>(121, Arrays.asList());
                    default: return null;
                }
            }
            //# line 576
            case ExprT8: {
                switch (lookahead) {
                    case '[':
                        return new Pair<>(113, Arrays.asList(Integer.valueOf('['), Expr, Integer.valueOf(']'), ExprT8));
                    case '.':
                        return new Pair<>(114, Arrays.asList(Integer.valueOf('.'), IDENTIFIER, AfterIdentExpr, ExprT8));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case GREATER_EQUAL:
                    case '-':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case '=':
                    case OR:
                    case '+':
                    case AND:
                    case '*':
                    case ';':
                    case '<':
                    case '>':
                    case '%':
                        return new Pair<>(121, Arrays.asList());
                    default: return null;
                }
            }
            //# line 546
            case Expr7: {
                switch (lookahead) {
                    case '-':
                    case '!':
                        return new Pair<>(116, Arrays.asList(Oper7, Expr8));
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case SUPER:
                    case READ_INTEGER:
                        return new Pair<>(117, Arrays.asList(Expr8));
                    default: return null;
                }
            }
            //# line 789
            case DoStmtList: {
                switch (lookahead) {
                    case DOBLOCK:
                        return new Pair<>(118, Arrays.asList(DoStmtList, DOBLOCK, DoStmt));
                    case OD:
                        return new Pair<>(119, Arrays.asList());
                    default: return null;
                }
            }
            //# line 44
            case ClassList: {
                switch (lookahead) {
                    case CLASS:
                        return new Pair<>(120, Arrays.asList(ClassDef, ClassList));
                    case eof:
                    case eos:
                        return new Pair<>(121, Arrays.asList());
                    default: return null;
                }
            }
            //# line 298
            case Oper4: {
                switch (lookahead) {
                    case LESS_EQUAL:
                        return new Pair<>(122, Arrays.asList(LESS_EQUAL));
                    case GREATER_EQUAL:
                        return new Pair<>(123, Arrays.asList(GREATER_EQUAL));
                    case '<':
                        return new Pair<>(124, Arrays.asList(Integer.valueOf('<')));
                    case '>':
                        return new Pair<>(125, Arrays.asList(Integer.valueOf('>')));
                    default: return null;
                }
            }
            //# line 141
            case Field: {
                switch (lookahead) {
                    case STATIC:
                        return new Pair<>(126, Arrays.asList(STATIC, Type, IDENTIFIER, Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case COMPLEX:
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new Pair<>(127, Arrays.asList(Type, IDENTIFIER, FunctionField));
                    default: return null;
                }
            }
            default: return null;
        }
    }
    
    /**
      * Execute some user-defined semantic action on the specification file.
      * Note that `$$ = params[0], $1 = params[1], ...`. Nothing will be returned, so please
      * do not forget to store the parsed AST result in `params[0]`.
      *
      * @param id      the action id.
      * @param params  parameter array.
      */
        
    public void act(int id, SemValue[] params) {
        switch (id) {
            case 0: {
                //# line 56
                params[0].vdef = params[1].vdef;
                return;
            }
            case 1: {
                //# line 501
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 2: {
                /* no action */
                return;
            }
            case 3: {
                //# line 762
                params[0].caselist.add(params[2].cas);
                return;
            }
            case 4: {
                //# line 766
                params[0] = new SemValue();
                params[0].caselist = new ArrayList<Tree.Case>();
                return;
            }
            case 5: {
                //# line 287
                params[0].counter = Tree.EQ;
                params[0].loc = params[1].loc;
                return;
            }
            case 6: {
                //# line 292
                params[0].counter = Tree.NE;
                params[0].loc = params[1].loc;
                return;
            }
            case 7: {
                //# line 333
                params[0].counter = Tree.MUL;
                params[0].loc = params[1].loc;
                return;
            }
            case 8: {
                //# line 338
                params[0].counter = Tree.DIV;
                params[0].loc = params[1].loc;
                return;
            }
            case 9: {
                //# line 343
                params[0].counter = Tree.MOD;
                params[0].loc = params[1].loc;
                return;
            }
            case 10: {
                //# line 176
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[1].vdef);
                if (params[2].vlist != null) {
                    params[0].vlist.addAll(params[2].vlist);
                }
                return;
            }
            case 11: {
                //# line 166
                params[0].vlist = params[1].vlist;
                return;
            }
            case 12: {
                //# line 170
                params[0].vlist = new ArrayList<VarDef>();
                return;
            }
            case 13: {
                //# line 350
                params[0].counter = Tree.NEG;
                params[0].loc = params[1].loc;
                return;
            }
            case 14: {
                //# line 355
                params[0].counter = Tree.NOT;
                params[0].loc = params[1].loc;
                return;
            }
            case 15: {
                //# line 557
                params[0].expr = params[1].expr;
                params[0].loc = params[1].loc;
                if (params[2].vec != null) {
                    for (SemValue v : params[2].vec) {
                        if (v.expr != null) {
                            params[0].expr = new Tree.Indexed(params[0].expr, v.expr, params[0].loc);
                        } else if (v.elist != null) {
                            params[0].expr = new Tree.CallExpr(params[0].expr, v.ident, v.elist, v.loc);
                            params[0].loc = v.loc;
                        } else {
                            params[0].expr = new Tree.Ident(params[0].expr, v.ident, v.loc);
                            params[0].loc = v.loc;
                        }
                    }
                }
                return;
            }
            case 16: {
                //# line 671
                params[0].expr = params[3].expr;
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 17: {
                //# line 676
                params[0].expr = params[1].expr;
                params[0].counter = 0;
                return;
            }
            case 18: {
                //# line 402
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 19: {
                //# line 280
                params[0].counter = Tree.AND;
                params[0].loc = params[1].loc;
                return;
            }
            case 20: {
                //# line 779
                params[0].defa = new Tree.Default(params[3].expr, params[1].loc);
                return;
            }
            case 21: {
                //# line 518
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 22: {
                //# line 756
                params[0].expr = new Tree.Switch(params[3].expr, params[6].caselist, params[7].defa, params[1].loc);
                return;
            }
            case 23: {
                //# line 750
                params[0].stmt = new Tree.Break(params[1].loc);
                return;
            }
            case 24: {
                //# line 414
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 25: {
                /* no action */
                return;
            }
            case 26: {
                //# line 203
                params[0].slist.add(params[1].stmt);
                params[0].slist.addAll(params[2].slist);
                return;
            }
            case 27: {
                /* no action */
                return;
            }
            case 28: {
                //# line 695
                params[0].expr = new Tree.Literal(params[1].typeTag, params[1].literal, params[1].loc);
                return;
            }
            case 29: {
                //# line 699
                params[0].expr = new Null(params[1].loc);
                return;
            }
            case 30: {
                //# line 186
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[2].vdef);
                if (params[3].vlist != null) {
                    params[0].vlist.addAll(params[3].vlist);
                }
                return;
            }
            case 31: {
                /* no action */
                return;
            }
            case 32: {
                //# line 833
                params[0].stmt = new Tree.Print(params[3].elist, params[1].loc);
                return;
            }
            case 33: {
                //# line 744
                params[0].stmt = new Tree.ForLoop(params[3].stmt, params[5].expr, params[7].stmt, params[9].stmt, params[1].loc);
                return;
            }
            case 34: {
                //# line 609
                params[0].expr = params[1].expr;
                return;
            }
            case 35: {
                //# line 613
                params[0].expr = new Tree.ReadIntExpr(params[1].loc);
                return;
            }
            case 36: {
                //# line 617
                params[0].expr = new Tree.ReadLineExpr(params[1].loc);
                return;
            }
            case 37: {
                //# line 621
                params[0].expr = new Tree.ThisExpr(params[1].loc);
                return;
            }
            case 38: {
                //# line 625
                params[0].expr = new Tree.Super(params[1].loc);
                return;
            }
            case 39: {
                //# line 629
                if (params[2].ident != null) {
                    params[0].expr = new Tree.NewClass(params[2].ident, params[1].loc);
                } else {
                    params[0].expr = new Tree.NewArray(params[2].type, params[2].expr, params[1].loc);
                }
                return;
            }
            case 40: {
                //# line 637
                params[0].expr = new Tree.TypeTest(params[3].expr, params[5].ident, params[1].loc);
                return;
            }
            case 41: {
                //# line 641
                params[0].expr = params[2].expr;
                return;
            }
            case 42: {
                //# line 645
                if (params[2].elist != null) {
                    params[0].expr = new Tree.CallExpr(null, params[1].ident, params[2].elist, params[1].loc);
                } else {
                    params[0].expr = new Tree.Ident(null, params[1].ident, params[1].loc);
                }
                return;
            }
            case 43: {
                //# line 373
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 44: {
                //# line 273
                params[0].counter = Tree.OR;
                params[0].loc = params[1].loc;
                return;
            }
            case 45: {
                //# line 813
                params[0].stmt = params[2].stmt;
                return;
            }
            case 46: {
                /* no action */
                return;
            }
            case 47: {
                //# line 126
                params[0].flist = new ArrayList<Tree>();
                if (params[1].vdef != null) {
                    params[0].flist.add(params[1].vdef);
                } else {
                    params[0].flist.add(params[1].fdef);
                }
                params[0].flist.addAll(params[2].flist);
                return;
            }
            case 48: {
                //# line 136
                params[0].flist = new ArrayList<Tree>();
                return;
            }
            case 49: {
                //# line 725
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[2].expr);
                params[0].elist.addAll(params[3].elist);
                return;
            }
            case 50: {
                //# line 731
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 51: {
                //# line 683
                params[0].expr = params[1].expr;
                return;
            }
            case 52: {
                //# line 687
                params[0].expr = new Tree.TypeCast(params[2].ident, params[4].expr, params[4].loc);
                return;
            }
            case 53: {
                //# line 113
                params[0].cdef = new Tree.ClassDef(params[2].ident, params[3].ident, params[5].flist, params[1].loc);
                return;
            }
            case 54: {
                //# line 820
                params[0].stmt = new Tree.Return(params[2].expr, params[1].loc);
                return;
            }
            case 55: {
                //# line 717
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[1].expr);
                params[0].elist.addAll(params[2].elist);
                return;
            }
            case 56: {
                //# line 784
                params[0].stmt = new Tree.Doing(params[2].doeslist, params[1].loc);
                return;
            }
            case 57: {
                //# line 197
                params[0].stmt = new Tree.Block(params[2].slist, params[1].loc);
                return;
            }
            case 58: {
                //# line 158
                params[0].vlist = params[2].vlist;
                params[0].stmt = params[4].stmt;
                return;
            }
            case 59: {
                /* no action */
                return;
            }
            case 60: {
                //# line 602
                params[0].elist = params[2].elist;
                return;
            }
            case 61: {
                /* no action */
                return;
            }
            case 62: {
                //# line 801
                params[0].does = new Tree.Do(params[1].expr, params[3].stmt, params[1].loc);
                return;
            }
            case 63: {
                //# line 34
                params[0].clist = new ArrayList<ClassDef>();
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                params[0].prog = new Tree.TopLevel(params[0].clist, params[0].loc);
                return;
            }
            case 64: {
                //# line 363
                params[0].expr = params[1].expr;
                return;
            }
            case 65: {
                //# line 367
                params[0].expr = params[1].expr;
                return;
            }
            case 66: {
                //# line 773
                params[0].cas = new Tree.Case(params[1].expr, params[3].expr, params[1].loc);
                return;
            }
            case 67: {
                //# line 94
                params[0].type = params[1].type;
                for (int i = 0; i < params[2].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                return;
            }
            case 68: {
                //# line 489
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 69: {
                //# line 657
                params[0].ident = params[1].ident;
                return;
            }
            case 70: {
                //# line 661
                params[0].type = params[1].type;
                for (int i = 0; i < params[3].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                params[0].expr = params[3].expr;
                return;
            }
            case 71: {
                //# line 264
                params[0].loc = params[1].loc;
                params[0].expr = params[2].expr;
                return;
            }
            case 72: {
                /* no action */
                return;
            }
            case 73: {
                //# line 119
                params[0].ident = params[2].ident;
                return;
            }
            case 74: {
                /* no action */
                return;
            }
            case 75: {
                //# line 321
                params[0].counter = Tree.PLUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 76: {
                //# line 326
                params[0].counter = Tree.MINUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 77: {
                //# line 103
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 78: {
                //# line 107
                params[0].counter = 0;
                return;
            }
            case 79: {
                //# line 431
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 80: {
                //# line 707
                params[0].elist = params[1].elist;
                return;
            }
            case 81: {
                //# line 711
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 82: {
                //# line 62
                params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                return;
            }
            case 83: {
                //# line 443
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 84: {
                /* no action */
                return;
            }
            case 85: {
                //# line 211
                params[0].stmt = params[1].vdef;
                return;
            }
            case 86: {
                //# line 215
                if (params[1].stmt == null) {
                    params[0].stmt = new Tree.Skip(params[2].loc);
                } else {
                    params[0].stmt = params[1].stmt;
                }
                return;
            }
            case 87: {
                //# line 223
                params[0].stmt = params[1].stmt;
                return;
            }
            case 88: {
                //# line 227
                params[0].stmt = params[1].stmt;
                return;
            }
            case 89: {
                //# line 231
                params[0].stmt = params[1].stmt;
                return;
            }
            case 90: {
                //# line 235
                params[0].stmt = params[1].stmt;
                return;
            }
            case 91: {
                //# line 239
                params[0].stmt = params[1].stmt;
                return;
            }
            case 92: {
                //# line 243
                params[0].stmt = params[1].stmt;
                return;
            }
            case 93: {
                //# line 247
                params[0].stmt = params[1].stmt;
                return;
            }
            case 94: {
                //# line 253
                if (params[2].expr == null) {
                    params[0].stmt = new Tree.Calculate(params[1].expr, params[1].loc);
                } else {
                    params[0].stmt = new Tree.Assign(params[1].expr, params[2].expr, params[2].loc);
                }
                return;
            }
            case 95: {
                /* no action */
                return;
            }
            case 96: {
                //# line 68
                params[0].type = new Tree.TypeIdent(Tree.INT, params[1].loc);
                return;
            }
            case 97: {
                //# line 72
                params[0].type = new Tree.TypeIdent(Tree.VOID, params[1].loc);
                return;
            }
            case 98: {
                //# line 76
                params[0].type = new Tree.TypeIdent(Tree.BOOL, params[1].loc);
                return;
            }
            case 99: {
                //# line 80
                params[0].type = new Tree.TypeIdent(Tree.STRING, params[1].loc);
                return;
            }
            case 100: {
                //# line 84
                params[0].type = new Tree.TypeClass(params[2].ident, params[1].loc);
                return;
            }
            case 101: {
                //# line 88
                params[0].type = new Tree.TypeIdent(Tree.COMPLEX, params[1].loc);
                return;
            }
            case 102: {
                //# line 738
                params[0].stmt = new Tree.WhileLoop(params[3].expr, params[5].stmt, params[1].loc);
                return;
            }
            case 103: {
                //# line 385
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 104: {
                /* no action */
                return;
            }
            case 105: {
                //# line 460
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 106: {
                //# line 472
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 107: {
                /* no action */
                return;
            }
            case 108: {
                //# line 826
                params[0].expr = params[1].expr;
                return;
            }
            case 109: {
                /* no action */
                return;
            }
            case 110: {
                //# line 807
                params[0].stmt = new Tree.If(params[3].expr, params[5].stmt, params[6].stmt, params[1].loc);
                return;
            }
            case 111: {
                //# line 530
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 112: {
                /* no action */
                return;
            }
            case 113: {
                //# line 577
                SemValue sem = new SemValue();
                sem.expr = params[2].expr;
                params[0].vec = new Vector<SemValue>();
                params[0].vec.add(sem);
                if (params[4].vec != null) {
                    params[0].vec.addAll(params[4].vec);
                }
                return;
            }
            case 114: {
                //# line 587
                SemValue sem = new SemValue();
                sem.ident = params[2].ident;
                sem.loc = params[2].loc;
                sem.elist = params[3].elist;
                params[0].vec = new Vector<SemValue>();
                params[0].vec.add(sem);
                if (params[4].vec != null) {
                    params[0].vec.addAll(params[4].vec);
                }
                return;
            }
            case 115: {
                /* no action */
                return;
            }
            case 116: {
                //# line 547
                params[0].expr = new Tree.Unary(params[1].counter, params[2].expr, params[1].loc);
                return;
            }
            case 117: {
                //# line 551
                params[0].expr = params[1].expr;
                return;
            }
            case 118: {
                //# line 790
                params[0].doeslist.add(params[3].does);
                return;
            }
            case 119: {
                //# line 794
                params[0] = new SemValue();
                params[0].doeslist = new ArrayList<Tree.Do>();
                return;
            }
            case 120: {
                //# line 45
                params[0].clist = new ArrayList<ClassDef>();
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                return;
            }
            case 121: {
                /* no action */
                return;
            }
            case 122: {
                //# line 299
                params[0].counter = Tree.LE;
                params[0].loc = params[1].loc;
                return;
            }
            case 123: {
                //# line 304
                params[0].counter = Tree.GE;
                params[0].loc = params[1].loc;
                return;
            }
            case 124: {
                //# line 309
                params[0].counter = Tree.LT;
                params[0].loc = params[1].loc;
                return;
            }
            case 125: {
                //# line 314
                params[0].counter = Tree.GT;
                params[0].loc = params[1].loc;
                return;
            }
            case 126: {
                //# line 142
                params[0].fdef = new Tree.MethodDef(true, params[3].ident, params[2].type, params[5].vlist,
                    (Block) params[7].stmt, params[3].loc);
                return;
            }
            case 127: {
                //# line 147
                if (params[3].vlist != null) {
                    params[0].fdef = new Tree.MethodDef(false, params[2].ident, params[1].type, params[3].vlist,
                        (Block) params[3].stmt, params[2].loc);
                } else {
                    params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                }
                return;
            }
        }
    }
}
/* end of file */
