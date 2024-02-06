package org.shkandyuk.nuxmv.grammar.psi;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import org.antlr.intellij.adaptor.lexer.RuleIElementType;
import org.antlr.intellij.adaptor.lexer.TokenIElementType;
import org.shkandyuk.nuxmv.grammar.parser.NuXmvParser;
import org.shkandyuk.nuxmv.grammar.psi.rules.*;

public class PsiElementFactory {
    public static final Logger LOG = Logger.getInstance("PsiElementFactory");

    public static final PsiElementFactory INSTANCE = new PsiElementFactory();

    public PsiElement createElement(ASTNode node) {
        IElementType elType = node.getElementType();
        if (elType instanceof TokenIElementType) {
            LOG.info("TOKEN DECL " + node);
            return new ASTWrapperPsiElement(node);
        }
        if (!(elType instanceof RuleIElementType ruleElType)) {
            LOG.info("NOT RULE DECL " + node);
            return new ASTWrapperPsiElement(node);
        }

        return switch (ruleElType.getRuleIndex()) {
            case NuXmvParser.RULE_assign -> new NuXmvAssign(node);
            case NuXmvParser.RULE_module -> new NuXmvModule(node);
            case NuXmvParser.RULE_andExpr -> new NuXmvAndExpr(node);
            case NuXmvParser.RULE_expr -> new NuXmvExpr(node);
            case NuXmvParser.RULE_nextAssign -> new NuXmvNextAssign(node);
            case NuXmvParser.RULE_condition -> new NuXmvCondition(node);
            case NuXmvParser.RULE_equalityExpr -> new NuXmvEqualityExpr(node);
            case NuXmvParser.RULE_assignList -> new NuXmvAssignList(node);
            case NuXmvParser.RULE_init -> new NuXmvInit(node);
            case NuXmvParser.RULE_initAssign -> new NuXmvInitAssign(node);
            case NuXmvParser.RULE_orExpr -> new NuXmvOrExpr(node);
            case NuXmvParser.RULE_invarspec -> new NuXmvInvarspec(node);
            case NuXmvParser.RULE_ivar -> new NuXmvIvar(node);
            case NuXmvParser.RULE_primaryExpr -> new NuXmvPrimaryExpr(node);
            case NuXmvParser.RULE_relationalExpr -> new NuXmvRelationalExpr(node);
            case NuXmvParser.RULE_trans -> new NuXmvTrans(node);
            default -> {
                LOG.info("default node " + node);
                yield new ASTWrapperPsiElement(node);
            }
        };
    }
}