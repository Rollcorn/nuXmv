package org.shkandyuk.nuxmv.grammar.psi;

import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.psi.PsiElement;
import com.intellij.psi.tree.IElementType;
import org.antlr.intellij.adaptor.lexer.RuleIElementType;
import org.antlr.intellij.adaptor.lexer.TokenIElementType;
import org.shkandyuk.nuxmv.grammar.antlr.NuXmvParser;
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
            case NuXmvParser.RULE_root -> new NuXmvRoot(node);
            case NuXmvParser.RULE_module -> new NuXmvModule(node);
            case NuXmvParser.RULE_moduleBody -> new NuXmvNextAssign(node);
            case NuXmvParser.RULE_assignment -> new NuXmvAssign(node);
            case NuXmvParser.RULE_assign_statment -> new NuXmvAssignStatment(node);
            case NuXmvParser.RULE_spec -> new NuXmvSpec(node);
            case NuXmvParser.RULE_type -> new NuXmvType(node);
            case NuXmvParser.RULE_expression -> new NuXmvExpression(node);
            case NuXmvParser.RULE_expressions -> new NuXmvExpressions(node);
            case NuXmvParser.RULE_value -> new NuXmvValue(node);
            case NuXmvParser.RULE_value_list -> new NuXmvValueList(node);
            case NuXmvParser.RULE_varDeclaration -> new NuXmvValDeclaration(node);
            case NuXmvParser.RULE_case -> new NuXmvCase(node);
            case NuXmvParser.RULE_case_statment -> new NuXmvCaseStatment(node);
            case NuXmvParser.RULE_init -> new NuXmvInit(node);
            case NuXmvParser.RULE_bit_ops -> new NuXmvBitOperations(node);
            case NuXmvParser.RULE_variables_declarations -> new NuXmvVariablesDeclarationList(node);
            case NuXmvParser.RULE_unar_ops -> new NuXmvUnarOperation(node);
            case NuXmvParser.RULE_next_statement -> new NuXmvNextStatement(node);
            case NuXmvParser.RULE_next -> new NuXmvNext(node);
            case NuXmvParser.RULE_init_statement -> new NuXmvInitStatement(node);
            case NuXmvParser.RULE_spec_operators -> new NuXmvSpecOperators(node);

            default -> {
                LOG.info("default node " + node);
                yield new ASTWrapperPsiElement(node);
            }
        };
    }
}