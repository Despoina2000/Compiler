/* This file was generated by SableCC (http://www.sablecc.org/). */

package minipython.analysis;

import java.util.*;
import minipython.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable in;
    private Hashtable out;

    public Object getIn(Node node)
    {
        if(in == null)
        {
            return null;
        }

        return in.get(node);
    }

    public void setIn(Node node, Object in)
    {
        if(this.in == null)
        {
            this.in = new Hashtable(1);
        }

        if(in != null)
        {
            this.in.put(node, in);
        }
        else
        {
            this.in.remove(node);
        }
    }

    public Object getOut(Node node)
    {
        if(out == null)
        {
            return null;
        }

        return out.get(node);
    }

    public void setOut(Node node, Object out)
    {
        if(this.out == null)
        {
            this.out = new Hashtable(1);
        }

        if(out != null)
        {
            this.out.put(node, out);
        }
        else
        {
            this.out.remove(node);
        }
    }
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    public void caseAGoal(AGoal node)
    {
        defaultCase(node);
    }

    public void caseAFunction(AFunction node)
    {
        defaultCase(node);
    }

    public void caseAArgument(AArgument node)
    {
        defaultCase(node);
    }

    public void caseAIfStatement(AIfStatement node)
    {
        defaultCase(node);
    }

    public void caseAWhileStatement(AWhileStatement node)
    {
        defaultCase(node);
    }

    public void caseAForStatement(AForStatement node)
    {
        defaultCase(node);
    }

    public void caseAReturnStatement(AReturnStatement node)
    {
        defaultCase(node);
    }

    public void caseAPrintStatement(APrintStatement node)
    {
        defaultCase(node);
    }

    public void caseAAssingStatement(AAssingStatement node)
    {
        defaultCase(node);
    }

    public void caseAArrayStatement(AArrayStatement node)
    {
        defaultCase(node);
    }

    public void caseAAssertStatement(AAssertStatement node)
    {
        defaultCase(node);
    }

    public void caseAFunctionCallStatement(AFunctionCallStatement node)
    {
        defaultCase(node);
    }

    public void caseADmultExpression(ADmultExpression node)
    {
        defaultCase(node);
    }

    public void caseAMultExpression(AMultExpression node)
    {
        defaultCase(node);
    }

    public void caseADivExpression(ADivExpression node)
    {
        defaultCase(node);
    }

    public void caseAPercentExpression(APercentExpression node)
    {
        defaultCase(node);
    }

    public void caseAAddExpression(AAddExpression node)
    {
        defaultCase(node);
    }

    public void caseASubExpression(ASubExpression node)
    {
        defaultCase(node);
    }

    public void caseAIdBrExpression(AIdBrExpression node)
    {
        defaultCase(node);
    }

    public void caseAFunctionCExpression(AFunctionCExpression node)
    {
        defaultCase(node);
    }

    public void caseAIdentifierExpression(AIdentifierExpression node)
    {
        defaultCase(node);
    }

    public void caseALenExpression(ALenExpression node)
    {
        defaultCase(node);
    }

    public void caseAExprMaxMinExpression(AExprMaxMinExpression node)
    {
        defaultCase(node);
    }

    public void caseAGroupExpressionInBrExpression(AGroupExpressionInBrExpression node)
    {
        defaultCase(node);
    }

    public void caseAFunCallExpression(AFunCallExpression node)
    {
        defaultCase(node);
    }

    public void caseANumberExpression(ANumberExpression node)
    {
        defaultCase(node);
    }

    public void caseAStrExpression(AStrExpression node)
    {
        defaultCase(node);
    }

    public void caseANoneExpression(ANoneExpression node)
    {
        defaultCase(node);
    }

    public void caseASimplyImportImportType(ASimplyImportImportType node)
    {
        defaultCase(node);
    }

    public void caseAFromImportImportType(AFromImportImportType node)
    {
        defaultCase(node);
    }

    public void caseAModule(AModule node)
    {
        defaultCase(node);
    }

    public void caseACompareExpressionComparison(ACompareExpressionComparison node)
    {
        defaultCase(node);
    }

    public void caseANotComparison(ANotComparison node)
    {
        defaultCase(node);
    }

    public void caseAAndComparison(AAndComparison node)
    {
        defaultCase(node);
    }

    public void caseAOrComparison(AOrComparison node)
    {
        defaultCase(node);
    }

    public void caseATrueComparison(ATrueComparison node)
    {
        defaultCase(node);
    }

    public void caseAFalseComparison(AFalseComparison node)
    {
        defaultCase(node);
    }

    public void caseAFunctionCall(AFunctionCall node)
    {
        defaultCase(node);
    }

    public void caseAGroupExpressionArglist(AGroupExpressionArglist node)
    {
        defaultCase(node);
    }

    public void caseAFunctionGroupFuncStat(AFunctionGroupFuncStat node)
    {
        defaultCase(node);
    }

    public void caseAStatementGroupFuncStat(AStatementGroupFuncStat node)
    {
        defaultCase(node);
    }

    public void caseAGroupCommaIdEqVal(AGroupCommaIdEqVal node)
    {
        defaultCase(node);
    }

    public void caseAGroupEqVal(AGroupEqVal node)
    {
        defaultCase(node);
    }

    public void caseAGroupCommaId(AGroupCommaId node)
    {
        defaultCase(node);
    }

    public void caseAGroupMod(AGroupMod node)
    {
        defaultCase(node);
    }

    public void caseAGroupIdDot(AGroupIdDot node)
    {
        defaultCase(node);
    }

    public void caseAGroupCommaVal(AGroupCommaVal node)
    {
        defaultCase(node);
    }

    public void caseAGroupCommaExpr(AGroupCommaExpr node)
    {
        defaultCase(node);
    }

    public void caseAGroupAsId(AGroupAsId node)
    {
        defaultCase(node);
    }

    public void caseAEqualCompEqs(AEqualCompEqs node)
    {
        defaultCase(node);
    }

    public void caseAMinusEqualCompEqs(AMinusEqualCompEqs node)
    {
        defaultCase(node);
    }

    public void caseADivEqualCompEqs(ADivEqualCompEqs node)
    {
        defaultCase(node);
    }

    public void caseALessCompTypes(ALessCompTypes node)
    {
        defaultCase(node);
    }

    public void caseAGreatCompTypes(AGreatCompTypes node)
    {
        defaultCase(node);
    }

    public void caseAGreatEqualCompTypes(AGreatEqualCompTypes node)
    {
        defaultCase(node);
    }

    public void caseALessEqualCompTypes(ALessEqualCompTypes node)
    {
        defaultCase(node);
    }

    public void caseANotEqualCompTypes(ANotEqualCompTypes node)
    {
        defaultCase(node);
    }

    public void caseAEqualCompTypes(AEqualCompTypes node)
    {
        defaultCase(node);
    }

    public void caseAMaxMaxMin(AMaxMaxMin node)
    {
        defaultCase(node);
    }

    public void caseAMinMaxMin(AMinMaxMin node)
    {
        defaultCase(node);
    }

    public void caseTImport(TImport node)
    {
        defaultCase(node);
    }

    public void caseTDef(TDef node)
    {
        defaultCase(node);
    }

    public void caseTLPar(TLPar node)
    {
        defaultCase(node);
    }

    public void caseTRPar(TRPar node)
    {
        defaultCase(node);
    }

    public void caseTSemi(TSemi node)
    {
        defaultCase(node);
    }

    public void caseTAs(TAs node)
    {
        defaultCase(node);
    }

    public void caseTEq(TEq node)
    {
        defaultCase(node);
    }

    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    public void caseTTab(TTab node)
    {
        defaultCase(node);
    }

    public void caseTIf(TIf node)
    {
        defaultCase(node);
    }

    public void caseTWhile(TWhile node)
    {
        defaultCase(node);
    }

    public void caseTFor(TFor node)
    {
        defaultCase(node);
    }

    public void caseTIn(TIn node)
    {
        defaultCase(node);
    }

    public void caseTReturn(TReturn node)
    {
        defaultCase(node);
    }

    public void caseTPrint(TPrint node)
    {
        defaultCase(node);
    }

    public void caseTMinusEq(TMinusEq node)
    {
        defaultCase(node);
    }

    public void caseTDivEq(TDivEq node)
    {
        defaultCase(node);
    }

    public void caseTLBr(TLBr node)
    {
        defaultCase(node);
    }

    public void caseTRBr(TRBr node)
    {
        defaultCase(node);
    }

    public void caseTAssert(TAssert node)
    {
        defaultCase(node);
    }

    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    public void caseTMult(TMult node)
    {
        defaultCase(node);
    }

    public void caseTDmult(TDmult node)
    {
        defaultCase(node);
    }

    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    public void caseTPercent(TPercent node)
    {
        defaultCase(node);
    }

    public void caseTExclam(TExclam node)
    {
        defaultCase(node);
    }

    public void caseTDict(TDict node)
    {
        defaultCase(node);
    }

    public void caseTLogicPlus(TLogicPlus node)
    {
        defaultCase(node);
    }

    public void caseTMax(TMax node)
    {
        defaultCase(node);
    }

    public void caseTMin(TMin node)
    {
        defaultCase(node);
    }

    public void caseTAnd(TAnd node)
    {
        defaultCase(node);
    }

    public void caseTOr(TOr node)
    {
        defaultCase(node);
    }

    public void caseTNot(TNot node)
    {
        defaultCase(node);
    }

    public void caseTLess(TLess node)
    {
        defaultCase(node);
    }

    public void caseTGreat(TGreat node)
    {
        defaultCase(node);
    }

    public void caseTGreatEq(TGreatEq node)
    {
        defaultCase(node);
    }

    public void caseTLessEq(TLessEq node)
    {
        defaultCase(node);
    }

    public void caseTNotEq(TNotEq node)
    {
        defaultCase(node);
    }

    public void caseTEqual(TEqual node)
    {
        defaultCase(node);
    }

    public void caseTTrue(TTrue node)
    {
        defaultCase(node);
    }

    public void caseTFalse(TFalse node)
    {
        defaultCase(node);
    }

    public void caseTQuote(TQuote node)
    {
        defaultCase(node);
    }

    public void caseTLen(TLen node)
    {
        defaultCase(node);
    }

    public void caseTFrom(TFrom node)
    {
        defaultCase(node);
    }

    public void caseTDot(TDot node)
    {
        defaultCase(node);
    }

    public void caseTNone(TNone node)
    {
        defaultCase(node);
    }

    public void caseTLineComment(TLineComment node)
    {
        defaultCase(node);
    }

    public void caseTNumber(TNumber node)
    {
        defaultCase(node);
    }

    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(Node node)
    {
    }
}
